/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenShot;

/**
 *
 * @author shemr
 */
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class screenshot {
    public static void main(String[] args) {
		int time1 = 5000;
		int i=0;
		try { 
			while(true) {
			Thread.sleep(time1); 
			Robot r = new Robot(); 

			// It saves screenshot to desired path 
			String path = "C:/Users/shemr/Desktop/Screenshots"+ i++ +".jpg"; 

			// Used to get ScreenSize and capture image 
			Rectangle capture = 
			new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); 
			BufferedImage Image = r.createScreenCapture(capture); 
			ImageIO.write(Image, "jpg", new File(path)); 
			System.out.println("Screenshot saved");
			}
		} 
		catch (AWTException | IOException | InterruptedException ex) { 
			System.out.println(ex); 
		} 
		
}
}
