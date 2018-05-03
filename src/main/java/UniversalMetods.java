import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

 public class UniversalMetods extends ResursConstant {

    protected static void setClick(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    protected static void setText(String name, String text) {
        WebElement textEl = driver.findElement(By.name(name));
        textEl.clear();
        textEl.sendKeys(text);
        System.out.println("Текст: "+text+"- успешно добавлен");
    }
    protected static void checkTitle(String title) {
        if(driver.getTitle().equals(title)) {
            System.out.println("Шаг на:"+" "+title+"- Успешно");
        }else {
            System.out.println("Шаг на:"+" "+title+" - Ошибка");
            driver.quit();
        }
    }
    protected static void cofigureList(String nameList, String nameChoise) {
        selectEl = driver.findElement(By.name(nameList));
        select = new Select(selectEl);
        select.selectByVisibleText(nameChoise);
        System.out.println("В выпадающем списке выбран: "+nameChoise);
    }
     protected static void checkForTextMaching(String elementWay, String text) {
         Assert.assertTrue(driver.findElement(By.xpath(elementWay)).getText().matches(text));
         System.out.println(text+" -проверен");
     }
     protected static void checkDate(String way, String date) {
         Assert.assertTrue(driver.findElement(By.xpath(way)).getText().contains(date));
         System.out.println(date+" -проверен");
     }

 }
