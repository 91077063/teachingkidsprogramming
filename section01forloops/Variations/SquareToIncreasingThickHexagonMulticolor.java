package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToIncreasingThickHexagonMulticolor
{
  //
  //------ Kata qustion----
  //how would you make an equilateral triangle...
  //with 20 pixel thick sides?
  //and multicolored lines?
  //and with the side lengths of 25 that increase by 2?
  //write out the steps in english
  //translate the steps into Java
  // make sure to run after each line
  //chnage the color of the line to multicolor
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setName("Miles and Naythan");
    VirtualProctor.setClassName("Palm Digital");
    Tortoise.show();
    Tortoise.setSpeed(7);
    Tortoise.setPenWidth(20);
    //make 6 sides
    int sides = 6;
    int length = 5;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.move(length);
      length = length * 2;
      Tortoise.turn(360 / sides);
    }
    //  Repeat --#5.2
    //
  }
}
