import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutileCheckBox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://designsystem.digital.gov/components/checkbox/");
		driver.manage().window().maximize();
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Avalable Website Checkbox:" + checkbox.size());
		driver.close();

	}

}
