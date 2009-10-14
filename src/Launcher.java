import processing.core.*;

public class Launcher extends PApplet implements TuioObserver{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(new String[] {"--present",  "Launcher" });
	}

	public void setup() {
		size(screen.width,screen.height);
	}

	public void draw() {
		background(100);		

	}

	public void tuioCursorAdded(long sessionID, int cursorX, int cursorY) {
		// TODO Auto-generated method stub
		
	}

	public void tuioCursorRemove(long sessionID) {
		// TODO Auto-generated method stub
		
	}

	public void tuioCursorUpdate(long sessionID, int cursorX, int cursorY) {
		// TODO Auto-generated method stub
		
	}

}
