package com.a129;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class InbuiltWorkEx1 
{
  // execute before class
  @BeforeClass
  public static void beforeClass() 
  {
    System.out.println("in before class");
  }

  // execute after class
  @AfterClass
  public static void afterClass() 
  {
    System.out.println("in after class");
  }

  // execute before test
  @Before
  public void before() 
  {
    System.out.println("in before");
  }

  // execute after test
  @After
  public void after() 
  {
    System.out.println("in after");
  }

  // test case
  @Test
  public void test() 
  {
    System.out.println("in test");
  }

  // test case ignore and will not execute
  @Ignore
  public void ignoreTest() 
  {
    System.out.println("in ignore test");
  }
}

public class InbuiltWorkEx 
{
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(InbuiltWorkEx1.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
   }
}