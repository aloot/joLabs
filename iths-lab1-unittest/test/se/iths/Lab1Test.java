package se.iths;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class Lab1Test {

  private Lab1 lab1;
  private String one = "We cannot solve our problems with the same "
      + "thinking we used when we created them. - Albert Einstein";
  private String two = "A fool thinks himself to be wise, but a wise "
      + "man knows himself to be a fool. - William Shakespeare";
  private String three = "You must be the change you wish to see in "
      + "the world. - Mahatma Gandhi";
  private String four = "aIn the End, we will remember not the words of"
      + " our enemies, but the silence of our friends. - Martin Luther King, Jr.";
  private String five = "Choose a job you love, and you will never "
      + "have to work a day in your life. - Confucius";
  private String six = "aTo expect the unexpected shows a thoroughly "
      + "modern intellect. - Oscar Wilde";
  private String seven = "Without music, life would be a mistake. - "
      + "Friedrich Nietzsche";
  private String eight = "aI love deadlines. I like the whooshing sound "
      + "they make as they fly by. - Douglas Adams";
 
  @Before
  public void start() {
    lab1 = new Lab1 ();
  }
  
  
  @Test
  @Category(MatteTests.class)
  public void testAdd() {
    int nr = lab1.add(4, 5);
    assertEquals(9, nr);
  }

  @Test
  @Category(MatteTests.class)
  public void testSubtract(){
    int nr = lab1.subtract(4, 5);
    assertEquals(-1, nr);
  }
  
  @Test
  @Category(MatteTests.class)
  public void testMultiply() {
    int nr = lab1.multiply(4, 5);
    assertEquals(20, nr);
  }
  
  @Test
  @Category(MatteTests.class)
  public void testDivide() {
    int nr = lab1.divide(20, 4);
    assertEquals(5, nr);
  }
  @Test
  @Category(MatteTests.class)
  public void testDivideZero() {
    try {
      lab1.divide(20, 0);
    } catch (ArithmeticException ae) {
//      new AssertionError("Divide by zero error in lab1.divide()");
    }
    assertFalse("Div by zero error in lab1.divide()", true);
  }
  
  @Test
  public void testReverse() {
    String s = lab1.reverse("abcdefg");
    assertEquals("gfedcba", s);
  }
  
  @Test
  public void testQuote() {
    ArrayList<Integer> intList = new ArrayList<>(100);
    for (int countHundred = 0; countHundred < 100; countHundred++) {
      int i = -1;
      String s = lab1.quote();
      if (s.equals(one)) {
        i = 1;
      } else if (s.equals(two)) {
        i = 2;
      } else if (s.equals(three)) {
        i = 3;
      } else if (s.equals(four)) {
        i = 4;
      } else if (s.equals(five)) {
        i = 5;
      } else if (s.equals(six)) {
        i = 6; 
      } else if (s.equals(seven)) {
        i = 7;
      } else if (s.equals(eight)) {
        i = 8;
      }
      if (i > 0 && !intList.contains(i)) {
        intList.add(i);
      }
    } // end of 100 times
    if (intList.size() < 8) {
      ArrayList<Integer> errList = new ArrayList<Integer>();
      for (int counter = 1; counter < 9; counter ++) {
        if (!intList.contains(counter)) {
          errList.add((Integer) counter);
  //        assertFalse("Error in lab1.quote(), case: " + errList , !intList.contains(counter));
  //        new AssertionError("Error in lab1.quote(), cases: " + errList);
        }
      }

      System.out.println("case(s) not reached: " + errList);
    }
    assertEquals(8, intList.size());
  }
  
  @Test
  public void testGetCounter() {
    int c1 = lab1.getCounter();
    lab1.add(1, 1);
    lab1.subtract(1, 1);
    lab1.multiply(1, 1);
    lab1.divide(1, 1);
    lab1.reverse("hej");
    lab1.quote();
    int c2 = lab1.getCounter();
    assertEquals(6, c2 - c1);
  }
  
  /*@Test
  public void testQuote2(ArrayList<Integer> intList) {
      ArrayList<Integer> errList = new ArrayList<Integer>();
      for (int counter = 1; counter < 9; counter ++) {
        if (!intList.contains(counter)) {
          errList.add((Integer) counter);
    //      assertFalse("not in list: ", intList.contains(counter));
          System.out.println("not in list: " + counter);
        }
      }
      System.out.println(errList);    
  }*/
  
  
  /*@BeforeClass
  public static void startClass() {
    System.out.println("In BeforeClass");
  }
  
  @Before
  public void start() {
    System.out.println("In Before");
  }
  
  @After
  public void end() {
    System.out.println("In After");
  }
  
  @AfterClass
  public static void endClass() {
    System.out.println("In AfterClass");
  }
  
  @Test
  public void test1() {
    System.out.println("In test1");;
  }
  @Test
  public void test2() {
    System.out.println("In test2");*/
}

