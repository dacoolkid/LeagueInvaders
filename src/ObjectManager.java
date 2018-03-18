import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
Rocketship rocky;
ArrayList<Projectile> projectiles = new ArrayList();
public ObjectManager(Rocketship supership) {
	rocky = supership;
}
public void update() {
	rocky.update();
	for(int i = 0; i<projectiles.size();i++) {
		projectiles.get(i).update();
	}
}
public void draw(Graphics g) {
	rocky.draw(g);
	for(int i = 0; i<projectiles.size();i++) {
		projectiles.get(i).draw(g);
	}
	
}
public void addProjectile(Projectile tom) {
	projectiles.add(tom);
	
	
	
}
}
