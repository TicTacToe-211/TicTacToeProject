import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GameInterface {

	private JFrame GameFrame;
	private Game game;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameInterface window = new GameInterface();
					window.GameFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		GameFrame = new JFrame();
		GameFrame.setTitle("Tic Tac Toe");
		GameFrame.setResizable(false);
		GameFrame.setBounds(100, 100, 380, 476);
		GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GameFrame.getContentPane().setLayout(null);
		game = new Game();
		
		XOButton button00 = new XOButton(0,0);
		button00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				game.play(button00.getLocation());
			}
		});
		button00.setBounds(23, 37, 75, 75);
		GameFrame.getContentPane().add(button00);
		
		XOButton button01 = new XOButton();
		button01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button01.setBounds(103, 37, 75, 75);
		GameFrame.getContentPane().add(button01);
		
		XOButton button02 = new XOButton();
		button02.setBounds(184, 37, 75, 75);
		GameFrame.getContentPane().add(button02);
		
		XOButton button03 = new XOButton();
		button03.setBounds(265, 37, 75, 75);
		GameFrame.getContentPane().add(button03);
		
		XOButton button10 = new XOButton();
		button10.setBounds(23, 118, 75, 75);
		GameFrame.getContentPane().add(button10);
		
		XOButton button11 = new XOButton();
		button11.setBounds(103, 118, 75, 75);
		GameFrame.getContentPane().add(button11);
		
		XOButton button12 = new XOButton();
		button12.setBounds(184, 118, 75, 75);
		GameFrame.getContentPane().add(button12);
		
		XOButton button13 = new XOButton();
		button13.setBounds(265, 118, 75, 75);
		GameFrame.getContentPane().add(button13);
		
		XOButton button20 = new XOButton();
		button20.setBounds(23, 199, 75, 75);
		GameFrame.getContentPane().add(button20);
		
		XOButton button21 = new XOButton();
		button21.setBounds(103, 199, 75, 75);
		GameFrame.getContentPane().add(button21);
		
		XOButton button22 = new XOButton();
		button22.setBounds(184, 199, 75, 75);
		GameFrame.getContentPane().add(button22);
		
		XOButton button23 = new XOButton();
		button23.setBounds(265, 199, 75, 75);
		GameFrame.getContentPane().add(button23);
		
		XOButton button30 = new XOButton();
		button30.setBounds(23, 280, 75, 75);
		GameFrame.getContentPane().add(button30);
		
		XOButton button31 = new XOButton();
		button31.setBounds(103, 280, 75, 75);
		GameFrame.getContentPane().add(button31);
		
		XOButton button32 = new XOButton();
		button32.setBounds(184, 280, 75, 75);
		GameFrame.getContentPane().add(button32);
		
		XOButton button33 = new XOButton();
		button33.setBounds(265, 280, 75, 75);
		GameFrame.getContentPane().add(button33);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(265, 403, 75, 23);
		GameFrame.getContentPane().add(btnExit);
	}
}
