import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
    int x;

    int y;
    Rectangle collisionBox = new Rectangle();
    boolean isAlive = true;
    
    int width;

    int height;
    
    public GameObject(int x, int y, int width, int height) {
    	this.x = x;
    	this.y = y;
    	this.width = width;
    	this.height = height;
    	collisionBox.setBounds(x, y, width, height);
    }
    public void update() {
    	
    }
    public void draw(Graphics g){

	                

	        }
    	
    	
    }

