/**
 * @author -salimt
 */


import edu.duke.ImageResource;

public class ImageSaver {
	public static void doSave(ImageResource image, String fileName, String conversionType) {
        image.setFileName(conversionType + fileName);
        image.save();
	}
}
