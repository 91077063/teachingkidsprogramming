package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
//----kata question
//where do you see duplicated lines of code
// and how can you refactor to make this code readable
//write out the steps in english
//then transl8 the steps into code
//make sure to run after each line
//----kata question
//where do you see duplicated lines of code
//and how can you refactor to make this code readable
//write out the steps in english
//then transl8 the steps into code
//make sure to run after each line
//----kata question
//where do you see duplicated lines of code
//and how can you refactor to make this code readable
//write out the steps in english
//then transl8 the steps into code
//make sure to run after each line
//----kata question
//where do you see duplicated lines of code
//and how can you refactor to make this code readable
//write out the steps in english
//then transl8 the steps into code
//make sure to run after each line

//be aware: this is an example of too much refacktoring i.e. after
//we're done it will be less readable than before, Thas bad.
public class PyramidsOfGizaRemoveEvenmoreduplication_04
{
  public static void main(String[] args) throws Exception
  {
    setUpPyramidLand();
    //bad refactoring
    int[][] degreesAndLength = {{-90, 220},
                                {135, 100},
                                {90, 100},
                                {-90, 100},
                                {90, 100},
                                {-90, 100},
                                {90, 100},
                                {135, 210}};
    for (int[] i : degreesAndLength)
    {
      Tortoise.turn(i[0]);
      Tortoise.move(i[1]);
    }
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
