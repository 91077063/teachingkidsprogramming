package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import java.text.StringCharacterIterator;

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
//what happens when you enter letters
//how can you see what your guess is exactly
//write out the stepes theisnr
public class HiLowSeeBugInfo
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    //MessageBox.showMessage("The answer is " + answer); // delete (or comment out) this line after testing the game 
    for (int i = 0; i < 7; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!");
        System.exit(0);
      }
      else if (guess == )
      {
        MessageBox.showMessage(guess + " is an invalid value!");
        System.exit(0);
      }
      else if (guess < 0)
      {
        MessageBox.showMessage(guess + " is invalid because values can't be below 100");
      }
      else if (guess > 100)
      {
        MessageBox.showMessage(guess + " is invalid because values can't be over 100");
        System.exit(100);
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high!");
      }
      else if ((guess - answer) < 5 && (guess - answer) > -5)
      {
        MessageBox.showMessage("You are really close!");
      }
      else
      {
        MessageBox.showMessage("Too low!");
      }
    }
    MessageBox.showMessage("You lost");
  }
