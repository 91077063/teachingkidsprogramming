package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class exeptionalAdLibs
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    MessageBox.showMessage("The adverb is " + adverb);
    String edVerb = askEDVerb();
    MessageBox.showMessage("The ed verb is " + edVerb);
    String bodyPart = askBodyPart();
    MessageBox.showMessage("The body part is " + bodyPart);
    String currentStory = "Today i woke " + adverb + ". Then I " + edVerb + " my " + bodyPart + ". ";
    MessageBox.showMessage(currentStory);
  }
  public static String askEDVerb()
  {
    String edverb = MessageBox.askForTextInput("what is the -ed verb");
    if (edverb.isEmpty())
    {
      MessageBox.showMessage("Please enter an ed verb");
    }
    return edverb;
  }
  public static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("What is the adverb");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Please enter an adverb");
      adverb = askAdverb();
    }sf
    if (adverb.matches("[\\d*]"))
    {
      MessageBox.showMessage("no body no story pay attention and start over!");
      adverb = askBodyPart();
    }
    return adverb;
  }
  public static String askBodyPart()
  {
    String bodyPart = MessageBox.askForTextInput("What is the body Part");
    if (bodyPart.isEmpty())
    {
      MessageBox.showMessage("Please enter a body part");
      bodyPart = askBodyPart();
    }
    if (bodyPart.matches("[\\d*]"))
    {
      MessageBox.showMessage("no body no story pay attention and start over!");
      bodyPart = askBodyPart();
    }
    return bodyPart;
  }
}