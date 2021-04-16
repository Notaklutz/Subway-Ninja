/*
Kevin Nguyen
Mr.Rosen
October 20, 2018
This class animates Pete moving onto the screen with a Subway sandwich. Subway
Ninja then believes that he has been betrayed and summons his sword, but Pete
explains that the sandwich is a gift. Subway Ninja happily accepts the gift, 
but says that he cannot eat it because he does not have a mouth. This foils
Pete's dastardly scheme to poison Subway Ninja.
*/

// The "Pete" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; // to access Thread class

public class Pete extends Thread
{
    private Console c;

    // Global colour variable for text, Pete's jacket's buttons, his outfit lines, and his shoes
    Color lineBlack = new Color (0, 0, 0);
    // Global colour variable for the station's background
    Color backgroundPurple = new Color (165, 86, 255);
    // Global colour variable for the bread
    Color breadBrown = new Color (204, 170, 116);
    // Global colour variable for the Sandwich's topping
    Color toxicTopping = new Color (91, 47, 82);
    // Global colour variable for Pete's eyes
    Color eyeBlue = new Color (46, 83, 111);

    // Animates Pete moving onto the screen with a Subway sandwich
    public void animate ()
    {
	// loop used to animate Pete and his sandwich
	for (int x = 0 ; x < 301 ; x++)
	{
	    // Local colour variable for Pete's mouth
	    Color mouthRed = new Color (196, 25, 25);
	    // Local colour variable for Pete's skin
	    Color skinPeach = new Color (255, 205, 148);
	    // Local colour variable for Pete's shirt
	    Color shirtGreen = new Color (68, 114, 64);
	    // Local colour variable for Pete's jacket
	    Color jacketBrown = new Color (173, 145, 90);
	    // Local colour variable for Pete's jeans
	    Color jeanBlue = new Color (8, 43, 81);
	    // Local colour variable for Pete's hair
	    Color hairBrown = new Color (86, 60, 49);

	    // Pete's and his sandwich's erase
	    c.setColor (backgroundPurple);
	    c.fillRect (699 - x, 22, 154, 181);

	    // Pete's head
	    c.setColor (skinPeach);
	    c.fillOval (780 - x, 22, 46, 46);

	    // Pete's shirt
	    c.setColor (shirtGreen);
	    c.fillRect (775 - x, 68, 54, 76);
	    c.setColor (skinPeach);
	    c.fillArc (790 - x, 61, 24, 15, 180, 180);
	    c.setColor (lineBlack);
	    c.drawArc (790 - x, 61, 24, 15, 180, 190);

	    // Pete's hair
	    c.setColor (hairBrown);
	    c.fillArc (784 - x, 22, 38, 18, 0, 181);

	    // Pete's eyes
	    c.setColor (eyeBlue);
	    c.fillOval (790 - x, 37, 10, 10);
	    c.fillOval (805 - x, 37, 10, 10);

	    // Pete's mouth
	    c.setColor (mouthRed);
	    c.fillArc (790 - x, 45, 25, 15, 180, 180);

	    // Pete's jacket
	    c.setColor (jacketBrown);
	    c.fillRect (775 - x, 68, 15, 76);
	    c.fillRect (814 - x, 68, 15, 76);
	    c.setColor (lineBlack);
	    c.drawLine (790 - x, 68, 790 - x, 144);
	    c.drawLine (814 - x, 68, 814 - x, 144);

	    // Pete's jacket's pocket
	    c.drawArc (822 - x, 115, 15, 20, 91, 180);

	    // Pete's jacket's buttons
	    c.fillOval (782 - x, 83, 5, 5);
	    c.fillOval (782 - x, 98, 5, 5);
	    c.fillOval (782 - x, 113, 5, 5);
	    c.fillOval (782 - x, 128, 5, 5);

	    // Pete's left leg
	    c.setColor (jeanBlue);
	    c.fillRect (775 - x, 144, 11, 49);

	    // Pete's right leg
	    c.fillRect (818 - x, 144, 11, 49);

	    // Pete's left shoe
	    c.setColor (lineBlack);
	    c.fillRect (775 - x, 193, 11, 10);

	    // Pete's right shoe
	    c.fillRect (818 - x, 193, 11, 10);

	    // array of local int variables of x coordinates to make Pete's left arm
	    int peteLeftArmX[] = {775 - x, 747 - x, 755 - x, 775 - x};
	    // array of local int variables of y coordinates to make Pete's left arm
	    int peteLeftArmY[] = {68, 120, 125, 83};
	    // array of local int variables of x coordinates to make Pete's right arm
	    int peteRightArmX[] = {829 - x, 852 - x, 829 - x, 829 - x, 842 - x, 829 - x};
	    // array of local int variables of y coordinates to make Pete's right arm
	    int peteRightArmY[] = {68, 111, 130, 120, 111, 83};

	    // Pete's left arm
	    c.setColor (jacketBrown);
	    c.fillPolygon (peteLeftArmX, peteLeftArmY, 4);

	    // Pete's right arm
	    c.fillPolygon (peteRightArmX, peteRightArmY, 6);

	    // Pete's left hand
	    c.setColor (skinPeach);
	    c.fillArc (746 - x, 118, 10, 10, 150, 180);

	    //Subway Sandwich
	    //-------------------------------------------------------

	    // Bottom layer of bread
	    c.setColor (breadBrown);
	    c.fillRect (699 - x, 118, 46, 8);

	    // Top layer of bread
	    c.drawLine (699 - x, 110, 745 - x, 110);
	    c.fillArc (699 - x, 101, 9, 20, 0, 180);
	    c.fillArc (708 - x, 101, 9, 20, 0, 180);
	    c.fillArc (717 - x, 101, 10, 20, 0, 180);
	    c.fillArc (727 - x, 101, 10, 20, 0, 180);
	    c.fillArc (737 - x, 101, 10, 20, 0, 180);


	    // Topping of the sandwich
	    c.setColor (toxicTopping);
	    c.fillRoundRect (703 - x, 111, 40, 7, 10, 10);

	    // animation delay
	    try
	    {
		Thread.sleep (5); // make this 5
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    // Outputs conversation between Subway Ninja and Pete
    public void text ()
    {

	// Local colour variable for Subway Ninja's radioactive eyes
	Color eyeGreen = new Color (93, 202, 49);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Hello Ninja!", 400, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Hello Ninja!", 400, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Hey Pete! The usual agai-", 225, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Hey Pete! The usual agai-", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Wait, what are you holding??", 225, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Wait, what are you holding??", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("I brought you a subway sandwich!", 300, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("I brought you a subway sandwich!", 300, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("I've only served two customers today.", 225, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("I've only served two customers today.", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Did you get that from another store??", 225, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Did you get that from another store??", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Yes.", 440, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Yes.", 440, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	// Suwbay Ninja's eyes changing colour to green
	c.setColor (eyeGreen);
	c.fillOval (168, 36, 8, 8);
	c.fillOval (180, 36, 8, 8);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("TRAITOR!!!!!!!", 225, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("TRAITOR!!!!!!!", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	// Local colour variable for the Subway Ninja's regular eyes
	Color eyeRed = new Color (196, 25, 25);
	// Local colour variable for the blade of the sword
	Color bladeGrey = new Color (154, 159, 165);
	// Local colour variable for the hilt of the sword
	Color hiltBlack = new Color (38, 35, 29);
	// Local colour variable for the hilt lines
	Color lineCopper = new Color (184, 115, 51);

	// loop used to animate a sword moving downwards
	for (int x = 0 ; x < 201 ; x++)
	{

	    // The sword's erase
	    c.setColor (backgroundPurple);
	    c.fillRect (233, -174 + x, 11, 125);

	    // The sword's hilt
	    c.setColor (hiltBlack);
	    c.fillRect (233, -95 + x, 10, 15);
	    c.fillOval (233, -85 + x, 10, 10);

	    // The hilt lines
	    c.setColor (lineCopper);
	    c.drawLine (233, -90 + x, 243, -90 + x);
	    c.drawLine (233, -80 + x, 243, -80 + x);

	    // array of local int variables of x coordinates to make the blade tip
	    int bladeTipX[] = {233, 233, 243};
	    // array of local int variables of y coordinates to make the blade tip
	    int bladeTipY[] = { - 162 + x, -173 + x, -162 + x};

	    // The blade's tip
	    c.setColor (bladeGrey);
	    c.fillPolygon (bladeTipX, bladeTipY, 3);

	    // The sword's blade
	    c.fillRect (233, -162 + x, 10, 67);

	    // The blade line
	    c.setColor (lineBlack);
	    c.drawLine (238, -167 + x, 238, -95 + x);

	    // Animation delay
	    try
	    {
		Thread.sleep (10); // make this 10
	    }
	    catch (Exception e)
	    {
	    }
	}

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Woah, hold on!", 390, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Woah, hold on!", 390, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("I bought it for you! It's a gift!", 325, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("I bought it for you! It's a gift!", 325, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("You're always working so hard to serve", 275, 40);
	c.drawString ("your customers, so I thought it would be", 270, 55);
	c.drawString ("nice for me to serve you for a change.", 280, 70);

	try
	{
	    Thread.sleep (3500); // make this 3500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("You're always working so hard to serve", 275, 40);
	c.drawString ("your customers, so I thought it would be", 270, 55);
	c.drawString ("nice for me to serve you for a change.", 280, 70);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Oh.", 250, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Oh.", 250, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	// Suwbay Ninja's eyes changing back to red
	c.setColor (eyeRed);
	c.fillOval (168, 36, 8, 8);
	c.fillOval (180, 36, 8, 8);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	// loop used to animate a sword moving upwards
	for (int x = 0 ; x < 201 ; x++)
	{
	    // The sword's erase
	    c.setColor (backgroundPurple);
	    c.fillRect (233, 26 - x, 11, 125);

	    // The sword's hilt
	    c.setColor (hiltBlack);
	    c.fillRect (233, 105 - x, 10, 15);
	    c.fillOval (233, 115 - x, 10, 10);

	    // The hilt lines
	    c.setColor (lineCopper);
	    c.drawLine (233, 110 - x, 243, 110 - x);
	    c.drawLine (233, 120 - x, 243, 120 - x);

	    // array of local int variables of x coordinates to make the blade tip
	    int bladeTipX[] = {233, 233, 243};
	    // array of local int variables of y coordinates to make the blade tip
	    int bladeTipY[] = {38 - x, 27 - x, 38 - x};

	    // The blade's tip
	    c.setColor (bladeGrey);
	    c.fillPolygon (bladeTipX, bladeTipY, 3);

	    // The sword's blade
	    c.fillRect (233, 38 - x, 10, 67);

	    // The blade line
	    c.setColor (lineBlack);
	    c.drawLine (238, 33 - x, 238, 105 - x);

	    // Animation delay
	    try
	    {
		Thread.sleep (10); // make this 10
	    }
	    catch (Exception e)
	    {
	    }
	}

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Well, thanks Pete.", 225, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Well, thanks Pete.", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("It's nice to know that someone cares.", 225, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("It's nice to know that someone cares.", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Anytime, Ninja. Now, how about a taste?", 275, 40);

	try
	{
	    Thread.sleep (2000); // make this 2000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Anytime, Ninja. Now, how about a taste?", 275, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("I would love to. Now, if only I had a mouth...", 225, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("I would love to. Now, if only I had a mouth...", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Oh, haha...", 400, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Oh, haha...", 400, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Darn it. I should've thought this through.", 275, 40);

	try
	{
	    Thread.sleep (2000); // make this 2000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Darn it. I should've thought this through.", 275, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Guess I'll have to find another way to poison him.", 230, 40);

	try
	{
	    Thread.sleep (2000); // make this 2000
	}
	catch (InterruptedException e)
	{
	}

	// Changes Pete's eye colour to black
	c.setColor (lineBlack);
	c.fillOval (490, 37, 10, 10);
	c.fillOval (505, 37, 10, 10);

	c.setColor (backgroundPurple);
	c.drawString ("Guess I'll have to find another way to poison him.", 230, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Did you say something..?", 225, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Did you say something..?", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	// Changes Pete's eye back to blue
	c.setColor (eyeBlue);
	c.fillOval (490, 37, 10, 10);
	c.fillOval (505, 37, 10, 10);

	c.setColor (lineBlack);
	c.drawString ("Nope!", 425, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Nope!", 425, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	// Changes Pete's eye colour to black
	c.setColor (lineBlack);
	c.fillOval (490, 37, 10, 10);
	c.fillOval (505, 37, 10, 10);

	c.setColor (eyeRed);
	c.drawString ("AND SOON ENOUGH, YOU WON'T", 275, 40);
	c.drawString ("BE SAYING ANYTHING EITHER.", 280, 55);

	try
	{
	    Thread.sleep (3000); // make this 3000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("AND SOON ENOUGH, YOU WON'T", 275, 40);
	c.drawString ("BE SAYING ANYTHING EITHER.", 280, 55);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

    }


    public Pete (Console con)
    {
	c = con;
    }


    public void run ()
    {
	animate ();
	text ();
    }
} // Pete class


