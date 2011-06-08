import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import javax.swing.JPanel;
import java.applet.*;
import java.awt.*;

public class ruler {
	
	
	public class showRuler extends Applet {
		Point lineStart = new Point(75, 150);
        Point lineEnd = new Point(50, 100);
        Line2D line = new Line2D.Double(lineStart, lineEnd);
        Stroke stroke = new BasicStroke(2.0f);
        
        public void paint(Graphics g) {
        
        g.drawLine(0, 0, 50, 100);
        
        }
	}
	

	
	
	//public void paintComponent(Graphics g){
	//	super.paintComponent(stroke);
    //    Graphics2D g2 = (Graphics2D) g;
    //    g2.setStroke(stroke);
    //    g2.draw(line);
	//}
	
}