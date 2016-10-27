package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class Spiral
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(7);
    ColorWheel.addColor(PenColors.Purples.BlueViolet);
    ColorWheel.addColor(PenColors.Purples.Violet);
    ColorWheel.addColor(PenColors.Purples.Purple);
    //    Do the following 75 times --#3.1
    for (int i = 0; i < 75; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.turn(360 / 10);
      Tortoise.move(i * 5);
    }
    try
    {
    }
    catch (RuntimeException re)
    {
      MessageBox.showMessage("Hold up: " + re);
    }
    //    Repeat --#3.2
  }
}
