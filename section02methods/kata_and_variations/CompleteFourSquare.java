package org.teachingkidsprogramming.section02methods.kata_and_variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

//  Use the Tortoise to draw four squares, each with a width and height of 50 pixels
// Write out the steps in English
// Then translate the steps into code
// Make sure to run after each line
//
public class CompleteFourSquare
{
  public static void main(String[] args)
  {
    System.out.println("be sure to complete the main method to start");
    //TODO: write comments and then code here
    //show the tortoise--#1.1
    Tortoise.show();
    //repeat the following 4 times --7.1
    for (int i = 0; i < 4; i++)
    {
      drawSquare();
      Tortoise.turn(90);
      //turn 90 degrees to the right--5
    }
    //end loop 7.2
  }
  // extract method drawSquare 6.1
  private static void drawSquare()
  {
    // change the color to random--1.2
    Tortoise.setPenColor(PenColors.getRandomColor());
    //repeat the following 4 times--4.1
    for (int i = 0; i < 4; i++)
    {
      //move the tortoise 50 pixels--2
      Tortoise.move(50);
      // turn 90 degrees to the right--3
      Tortoise.turn(90);
      //end loop--4.2
    }
    //end method--6.2
  }
}
