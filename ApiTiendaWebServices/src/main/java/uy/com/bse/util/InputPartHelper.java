package uy.com.bse.util;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.ws.rs.core.MultivaluedMap;

public class InputPartHelper {
	public static byte[] readInputStream(InputStream inputStream, Integer fileSizeThresholdMB) throws IOException {
		final Long FILE_SIZE_THRESHOLD_BYTES = (long) (1024 * 1024 * fileSizeThresholdMB);
		final Integer BUFFER_SIZE_BYTES = 16 * 1024;

		byte[] result = new byte[0]; // Largo cero
		ByteArrayOutputStream byteArrayOutputStream = null;
		try {
			byteArrayOutputStream = new ByteArrayOutputStream();
			byte[] buffer = new byte[BUFFER_SIZE_BYTES];
			int bytesRead = 0;
			int totalBytesRead = 0;
			boolean exit = false;
			while (!exit && (bytesRead = inputStream.read(buffer, 0, buffer.length)) != -1) {
				totalBytesRead += bytesRead;
				if (totalBytesRead > FILE_SIZE_THRESHOLD_BYTES) {
					exit = true;
					byteArrayOutputStream.reset(); // Resetea el output stream
				} else {
					byteArrayOutputStream.write(buffer, 0, bytesRead);
				}
			}

			byteArrayOutputStream.flush();
			result = byteArrayOutputStream.toByteArray();
		} finally {
			try {
				if (byteArrayOutputStream != null) {
					byteArrayOutputStream.close();
				}
				inputStream.close();
			} catch (IOException e) {
				throw e;
			}
		}

		return result;
	}

	/**
	 * header sample { Content-Type=[image/png], Content-Disposition=[form-data;
	 * name="file"; filename="filename.extension"] }
	 **/
	public static String getFileName(MultivaluedMap<String, String> header) {
		final String CONTENT_DISPOSITION = "Content-Disposition";
		final String FILENAME = "filename";

		String result = null;
		String[] contentDisposition = header.getFirst(CONTENT_DISPOSITION).split(";");
		for (String filename : contentDisposition) {
			if ((filename.trim().startsWith(FILENAME))) {
				String[] name = filename.split("=");
				result = name[1].trim().replaceAll("\"", "");
				break;
			}
		}

		return result;
	}

	/**
	 * header sample { Content-Type=[image/png], Content-Disposition=[form-data;
	 * name="file"; filename="filename.extension"] }
	 **/
	public static String getMimeType(MultivaluedMap<String, String> header) {
		final String CONTENT_TYPE = "Content-Type";

		return header.getFirst(CONTENT_TYPE);
	}

	public static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
		BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
		Graphics2D graphics2D = resizedImage.createGraphics();
		graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		graphics2D.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
		graphics2D.dispose();
		return resizedImage;
	}
}
