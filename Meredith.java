/*
Kevin Nguyen
Mr.Rosen
October 17, 2018
This class will animate Meredith moving onto the train and output her conversation
with Subway Ninja, in which she orders 3 subway sandwiches.
*/

// The "Meredith" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; // to access Thread class


public class Meredith extends Thread
{
    private Console c;

    // Global colour variable for Meredith's leggings and text
    Color lineBlack = new Color (0, 0, 0);
    // Global colour variable for the station's background
    Color backgroundPurple = new Color (165, 86, 255);
    // Global colour variable for Meredith's hair
    Color hairBrown = new Color (86, 60, 49);
    // Global colour variable for Meredith's purse and shoes
    Color pursePink = new Color (239, 172, 228);
    // Global colour variable for Meredith's dress
    Color dressRed = new Color (155, 61, 61);
    // Global colour variable for Meredith's mouth
    Color mouthRed = new Color (196, 25, 25);
    // Global colour variable for Meredith's eyes
    Color eyeBlue = new Color (46, 83, 111);
    // Global colour variable for Meredith's skin
    Color skinPeach = new Color (255, 205, 148);

    // this method will animate Meredith moving onto the train
    public void animate ()
    {
	// loop used to animate Meredith
	for (int x = 0 ; x < 301 ; x++)
	{
	    // Erase of Meredith
	    c.setColor (backgroundPurple);
	    c.fillRect (747 - x, 22, 128, 181);

	    // array of local int variables of x coordinates to make Meredith's left arm
	    int meredithLeftArmX[] = {791 - x, 748 - x, 753 - x, 791 - x};
	    // array of local int variables of y coordinates to make Meredith's left arm
	    int meredithLeftArmY[] = {79, 102, 109, 90};
	    // array of local int variables of x coordinates to make Meredith's right arm
	    int meredithRightArmX[] = {815 - x, 858 - x, 853 - x, 815 - x};
	    // array of local int variables of y coordinates to make Meredith's left arm
	    int meredithRightArmY[] = {79, 102, 109, 90};
	    // array of local int variables of x coordinates to make Meredith's dress
	    int meredithDressX[] = {795 - x, 770 - x, 836 - x, 811 - x};
	    // array of local int variables of y coordinates to make Meredith's dress
	    int meredithDressY[] = {65, 144, 144, 65};

	    // Meredith's left arm
	    c.setColor (dressRed);
	    c.fillPolygon (meredithLeftArmX, meredithLeftArmY, 4);

	    // Meredith's right arm
	    c.fillPolygon (meredithRightArmX, meredithRightArmY, 4);

	    // Meredith's dress
	    c.fillPolygon (meredithDressX, meredithDressY, 4);

	    // Meredith's hair
	    c.setColor (hairBrown);
	    c.fillRect (780 - x, 22, 46, 23);

	    // Meredith's head
	    c.setColor (skinPeach);
	    c.fillOval (780 - x, 22, 46, 46);

	    // Meredith's eyes
	    c.setColor (eyeBlue);
	    c.fillOval (790 - x, 32, 12, 12);
	    c.fillOval (805 - x, 32, 12, 12);

	    // Meredith's mouth
	    c.setColor (mouthRed);
	    c.fillArc (791 - x, 45, 24, 17, 180, 180);

	    // Meredith's left hand
	    c.setColor (skinPeach);
	    c.fillArc (747 - x, 100, 10, 10, 130, 180);

	    // Meredith's right hand
	    c.fillArc (849 - x, 100, 10, 10, 220, 180);

	    // Meredith's left leg
	    c.setColor (lineBlack);
	    c.fillRect (784 - x, 144, 11, 49);

	    // Meredith's right leg
	    c.fillRect (814 - x, 144, 11, 49);

	    // Meredith's left shoe
	    c.setColor (pursePink);
	    c.fillRect (784 - x, 193, 11, 10);

	    // Meredith's right shoe
	    c.fillRect (814 - x, 193, 11, 10);

	    // Meredith's purse strap
	    c.drawArc (849 - x, 109, 20, 30, 0, 180);

	    // Meredith's purse
	    c.fillRect (844 - x, 124, 30, 20);

	    try
	    {
		Thread.sleep (5); // make this 5
	    }
	    catch (InterruptedException e)
	    {
	    }
	}

    }


