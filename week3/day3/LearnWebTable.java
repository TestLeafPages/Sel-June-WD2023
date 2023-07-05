package week3.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		// https://www.leafground.com/table.xhtml
		
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/table.xhtml");
		String data = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
		
		System.out.println(data);
		
		String rowValue = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[6]/td[4]")).getText();
		
		System.out.println(rowValue);
		
		//row count
		
		List<WebElement> rowcount = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td[1]"));
		
		int rowSize = rowcount.size();
		
		System.out.println("row size :"+rowSize);
		
		
		//column count
		
		List<WebElement> columncount = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
		
		int columnSize = columncount.size();
		System.out.println(columnSize);
		
		//for loop-nested 
		
		for (int i = 1; i <=rowSize; i++) {
			
			
			for (int j = 1; j <=columnSize; j++) {
				
				String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				
				System.out.println(text);
				
			}
			
		}
		
		
		
		
		
	}

}
