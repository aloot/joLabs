package se.iths;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AmericanizerTest {
  Americanizer a;
  TimeConverter tc;
  MeasureConverter mc;
  
  @Before
  public void start() {
    a = new Americanizer();
    tc = new TimeConverter();
    mc = new MeasureConverter();
  }
  
  @Test
  public void testConvertTime(){
    a.setTimeConverter(tc);
    String s = a.convertTime(4);
    assertEquals("4 AM", s);
  }
  @Test
  public void testConvertTimeTwelve(){
    a.setTimeConverter(tc);
    String s = a.convertTime(12);
    assertEquals("12 AM", s);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConvertTimePass(){
    System.out.println("Pass");
    a.setTimeConverter(tc);
    a.convertTime(25);
  }
  @Test(expected = IllegalArgumentException.class)
  public void testConvertTimeFail(){
    System.out.println("Fail");
    a.setTimeConverter(tc);
    a.convertTime(2);
  }

  @Test
  public void testConvertToPound() {
    a.setWeightConverter(mc);
    int nr = a.convertToPound(10);
    assertEquals(3, nr);
  }
  @Test
  public void testConvertToPoundBoolean() {
    a.setWeightConverter(mc);
    int nr = a.convertToPound(10);
   // nr = mc.convertWeight(10, false);
    assertEquals(27, nr);
    }

  @Test
  public void testConvertToFeet() {
    a.setWeightConverter(mc);
    int nr = a.convertToFeet(105);
    assertEquals(3, nr);
  }
  
  @Test
  public void testConvertSpeach() {
    String s = a.convertSpeach(" abc");
    assertEquals("yo dude! abc, you know?", s);
  }
}
