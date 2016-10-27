package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

//
//------ Kata qustion----
//
// how would you make an equalateral triangle with a
//horizontal base?
//write the stpes in english
// translate into code
//run after every line
//
//make all angles equal
public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setName("Miles and Naythan");
    VirtualProctor.setClassName("Mr. C");
    Tortoise.show();
    Tortoise.setSpeed(7);
    //make all  sides equal--#1
    //make all the 3 sides equal -- #1
    for (int i = 0; i < 10; i++)
    {
      Tortoise.setPenColor(PenColors.Blues.Blue);
      Tortoise.move(i * 5);
      Tortoise.turn(360 / i);
    }
    //  Repeat --#5.2
    //
  }
}
