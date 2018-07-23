package com.practice.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void onMethods() {
		
		
		System.out.println("on method");
		Assert.fail();
		
	}
	
	
	@Test(dependsOnMethods= {"onMethods"})
	public void sleep()
	{
		System.out.println("on 2nd method");
		
	}
	

}
