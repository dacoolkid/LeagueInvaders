import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{  
	final int MENU_STATE = 0;

	final int GAME_STATE = 1;

	final int END_STATE = 2;
	int currentState = MENU_STATE;
	
	public Font titleFont;
	public GamePanel() {
		 titleFont = new Font("Arial",Font.PLAIN, 48);
		 
	}
	
	@Override
	

	public void paintComponent(Graphics g){
		if(currentState == MENU_STATE){
			System.out.println("We are missing something here we gotta figure out what it is");
            drawMenuState(g);

    }else if(currentState == GAME_STATE){

            drawGameState(g);

    }else if(currentState == END_STATE){

            drawEndState(g);

    }


	                

	        }
	Timer timer = new Timer(1000 / 60, this);
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if(currentState == MENU_STATE){
		
            updateMenuState();

    }else if(currentState == GAME_STATE){

            updateGameState();

    }else if(currentState == END_STATE){

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
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
currentState++;
if(currentState > END_STATE){
	

                currentState = MENU_STATE;

        }
		// TODO Auto-generated method stub
	
	}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	
	}
	public void updateMenuState() {
		
	}
public void updateGameState() {
		
	}
public void updateEndState() {
	
}
	public void drawMenuState(Graphics g) {
		g.setColor(Color.PINK);
		g.setFont(titleFont);
		   g.drawString("text", 90, 90);
		   
		g.setColor(Color.BLUE);

		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);    
	}
	public void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);

		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);    
	}
	public void drawEndState(Graphics g) {
		g.setColor(Color.RED);

		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);    
	}
	}

