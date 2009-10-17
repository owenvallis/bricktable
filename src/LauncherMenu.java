
public class LauncherMenu implements StateInterface {

	Launcher L;
	
	Buttons AhText;
	Buttons SOM;
	Buttons Roots;
	
	LauncherMenu(Launcher L)
	{
		this.L = L;
		
		String ah = "data/launcher/ahtext.jpg";
		AhText = new Buttons(15,0,400,800,ah,ah,ah,L);
		
		String root = "data/launcher/roots.jpg";
		Roots = new Buttons(440,0,400,800,root,root,root,L);
		
		String som = "data/launcher/som.jpg";
		SOM = new Buttons(865,0,400,800,som,som,som,L);
		
		
	}
	
	public void display() {
		L.ellipse(100, 100, 50, 60);
		AhText.display();
		Roots.display();
		SOM.display();
	}

	public void touchEventAddCursor(long sessionID, int cursorX, int cursorY) {
		if (cursorX < (int)(L.width) && cursorY < (int)(L.height)) {
			L.ellipse(200, 200, 50, 60);
		}
	}

	public void touchEventRemoveCursor(long sessionID) {
		// TODO Auto-generated method stub
		
	}

	public void touchEventUpdateCursor(long sessionID, int cursorX, int cursorY) {
		// TODO Auto-generated method stub
		
	}

}
