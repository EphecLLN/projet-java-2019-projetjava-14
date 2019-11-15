package projet;

import java.util.Random;

/**
 * Create a random number that is greater than or equal to 0,
 * and less than 100. (It is set to run 20 tests.)
 */
public class IA
{
  public static void main(String[] args)
  {
    

    // create a new Java Random object
    Random random = new Random();
    
      int randomInt = random.nextInt(10);
      System.out.format("test %2d, randomInt = %d\n", randomInt );
    }
  }