/*
Kevin Nguyen
Mr.Rosen
October 20, 2018
This class animates Subway Ninja cutting up Suzy's sandwich with a sword and her subsequent
departure from the subway shop.
*/

// The "Sword" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; // to access Thread class

public class Sword implements Runnable
{
    private Console c;

    // Global variable for the background of the station
    Color backgroundPurple = new Color (165, 86, 255);
    // Global variable for the text and blade line
    Color lineBlack = new Color (0, 0, 0);
    // Global colour variable for the bread
    Color breadBrown = new Color (204, 170, 116);
    // Global colour variable for the bacon
    Color baconPink = new Color (246, 86, 86);

    // Animates Subway Ninja cutting up the sandwich
    public void animate ()
    {
	// Local colour variable for the bread
	Color breadBrown = new Color (204, 170, 116);
	// Local colour variable for the bacon
	Color baconPink = new Color (246, 86, 86);
	// Local colour variable for the blade
	Color bladeGrey = new Color (154, 159, 165);
	// Local colour variable for the hilt
	Color hiltBlack = new Color (38, 35, 29);
	// Local colour variable for the crossguard
	Color crossguardCopper = new Color (184, 115, 51);

	// loop used to animate the sandwich moving downwards
	for (int x = 0 ; x < 161 ; x++)
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
	    c.setColor (baconPink);
	    c.fillRoundRect (237, -95 + x, 40, 7, 10, 10);

	    // animation delay
	    try
	    {
		Thread.sleep (5); // make this 5
	    }
	    catch (Exception e)
	    {
	    }
	}

	// loop used to animate the sandwich moving to the right
	for (int x = 0 ; x < 101 ; x++)
	{
	    // Erase of sandwich
	    c.setColor (backgroundPurple);
	    c.fillRect (232 + x, 55, 49, 25);

	    // Bottom layer of bread
	    c.setColor (breadBrown);
	    c.fillRect (233 + x, 72, 46, 8);

	    // Top layer of bread
	    c.drawLine (233 + x, 64, 279 + x, 64);
	    c.fillArc (233 + x, 55, 9, 20, 0, 180);
	    c.fillArc (242 + x, 55, 9, 20, 0, 180);
	    c.fillArc (251 + x, 55, 10, 20, 0, 180);
	    c.fillArc (261 + x, 55, 10, 20, 0, 180);
	    c.fillArc (271 + x, 55, 10, 20, 0, 180);


	    // Topping of the sandwich
	    c.setColor (baconPink);
	    c.fillRoundRect (237 + x, 65, 40, 7, 10, 10);

	    // animation delay
	    try
	    {
		Thread.sleep (5); // make this 5
	    }
	    catch (Exception e)
	    {
	    }
	}

	// loop used to animate the sword moving downwards
	for (int x = 0 ; x < 201 ; x++)
	{

	    // array of local int variables of x coordinates to make the sword's crossguard
	    int crossguardX[] = {233, 223, 233, 243, 253, 243};
	    // array of local int variables of y coordinates to make the sword's crossguard
	    int crossguardY[] = { - 95 + x, -109 + x, -102 + x, -102 + x, -109 + x, -95 + x};
	    // array of local int variables of x coordinates to make the blade tip
	    int bladeTipX[] = {233, 233, 243};
	    // array of local int variables of y coordinates to make the blade tip
	    int bladeTipY[] = { - 162 + x, -173 + x, -162 + x};

	    // The sword's erase
	    c.setColor (backgroundPurple);
	    c.fillRect (223, -174 + x, 30, 72);
	    c.fillPolygon (crossguardX, crossguardY, 6);
	    c.fillRect (233, -95 + x, 11, 20);

	    // The sword's hilt
	    c.setColor (hiltBlack);
	    c.fillRect (233, -95 + x, 10, 15);
	    c.fillOval (233, -85 + x, 10, 10);

	    // The sword's crossguard
	    c.setColor (crossguardCopper);
	    c.fillPolygon (crossguardX, crossguardY, 6);

	    // The hilt lines
	    c.drawLine (233, -90 + x, 243, -90 + x);
	    c.drawLine (233, -80 + x, 243, -80 + x);

	    // The blade's tip
	    c.setColor (bladeGrey);
	    c.fillPolygon (bladeTipX, bladeTipY, 3);

	    // The sword's blade
	    c.fillRect (233, -162 + x, 10, 60);

	    // The blade line
	    c.setColor (lineBlack);
	    c.drawLine (238, -167 + x, 238, -103 + x);

	    // animation delay
	    try
	    {
		Thread.sleep (5); // make this 5
	    }
	    catch (Exception e)
	    {
	    }
	}

