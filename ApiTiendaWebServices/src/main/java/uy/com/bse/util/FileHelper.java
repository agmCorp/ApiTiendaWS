package uy.com.bse.util;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileHelper {
	public static byte[] readInputStream(InputStream inputStream) {
		byte[] result = new byte[0]; // Largo cero
		
		ByteArrayOutputStream byteArrayOutputStream = null;
		try {
			byteArrayOutputStream = new ByteArrayOutputStream();
			byte[] buffer = new byte[16384];
			int bytesRead = 0;
			int totalBytesRead = 0;
			boolean exit = false;
			while (!exit && (bytesRead = inputStream.read(buffer, 0, buffer.length)) != -1) {
				totalBytesRead += bytesRead;
				if (totalBytesRead > 5242880) { // 5 MB
					System.out.println("El archivo es mayor a 5 megas");
					exit = true;
					byteArrayOutputStream.reset(); // resetea el output stream
				} else {
					byteArrayOutputStream.write(buffer, 0, bytesRead);
				}
			}
			
			result = byteArrayOutputStream.toByteArray();
			
		} catch (IOException e) {
			System.out.println("Error al leer el inputStream: " + e.getMessage());
		} finally {
			try {
				if (byteArrayOutputStream != null) {
					byteArrayOutputStream.close();
				}
				inputStream.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el outputStream o inputStream: " + e.getMessage());
			}
		}
		
		return result;
	}

//	final int NEW_WIDTH_PX = 700;
//	final int WIDTH_OFFSET_PX = NEW_WIDTH_PX / 10;
//    int newWidth = (image.getWidth() == NEW_WIDTH_PX) ? NEW_WIDTH_PX + WIDTH_OFFSET_PX: NEW_WIDTH_PX;
//   BufferedImage resizedImage = CustomPortletManager.resizeImage(image, newWidth, (image.getHeight() * newWidth) / image.getWidth());

	public static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
	    BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
	    Graphics2D graphics2D = resizedImage.createGraphics();
	    graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	    graphics2D.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
	    graphics2D.dispose();
	    return resizedImage;
	}
}
