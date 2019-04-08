import java.awt.*;

public class RectangleCircles {

	public static void main(String[] args) {
		
		DrawingPanel panel = new DrawingPanel(300, 200);
		panel.setBackground(Color.YELLOW);
		Graphics g = panel.getGraphics();
		
		
		g.setColor(Color.BLUE);
		g.fillOval(65, 40, 45, 50);
		g.fillOval(175, 40, 45, 50);
		
		
		g.setColor(Color.RED);
		g.fillRect(95, 65, 95, 60);
		
		
		g.setColor(Color.RED);
		g.fillRect(95, 105, 95, 60);
		
		g.setColor(Color.BLACK);
		g.drawLine(95, 115, 190, 115);
		
	}

}
