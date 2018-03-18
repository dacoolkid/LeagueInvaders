import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	final int MENU_STATE = 0;

	final int GAME_STATE = 1;

	final int END_STATE = 2;
	int currentState = MENU_STATE;
	
	public Font titleFont;
	Rocketship rocket = new Rocketship(250, 700, 50, 50, 5);
	ObjectManager objectMan = new ObjectManager(rocket);

	public GamePanel() {
		titleFont = new Font("Arial", Font.PLAIN, 48);

	}

	@Override

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {

			drawMenuState(g);

		} else if (currentState == GAME_STATE) {

			drawGameState(g);

		} else if (currentState == END_STATE) {

			drawEndState(g);

		}

	}

	Timer timer = new Timer(1000 / 60, this);

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (currentState == MENU_STATE) {

			updateMenuState();

		} else if (currentState == GAME_STATE) {

			updateGameState();

		} else if (currentState == END_STATE) {

			updateEndState();

		}
		repaint();
	}

	public void startGame() {
		timer.start();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState++;
			if (currentState > END_STATE) {

				currentState = MENU_STATE;
				// Movement
				
					}
				
			}
		if (currentState == GAME_STATE) {
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				rocket.y = rocket.y - rocket.speed;
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				rocket.x = rocket.x + rocket.speed;
			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				rocket.y = rocket.y + rocket.speed;
			}
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				rocket.x = rocket.x - rocket.speed;
			}
			//projectiles
			if(e.getKeyCode()==KeyEvent.VK_SPACE) {
				   objectMan.addProjectile(new Projectile(rocket.x, rocket.y, 10, 10,10));
			}

		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void updateMenuState() {

	}

	public void updateGameState() {
		objectMan.update();
	}

	public void updateEndState() {

	}

	public void drawMenuState(Graphics g) {
		g.setColor(Color.PINK);
		g.setFont(titleFont);

		g.setColor(Color.BLUE);

		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setColor(Color.BLACK);
		g.drawString("League Invaders", 85, 90);
		g.drawString("Smash That Enter", 85, 250);
		g.drawString("Button!!!!!!!!!!", 85, 300);
	}

	public void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);

		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setColor(Color.BLUE);
		objectMan.draw(g);
	}

	public void drawEndState(Graphics g) {
		g.setColor(Color.RED);

		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setColor(Color.PINK);
		g.drawString("U Ded Foo", 100, 90);
	}
}
