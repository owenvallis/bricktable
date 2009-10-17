import processing.core.PImage;

public class Buttons {
	
	// Make a copy of Launcher so can use Processing Commands
	Launcher L;
	
	// Store Images
	PImage base;
	PImage roll;	
	PImage down;
	PImage currentimage;

	int x, y;
	int w, h;	
	boolean over = false;	
	boolean pressed = false;   	

	Buttons(int ix, int iy, int iw, int ih, String ibase, String iroll, String idown, Launcher L) 
	{
		// Make local copy of Launcher for Processing Commands
		this.L = L;
		
		x = ix;
		y = iy;
		w = iw;
		h = ih;
		base = L.loadImage(ibase);
		roll = L.loadImage(iroll);
		down = L.loadImage(idown);
		currentimage = base;
	}

	  void display() 
	  {
	    L.image(currentimage, x, y);
	  }

}
