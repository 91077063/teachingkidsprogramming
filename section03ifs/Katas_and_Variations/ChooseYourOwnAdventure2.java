package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ChooseYourOwnAdventure2
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    tellMoreStory("One morning the Tortoise woke up in a dream.");
    animateStartStory();
    String action = askAQuestion("Do you want to 'wake up' or 'explore' the dream?");
    if ("wake up".equalsIgnoreCase(action))
    {
      wakeUp();
    }
    else if ("explore".equalsIgnoreCase(action))
    {
      approachOoze();
    }
    else
    {
      endStory();
    }
  }
  private static void endStory()
  {
    MessageBox.showMessage("You don't know how to read directions. You can't play this game. Get out of here!");
  }
  private static void approachOoze()
  {
    MessageBox.showMessage(
        "You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket.");
    String action = askAQuestion("Do you want to pour the ooze into the 'backyard' or 'toilet'?");
    if ("toilet".equalsIgnoreCase(action))
    {
      pourIntoToilet();
    }
    //            pourIntoBackyard (recipe below) --#19.1
    if ("backyard".equalsIgnoreCase(action))
    {
      pourIntoBackyard();
    }
    //            ------------- Recipe for pourIntoBackyard --#19.2
    //         ------------- End of pourIntoBackyard recipe --#19.3
  }
  private static void pourIntoBackyard()
  {
    MessageBox.showMessage(
        "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
    String action1 = askAQuestion("As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?");
    //                If they answer "faint" --#20.1
    if ("faint".equalsIgnoreCase(action1))
    {
      startStory();
    }
    //                Otherwise, if they answer "scream" --#20.2
    else if ("scream".equalsIgnoreCase(action1))
    {
      Tortoise.setAnimal(Animals.ExplodedTurtle);
      MessageBox.showMessage("You made a delicious soup! Yum! The end.");
    }
    else
    {
      endStory();
    }
  }
  private static void pourIntoToilet()
  {
    MessageBox.showMessage(
        "As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste.");
    String action = askAQuestion("Do you want to train to be a ninja 'Yes' or 'Heck Yes'?");
    if ("yes".equalsIgnoreCase(action) || "heck yes".equalsIgnoreCase(action))
    {
      MessageBox
          .showMessage("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
    }
    //    if ("no".equalsIgnoreCase(action))
    //    {
    //      MessageBox
    //          .showMessage("Well.. You're are going to live the rest of your life as a .");
    //    }
  }
  private static void wakeUp()
  {
    MessageBox.showMessage("You wake up to your enclosure in Cincinatii Zoo..");
    String action = askAQuestion(
        "A child falls into the enclosure.. What do you do? Pick it up? or Leave it Alone?");
    if ("Pick it up".equalsIgnoreCase(action))
    {
      MessageBox.showMessage("You start to drag him around! People start screaming!");
      MessageBox.showMessage(
          "The Zoo Keeper shows up and pulls out his gun..you turn around to shelter the child but get shot.");
      MessageBox.showMessage("BANG! You die. Heros live forever, but legends never die.. Good job.");
      startStory();
    }
    {
      if ("Leave it alone".equalsIgnoreCase(action))
      {
        MessageBox.showMessage("The child eventually gets saved by a firefighter. The end.");
        endStory();
      }
    }
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Grays.Black;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = PenColors.lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  private static void tellMoreStory(String message)
  {
    MessageBox.showMessage(message);
  }
  private static String askAQuestion(String question)
  {
    String answer = MessageBox.askForTextInput(question);
    return answer;
  }
}
