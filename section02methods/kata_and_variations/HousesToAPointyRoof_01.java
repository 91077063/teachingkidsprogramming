package org.teachingkidsprogramming.section02methods.kata_and_variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class HousesToAPointyRoof_01
{
  //product owner wants to change to a pointy roof
  //-kata question-
  //how would you make a house with a pointy roof
  //write steps in english
  //translate into code
  //run after each line
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Miles and Nathan");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawHousePointyRoof(height);
    drawHousePointyRoof(120);
    drawHousePointyRoof(90);
    drawHousePointyRoof(20);
  }
  private static void drawHouseFlatRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawFlatRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHousePointyRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawPointyRoof()
  {
    //make a pointy roof
    //turn the tortoise 45 degrees to the right #1
    Tortoise.turn(45);
    //move the tortoise a pixels #2
    Tortoise.move(30);
    //turn the tortoise 90 degrees to the right #3
    Tortoise.turn(90);
    //move the tortoise a pixels #4
    Tortoise.move(30);
    // turn the tortoise 45 degrees the the right--#5
    Tortoise.turn(45);
  }
  private static void drawFlatRoof()
  {
    // make flat roof
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
