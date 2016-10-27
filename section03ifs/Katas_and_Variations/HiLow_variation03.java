package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_variation03
{
  public static void main(String[] args)
  {
    //    Choose a random number between 1 and 100 --#4.1 (fake!) & --#13
    int answer = NumberUtils.getRandomInt(50, 100);
    int numGuesses = MessageBox.askForNumericalInput("How many guesses do you want?");
    for (int i = 0; i < numGuesses; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number between 50 and 100");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You Won!!!");
        System.exit(0);
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Its too high!!");
      }
      else if (guess < answer)
      {
        MessageBox.showMessage("Its too low");
      }
    }
    MessageBox.showMessage("You Lost");
    MessageBox.showMessage("The number was " + answer);
  }
}
