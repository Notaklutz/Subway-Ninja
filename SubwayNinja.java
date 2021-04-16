/*
Kevin Nguyen
Mr.Rosen
October 16, 2018
This class will animate the Subway Ninja moving onto the train.
*/

// The "SubwayNinja" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; // to access Thread class

public class SubwayNinja extends Thread
{
    private Console c;           // The output console

    // Global colour variable for the Subway Ninja's outfit lines and text
    Color lineBlack = new Color (0, 0, 0);
    // Global colour variable for the station's background
    Color backgroundPurple = new Color (165, 86, 255);

    // method used to animate the Subway Ninja
    public void animate ()
    {
	// Local colour variable for the Subway Ninja's outfit
	Color outfitGrey = new Color (68, 68, 68);
	// Local colour variable for the Subway Ninja's belt and eyes
	Color ninjaRed = new Color (196, 25, 25);
	// Local colour variable for the Subway Ninja's skin
	Color skinPeach = new Color (255, 205, 148);

	// loop used to animate the Subway Ninja moving onto the train
	for (int x = 0 ; x < 301 ; x++)
	{
	    // the erase of Subway Ninja
	    c.setColor (backgroundPurple);
	    c.fillRect (-178 + x, 25, 109, 178);

	    // the head and body of Subway Ninja
	    c.setColor (outfitGrey);
	    c.fillOval (-144 + x, 25, 46, 46);
	    c.fillRect (-149 + x, 68, 54, 76);

	    // array of local int variables of x coordinates to make Subway Ninja's left arm
	    int subwayNinjaLeftArmX[] = { - 149 + x, -175 + x, -165 + x, -149 + x};
	    // array of local int variables of y coordinates to make Subway Ninja's left arm
	    int subwayNinjaLeftArmY[] = {68, 113, 121, 91};
	    // array of local int variables of x coordinates to make Subway Ninja's right arm
	    int subwayNinjaRightArmX[] = { - 95 + x, -69 + x, -79 + x, -95 + x};
	    // array of local int variables of y coordinates to make Subway Ninja's right arm
	    int subwayNinjaRightArmY[] = {68, 113, 121, 91};
	    // array of local int variables of x coordinates to make Subway Ninja's left leg
	    int subwayNinjaLeftLegX[] = { - 147 + x, -177 + x, -166 + x, -136 + x};
	    // array of local int variables of y coordinates to make Subway Ninja's left leg
	    int subwayNinjaLeftLegY[] = {135, 203, 203, 139};
	    // array of local int variables of x coordinates to make Subway Ninja's right leg
	    int subwayNinjaRightLegX[] = { - 100 + x, -73 + x, -84 + x, -95 + x, -84 + x, -107 + x};
	    // array of local int variables of y coordinates to make Subway Ninja's right leg
	    int subwayNinjaRightLegY[] = {135, 161, 203, 203, 161, 144};

	    // the limbs of Subway Ninja
	    c.fillPolygon (subwayNinjaLeftArmX, subwayNinjaLeftArmY, 4);
	    c.fillPolygon (subwayNinjaRightArmX, subwayNinjaRightArmY, 4);
	    c.fillPolygon (subwayNinjaLeftLegX, subwayNinjaLeftLegY, 4);
	    c.fillPolygon (subwayNinjaRightLegX, subwayNinjaRightLegY, 6);

	    // the face and hands of Subway Ninja
	    c.setColor (skinPeach);
	    c.fillRect (-134 + x, 35, 25, 10);
	    // left hand of Subway Ninja
	    c.fillArc (-176 + x, 112, 11, 11, 145, 180);
	    // right hand of Subway Ninja
	    c.fillArc (-79 + x, 112, 11, 11, 215, 180);

	    // the outfit lines of Subway Ninja
	    c.setColor (lineBlack);
	    // line on the left face
	    c.drawLine (-143 + x, 40, -135 + x, 40);
	    // line on the right face
	    c.drawLine (-109 + x, 40, -101 + x, 40);
	    // line on the left arm
	    c.drawLine (-172 + x, 108, -162 + x, 114);
	    // line on the right arm
	    c.drawLine (-82 + x, 114, -72 + x, 108);
	    // line on the left leg
	    c.drawLine (-175 + x, 198, -164 + x, 198);
	    // line on the right leg
	    c.drawLine (-93 + x, 198, -83 + x, 198);

	    // the eyes and the belt of Subway Ninja
	    c.setColor (ninjaRed);
	    c.fillOval (-132 + x, 36, 8, 8);
	    c.fillOval (-120 + x, 36, 8, 8);
	    c.fillRect (-149 + x, 130, 54, 10);

	    try
	    {
		Thread.sleep (5); // make this 5
	    }
	    catch (InterruptedException e)
	    {
	    }
	}
    }


    // this method will output the Subway Ninja's dialogue
    public void text ()
    {
	try
	{
	    Thread.sleep (500); // make this 500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("THE TIME HAS COME.", 225, 40);

	try
	{
	    Thread.sleep (2000); // make this 2000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("THE TIME HAS COME.", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("OPEN THE SUBWAY SHOP.", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("OPEN THE SUBWAY SHOP.", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}
    }



    public SubwayNinja (Console con)
    {
	c = con;
    }


    public void run ()
    {
	animate ();
	text ();
    }
} // SubwayNinja class
