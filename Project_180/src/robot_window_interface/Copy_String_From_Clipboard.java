package robot_window_interface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Copy_String_From_Clipboard 
{

	public static void main(String[] args) throws Exception {
		
		
		
		
		String text="Never miss to apply on the best jobs with free job alerts. "
				+ "Get most relevant jobs matching your profile directly in your inbox";
		
		//Select requited string
		StringSelection Stext=new StringSelection(text);
		//Enable System clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Add content to clipboard
		clipboard.setContents(Stext, Stext);
		
		
		//Launch notepad file
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
	
		//Create object of robot class
		Robot robot=new Robot();
		robot.setAutoDelay(300);
		
		
		//Press Control+V
		robot.keyPress(KeyEvent.VK_CONTROL);   //Because control is down key we need release after completed actions
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		

	}

}
