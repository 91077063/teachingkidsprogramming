package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class OneUp
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Grays.Gray);
    ColorWheel.addColor(PenColors.Grays.Black);
    //    Do the following 75 times --#3.1
    //    Repeat --#3.2
    //  
    for (int i = 0; i < 100; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(i * 4);
      Tortoise.turn(-360 / 6); // set the coolness
      // 
      for (int j = 0; j < 15; j++)
      {
        Tortoise.setPenWidth(4);
        Tortoise.move(j * 5);
        Tortoise.turn(360 / 6);
        Tortoise.setPenColor(ColorWheel.getNextColor());
        VirtualProctor.setName("Miles and Naythan");
        VirtualProctor.setClassName("Palm Digital");
      }
    }
  }
}
//for (int i = 0; i < 75; i++)
//{
//Tortoise.setPenColor(ColorWheel.getNextColor());
//Tortoise.turn(360 / 3);
//Tortoise.move(i * 5);
//}
//try
//{
//}
//catch (RuntimeException re)
//{
// MessageBox.showMessage("Hold up: " + re);
//}
