import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * Created by rev on 10/10/2016.
 */
public class Main {
    private static boolean GoBack = true;
    private static boolean login = true;
    private static boolean swipe = true;
    private static boolean vertical_swipe = true;
    private static boolean update_status = true;
    private static boolean swipe_e = true;
    private static AndroidDriver driver;
    private static Dimension size;
    private static WebDriverWait wait;

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "0815f81b177f1004");
//        cap.setCapability("deviceName", "08ce6a00");
        cap.setCapability("platformName", "Android");
        cap.setCapability("app", "E:\\unlock_apk-debug.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 300);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.FrameLayout")));

        driver.findElementByAndroidUIAutomator("new UiSelector().description(\"Apps\")").click();

//        for swiping through apps
//        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.sec.android.app.launcher:id/apps_grid\").scrollable(true)");
//        swipe(true);

        wait.until(ExpectedConditions.elementToBeClickable(By.name("pma"))).click();
        System.out.println("PMA Launched");

//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//       login(true);
        System.out.println("Welcome to the Job List");

// -----------Changes made for Alvin------------------------------------------
        driver.findElement(By.id("lbl-9")).click();
        driver.findElement(By.id("lbl-9")).clear();
        driver.findElement(By.id("lbl-9")).sendKeys("test");

        driver.findElementByXPath("//android.view.View[@index='3']/descendant::android.view.View[@content-desc='PROD']").click();
// ----------------------------------------------------------------------------------------

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='2']/descendant::android.view.View[@content-desc='213 7TH ST, PETALUMA ,CA 94952' and @index='4']")));

        wait.until(ExpectedConditions.elementToBeClickable(By.name("Upcoming"))).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.name("Upcoming"))).click();

        swipe_element(true);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.name("text Reassign"))).click();
        System.out.println("Reassign");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElementByXPath("//android.view.View[@index='1']/descendant::android.widget.Button[@content-desc='close ']").click();
        System.out.println("Close");

        swipe_element(true);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.name("call Reschedule"))).click();
        System.out.println("Reschedule");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc='Schedule Date']/following::android.view.View[1]"))).click();
        System.out.println("Clicked date");

        for (int i = 0; i < 10; i++) {
            //click the button
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc='Increase day']"))).click();
        }
        System.out.println("Changed date");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='OK']"))).click();
        System.out.println("Clicked OK");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc='Increase hour']"))).click();
        System.out.println("Changed time");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='OK']"))).click();
        System.out.println("Clicked OK");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@text='Enter Comments...']"))).click();
        System.out.println("Clicked comment box");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@text='Enter Comments...']"))).sendKeys("test");
        System.out.println("Typed in comment section");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        driver.findElementByXPath("//android.widget.Button[@content-desc='Submit ']").click();
