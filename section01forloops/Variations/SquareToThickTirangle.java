package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToThickTirangle
{
  //
  //------ Kata qustion----
  //how would you make an equilateral triangle
  //write out the steps in english
  //translate the steps into Java
  // make sure to run after each line
  //make line width = 20 pixels
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setName("Miles and Naythan");
    VirtualProctor.setClassName("Palm Digital");
    Tortoise.show();
    Tortoise.setSpeed(7);
    Tortoise.setPenWidth(20);
    //make 3 sides
    int sides = 3;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(PenColors.Blues.Blue);
      Tortoise.move(50);
      Tortoise.turn(360 / sides);
    }
    //  Repeat --#5.2
    //
  }
}
