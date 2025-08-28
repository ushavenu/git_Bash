package module_1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;

@Listeners(genericUtility.listnerUtility.class)
public class Tc_01 extends BaseClass {

	@Test
	public void demoTest()
	{
		System.out.println("running demo testscipt");
	}
}
