package com.a129;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JUnitWithExceptionEx 
{
	
	@Test(expected = ArithmeticException.class)
	 public void testPrintMessage() 
	{
	    int a = 0;
	    int b = 10 / a;
	    //assertEquals(0,b);
	    System.out.println(b);
	  }
	
	
	public static void main(String[] args) 
	{
		 Result result = JUnitCore.runClasses(JUnitWithExceptionEx.class);
	      for (Failure failure : result.getFailures()) 
	      {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());
	   }
}

