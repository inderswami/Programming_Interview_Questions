import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testopen {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fdp%2FB0CHQKRVMQ%2F%3F_encoding%3DUTF8%26ascsubtag%3D_k_Cj0KCQjw-_mvBhDwARIsAA-Q0Q5RSf4eFcZXswACIv35zXlGWZTQfQFWsEkKyWZFUC-uuzlPwBiceecaAkb-EALw_wcB_k_%26tag%3Dgoogmantxtmob674-21%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.findElement(By.xpath("//*[@type='email']")).sendKeys("inder.swami@gmail.com");


    }



}