	// loop used to animate the sword moving right
	for (int x = 0 ; x < 90 ; x++)
	{
	    // array of local int variables of x coordinates to make the sword's crossguard
	    int crossguardX[] = {233 + x, 223 + x, 233 + x, 243 + x, 253 + x, 243 + x};
	    // array of local int variables of y coordinates to make the sword's crossguard
	    int crossguardY[] = {105, 91, 98, 98, 91, 105};
	    // array of local int variables of x coordinates to make the blade tip
	    int bladeTipX[] = {233 + x, 233 + x, 243 + x};
	    // array of local int variables of y coordinates to make the blade tip
	    int bladeTipY[] = {38, 27, 38};

	    // The sword's erase
	    c.setColor (backgroundPurple);
	    c.fillRect (232 + x, 27, 11, 72);
	    c.fillPolygon (crossguardX, crossguardY, 6);
	    c.drawLine (222 + x, 91, 232 + x, 105);
	    c.drawLine (223 + x, 91, 233 + x, 105);
	    c.fillRect (223 + x, 91, 30, 7);
	    c.fillRect (232 + x, 105, 11, 20);

	    // The sword's hilt
	    c.setColor (hiltBlack);
	    c.fillRect (233 + x, 105, 10, 15);
	    c.fillOval (233 + x, 115, 10, 10);

	    // The sword's crossguard
	    c.setColor (crossguardCopper);
	    c.fillPolygon (crossguardX, crossguardY, 6);

	    // The hilt lines
	    c.drawLine (233 + x, 110, 243 + x, 110);
	    c.drawLine (233 + x, 120, 243 + x, 120);

	    // The blade's tip
	    c.setColor (bladeGrey);
	    c.fillPolygon (bladeTipX, bladeTipY, 3);

	    // The sword's blade
	    c.fillRect (233 + x, 38, 10, 60);

	    // The blade line
	    c.setColor (lineBlack);
	    c.drawLine (238 + x, 33, 238 + x, 97);

	    // animation delay
	    try
	    {
		Thread.sleep (5); // make this 5
	    }
	    catch (Exception e)
	    {
	    }
	}

	// first cut lines
	c.drawLine (346, 55, 346, 80);
	c.drawLine (347, 55, 347, 80);

	// loop used to animate the sword moving to the left
	for (int x = 0 ; x < 90 ; x++)
	{
	    // array of local int variables of x coordinates to make the sword's crossguard
	    int crossguardX[] = {323 - x, 313 - x, 323 - x, 333 - x, 343 - x, 333 - x};
	    // array of local int variables of y coordinates to make the sword's crossguard
	    int crossguardY[] = {105, 91, 98, 98, 91, 105};
	    // array of local int variables of x coordinates to make the blade tip
	    int bladeTipX[] = {323 - x, 323 - x, 333 - x};
	    // array of local int variables of y coordinates to make the blade tip
	    int bladeTipY[] = {38, 27, 38};

	    // The sword's erase
	    c.setColor (backgroundPurple);
	    c.fillRect (323 - x, 27, 11, 72);
	    c.fillPolygon (crossguardX, crossguardY, 6);
	    c.drawLine (343 - x, 91, 333 - x, 105);
	    c.drawLine (344 - x, 91, 334 - x, 105);
	    c.fillRect (313 - x, 91, 30, 7);
	    c.fillRect (323 - x, 105, 12, 20);

	    // The sword's hilt
	    c.setColor (hiltBlack);
	    c.fillRect (323 - x, 105, 10, 15);
	    c.fillOval (323 - x, 115, 10, 10);

	    // The sword's crossguard
	    c.setColor (crossguardCopper);
	    c.fillPolygon (crossguardX, crossguardY, 6);

	    // The hilt lines
	    c.drawLine (323 - x, 110, 333 - x, 110);
	    c.drawLine (323 - x, 120, 333 - x, 120);

	    // The blade's tip
	    c.setColor (bladeGrey);
	    c.fillPolygon (bladeTipX, bladeTipY, 3);

	    // The sword's blade
	    c.fillRect (323 - x, 38, 10, 60);

	    // The blade line
	    c.setColor (lineBlack);
	    c.drawLine (328 - x, 33, 328 - x, 97);

	    // animation delay
	    try
	    {
		Thread.sleep (5); // make this 5
	    }
	    catch (Exception e)
	    {
	    }
	}

