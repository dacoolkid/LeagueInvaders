import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{  
 
	@Override

	
	public void paintComponent(Graphics g){


	        }
	final int MENU_STATE = 0;

	final int GAME_STATE = 1;

	final int END_STATE = 2;
	
	int currentState = MENU_STATE;
	
	Timer timer = new Timer(1000 / 60, this);
	
	public void updateMenuState() {
	}
	public void updateGameState(){}
	public void updateEndState() {}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}
	
	public void startGame() {
	
		timer.start();
	
	}
public void update() {
    	
    }
public void draw(Graphics g){
	
}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("gay");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("supergay");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("megagay");
	}
}
