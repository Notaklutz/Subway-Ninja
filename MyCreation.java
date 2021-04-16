/*
Kevin Nguyen
Mr.Rosen
October 13, 2018
This class runs the other classes in the MyCreation program.
Subway Ninja: It is a day like any other. The owner of the local subway shop,
Subway Ninja, opens up his shop and serves his customers as usual. A usual
customer attempts to betray him by poisoning him with a subway sandwich of
his own, but is foiled when he fails to realize that Subway Ninja does not
have a mouth to consume the sandwich.
*/

// The "MyCreation" class.
import java.awt.*;
import hsa.Console;

public class MyCreation
{
    Console c;           // The output console

    // adds the Background thread to MyCreation
    public void background ()
    {
	Background b = new Background (c);
    }


    // adds the SubwayNinja thread to MyCreation
    public void subwayNinja ()
    {
	// creates the thread
	SubwayNinja s = new SubwayNinja (c);
	// starts the thread
	s.start ();

	// joins with Meredith thread so that it will only execute once SubwayNinja has finished
	try
	{
	    s.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the Meredith thread to MyCreation
    public void meredith ()
    {
	// creates the thread
	Meredith m = new Meredith (c);
	// starts the thread
	m.start ();

	// joins with Sandwich thread so that it will only execute once Meredith has finished
	try
	{
	    m.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the Sandwich thread to MyCreation
    public void sandwich ()
    {
	// creates the sandwich thread
	Sandwich t = new Sandwich (c);
	// starts the thread
	t.start ();

	// delay to ensure that sandwiches do not overlap
	try
	{
	    Thread.sleep (1000);
	}
	catch (Exception e)
	{
	}

	// creates the thread
	Sandwich t2 = new Sandwich (c, Color.green);
	// starts the thread
	t2.start ();

	// creates the thread
	Sandwich t3 = new Sandwich (c, Color.orange, 10);
	// starts the thread
	t3.start ();

	// joins with Suzy thread so that it will only execute once the last Sandwich thread has finished
	try
	{
	    t3.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the Suzy thread to MyCreation
    public void suzy ()
    {
	// creates the thread
	Suzy u = new Suzy (c);
	// starts the thread
	u.start ();

	// joins with Sword thread so that it will only execute once the Suzy thread has finished
	try
	{
	    u.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the Sword thread to MyCreation
    public void sword ()
    {
	// creates the thread
	Sword v = new Sword (c);
	// starts the thread
	v.run ();
    }


    // adds the Pete thread to MyCreation
    public void pete ()
    {
	// creates the thread
	Pete p = new Pete (c);
	// starts the thread
	p.start ();

	// joins with Sword thread so that it will only execute once the Suzy thread has finished
	try
	{
	    p.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the Ending thread to MyCreation
    public void ending ()
    {
	// creates the thread
	Ending e = new Ending (c);
	// starts the thread
	e.start ();
    }


    public MyCreation ()
    {
	c = new Console ("Subway Ninja");
    }


    public static void main (String[] args)
    {
	MyCreation z = new MyCreation ();
	z.background ();
	z.subwayNinja ();
	z.meredith ();
	z.sandwich ();
	z.suzy ();
	z.sword ();
	z.pete ();
	z.ending ();
    }
} // MyCreation class