	// loop used to animate the sword moving right
	for (int x = 0 ; x < 90 ; x++)
	{
	    // array of local int variables of x coordinates to make the sword's crossguard
	    int crossguardX[] = {233 + x, 223 + x, 233 + x, 243 + x, 253 + x, 243 + x};
	    // array of local int variables of y coordinates to make the sword's crossguard
	    int crossguardY[] = {105, 91, 98, 98, 91, 105};
	    // array of local int variables of x coordinates to make the blade tip
	    int bladeTipX[] = {233 + x, 233 + x, 243 + x};
	    // array of local int variables of y coordinates to make the blade tip
	    int bladeTipY[] = {38, 27, 38};

	    // The sword's erase
	    c.setColor (backgroundPurple);
	    c.fillRect (232 + x, 27, 11, 72);
	    c.fillPolygon (crossguardX, crossguardY, 6);
	    c.drawLine (222 + x, 91, 232 + x, 105);
	    c.drawLine (223 + x, 91, 233 + x, 105);
	    c.fillRect (223 + x, 91, 30, 7);
	    c.fillRect (232 + x, 105, 11, 20);

	    // The sword's hilt
	    c.setColor (hiltBlack);
	    c.fillRect (233 + x, 105, 10, 15);
	    c.fillOval (233 + x, 115, 10, 10);

	    // The sword's crossguard
	    c.setColor (crossguardCopper);
	    c.fillPolygon (crossguardX, crossguardY, 6);

	    // The hilt lines
	    c.drawLine (233 + x, 110, 243 + x, 110);
	    c.drawLine (233 + x, 120, 243 + x, 120);

	    // The blade's tip
	    c.setColor (bladeGrey);
	    c.fillPolygon (bladeTipX, bladeTipY, 3);

	    // The sword's blade
	    c.fillRect (233 + x, 38, 10, 60);

	    // The blade line
	    c.setColor (lineBlack);
	    c.drawLine (238 + x, 33, 238 + x, 97);

	    // animation delay
	    try
	    {
		Thread.sleep (5); // make this 5
	    }
	    catch (Exception e)
	    {
	    }
	}

	// second cut lines
	c.drawLine (355, 55, 355, 80);
	c.drawLine (356, 55, 356, 80);

