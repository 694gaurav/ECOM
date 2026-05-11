package Methods;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class CommonMethods extends Pages.BasePage {

	public CommonMethods(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	WebDriver driver;
	WebDriverMethod wm;
	
	Random random;
	int number;

	public static void Verify(boolean verify, boolean TrueOrFalse) 
	{
		System.out.println(verify);
		if (TrueOrFalse == true)			
			Assert.assertTrue(verify);
		else
			Assert.assertFalse(verify);
	}	
	
	public static void Verify1(boolean verify, boolean TrueOrFalse) 
	{
		System.out.println(verify);
		if (TrueOrFalse == true)			
			Assert.assertTrue(verify);
		else
			Assert.assertFalse(verify);
	}	
	
	public static Boolean isElementSelected(WebDriver driver,WebElement Element)
	{
	WebElement element = null;
	boolean isSelected = false;
	try
	{
	element = (Element);
	if(element.isSelected() == true && element.isDisplayed() == true)
	{
	isSelected = true;
	}
	else
	{
	isSelected = false;
	}
	}
	catch (Exception ex)
	{
	isSelected = false;
	System.out.println(ex.toString());
	}
	return isSelected;
	}
	
//	public  void explictwait(){
//		WebDriverWait wait = new WebDriverWait(driver,30000);
//	}
	
	
	public String Random_AWBNo()
	{
		
		
		random = new Random();
		number = 1000000 + (int)(random.nextFloat() * 8999000);
        String awbNo =(Integer.toString(number))+(Integer.toString(number%7)); 
        System.out.println("Air Waybill no.: "+awbNo);
        return awbNo; 
	}
	
	public static String RandomNo(int howManyDigit)
	{
		Random random = new Random();
		int number = 0;
		long num = 13;
		String strNo = null;

		if(howManyDigit==1)
		{
			number = 1 + (int)(random.nextFloat() * 8);
			strNo = Integer.toString(number);
		}
		else if(howManyDigit==2)
		{
			number = 10 + (int)(random.nextFloat() * 89);
			strNo = Integer.toString(number);
		}
		else if(howManyDigit==3)
		{
			number = 100 + (int)(random.nextFloat() * 899);
			strNo = Integer.toString(number);
		}
		else if(howManyDigit==4)
		{
			number = 1000 + (int)(random.nextFloat() * 8999);
			strNo = Integer.toString(number);
		}
		else if(howManyDigit==5)
		{
			number = 10000 + (int)(random.nextFloat() * 89990);
			strNo = Integer.toString(number);
		}
		else if(howManyDigit==6)
		{
			number = 100000 + (int)(random.nextFloat() * 899900);
			strNo = Integer.toString(number);
		}
		else if(howManyDigit==7)
		{
			number = 1000000 + (int)(random.nextFloat() * 8999000);
			strNo = Integer.toString(number);
		}
		else if(howManyDigit==8)
		{
			number = 10000000 + (int)(random.nextFloat() * 89990000);
			strNo = Integer.toString(number);
		}
		else if(howManyDigit==9)
		{
			number = 100000000 + (int)(random.nextFloat() * 899900000);
			strNo = Integer.toString(number);
		}
		else if(howManyDigit==10)
		{
			number = 1000000000 + (int)(random.nextFloat() * 1147483600);
			strNo = Integer.toString(number);
		}
		
	
		
		else
			
		{
			number = 1 + (int)(random.nextFloat() * 1147483600);
			strNo = Integer.toString(number);
		}

		return strNo;
	}
	
	
	
	}
