package org.teachingkidsprogramming.section05recursion.katas_and_variations;

public class TowersOfHanoi
{
  // feilds
  public static int index;
  public static void main(String[] args)
  {
    // create constant variables 
    final int NUM_DISCS = 4;// number of  disc to move
    final int FROM_PEG = 1;//initial from peg
    final int TO_PEG = 3; //initial to peg
    final int TEMP_PEG = 2;// initial temp peg
    //play game
    moveDiscs(NUM_DISCS, FROM_PEG, TO_PEG, TEMP_PEG);
    System.out.println("\nAll thediscs are moved!");
  }
  private static void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg)
  {
    if (num > 0)
    {
      moveDiscs(num - 1, fromPeg, tempPeg, toPeg);
      index++;
      System.out.println(index + ". Move a disc from peg" + fromPeg + "to peg" + toPeg);
      moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
    }
  }
}
