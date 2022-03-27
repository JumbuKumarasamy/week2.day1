package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tata Consulting Inc");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kannan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ganesan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ramesh");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Quality Assurance");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Quality Assurance Department");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rameshkannan1234@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select ss = new Select(state);
		ss.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement desc = driver.findElement(By.id("updateLeadForm_description"));
		desc.clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Updating Notes with QA");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The title is : " + driver.getTitle());
//		WebElement heading = driver.findElement(By.id("sectionHeaderTitle_leads"));
//		System.out.println("The section heading is : " + heading.getText());
	}

}
