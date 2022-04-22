package newpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
	  public static void main(String[] args) {
	    
			System.setProperty("webdriver.chrome.driver","C:\\Users\\satri\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
		    driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	    	
			
			int Row_count = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr")).size();
			System.out.println("Number Of Rows = "+Row_count);

			
			int Col_count = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td")).size();
			System.out.println("Number Of Columns = "+Col_count);

			 
			String first_part = "//*[@id=\"customers\"]/tbody/tr[";
			String second_part = "]/td[";
			String third_part = "]";

			 
			 for (int i=2; i<=Row_count; i++){
			  
			  
			  for(int j=1; j<=Col_count; j++){
			   
			   
			   String final_xpath = first_part+i+second_part+j+third_part;
			   
			   
			   String Table_data = driver.findElement(By.xpath(final_xpath)).getText();
			   System.out.print(Table_data +" ");
			  }

			  System.out.println("");
			  System.out.println("");
			  }
	       
	    }
	
}
