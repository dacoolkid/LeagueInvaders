import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
Rocketship rocky;
long enemyTimer;
int enemySpawnTime;
ArrayList<Projectile> projectiles = new ArrayList();
ArrayList<Alien> aliens = new ArrayList();
public ObjectManager(Rocketship supership) {
	rocky = supership;
}
public void update() {
	rocky.update();
	for(int i = 0; i<projectiles.size();i++) {
		projectiles.get(i).update();
		
	}
	for(int i = 0; i<aliens.size();i++) {
		aliens.get(i).update();
		
	}
	
	
}
public void manageEnemies(){
    if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
            addAlien(new Alien(new Random().nextInt(LeagueInvaders.WIDTH), 0, 50, 50));

enemyTimer = System.currentTimeMillis();
    }
}
public void purgeObjects() {
	for(int i = 0;i<projectiles.size();i++) {
		if(projectiles.get(i).isAlive == false) {
			projectiles.remove(i);
		}
		}

	


	
for(int i = 0;i<aliens.size();i++) {
	if(aliens.get(i).isAlive == false) {
		aliens.remove(i);
	}
	}
}
	public void checkCollision() {
		for(int a = 0; a<aliens.size();a++) {

	        if(rocky.collisionBox.intersects(aliens.get(a).collisionBox)){

	                rocky.isAlive = false;

	        }
	        for(int i = 0; i<projectiles.size();i++) {
	        	 if(aliens.get(i).collisionBox.intersects(projectiles.get(i).collisionBox)){

		                aliens.get(a).isAlive = false;
		                projectiles.get(a).isAlive = false;

	        	 }
	}
	     
		}
	}



	


public void draw(Graphics g) {
	rocky.draw(g);
	for(int i = 0; i<projectiles.size();i++) {
		projectiles.get(i).draw(g);
	}
	for(int i = 0; i<aliens.size();i++) {
		aliens.get(i).draw(g);
	}
	
}
public void addProjectile(Projectile tom) {
	projectiles.add(tom);
	
	
	
}
public void addAlien(Alien arien) {
	aliens.add(arien);
}
}