	// loop used to animate the sword moving to the left
	for (int x = 0 ; x < 90 ; x++)
	{
	    // array of local int variables of x coordinates to make the sword's crossguard
	    int crossguardX[] = {323 - x, 313 - x, 323 - x, 333 - x, 343 - x, 333 - x};
	    // array of local int variables of y coordinates to make the sword's crossguard
	    int crossguardY[] = {105, 91, 98, 98, 91, 105};
	    // array of local int variables of x coordinates to make the blade tip
	    int bladeTipX[] = {323 - x, 323 - x, 333 - x};
	    // array of local int variables of y coordinates to make the blade tip
	    int bladeTipY[] = {38, 27, 38};

	    // The sword's erase
	    c.setColor (backgroundPurple);
	    c.fillRect (323 - x, 27, 11, 72);
	    c.fillPolygon (crossguardX, crossguardY, 6);
	    c.drawLine (343 - x, 91, 333 - x, 105);
	    c.drawLine (344 - x, 91, 334 - x, 105);
	    c.fillRect (313 - x, 91, 30, 7);
	    c.fillRect (323 - x, 105, 12, 20);

	    // The sword's hilt
	    c.setColor (hiltBlack);
	    c.fillRect (323 - x, 105, 10, 15);
	    c.fillOval (323 - x, 115, 10, 10);

	    // The sword's crossguard
	    c.setColor (crossguardCopper);
	    c.fillPolygon (crossguardX, crossguardY, 6);

	    // The hilt lines
	    c.drawLine (323 - x, 110, 333 - x, 110);
	    c.drawLine (323 - x, 120, 333 - x, 120);

	    // The blade's tip
	    c.setColor (bladeGrey);
	    c.fillPolygon (bladeTipX, bladeTipY, 3);

	    // The sword's blade
	    c.fillRect (323 - x, 38, 10, 60);

	    // The blade line
	    c.setColor (lineBlack);
	    c.drawLine (328 - x, 33, 328 - x, 97);

	    // animation delay
	    try
	    {
		Thread.sleep (5); // make this 5
	    }
	    catch (Exception e)
	    {
	    }
	}

	// loop used to animate the sword moving right
	for (int x = 0 ; x < 90 ; x++)
	{
	    // array of local int variables of x coordinates to make the sword's crossguard
	    int crossguardX[] = {233 + x, 223 + x, 233 + x, 243 + x, 253 + x, 243 + x};
	    // array of local int variables of y coordinates to make the sword's crossguard
	    int crossguardY[] = {105, 91, 98, 98, 91, 105};
	    // array of local int variables of x coordinates to make the blade tip
	    int bladeTipX[] = {233 + x, 233 + x, 243 + x};
	    // array of local int variables of y coordinates to make the blade tip
	    int bladeTipY[] = {38, 27, 38};

	    // The sword's erase
	    c.setColor (backgroundPurple);
	    c.fillRect (232 + x, 27, 11, 72);
	    c.fillPolygon (crossguardX, crossguardY, 6);
	    c.drawLine (222 + x, 91, 232 + x, 105);
	    c.drawLine (223 + x, 91, 233 + x, 105);
	    c.fillRect (223 + x, 91, 30, 7);
	    c.fillRect (232 + x, 105, 11, 20);

	    // The sword's hilt
	    c.setColor (hiltBlack);
	    c.fillRect (233 + x, 105, 10, 15);
	    c.fillOval (233 + x, 115, 10, 10);

	    // The sword's crossguard
	    c.setColor (crossguardCopper);
	    c.fillPolygon (crossguardX, crossguardY, 6);

	    // The hilt lines
	    c.drawLine (233 + x, 110, 243 + x, 110);
	    c.drawLine (233 + x, 120, 243 + x, 120);

	    // The blade's tip
	    c.setColor (bladeGrey);
	    c.fillPolygon (bladeTipX, bladeTipY, 3);

	    // The sword's blade
	    c.fillRect (233 + x, 38, 10, 60);

	    // The blade line
	    c.setColor (lineBlack);
	    c.drawLine (238 + x, 33, 238 + x, 97);

	    // animation delay
	    try
	    {
		Thread.sleep (5); // make this 5
	    }
	    catch (Exception e)
	    {
	    }
	}

	// third cut lines
	c.drawLine (365, 55, 365, 80);
	c.drawLine (366, 55, 366, 80);

