import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.JLabel;


public class GameInterface {

	private JFrame GameFrame;
	private Game game;
	private Location computerMove;
	private ArrayList<XOButton> buttonsList = new ArrayList<XOButton>(); //arraylist to keep buttons
	private ArrayList<JLabel> countersList = new ArrayList<JLabel>(); //arraylist to keep counters;
	private int numberOfWins = 0;
	private int numberOfLosses = 0;
	private int numberOfTies = 0;
	private JLabel lblNumberOfWins;
	private JLabel lblNumberOfLosses;
	private JLabel lblNumberOfTies;

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
	
	private XOButton getButtonOfLocation(Location location){
		for(XOButton button : buttonsList){
			if(button.getButtonLocation().compareTo(location)==0){
				return button;
			}
		}
		return null;
	}

	/**
	 * Create the application.
	 */
	public GameInterface() {
		initialize();
	}
	
	/* this method should be called when a key is pressed; to avoid redundency*/
	private void XOButtonPressed(XOButton button){
		computerMove =	game.play(button.getButtonLocation());
		button.setValue('x');
		System.out.println(computerMove);
		getButtonOfLocation(computerMove).setValue('o');
		getButtonOfLocation(computerMove).setEnabled(false);
		if(game.isGameOver() == -1){
			JOptionPane.showMessageDialog(null, "It's a tie!");
			numberOfTies++;
			resetGame();
		}
	}
	
	/* this method resets the game, it is only called once game.isGameOver() returns a value other than 0*/
	private void resetGame(){
		game.resetBoard();
		for(XOButton button: buttonsList){
			button.setValue(' ');
			button.setEnabled(true);
		}
		lblNumberOfWins.setText(String.valueOf(numberOfWins));
		lblNumberOfLosses.setText(String.valueOf(numberOfLosses));
		lblNumberOfTies.setText(String.valueOf(numberOfTies));
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
		buttonsList.add(button00);
		button00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			XOButtonPressed(button00);
			}
		});
		button00.setBounds(23, 37, 75, 75);
		GameFrame.getContentPane().add(button00);
		
		XOButton button01 = new XOButton(0,1);
		buttonsList.add(button01);
		button01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				XOButtonPressed(button01);
			}
		});
		button01.setBounds(103, 37, 75, 75);
		GameFrame.getContentPane().add(button01);
		
		
		XOButton button02 = new XOButton(0,2);
		buttonsList.add(button02);
		button02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				XOButtonPressed(button02);
			}
		});
		button02.setBounds(184, 37, 75, 75);
		GameFrame.getContentPane().add(button02);
		
		XOButton button03 = new XOButton(0,3);
		buttonsList.add(button03);
		button03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				XOButtonPressed(button03);
			}
		});
		button03.setBounds(265, 37, 75, 75);
		GameFrame.getContentPane().add(button03);
		
		XOButton button10 = new XOButton(1,0);
		buttonsList.add(button10);
		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				XOButtonPressed(button10);
			}
		});
		button10.setBounds(23, 118, 75, 75);
		GameFrame.getContentPane().add(button10);
		
		XOButton button11 = new XOButton(1,1);
		buttonsList.add(button11);
		button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				XOButtonPressed(button11);
			}
		});
		button11.setBounds(103, 118, 75, 75);
		GameFrame.getContentPane().add(button11);
		
		XOButton button12 = new XOButton(1,2);
		buttonsList.add(button12);
		button12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				XOButtonPressed(button12);
			}
		});
		button12.setBounds(184, 118, 75, 75);
		GameFrame.getContentPane().add(button12);
		
		XOButton button13 = new XOButton(1,3);
		buttonsList.add(button13);
		button13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				XOButtonPressed(button13);
			}
		});
		button13.setBounds(265, 118, 75, 75);
		GameFrame.getContentPane().add(button13);
		
		XOButton button20 = new XOButton(2,0);
		buttonsList.add(button20);
		button20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				XOButtonPressed(button20);
			}
		});
		button20.setBounds(23, 199, 75, 75);
		GameFrame.getContentPane().add(button20);
		
		XOButton button21 = new XOButton(2,1);
		buttonsList.add(button21);
		button21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				XOButtonPressed(button21);
			}
		});
		button21.setBounds(103, 199, 75, 75);
		GameFrame.getContentPane().add(button21);
		
		XOButton button22 = new XOButton(2,2);
		buttonsList.add(button22);
		button22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				XOButtonPressed(button22);
			}
		});
		button22.setBounds(184, 199, 75, 75);
		GameFrame.getContentPane().add(button22);
		
		XOButton button23 = new XOButton(2,3);
		buttonsList.add(button23);
		button23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				XOButtonPressed(button23);
			}
		});
		button23.setBounds(265, 199, 75, 75);
		GameFrame.getContentPane().add(button23);
		
		XOButton button30 = new XOButton(3,0);
		buttonsList.add(button30);
		button30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				XOButtonPressed(button30);
			}
		});
		button30.setBounds(23, 280, 75, 75);
		GameFrame.getContentPane().add(button30);
		
		XOButton button31 = new XOButton(3,1);
		buttonsList.add(button31);
		button31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				XOButtonPressed(button31);
			}
		});
		button31.setBounds(103, 280, 75, 75);
		GameFrame.getContentPane().add(button31);
		
		XOButton button32 = new XOButton(3,2);
		buttonsList.add(button32);
		button32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				XOButtonPressed(button32);
			}
		});
		button32.setBounds(184, 280, 75, 75);
		GameFrame.getContentPane().add(button32);
		
		XOButton button33 = new XOButton(3,3);
		buttonsList.add(button33);
		button33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				XOButtonPressed(button33);
			}
		});
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
		
		JLabel lblWins = new JLabel("Wins:");
		lblWins.setBounds(10, 381, 49, 14);
		GameFrame.getContentPane().add(lblWins);
		
		JLabel lblLosses = new JLabel("Losses:");
		lblLosses.setBounds(83, 381, 61, 14);
		GameFrame.getContentPane().add(lblLosses);
		
		JLabel lblTies = new JLabel("Ties:");
		lblTies.setBounds(184, 381, 27, 14);
		GameFrame.getContentPane().add(lblTies);
		
		lblNumberOfWins = new JLabel("0");
		lblNumberOfWins.setBounds(60, 381, 27, 14);
		GameFrame.getContentPane().add(lblNumberOfWins);
		
		lblNumberOfLosses = new JLabel("0");
		lblNumberOfLosses.setBounds(151, 381, 27, 14);
		GameFrame.getContentPane().add(lblNumberOfLosses);
		
		lblNumberOfTies = new JLabel("0");
		lblNumberOfTies.setBounds(232, 381, 27, 14);
		GameFrame.getContentPane().add(lblNumberOfTies);
	}
}
