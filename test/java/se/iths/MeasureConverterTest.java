package se.iths;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MeasureConverterTest {
  
  private MeasureConverter mc;
  
  @Before
  public void start() {
    mc = new MeasureConverter ();
  }
  
  @Test
  public void testConvertWeight() {   
    int nr = mc.convertWeight(50, true);
    assertEquals(18, nr);

    nr = mc.convertWeight(50, false);
    assertEquals(135, nr);
  }
  
  @Test
  public void testConvertToFeet() {
    int nr = mc.convertToFeet(75);
    assertEquals(2, nr);
  }
}
