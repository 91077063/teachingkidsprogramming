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

//---Kata question---//
//How would you make sure the guess is Not zero
//and end the game if the guess is zero
//How would you make sire the guess is not a negative number 
//but go to the next turn if negative
//how would you make sure the guess is less than 100
// and end the game if it is greater than 100
//write in English
//translate into code
// run after each line
//
public class HiLowNoZeroNoNegativeAndPlayOn_02
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    MessageBox.showMessage("The answer is " + answer); // delete (or comment out) this line after testing the game 
    for (int i = 0; i < 2; i++)
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
      else if (guess < 0)
      {
        MessageBox.showMessage("it cant be less than 0");
      }
      else if (guess > 100)
      {
        MessageBox.showMessage("it cant be over 100");
        System.exit(100);
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