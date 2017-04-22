package se.iths;

import java.util.Random;

public class TryRand {
  public static void main (String[] args) {
    Random rand = new Random();
    for (int i = 0; i < 100; i ++) {
      int number = rand.nextInt(8) +1;
      System.out.print(number + ", ");
    }
  }
}
