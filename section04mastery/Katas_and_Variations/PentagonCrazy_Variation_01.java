package org.teachingkidsprogramming.section04mastery.Katas_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Grays;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;

public class PentagonCrazy_Variation_01
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    createColorPalette();
    //
    drawPentagon();
  }
  static int whatever = 0;
  private static void drawPentagon()
  {
    for (int i = 0; i < 2000; i++)
    {
      adjustPen();
      //
      Tortoise.move(i * 2);
      Tortoise.turn(360 / 2);
      Tortoise.turn(1);
      whatever = i;
    }
  }
  private static void adjustPen()
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.setPenWidth(Tortoise.getPenWidth() + 1);
    if (Tortoise.getPenWidth() > 4)
    {
      Tortoise.setPenWidth(2);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(Grays.Black);
    ColorWheel.addColor(Reds.FireBrick);
  }
}
