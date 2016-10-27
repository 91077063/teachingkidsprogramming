package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class CompleteSquare
{
  // Use the tortoise to draw a red square with a width and a height of 40 pix
  //
  // write each of the English line comments(use at least 6 line comments)
  //
  // number each comment line at the end, so your user knows the correct order to translate the code
  //
  // Verify - step one - translate EACH comment line into Java code.
  //
  //Verify - step two - Run your code after each line.
  public static void main(String[] args) throws Exception
  {
    // TODO: write comments and then code here 
    // show the tortoise -- #1
    //change the pen color to red #2
    //make tortoise move as fast as possible --#3
    // repeat the following 2 times #6.1
    // move the tortoise 40 pixels --#4
    //turn the tortoise to the right 90 degrees--#5
    //end the loop #6.2
    Tortoise.show();
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.setSpeed(10);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(40);
      Tortoise.turn(90);
    }
  }
}
