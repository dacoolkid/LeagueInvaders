import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class LeagueInvaders{
	JFrame frame = new JFrame();
	final static int WIDTH = 500;
	final static int HEIGHT = 800;
	GamePanel game = new GamePanel();
	
	public static void main(String[] args) {
		LeagueInvaders league = new LeagueInvaders();
		league.setup();
	}
	public void setup() {
		frame.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.add(game);
       frame.addKeyListener(game);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		game.startGame();
	}
	
	
	}


