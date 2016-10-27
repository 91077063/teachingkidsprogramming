package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToThickHexagonMulticolor
{
  //
  //------ Kata qustion----
  //how would you make an equilateral triangle
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
    //make 3 sides
    int sides = 6;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.move(50);
      Tortoise.turn(360 / sides);
    }
    //  Repeat --#5.2
    //
  }
}
