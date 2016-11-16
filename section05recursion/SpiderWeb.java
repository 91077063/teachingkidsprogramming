package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    Change the width of the line the tortoise draws to 1 pixel --#12
    //    Change the Tortoise to a Spider --#14
    //    Change the pen color of the line the tortoise draws to red --#13.1
    //    Set the color of the background window to black (HINT: use the Tortoise to get the background window) --#13.2
    double lineLength = 10.5;
    double zoom = 1.1;
    //    Do the following 10 times --#10.1
    lineLength = weaveOneLayer(lineLength, zoom);
    //
    //        Change the current zoom so it is multiplied by 1.3 --#11
    //    Repeat --#10.2
  }
  private static double weaveOneLayer(double lineLength, double zoom)
  {
    //        weaveOneLayer (recipe below) --#9.1
    //
    //        ------------- Recipe for weaveOneLayer --#9.2
    for (int i = 0; i < 6; i++)
    {
      drawTriangle(lineLength);
      //
      Tortoise.turn(360 / 6);
      lineLength = lineLength + zoom;
    }
    //        ------------- End of weaveOneLayer recipe --#9.3
    return lineLength;
  }
  private static void drawTriangle(double lineLength)
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(lineLength);
      Tortoise.turn(360 / 3);
    }
  }
}