//        System.out.println("Submit");
        driver.findElementByXPath("//android.view.View[@index='1']/descendant::android.widget.Button[@content-desc='close ']").click();
        System.out.println("Close");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        swipe_element(true);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.name("more Other"))).click();
        System.out.println("Others");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.name("Result"))).click();
        System.out.println("Result Inspection");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        swipe(true);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        swipe(true);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String loc = driver.findElementByXPath("//android.view.View[@index='1']/descendant::android.widget.Button[@content-desc='close ']").getLocation().toString();

        System.out.println("Close "+loc);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='6']/descendant::android.view.View[@content-desc='213 7TH ST, PETALUMA ,CA 94952' and @index='4']"))).click();
        System.out.println("Clicked Inspection");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='2']/descendant::android.widget.Button[@content-desc='Result Inspection']"))).click();
        System.out.println("Result Inspection");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        swipe(true);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        swipe(true);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElementByXPath("//android.widget.Button[@content-desc='close ']").click();
        System.out.println("Close");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='2']/descendant::android.widget.Button[@content-desc='more ']"))).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.app.Dialog/descendant::android.widget.Button[@content-desc='Cancel']"))).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.name("Attachments"))).click();
        System.out.println("Clicked Attachments section");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='1']/android.widget.Button[@content-desc='more ']"))).click();
        System.out.println("Clicked more");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='1']/descendant::android.widget.Image[@content-desc='grid']"))).click();
        System.out.println("Clicked grid");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='1']/android.widget.Button[@content-desc='more ']"))).click();
        System.out.println("Clicked more");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='1']/descendant::android.view.View[@content-desc='List' and @index='2']"))).click();
        System.out.println("Clicked list");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.name("pmaQQ_Photo20161008154049"))).click();
        System.out.println("Image preview");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        back(true);
        back(true);

        wait.until(ExpectedConditions.elementToBeClickable(By.name(" Comments"))).click();
        System.out.println("Clicked Comments section");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        back(true);

        wait.until(ExpectedConditions.elementToBeClickable(By.name(" Checklists"))).click();
        System.out.println("Clicked Checklists section");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='2']/descendant::android.view.View[@content-desc='Alvin_Checklist']"))).click();
        System.out.println("Clicked a checklist");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        back(true);
        back(true);

        wait.until(ExpectedConditions.elementToBeClickable(By.name(" Conditions"))).click();
        System.out.println("Clicked Conditions section");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        back(true);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name(" Contacts"))).click();
        System.out.println("Clicked Contacts section");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        back(true);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name(" Prior Inspections"))).click();
        System.out.println("Clicked Prior Inspections section");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        back(true);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name(" Reports"))).click();
        System.out.println("Clicked Reports section");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        back(true);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        swipe_up_down(true);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Records & Related Records"))).click();
        System.out.println("Clicked Records & Related Records");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='1']/descendant:android.view.View[@content-desc='Residential Building 1']"))).click();
        System.out.println("Clicked Related Record");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        back(true);
        back(true);
        back(true);

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("menu "))).click();
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        boolean clickable = driver.findElementByXPath("//android.widget.Button[@content-desc='settings Settings']").getAttribute("clickable").equals("true");
//        if (driver.findElementByAndroidUIAutomator("new UiSelector().description(\"settings Settings\")").isDisplayed()){
//            System.out.println("displayed");
//            if (clickable){
//                System.out.println("clickable");
////                driver.findElementByAndroidUIAutomator("new UiSelector().description(\"settings Settings\")").click();
//                WebElement element = driver.findElementByXPath("//android.view.View[@index='0']/descendant::android.widget.Button[@content-desc='settings Settings' and @index='4']");
//                tap(element, 5000);
//                System.out.println("tap");
//            }else {
//                System.out.println("false");
//            }
//        }else {
//            System.out.println("hidden");
//        }
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Logout"))).click();
//        driver.quit();
    }

    public static void tap(WebElement element, double duration) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Double> tapObject = new HashMap<String, Double>();
        tapObject.put("x", (double) element.getLocation().getX() + 10.0);
        tapObject.put("y", (double) element.getLocation().getY() + 10.0);
        tapObject.put("duration", duration);
        js.executeScript("mobile: tap", tapObject);
    }

    public static void back(boolean GoBack){
        driver.findElementByAndroidUIAutomator("new UiSelector().description(\"arrow back \")").click();
        System.out.println("Go back");
    }

    public static void login(boolean login){
        driver.findElementByXPath("//android.view.View[@resource-id='loginForm']/android.view.View[@index='0']").click();
        System.out.println("Tapped Agency");

        driver.findElementByXPath("//android.view.View[@resource-id='loginAgency']/android.widget.EditText").sendKeys("islandton");
        System.out.println("Agency added");

        driver.findElementByXPath("//android.view.View[@resource-id='loginForm']/android.view.View[@index='1']").click();
        System.out.println("Tapped Username");

        driver.findElementByXPath("//android.view.View[@resource-id='loginUsername']/android.widget.EditText").sendKeys("alvin");
        System.out.println("Username added");

        driver.findElementByXPath("//android.view.View[@resource-id='loginForm']/android.view.View[@index='2']").click();
        System.out.println("Tapped Password");

        driver.findElementByXPath("//android.view.View[@resource-id='loginPassword']/android.widget.EditText").sendKeys("admin");
        System.out.println("Password added");

        driver.findElementByXPath("//android.view.View[@resource-id='loginForm']/android.widget.Button[@resource-id='loginButton']").click();
        System.out.println("Sign in clicked");
    }
    public static void swipe(boolean swipe){
//        ---- nexus scroll -------
//        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.android.launcher:id/apps_customize_pane_content\").scrollable(true)");
//        ------- note 5 scroll ------------
        size = driver.manage().window().getSize();
        System.out.println(size);
        int startx = (int) (size.width * 0.70);
        int endx = (int) (size.width * 0.10);
        int starty = size.height / 2;
        driver.swipe(startx, starty, endx, starty, 3000); // it swipes from right to left
//        driver.swipe(endx, starty, startx, starty, 2000); // it swiptes from left to right
    }

    public static void swipe_element(boolean swipe_e){
        if(driver.findElement(By.xpath("//android.view.View[@index='2']/descendant::android.view.View[@content-desc='213 7TH ST, PETALUMA ,CA 94952' and @index='4']")).isDisplayed()){
            size=driver.manage().window().getSize();
            int x_start=(int)(size.width*0.80);
            int x_end=(int)(size.width*0.20);
            int y=694;
            driver.swipe(x_start,y,x_end,y,3000);
            System.out.println("displayed");
        }else {
            System.out.println("no");
        }
    }

    public static void swipe_up_down(boolean vertical_swipe){
        size = driver.manage().window().getSize();
        System.out.println(size);

        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.10);
        int startx = size.width / 2;

        //Swipe from Bottom to Top.
        driver.swipe(startx, starty, startx, endy, 2000);
        //Swipe from Top to Bottom.
//        driver.swipe(startx, endy, startx, starty, 3000);
    }

    public static void update_status(boolean update_status){
        driver.findElementByName("checkmark circle-outline Status").click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.name("checkmark circle-outline Status"))).click();
        System.out.println("Status action button clicked");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='0']/descendant::android.view.View[@content-desc='test' and @index='0']"))).click();
    }

    public static void esignature_func(boolean effect){
        WebElement element = driver.findElement(By.id("com.accela.pma:id/signature_view"));
//
        Actions builder = new Actions(driver);
        Action drawAction = builder.moveToElement(element,135,15) //start points x axis and y axis.
                .click()
                .moveByOffset(200, 60) // 2nd points (x1,y1)
                .click()
                .moveByOffset(100, 70)// 3rd points (x2,y2)
                .doubleClick()
                .build();
        drawAction.perform();
    }
}
