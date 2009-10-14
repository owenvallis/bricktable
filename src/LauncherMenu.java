
public class LauncherMenu implements StateInterface {

	Launcher L;
	
	LauncherMenu(Launcher L)
	{
		this.L = L;
	}
	
	public void display() {
		L.ellipse(100, 100, 50, 60);
	}

	public void touchEventAddCursor(long sessionID, int cursorX, int cursorY) {
		// TODO Auto-generated method stub
		
	}

	public void touchEventRemoveCursor(long sessionID) {
		// TODO Auto-generated method stub
		
	}

	public void touchEventUpdateCursor(long sessionID, int cursorX, int cursorY) {
		// TODO Auto-generated method stub
		
	}

}
