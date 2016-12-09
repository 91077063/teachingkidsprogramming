package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class AdLibs
{
  static String currentStory    = "";
  static String currentAdverb   = "";
  static String currentEdVerb   = "";
  static String currentBodyPart = "";
  public static void main(String[] args)
  {
    currentAdverb = MessageBox.askForTextInput("Enter a name");
    currentEdVerb = MessageBox.askForTextInput("Enter a verb ");
    currentBodyPart = MessageBox.askForTextInput("Enter a body part");
    currentStory = "hi " + "my name is " + currentAdverb + " " + "and I " + currentEdVerb + "  " + currentBodyPart
        + "  " + "HUHHHHHHHHHH " + ". ";
    if (currentAdverb == "Miles")
    {
      MessageBox.showMessage(" Miles is a cool dude and your probably just jealous.");
    }
    MessageBox.showMessage(currentStory);//view
  }
}