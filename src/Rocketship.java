import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
int speed ;
	public Rocketship(int x, int y, int width, int height, int speed) {
		super(x, y, width, height);
		this.speed = 5;
		
	} 
	public void draw(Graphics g) {
		y++;
	}
	public void update() {
		super.update();
	
	}
	
	
}