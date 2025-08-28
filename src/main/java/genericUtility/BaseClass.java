package genericUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

@BeforeSuite
public void beforesuite()
{
	System.out.println("Executing before suite");
}


@BeforeClass
public void beforeclass()
{
	System.out.println("Executing before class");
}


@BeforeMethod
public void beforemethod()
{
	System.out.println("Executing before method");
}

@AfterMethod
public void aftermethod()
{
	System.out.println("Executing after method");
}

@AfterClass
public void afterclass()
{
	System.out.println("Executing after class");
}


@AfterSuite
public void aftersuite()
{
	System.out.println("Executing after suite");
}


}
