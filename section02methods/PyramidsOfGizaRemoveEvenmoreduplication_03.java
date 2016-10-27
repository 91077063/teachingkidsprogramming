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
public class PyramidsOfGizaRemoveEvenmoreduplication_03
{
  public static void main(String[] args) throws Exception
  {
    setUpPyramidLand();
    turnAndMove(-90, 220);
    turnAndMove(135, 100);
    moveDown();
    moveUp();
    moveDown();
    moveUp();
    moveDown();
    turnAndMove(135, 210);
  }
  private static void turnAndMove(int degrees, int length)
  {
    Tortoise.turn(degrees);
    Tortoise.move(length);
  }
  private static void moveUp()
  {
    //look for duplicated lines of code
    //refactor code that moves tortoise up
    Tortoise.turn(-90);//!!
    Tortoise.move(100);
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
