package uy.com.bse.util;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

public class InputPartHelper {

	private static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
		BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
		Graphics2D graphics2D = resizedImage.createGraphics();
		graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		graphics2D.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
		graphics2D.dispose();
		return resizedImage;
	}

	public static byte[] readFile(InputPart inputPart) throws IOException {
		final Integer FILE_SIZE_THRESHOLD_MEGA_BYTES = 5; // Máximo 5MB por archivo
		final Long FILE_SIZE_THRESHOLD_BYTES = (long) (1024 * 1024 * FILE_SIZE_THRESHOLD_MEGA_BYTES);
		final Integer BUFFER_SIZE_BYTES = 16 * 1024;

		// Convierte el archivo recibido a Inputstream
		try (InputStream inputStream = inputPart.getBody(InputStream.class, null);
		     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
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
			return byteArrayOutputStream.toByteArray();
		}
	} 

	/**
	 * header sample { Content-Type=[image/png], Content-Disposition=[form-data;
	 * name="file"; filename="filename.extension"] }
	 **/
	public static String getFileName(InputPart inputPart) {
		final String CONTENT_DISPOSITION = "Content-Disposition";
		final String FILENAME = "filename";

		String result = null;
		String[] contentDisposition = inputPart.getHeaders().getFirst(CONTENT_DISPOSITION).split(";");
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
	public static String getMimeType(InputPart inputPart) {
		final String CONTENT_TYPE = "Content-Type";

		return inputPart.getHeaders().getFirst(CONTENT_TYPE);
	}

	public static byte[] resize(byte[] imageBytes) throws IOException {
		final Integer NEW_WIDTH_PX = 700;
		final Integer WIDTH_OFFSET_PX = NEW_WIDTH_PX / 10;
		final String FORMAT_NAME = "jpg";

		try (InputStream is = new ByteArrayInputStream(imageBytes);
		         ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
	        // Convierte byte[] a BufferedImage
	        BufferedImage image = ImageIO.read(is);
	        
			// Se redimensiona la imagen para evitar vulnerabilidades
			int newWidth = (image.getWidth() == NEW_WIDTH_PX) ? NEW_WIDTH_PX + WIDTH_OFFSET_PX : NEW_WIDTH_PX;
			BufferedImage resizedImage = resizeImage(image, newWidth,
					(image.getHeight() * newWidth) / image.getWidth());
			
			// Convierte BufferedImage a byte[]
			ImageIO.write(resizedImage, FORMAT_NAME, baos);

			return baos.toByteArray();
		}
	}
	
	public static List<InputPart> getInputPartList(MultipartFormDataInput input, String key) {
		Map<String, List<InputPart>> uploadForm = input.getFormDataMap();
		return uploadForm.getOrDefault(key, new ArrayList<InputPart>());
	}
}
