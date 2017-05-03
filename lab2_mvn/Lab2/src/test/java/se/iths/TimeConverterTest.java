package se.iths;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TimeConverterTest {
  
  private TimeConverter tc;
  
  @Before
  public void start() {
    tc = new TimeConverter();
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testGetMeridiemTooSmall() {
    tc.getMeridiem(-1);
  }
  @Test(expected = IllegalArgumentException.class)
  public void testGetMeridiemTooBig() {
    tc.getMeridiem(24);
  }
  
  @Test
  public void testGetMeridiemZero() {
    String s = tc.getMeridiem(0);
    assertEquals("AM", s);
  }
  @Test
  public void testGetMeridiemEleven() {
    String s = tc.getMeridiem(11);
    assertEquals("AM", s);
  }
  @Test
  public void testGetMeridiemTwelve() {
    String s = tc.getMeridiem(12);
    assertEquals("PM", s);
  }
  @Test
  public void testGetMeridiemTwnThree() {
    String s = tc.getMeridiem(23);
    assertEquals("PM", s);
  }
}
