		package com.monefy.app;
		
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.FindBy;
		import org.openqa.selenium.support.PageFactory;
		
		import com.aventstack.extentreports.ExtentTest;
		
		import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
		
		public class Transfer {
			AndroidDriver driver;
			ExtentTest extentTest;
			public Transfer(AppiumDriver driver2, ExtentTest extentTest) {
				this.driver = (AndroidDriver) driver2;
				this.extentTest = extentTest;
				PageFactory.initElements(driver2, this);
			}
			
			@FindBy(id = "com.monefy.app.lite:id/overflow")
			private WebElement clickDots;
			
			@FindBy(id = "com.monefy.app.lite:id/accounts_imagebutton")
			private WebElement clickAccounts;
			
			@FindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView[1]")
			private WebElement cash;
			
			@FindBy(id = "com.monefy.app.lite:id/initialAmount")
			private WebElement accountBalance;
			
			@FindBy(id = "AppiumBy")
			private WebElement backNavigation;
			
			@FindBy(id = "com.monefy.app.lite:id/transfer_menu_item")
			private WebElement transferIcon;
			
			@FindBy(xpath = "//android.widget.Spinner[1]/android.widget.LinearLayout/android.widget.LinearLayout")
			private WebElement clickFirstElement;
			
			@FindBy(xpath = "//android.widget.Spinner[2]/android.widget.LinearLayout/android.widget.LinearLayout")
			private WebElement clickSecondElement;
			
			@FindBy(id = "com.monefy.app.lite:id/show_keyboard_fab")
			private WebElement transferButton;
			
			@FindBy(id = "com.monefy.app.lite:id/keyboard_action_button")
			private WebElement addTransfer;
			
			@FindBy(id = "com.monefy.app.lite:id/textViewNote")
			private WebElement note;
			
			@FindBy(id = "com.monefy.app.lite:id/amount_text")
			private WebElement amountText;
			
			@FindBy(id = "com.monefy.app.lite:id/buttonKeyboard")
			private WebElement btnchooseCategory;
			
			public void clickTransferIcon() {
				transferIcon.click();
			}
			
			public void clickDots(){
				clickDots.click();
			}
			
			public void openCash(String amount) throws InterruptedException {
				Thread.sleep(2000);
				clickAccounts.click();
				cash.click();
				accountBalance.sendKeys(amount);
				backNavigation.click();
			}
			
			public void addAmount(String amount) {
			for(int i=0; i<amount.length(); i++)
				driver.findElement(By.id("com.monefy.app.lite:id/buttonKeyboard"+amount.charAt(i)));
		     }
			
			public void clickNote(){
			note.click();
			//note.sendKeys("Test Transfer");
			//driver.pressKey(new KeyEventeyE);
			}
			public void addTransfer(){
				addTransfer.click();
				}
			
			
			public void dropdown1(int firstIndex) throws InterruptedException {
				
				clickFirstElement.click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout["+firstIndex+"]/android.widget.LinearLayout")).click();;
					
			}
	        public void dropdown2(int secondIndex) {
				
				clickSecondElement.click();
				driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout["+secondIndex+"]/android.widget.LinearLayout")).click();;
						
			}
	        
	       
		}
