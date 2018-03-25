import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class LeagueInvaders implements KeyListener {
	JFrame frame = new JFrame();
	final int WIDTH = 500;
	final int HEIGHT = 800;
	GamePanel game = new GamePanel();
	
	public static void main(String[] args) {
		LeagueInvaders league = new LeagueInvaders();
		league.setup();
	}
	public void setup() {
		frame.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
frame.pack();
       frame.addKeyListener(this);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.add(game);
		game.startGame();
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


