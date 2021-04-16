/*
Kevin Nguyen
Mr.Rosen
October 13, 2018
This class will output the background of MyCreation, consisting of an idle train
at a subway station.
*/

// The "Background" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; // to access Thread class

public class Background
{
    private Console c;

    // class to make background
    public void draw ()
    {
	// local colour variable for the background of the station
	Color backgroundPurple = new Color (165, 86, 255);
	// Local colour variable for the train
	Color trainGrey = new Color (201, 200, 195);
	// Local colour variable for the train door
	Color doorSilver = new Color (178, 177, 173);
	// Local colour variable for the train's windows
	Color windowPaneBlue = new Color (197, 218, 219);
	// Local colour variable for the train stripes
	Color stripeGrey = new Color (142, 141, 137);
	// Local colour variable for the train's star
	Color starYellow = new Color (255, 255, 0);
	// Local colour variable for the platform
	Color platformMarble = new Color (160, 160, 160);
	// Local colour variable for the platform circles
	Color platformCircleGold = new Color (255, 223, 0);
	// Local colour variable for the platform lines
	Color lineBlack = new Color (0, 0, 0);

	// loop used to make the train, the platform, and the background of the station
	for (int x = 0 ; x < 641 ; x++)
	{
	    c.setColor (backgroundPurple);
	    c.drawRect (0, 0, x, 204);
	    c.setColor (trainGrey);
	    c.drawRect (0, 204, x, 228);
	    c.setColor (platformMarble);
	    c.drawRect (0, 432, x, 68);
	}

	// loop used to make the lines separating the platform
	for (int x = 160 ; x < 481 ; x = x + 160)
	{
	    c.setColor (lineBlack);
	    c.drawLine (x - 1, 432, x - 1, 500);
	    c.drawLine (x, 432, x, 500);
	    c.drawLine (x + 1, 432, x + 1, 500);
	}

	// loop used to make the platform circles
	for (int x = 0 ; x < 114 ; x++)
	{
	    c.setColor (platformCircleGold);
	    c.drawOval (23 + x, 443 + x, 113 - x * 2, 113 - x * 2);
	    c.drawOval (183 + x, 443 + x, 113 - x * 2, 113 - x * 2);
	    c.drawOval (343 + x, 443 + x, 113 - x * 2, 113 - x * 2);
	    c.drawOval (503 + x, 443 + x, 113 - x * 2, 113 - x * 2);
	}

	// loop used to make the train doors
	for (int x = 0 ; x < 167 ; x++)
	{
	    c.setColor (doorSilver);
	    c.drawRoundRect (46, 250 + x, 160, 166 - x, 10, 10);
	    c.drawRoundRect (434, 250 + x, 160, 166 - x, 10, 10);
	}

	// loop used to make the stripes on the train
	for (int x = 0 ; x < 641 ; x++)
	{
	    c.setColor (stripeGrey);
	    c.drawRect (0, 212, 640 - x, 8);
	    c.drawRect (0, 416, 640 - x, 8);
	}

	// loop used to make the stripes on the doors
	for (int x = 0 ; x < 9 ; x++)
	{
	    c.setColor (lineBlack);
	    c.drawRect (125, 250, 8 - x, 165);
	    c.drawRect (513, 250, 8 - x, 165);
	}

	// loop used to make the windows on the doors
	for (int x = 0 ; x < 47 ; x++)
	{
	    c.setColor (windowPaneBlue);
	    c.drawRoundRect (62 + x, 261 + x, 46 - x * 2, 68 - x * 2, 10, 10);
	    c.drawRoundRect (148 + x, 261 + x, 46 - x * 2, 68 - x * 2, 10, 10);
	    c.drawRoundRect (450 + x, 261 + x, 46 - x * 2, 68 - x * 2, 10, 10);
	    c.drawRoundRect (537 + x, 261 + x, 46 - x * 2, 68 - x * 2, 10, 10);
	}

	// loop used to make the window on the train
	for (int x = 0 ; x < 184 ; x++)
	{
	    c.drawRoundRect (229 + x, 250 + x, 183 - x * 2, 91 - x * 2, 10, 10);
	}

	// loop used to make the star on the train
	for (int x = 0 ; x < 30 ; x++)
	{
	    c.setColor (starYellow);
	    c.drawStar (320 - x, 380 - x, x * 2, x * 2);
	}

    }


    public Background (Console con)
    {
	c = con;
	draw ();
    }
} // Background class


