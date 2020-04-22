package SeleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class ReadPDF {

	
	public void ReadPDFFie() throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String path =System.getProperty("user.dir");
		System.out.println(" PATH   "+path);
        // page with example pdf document
        driver.get(path+"\\Resources\\pdf.pdf");
        driver.manage().window().maximize();
        
		String Currentlink=driver.getCurrentUrl();
		URL url=new URL(Currentlink);
		InputStream is=url.openStream();
		BufferedInputStream fp=new BufferedInputStream(is);
		PDDocument document=null;
		document=PDDocument.load(fp);
		String pdfContent= new PDFTextStripper().getText(document);
		System.out.println(pdfContent);
		driver.quit();
		
	}
}