	// loop used to animate the sword moving to the left
	for (int x = 0 ; x < 51 ; x++)
	{
	    // array of local int variables of x coordinates to make the sword's crossguard
	    int crossguardX[] = {323 - x, 313 - x, 323 - x, 333 - x, 343 - x, 333 - x};
	    // array of local int variables of y coordinates to make the sword's crossguard
	    int crossguardY[] = {105, 91, 98, 98, 91, 105};
	    // array of local int variables of x coordinates to make the blade tip
	    int bladeTipX[] = {323 - x, 323 - x, 333 - x};
	    // array of local int variables of y coordinates to make the blade tip
	    int bladeTipY[] = {38, 27, 38};

	    // The sword's erase
	    c.setColor (backgroundPurple);
	    c.fillRect (323 - x, 27, 11, 72);
	    c.fillPolygon (crossguardX, crossguardY, 6);
	    c.drawLine (343 - x, 91, 333 - x, 105);
	    c.drawLine (344 - x, 91, 334 - x, 105);
	    c.fillRect (313 - x, 91, 30, 7);
	    c.fillRect (323 - x, 105, 12, 20);

	    // The sword's hilt
	    c.setColor (hiltBlack);
	    c.fillRect (323 - x, 105, 10, 15);
	    c.fillOval (323 - x, 115, 10, 10);

	    // The sword's crossguard
	    c.setColor (crossguardCopper);
	    c.fillPolygon (crossguardX, crossguardY, 6);

	    // The blade's tip
	    c.setColor (bladeGrey);
	    c.fillPolygon (bladeTipX, bladeTipY, 3);

	    // The sword's blade
	    c.fillRect (323 - x, 38, 10, 60);

	    // The blade line
	    c.setColor (lineBlack);
	    c.drawLine (328 - x, 33, 328 - x, 97);

	    // animation delay
	    try
	    {
		Thread.sleep (5); // make this 5
	    }
	    catch (Exception e)
	    {
	    }
	}

	// loop used to animate the sword moving upwards
	for (int x = 0 ; x < 201 ; x++)
	{

	    // array of local int variables of x coordinates to make the sword's crossguard
	    int crossguardX[] = {273, 263, 273, 283, 293, 283};
	    // array of local int variables of y coordinates to make the sword's crossguard
	    int crossguardY[] = {105 - x, 91 - x, 98 - x, 98 - x, 91 - x, 105 - x};
	    // array of local int variables of x coordinates to make the blade tip
	    int bladeTipX[] = {273, 273, 283};
	    // array of local int variables of y coordinates to make the blade tip
	    int bladeTipY[] = {38 - x, 27 - x, 38 - x};

	    // The sword's erase
	    c.setColor (backgroundPurple);
	    c.fillRect (263, 27 - x, 30, 99);

	    // The sword's hilt
	    c.setColor (hiltBlack);
	    c.fillRect (273, 105 - x, 10, 15);
	    c.fillOval (273, 115 - x, 10, 10);

	    // The sword's crossguard
	    c.setColor (crossguardCopper);
	    c.fillPolygon (crossguardX, crossguardY, 6);

	    // The hilt lines
	    c.drawLine (273, 110 - x, 283, 110 - x);
	    c.drawLine (273, 120 - x, 283, 120 - x);

	    // The blade's tip
	    c.setColor (bladeGrey);
	    c.fillPolygon (bladeTipX, bladeTipY, 3);

	    // The sword's blade
	    c.fillRect (273, 38 - x, 10, 60);

	    // The blade line
	    c.setColor (lineBlack);
	    c.drawLine (278, 33 - x, 278, 97 - x);

	    // animation delay
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
    }


