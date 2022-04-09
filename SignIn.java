package pom;




	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	public class SignIn {
		
	     //declaration
		@FindBy(xpath = "//input[@name='firstname']")
		private WebElement username;

		@FindBy(xpath = "//input[@name='lastname']")
		private WebElement surname;

		@FindBy(xpath = "//input[@name='reg_email__']")
		private WebElement email;

		@FindBy(xpath = "//input[@type='password']")
		private WebElement newpass;

		@FindBy(xpath = "(//label[@class='_58mt'])[2]")
		private WebElement radioBtn;

		@FindBy(xpath = "//select[@name='birthday_day']")
		private WebElement bday;

		@FindBy(xpath = "//select[@name='birthday_month']")
		private WebElement month;

		@FindBy(xpath = "//select[@name='birthday_year']")
		private WebElement year;

		@FindBy(xpath = "(//input[@type='text'])[4]")
		private WebElement repass;

		@FindBy(xpath = "//button[@type='submit']")
		private WebElement submit;
		
		

		// initialization

		SignIn(WebDriver kaypan) {                   // parameterized constructor
			PageFactory.initElements(kaypan, this);  // initialization of driver
		}
		
		

		// usage
        // parameters (arguments)  passed to every method should be String 
		// select class parameters should also be String (visible text & value) and not int (index)
		public void enterfirstname(String name) {
			username.sendKeys(name);
		}

		public void enterlastname(String sname) {
			surname.sendKeys(sname);
		}

		public void enteremail(String mail) {
			email.sendKeys(mail);
		}

		public void enterpass(String pass) {
			newpass.sendKeys(pass);
		}

		public void enterrepass(String repassword) {
			repass.sendKeys(repassword);
		}

		public void clickonbtn() {
			radioBtn.click();
		}

		public void selectbday(String day) {     
			Select s = new Select(bday);
			s.selectByVisibleText(day);
		}

		public void selectmonth(String bdmnth) {
			Select s1 = new Select(month);
			s1.selectByVisibleText(bdmnth);
		}

		public void selectyear(String yr) {      
			Select s2 = new Select(year);
			s2.selectByVisibleText(yr);
		}

		public void clickonsubmit() {
			submit.click();
		}

	}



