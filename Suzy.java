/*
Kevin Nguyen
Mr.Rosen
October 19, 2018
This class will animate Suzy moving onto the train and talking with Subway Ninja as
she orders a cut up bacon sandwich.
*/

// The "Suzy" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; // to access Thread class

public class Suzy extends Thread
{
    private Console c;

    // Global colour variable for text and Suzy's outfit lines
    Color lineBlack = new Color (0, 0, 0);
    // Global colour variable for the station's background
    Color backgroundPurple = new Color (165, 86, 255);

    // Outputs one line of Subway Ninja's dialogue related to Meredith's order
    public void text ()
    {
	c.setColor (lineBlack);
	c.drawString ("Another happy customer!", 225, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Another happy customer!", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}
    }


    // Animates Suzy moving onto the screen
    public void animate ()
    {
	// loop used to animate Suzy
	for (int x = 0 ; x < 201 ; x++)
	{
	    // Local colour variable for Suzy's mouth
	    Color mouthRed = new Color (196, 25, 25);
	    // Local colour variable for Suzy's eyes
	    Color eyeBlue = new Color (46, 83, 111);
	    // Local colour variable for Suzy's skin
	    Color skinPeach = new Color (255, 205, 148);
	    // Local colour variable for Suzy's shirt
	    Color shirtGreen = new Color (5, 165, 0);
	    // Local colour variable for Suzy's hat
	    Color hatRed = new Color (216, 33, 41);
	    // Local colour variable for Suzy's pants
	    Color pantBlue = new Color (8, 43, 81);
	    // Local colour variable for Suzy's shoes
	    Color shoeOrange = new Color (255, 89, 0);

	    // Erase of Suzy
	    c.setColor (backgroundPurple);
	    c.fillRect (680 - x, 102, 79, 101);

	    // Suzy's left shoe
	    c.setColor (shoeOrange);
	    c.fillRect (704 - x, 198, 10, 5);

	    // Suzy's right shoe
	    c.fillRect (724 - x, 198, 10, 5);

	    // Suzy's left leg
	    c.setColor (pantBlue);
	    c.fillRect (704 - x, 174, 10, 24);

	    // Suzy's right leg
	    c.fillRect (724 - x, 174, 10, 24);

	    // Suzy's head
	    c.setColor (skinPeach);
	    c.fillRoundRect (708 - x, 111, 23, 23, 10, 10);

	    // array of local int variables of x coordinates to make Suzy's shirt
	    int suzyShirtX[] = {710 - x, 694 - x, 744 - x, 728 - x};
	    // array of local int variables of y coordinates to make Suzy's shirt
	    int suzyShirtY[] = {134, 174, 174, 134};
	    // array of local int variables of x coordinates to make Suzy's left arm
	    int suzyLeftArmX[] = {705 - x, 685 - x, 680 - x, 700 - x};
	    // array of local int variables of y coordinates to make Suzy's left arm
	    int suzyLeftArmY[] = {154, 135, 140, 160};
	    // array of local int variables of x coordinates to make Suzy's right arm
	    int suzyRightArmX[] = {733 - x, 753 - x, 758 - x, 738 - x};
	    // array of local int variables of y coordinates to make Suzy's right arm
	    int suzyRightArmY[] = {154, 135, 140, 160};

	    // Suzy's shirt
	    c.setColor (shirtGreen);
	    c.fillPolygon (suzyShirtX, suzyShirtY, 4);

	    // Suzy's left arm
	    c.fillPolygon (suzyLeftArmX, suzyLeftArmY, 4);
	    // Suzy's right arm
	    c.fillPolygon (suzyRightArmX, suzyRightArmY, 4);

	    // Suzy's shirt lines
	    c.setColor (lineBlack);
	    c.drawLine (708 - x, 140, 730 - x, 140);
	    c.drawLine (703 - x, 155, 735 - x, 155);
	    c.drawLine (698 - x, 165, 740 - x, 165);

	    // Suzy's left eye
	    c.setColor (eyeBlue);
	    c.fillOval (711 - x, 115, 7, 7);
	    // Suzy's right eye
	    c.fillOval (721 - x, 115, 7, 7);

	    // Suzy's mouth
	    c.setColor (mouthRed);
	    c.drawArc (712 - x, 120, 13, 10, 180, 187);

	    // Suzy's hat
	    c.setColor (hatRed);
	    c.fillArc (708 - x, 102, 23, 20, 0, 180);
	    c.drawLine (698 - x, 110, 708 - x, 110);
	    c.drawLine (698 - x, 111, 708 - x, 111);

	    try
	    {
		Thread.sleep (5); // make this 5
	    }


	    catch (InterruptedException e)
	    {
	    }
	}
    }


    // Conversation between Suzy and Subway Ninja, where she orders a sandwich to be cut up
    // NOTE: Suzy's dialogue is purposefully mispelt for comedic effect
    public void text2 ()
    {
	try
	{
	    Thread.sleep (1000); // make this 1000
	}


	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Hallo mistah Ninja!!", 375, 120);

	try
	{
	    Thread.sleep (2000); // make this 2000
	}


	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Hallo mistah Ninja!!", 375, 120);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}


	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Hello Suzy! What can I get for you?", 225, 40);

	try
	{
	    Thread.sleep (2000); // make this 2000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Hello Suzy! What can I get for you?", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("I want a bacon sandwich pwease!!!", 325, 120);

	try
	{
	    Thread.sleep (2000); // make this 2000
	}


	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("I want a bacon sandwich pwease!!!", 325, 120);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}


	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("And pwease cut it up!!", 375, 120);

	try
	{
	    Thread.sleep (2000); // make this 2000
	}


	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("And pwease cut it up!!", 375, 120);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}


	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Sure thing Suzy!", 225, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Sure thing Suzy!", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}
    }


    public Suzy (Console con)
    {
	c = con;
    }


    public void run ()
    {
	text ();
	animate ();
	text2 ();
    }
} // Suzy class