    // outputs conversation between Subway Ninja and Suzy
    public void text ()
    {
	c.setColor (lineBlack);
	c.drawString ("How's that?", 225, 40);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("How's that?", 225, 40);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("It's PWERFECT!!", 375, 120);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("It's PWERFECT!!", 375, 120);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (lineBlack);
	c.drawString ("Thank you MISTAH NINJA!!", 340, 120);

	try
	{
	    Thread.sleep (1500); // make this 1500
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (backgroundPurple);
	c.drawString ("Thank you MISTAH NINJA!!", 340, 120);

	try
	{
	    Thread.sleep (1000); // make this 1000
	}
	catch (InterruptedException e)
	{
	}

    }


    // Animates Suzy leaving the shop with her sandwich
    public void animate2 ()
    {
	// loop used to animate Suzy and her sandwich
	for (int x = 0 ; x < 401 ; x++)
	{
	    // Sandwich
	    //-----------------------------------------------
	    // Erase of sandwich
	    c.setColor (backgroundPurple);
	    c.fillRect (332 + x, 55, 49, 26);

	    // Bottom layer of bread
	    c.setColor (breadBrown);
	    c.fillRect (333 + x, 72, 46, 8);

	    // Top layer of bread
	    c.drawLine (333 + x, 64, 379 + x, 64);
	    c.fillArc (333 + x, 55, 9, 20, 0, 180);
	    c.fillArc (342 + x, 55, 9, 20, 0, 180);
	    c.fillArc (351 + x, 55, 10, 20, 0, 180);
	    c.fillArc (361 + x, 55, 10, 20, 0, 180);
	    c.fillArc (371 + x, 55, 10, 20, 0, 180);


	    // Topping of the sandwich
	    c.setColor (baconPink);
	    c.fillRoundRect (337 + x, 65, 40, 7, 10, 10);

	    // first cut lines of the sandwich
	    c.setColor (lineBlack);
	    c.drawLine (346 + x, 55, 346 + x, 80);
	    c.drawLine (347 + x, 55, 347 + x, 80);

	    // second cut lines of the sandwich
	    c.drawLine (355 + x, 55, 355 + x, 80);
	    c.drawLine (356 + x, 55, 356 + x, 80);

	    // third cut lines of the sandwich
	    c.drawLine (365 + x, 55, 365 + x, 80);
	    c.drawLine (366 + x, 55, 366 + x, 80);
	    //-----------------------------------------------


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
	    c.fillRect (479 + x, 102, 79, 101);

	    // Suzy's left shoe
	    c.setColor (shoeOrange);
	    c.fillRect (504 + x, 198, 10, 5);

	    // Suzy's right shoe
	    c.fillRect (524 + x, 198, 10, 5);

	    // Suzy's left leg
	    c.setColor (pantBlue);
	    c.fillRect (504 + x, 174, 10, 24);

	    // Suzy's right leg
	    c.fillRect (524 + x, 174, 10, 24);

	    // Suzy's head
	    c.setColor (skinPeach);
	    c.fillRoundRect (508 + x, 111, 23, 23, 10, 10);

	    // array of local int variables of x coordinates to make Suzy's shirt
	    int suzyShirtX[] = {510 + x, 494 + x, 544 + x, 528 + x};
	    // array of local int variables of y coordinates to make Suzy's shirt
	    int suzyShirtY[] = {134, 174, 174, 134};
	    // array of local int variables of x coordinates to make Suzy's left arm
	    int suzyLeftArmX[] = {505 + x, 485 + x, 480 + x, 500 + x};
	    // array of local int variables of y coordinates to make Suzy's left arm
	    int suzyLeftArmY[] = {154, 135, 140, 160};
	    // array of local int variables of x coordinates to make Suzy's right arm
	    int suzyRightArmX[] = {533 + x, 553 + x, 558 + x, 538 + x};
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
	    c.drawLine (508 + x, 140, 530 + x, 140);
	    c.drawLine (503 + x, 155, 535 + x, 155);
	    c.drawLine (498 + x, 165, 540 + x, 165);

	    // Suzy's left eye
	    c.setColor (eyeBlue);
	    c.fillOval (511 + x, 115, 7, 7);
	    // Suzy's right eye
	    c.fillOval (521 + x, 115, 7, 7);

	    // Suzy's mouth
	    c.setColor (mouthRed);
	    c.drawArc (512 + x, 120, 13, 10, 180, 187);

	    // Suzy's hat
	    c.setColor (hatRed);
	    c.fillArc (508 + x, 102, 23, 20, 0, 180);
	    c.drawLine (498 + x, 110, 508 + x, 110);
	    c.drawLine (498 + x, 111, 508 + x, 111);

	    try
	    {
		Thread.sleep (5); // make this 5
	    }
	    catch (InterruptedException e)
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
    }


    public Sword (Console con)
    {
	c = con;
    }


    public void run ()
    {
	animate ();
	text ();
	animate2 ();
    }
} // Sword class


