import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject{
	int speed;
	public Projectile(int x, int y, int width, int height, int speed) {
		super(x, y, width, height);
		this.speed = 10;
		
	}
		public void draw(Graphics g) {
			 g.setColor(Color.RED);

		     g.fillRect(x, y, width, height);
		}
		public void update() {
			super.update();
			y=y-speed;
			if(y<=0) {
				isAlive = false;
			}
			
	}
		
}
