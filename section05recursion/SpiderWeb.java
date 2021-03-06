package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(1);
    Tortoise.setAnimal(Animals.Spider);
    Tortoise.setPenColor(PenColors.Whites.White);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    double lineLength = 10.5;
    double zoom = 1.1;
    for (int i = 0; i < 10; i++)
    {
      lineLength = weaveOneLayer(lineLength, zoom);
      zoom = zoom * 1.3;
    }
  }
  private static double weaveOneLayer(double lineLength, double zoom)
  {
    for (int i = 0; i < 6; i++)
    {
      drawTriangle(lineLength);
      Tortoise.turn(360 / 6);
      lineLength = lineLength + zoom;
    }
    return lineLength;
  }
  private static void drawTriangle(double lineLength)
  {
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(lineLength);
      Tortoise.turn(360 / 6);
    }
  }
}
