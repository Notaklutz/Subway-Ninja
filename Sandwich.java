/*
Kevin Nguyen
Mr.Rosen
October 18, 2018
This class will output a subway sandwich that will move down and across the screen.
It has three overloaded constructors. The first one creates a sandwich in a specific
location, the second one passes a parameter to change the colour of the topping, and
the third one makes a sandwich with a certain colour and delay to change the speed
of the animation.
*/

// The "Sandwich" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; // to access Thread class

public class Sandwich extends Thread
{
    private Console c;
    private Color topping = Color.red;
    private int delay = 5;

    public void animate ()
    {
	// Local colour variable for the background of the station
	Color backgroundPurple = new Color (165, 86, 255);
	// Local colour variable for the bread
	Color breadBrown = new Color (204, 170, 116);

	// loop used to animate the sandwich moving downwards
	for (int x = 0 ; x < 201 ; x++)
	{
	    // Erase of sandwich
	    c.setColor (backgroundPurple);
	    c.fillRect (233, -106 + x, 48, 26);

	    // Bottom layer of bread
	    c.setColor (breadBrown);
	    c.fillRect (233, -88 + x, 46, 8);

	    // Top layer of bread
	    c.drawLine (233, -96 + x, 279, -96 + x);
	    c.fillArc (233, -105 + x, 9, 20, 0, 180);
	    c.fillArc (242, -105 + x, 9, 20, 0, 180);
	    c.fillArc (251, -105 + x, 10, 20, 0, 180);
	    c.fillArc (261, -105 + x, 10, 20, 0, 180);
	    c.fillArc (271, -105 + x, 10, 20, 0, 180);


	    // Topping of the sandwich
	    c.setColor (topping);
	    c.fillRoundRect (237, -95 + x, 40, 7, 10, 10);

	    // animation delay
	    try
	    {
		sleep (delay);
	    }
	    catch (Exception e)
	    {
	    }
	}

	// loop used to animate the sandwich moving to the right
	for (int x = 0 ; x < 501 ; x++)
	{
	    // Erase of sandwich
	    c.setColor (backgroundPurple);
	    c.fillRect (232 + x, 95, 49, 25);

	    // Bottom layer of bread
	    c.setColor (breadBrown);
	    c.fillRect (233 + x, 112, 46, 8);

	    // Top layer of bread
	    c.drawLine (233 + x, 104, 279 + x, 104);
	    c.fillArc (233 + x, 95, 9, 20, 0, 180);
	    c.fillArc (242 + x, 95, 9, 20, 0, 180);
	    c.fillArc (251 + x, 95, 10, 20, 0, 180);
	    c.fillArc (261 + x, 95, 10, 20, 0, 180);
	    c.fillArc (271 + x, 95, 10, 20, 0, 180);


	    // Topping of the sandwich
	    c.setColor (topping);
	    c.fillRoundRect (237 + x, 105, 40, 7, 10, 10);

	    // animation delay
	    try
	    {
		sleep (delay);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    /* The erase works perfectly most of the time but I do not know why it
       will sometimes leave a piece of the sandwich unerased */

    // basic sandwich
    public Sandwich (Console con)
    {
	c = con;
	topping = new Color (212, 78, 42);
    }


    // sandwich with a color parameter
    public Sandwich (Console con, Color n)
    {
	c = con;
	topping = n;
    }


    // sandwich with a oolor parameter and a delay time
    public Sandwich (Console con, Color n, int d)
    {
	c = con;
	topping = n;
	delay = d;
    }


    public void run ()
    {
	animate ();
    }
} // Sandwich class


