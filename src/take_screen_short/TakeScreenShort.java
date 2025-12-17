package take_screen_short;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
public class TakeScreenShort {
	
	
	 public static void main(String[] args) {
//	        if (args.length < 1) {
//	            System.out.println("Please provide the file path.");
//	            return;
//	        }

	        String filePath = "C://Users//Saurabh//OneDrive//Pictures//Camera Roll";
	        File inputFile = new File(filePath);
	        if (!inputFile.exists()) {
	            System.out.println("File does not exist: " + filePath);
	            return;
	        }

	        try {
	            // Create screenshots folder if not exists
	            File screenshotsDir = new File("screenshots");
	            if (!screenshotsDir.exists()) {
	                screenshotsDir.mkdir();
	            }

	            // Extract filename without extension
	            String fileNameWithoutExt = inputFile.getName().replaceFirst("\\.[^.]+$", "");
	            String screenshotPath = "screenshots/" + fileNameWithoutExt + ".png";

	            // Take screenshot
	            Robot robot = new Robot();
	            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
	            BufferedImage screenshot = robot.createScreenCapture(screenRect);

	            // Save screenshot
	            File screenshotFile = new File(screenshotPath);
	            ImageIO.write(screenshot, "PNG", screenshotFile);

	            System.out.println("Screenshot saved at: " + screenshotFile.getAbsolutePath());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
//     public static void main(String[] args) {
//    	 try {
//             // Create a Robot instance
//             Robot robot = new Robot();
//
//             // Get the screen dimensions
//             Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
//                    
//             // Capture the screen
//             BufferedImage screenshot = robot.createScreenCapture(screenRect);
//
//             // Save the image to a file
//             File file = new File("screenshot.png");
//             ImageIO.write(screenshot, "PNG", file);
//             System.out.println("Screenshot saved as screenshot.png");
//
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//    }
}
