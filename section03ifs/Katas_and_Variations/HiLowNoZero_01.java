package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;

//-----kata question------
//How would you make sure the guess is NOT zero
//and end the game if the guess is zero?
//write out the steps in english
//then translate the steps into code
//Make sure to run after each line

//
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLowNoZero_01
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    MessageBox.showMessage("The answer is " + answer); // delete (or comment out) this line after testing the game 
    for (int i = 0; i < 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!");
        System.exit(0);
      }
      else if (guess == 0)
      {
        MessageBox.showMessage("No zero.");
        System.exit(0);
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high");
      }
      else
      {
        MessageBox.showMessage("Too low");
      }
    }
    MessageBox.showMessage("You lost");
  }
}