import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
int speed ;
	public Rocketship(int x, int y, int width, int height, int speed) {
		super(x, y, width, height);
		this.speed = 5;
		
	} 
	public void draw(Graphics g) {
		 g.setColor(Color.BLUE);

	     g.fillRect(x, y, width, height);
	}
	public void update() {
		
	
	}
	
	
}