package SeleniumTopics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class ReadingNotepadData {

	
	public static void NotepadRead() throws IOException {

		
		String TestFile = ".//Resources//notepadData.txt";
		
		FileWriter FW= new FileWriter(TestFile);
		BufferedWriter BW = new BufferedWriter(FW);
		
		
		BW.write(" Hello World !");		
		BW.write("Welcome to java ");
		BW.newLine();
		BW.write("Hello Shubham ");
		BW.newLine();
		BW.write("akjdiashi");
		BW.close();
	    System.out.println("Close file.");
		
		
		
		
		FileReader FR = new FileReader(TestFile);
		BufferedReader BR = new BufferedReader(FR);
		String Content = "";
		
		//Loop to read all lines one by one from file and print It.
		while((Content = BR.readLine())!= null){
			System.out.println(Content);
			/*
			 * System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver.exe");
			 * WebDriver driver = new ChromeDriver(); driver.get(Content); String
			 * Tittle=driver.getTitle(); System.out.println("Tittle of Page is"+ Tittle);
			 */
		}
		BR.close();

	}

}