package by.itacademy.polnaerdman.calculator2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://svyatoslav.biz/testlab/wt/index.php");

        String xPathName = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By by1 =By.xpath(xPathName);
        WebElement webName = webDriver.findElement(by1);
        webName.sendKeys("Hello");

        String xPath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By by = By.xpath(xPath);
        WebElement webElement = webDriver.findElement(by);
        webElement.click();
    }
}
