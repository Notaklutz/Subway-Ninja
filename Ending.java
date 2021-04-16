/*
Kevin Nguyen
Mr.Rosen
October 21, 2018
This class will animate the ending of the story and output the programmer's name.
*/

// The "Ending" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; // to access Thread class

public class Ending extends Thread
{
    private Console c;

    public Ending (Console con)
    {
	c = con;
    }


    // Animates the ending of the story and outputs the programmer's name
    public void ending ()
    {

	c.setColor (Color.red);

	// loop used to animate the closing circle
	for (int x = 0 ; x < 701 ; x++)
	{
	    c.drawOval (-210 + x, -663 + x, 1410 - x * 2, 1410 - x * 2);

	    // Animation delay
	    try
	    {
		Thread.sleep (5); // make this 5
	    }
	    catch (Exception e)
	    {
	    }
	}

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (Exception e)
	{
	}

	// loop used to animate the closing sides
	for (int x = 0 ; x < 321 ; x++)
	{
	    c.drawLine (0 + x, 0, 0 + x, 500);
	    c.drawLine (640 - x, 0, 640 - x, 500);

	    // Animation delay
	    try
	    {
		Thread.sleep (5); // make this 5
	    }
	    catch (Exception e)
	    {
	    }
	}

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (Exception e)
	{
	}

	c.setColor (Color.black);
	c.drawString ("Subway Ninja", 302, 240);
	c.drawString ("By: Kevin Nguyen", 290, 255);
    }


    public void run ()
    {
	ending ();
    }
} // Ending class
