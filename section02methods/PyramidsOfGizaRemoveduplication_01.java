package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
//----kata question
//where do you see duplicated lines of code
// and how can you refactor to make this code readable
//write out the steps in english
//then transl8 the steps into code
//make sure to run after each line

public class PyramidsOfGizaRemoveduplication_01
{
  public static void main(String[] args) throws Exception
  {
    setUpPyramidLand();
    Tortoise.turn(-90);
    Tortoise.move(220);
    Tortoise.turn(135);
    Tortoise.move(100);
    moveDown();
    Tortoise.turn(-90);
    Tortoise.move(100);
    moveDown();
    Tortoise.turn(-90);
    Tortoise.move(100);
    moveDown();
    Tortoise.turn(135);
    Tortoise.move(210);
  }
  private static void moveDown()
  {
    //move the tortoise down
    //Extract a method and name it moveDown()
    Tortoise.turn(90); //!!! 
    Tortoise.move(100);//!!!
  }
  private static void setUpPyramidLand()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Blues.AliceBlue);
    Tortoise.setPenColor(PenColors.Yellows.DarkGoldenrod);
    Tortoise.setPenWidth(2);
    Tortoise.hide();
  }
}
