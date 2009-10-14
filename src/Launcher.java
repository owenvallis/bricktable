import processing.core.PApplet;

public class Launcher extends PApplet implements TuioObserver{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	StateInterface MenuLauncher;

	StateInterface stateInterface;
	
	TuioHandler tuioHandler;

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(new String[] {"--present",  "Launcher" });
	}

	public void setup() {
		size(screen.width,screen.height);

		tuioHandler = new TuioHandler(this);
		tuioHandler.registerObserver(this);

		MenuLauncher = new LauncherMenu(this);
		stateInterface = MenuLauncher;
	}

	public void draw() {
		background(100);
		stateInterface.display();

	}

	public void tuioCursorAdded(long sessionID, int cursorX, int cursorY) {
		stateInterface.touchEventAddCursor(sessionID, cursorX, cursorY);			
	}

	public void tuioCursorRemove(long sessionID) {
		// TODO Auto-generated method stub
		
	}

	public void tuioCursorUpdate(long sessionID, int cursorX, int cursorY) {
		// TODO Auto-generated method stub
		
	}

}