    // this method will output a conversation between Subway Ninja and Meredith
    public void text ()
    {

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Good morning Subway Ninja!", 320, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Good morning Subway Ninja!", 320, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Hello Meredith!", 225, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Hello Meredith!", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("What'll it be today?", 225, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("What'll it be today?", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("I am hosting a house party today,", 310, 40);
	c.drawString ("and I would like to order 3 subs.", 310, 55);
	c.drawString ("Please have them delivered to me.", 310, 70);

	try
	{
	    Thread.sleep (4500); // make this 4500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("I am hosting a house party today,", 310, 40);
	c.drawString ("and I would like to order 3 subs.", 310, 55);
	c.drawString ("Please have them delivered to me.", 310, 70);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Sure thing! Do you still live on Parker St?", 225, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Sure thing! Do you still live on Parker St?", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("SHH! I don't want anyone", 320, 40);
	c.drawString ("to know where I live!", 330, 55);

	try
	{
	    Thread.sleep (2500); // make this 2500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("SHH! I don't want anyone", 320, 40);
	c.drawString ("to know where I live!", 330, 55);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("You're the only one here Meredith.", 225, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("You're the only one here Meredith.", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("No! Don't you see that", 330, 40);
	c.drawString ("person looking at us?", 335, 55);

	try
	{
	    Thread.sleep (2500); // make this 2500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("No! Don't you see that", 330, 40);
	c.drawString ("person looking at us?", 335, 55);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("No? Anyways, I'll get the subs to you soon.", 225, 40);

	try
	{
	    Thread.sleep (2000); // make this 2000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("No? Anyways, I'll get the subs to you soon.", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Thank you.", 400, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Thank you.", 400, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}
    }


    // method that will animate Meredith leaving the shop
    public void animate2 ()
    {
	// loop used to animate Meredith
	for (int x = 0 ; x < 301 ; x++)
	{

	    // Erase of Meredith
	    c.setColor (backgroundPurple);
	    c.fillRect (446 + x, 22, 128, 181);

	    // array of local int variables of x coordinates to make Meredith's left arm
	    int meredithLeftArmX[] = {491 + x, 448 + x, 453 + x, 491 + x};
	    // array of local int variables of y coordinates to make Meredith's left arm
	    int meredithLeftArmY[] = {79, 102, 109, 90};
	    // array of local int variables of x coordinates to make Meredith's right arm
	    int meredithRightArmX[] = {515 + x, 558 + x, 553 + x, 515 + x};
	    // array of local int variables of y coordinates to make Meredith's left arm
	    int meredithRightArmY[] = {79, 102, 109, 90};
	    // array of local int variables of x coordinates to make Meredith's dress
	    int meredithDressX[] = {495 + x, 470 + x, 536 + x, 511 + x};
	    // array of local int variables of y coordinates to make Meredith's dress
	    int meredithDressY[] = {65, 144, 144, 65};

	    // Meredith's left arm
	    c.setColor (dressRed);
	    c.fillPolygon (meredithLeftArmX, meredithLeftArmY, 4);

	    // Meredith's right arm
	    c.fillPolygon (meredithRightArmX, meredithRightArmY, 4);

	    // Meredith's dress
	    c.fillPolygon (meredithDressX, meredithDressY, 4);

	    // Meredith's hair
	    c.setColor (hairBrown);
	    c.fillRect (480 + x, 22, 46, 23);

	    // Meredith's head
	    c.setColor (skinPeach);
	    c.fillOval (480 + x, 22, 46, 46);

	    // Meredith's eyes
	    c.setColor (eyeBlue);
	    c.fillOval (490 + x, 32, 12, 12);
	    c.fillOval (505 + x, 32, 12, 12);

	    // Meredith's mouth
	    c.setColor (mouthRed);
	    c.fillArc (491 + x, 45, 24, 17, 180, 180);

	    // Meredith's left hand
	    c.setColor (skinPeach);
	    c.fillArc (447 + x, 100, 10, 10, 130, 180);

	    // Meredith's right hand
	    c.fillArc (549 + x, 100, 10, 10, 220, 180);

	    // Meredith's left leg
	    c.setColor (lineBlack);
	    c.fillRect (484 + x, 144, 11, 49);

	    // Meredith's right leg
	    c.fillRect (514 + x, 144, 11, 49);

	    // Meredith's left shoe
	    c.setColor (pursePink);
	    c.fillRect (484 + x, 193, 11, 10);

	    // Meredith's right shoe
	    c.fillRect (514 + x, 193, 11, 10);

	    // Meredith's purse strap
	    c.drawArc (549 + x, 109, 20, 30, 0, 180);

	    // Meredith's purse
	    c.fillRect (544 + x, 124, 30, 20);

	    try
	    {
		Thread.sleep (5); // make this 5
	    }
	    catch (InterruptedException e)
	    {
	    }
	}
    }


    // this method will output Subway Ninja's dialogue after Meredith leaves
    public void text2 ()
    {
	c.setColor (lineBlack);
	c.drawString ("Poor Meredith. She must be off her meds.", 225, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Poor Meredith. She must be off her meds.", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Anyways, I better get to work on those subs.", 225, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Anyways, I better get to work on those subs.", 225, 40);

	try
	{
	    Thread.sleep (2000); // make this 2000
	}
	catch (InterruptedException e)
	{
	}

    }


    public Meredith (Console con)
    {
	c = con;
    }


    public void run ()
    {
	animate ();
	text ();
	animate2 ();
	text2 ();
    }
} // Meredith class
