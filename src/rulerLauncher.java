import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class rulerLauncher {
	public static void main (String[] args) {

		ruler english = new ruler();
		
		Frame rWindow = new Frame("Ruler");
		rWindow.addWindowListener (new WindowAdapter ()
        	{public void windowClosing (WindowEvent e) {System.exit(0);}});
		rWindow.setSize (800, 600);
		rWindow.setVisible(true);

		english.showRuler();
	}
}