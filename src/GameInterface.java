import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GameInterface {

	private JFrame GameFrame;
	private String[][] game;

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
	private void initialize() {
		game = new String[4][4];
		game[0][0] = "X";
		GameFrame = new JFrame();
		GameFrame.setTitle("Tic Tac Toe");
		GameFrame.setResizable(false);
		GameFrame.setBounds(100, 100, 380, 476);
		GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GameFrame.getContentPane().setLayout(null);
		
		XOButton button00 = new XOButton();
		button00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		
		JButton button02 = new JButton("");
		button02.setBounds(184, 37, 75, 75);
		GameFrame.getContentPane().add(button02);
		
		JButton button03 = new JButton("");
		button03.setBounds(265, 37, 75, 75);
		GameFrame.getContentPane().add(button03);
		
		JButton button10 = new JButton("");
		button10.setBounds(23, 118, 75, 75);
		GameFrame.getContentPane().add(button10);
		
		JButton button11 = new JButton("");
		button11.setBounds(103, 118, 75, 75);
		GameFrame.getContentPane().add(button11);
		
		JButton button12 = new JButton("");
		button12.setBounds(184, 118, 75, 75);
		GameFrame.getContentPane().add(button12);
		
		JButton button13 = new JButton("");
		button13.setBounds(265, 118, 75, 75);
		GameFrame.getContentPane().add(button13);
		
		JButton button20 = new JButton("");
		button20.setBounds(23, 199, 75, 75);
		GameFrame.getContentPane().add(button20);
		
		JButton button21 = new JButton("");
		button21.setBounds(103, 199, 75, 75);
		GameFrame.getContentPane().add(button21);
		
		JButton button22 = new JButton("");
		button22.setBounds(184, 199, 75, 75);
		GameFrame.getContentPane().add(button22);
		
		JButton button23 = new JButton("");
		button23.setBounds(265, 199, 75, 75);
		GameFrame.getContentPane().add(button23);
		
		JButton button30 = new JButton("");
		button30.setBounds(23, 280, 75, 75);
		GameFrame.getContentPane().add(button30);
		
		JButton button31 = new JButton("");
		button31.setBounds(103, 280, 75, 75);
		GameFrame.getContentPane().add(button31);
		
		JButton button32 = new JButton("");
		button32.setBounds(184, 280, 75, 75);
		GameFrame.getContentPane().add(button32);
		
		JButton button33 = new JButton("");
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
