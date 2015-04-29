import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GameInterface {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
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

	private JFrame GameFrame;
	private Game game;
	private Location computerMove;
	private ArrayList<XOButton> buttonsList = new ArrayList<XOButton>(); // arraylist
	// to
	// keep
	// buttons
	private ArrayList<JLabel> countersList = new ArrayList<JLabel>(); // arraylist
	// to
	// keep
	// counters;
	private int numberOfWins = 0;
	private int numberOfLosses = 0;
	private int numberOfTies = 0;
	private JLabel lblNumberOfWins;
	private JLabel lblNumberOfLosses;
	private JLabel lblNumberOfTies;
	private char player;

	private char computer;

	/**
	 * Create the application.
	 */
	public GameInterface() {
		this.initialize();

	}

	private void computerPlay(Location computerMove) {
		assert computerMove != null;
		this.getButtonOfLocation(computerMove).setValue(this.computer);
	}

	private XOButton getButtonOfLocation(Location location) {
		assert location != null;
		for (XOButton button : this.buttonsList) {
			if (button.getButtonLocation().compareTo(location) == 0) {
				return button;
			}
		}
		return null;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {

		this.GameFrame = new JFrame();
		this.GameFrame.setTitle("Tic Tac Toe");
		this.GameFrame.setResizable(false);
		this.GameFrame.setBounds(100, 100, 380, 476);
		this.GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.GameFrame.getContentPane().setLayout(null);

		int messageType = JOptionPane.QUESTION_MESSAGE;
		String[] options = { "X", "O" };
		int choice = JOptionPane.showOptionDialog(this.GameFrame,
				"X goes first, O goes second", "Choose your turn", 0,
				messageType, null, options, "X");
		if (choice == 0) {
			this.player = 'x';
			this.computer = 'o';
		} else if (choice == 1) {
			this.player = 'o';
			this.computer = 'x';
		}

		this.game = new Game(this.player, this.computer);
		XOButton button00 = new XOButton(0, 0);
		this.buttonsList.add(button00);
		button00.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				GameInterface.this.XOButtonPressed(button00);
			}
		});
		button00.setBounds(23, 37, 75, 75);
		this.GameFrame.getContentPane().add(button00);

		XOButton button01 = new XOButton(0, 1);
		this.buttonsList.add(button01);
		button01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				GameInterface.this.XOButtonPressed(button01);
			}
		});
		button01.setBounds(103, 37, 75, 75);
		this.GameFrame.getContentPane().add(button01);

		XOButton button02 = new XOButton(0, 2);
		this.buttonsList.add(button02);
		button02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				GameInterface.this.XOButtonPressed(button02);
			}
		});
		button02.setBounds(184, 37, 75, 75);
		this.GameFrame.getContentPane().add(button02);

		XOButton button03 = new XOButton(0, 3);
		this.buttonsList.add(button03);
		button03.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				GameInterface.this.XOButtonPressed(button03);
			}
		});
		button03.setBounds(265, 37, 75, 75);
		this.GameFrame.getContentPane().add(button03);

		XOButton button10 = new XOButton(1, 0);
		this.buttonsList.add(button10);
		button10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				GameInterface.this.XOButtonPressed(button10);
			}
		});
		button10.setBounds(23, 118, 75, 75);
		this.GameFrame.getContentPane().add(button10);

		XOButton button11 = new XOButton(1, 1);
		this.buttonsList.add(button11);
		button11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				GameInterface.this.XOButtonPressed(button11);
			}
		});
		button11.setBounds(103, 118, 75, 75);
		this.GameFrame.getContentPane().add(button11);

		XOButton button12 = new XOButton(1, 2);
		this.buttonsList.add(button12);
		button12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				GameInterface.this.XOButtonPressed(button12);
			}
		});
		button12.setBounds(184, 118, 75, 75);
		this.GameFrame.getContentPane().add(button12);

		XOButton button13 = new XOButton(1, 3);
		this.buttonsList.add(button13);
		button13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				GameInterface.this.XOButtonPressed(button13);
			}
		});
		button13.setBounds(265, 118, 75, 75);
		this.GameFrame.getContentPane().add(button13);

		XOButton button20 = new XOButton(2, 0);
		this.buttonsList.add(button20);
		button20.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				GameInterface.this.XOButtonPressed(button20);
			}
		});
		button20.setBounds(23, 199, 75, 75);
		this.GameFrame.getContentPane().add(button20);

		XOButton button21 = new XOButton(2, 1);
		this.buttonsList.add(button21);
		button21.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				GameInterface.this.XOButtonPressed(button21);
			}
		});
		button21.setBounds(103, 199, 75, 75);
		this.GameFrame.getContentPane().add(button21);

		XOButton button22 = new XOButton(2, 2);
		this.buttonsList.add(button22);
		button22.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				GameInterface.this.XOButtonPressed(button22);
			}
		});
		button22.setBounds(184, 199, 75, 75);
		this.GameFrame.getContentPane().add(button22);

		XOButton button23 = new XOButton(2, 3);
		this.buttonsList.add(button23);
		button23.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				GameInterface.this.XOButtonPressed(button23);
			}
		});
		button23.setBounds(265, 199, 75, 75);
		this.GameFrame.getContentPane().add(button23);

		XOButton button30 = new XOButton(3, 0);
		this.buttonsList.add(button30);
		button30.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				GameInterface.this.XOButtonPressed(button30);
			}
		});
		button30.setBounds(23, 280, 75, 75);
		this.GameFrame.getContentPane().add(button30);

		XOButton button31 = new XOButton(3, 1);
		this.buttonsList.add(button31);
		button31.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				GameInterface.this.XOButtonPressed(button31);
			}
		});
		button31.setBounds(103, 280, 75, 75);
		this.GameFrame.getContentPane().add(button31);

		XOButton button32 = new XOButton(3, 2);
		this.buttonsList.add(button32);
		button32.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				GameInterface.this.XOButtonPressed(button32);
			}
		});
		button32.setBounds(184, 280, 75, 75);
		this.GameFrame.getContentPane().add(button32);

		XOButton button33 = new XOButton(3, 3);
		this.buttonsList.add(button33);
		button33.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				GameInterface.this.XOButtonPressed(button33);
			}
		});
		button33.setBounds(265, 280, 75, 75);
		this.GameFrame.getContentPane().add(button33);

		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(265, 403, 75, 23);
		this.GameFrame.getContentPane().add(btnExit);

		JLabel lblWins = new JLabel("Wins:");
		lblWins.setBounds(10, 381, 49, 14);
		this.GameFrame.getContentPane().add(lblWins);

		JLabel lblLosses = new JLabel("Losses:");
		lblLosses.setBounds(83, 381, 61, 14);
		this.GameFrame.getContentPane().add(lblLosses);

		JLabel lblTies = new JLabel("Ties:");
		lblTies.setBounds(184, 381, 27, 14);
		this.GameFrame.getContentPane().add(lblTies);

		this.lblNumberOfWins = new JLabel("0");
		this.lblNumberOfWins.setBounds(60, 381, 27, 14);
		this.GameFrame.getContentPane().add(this.lblNumberOfWins);

		this.lblNumberOfLosses = new JLabel("0");
		this.lblNumberOfLosses.setBounds(151, 381, 27, 14);
		this.GameFrame.getContentPane().add(this.lblNumberOfLosses);

		this.lblNumberOfTies = new JLabel("0");
		this.lblNumberOfTies.setBounds(232, 381, 27, 14);
		this.GameFrame.getContentPane().add(this.lblNumberOfTies);

		if (this.computer == 'x') {
			this.computerPlay(this.game.generateComputerMove());
		}
	}

	/* this method does the GUI part of checking if the game is over */
	private void isGameOver() {
		if (this.game.isGameOver() == -1) {
			JOptionPane.showMessageDialog(null, "It's a tie!");
			this.numberOfTies++;
			this.resetGame();
		}
		if (this.game.isGameOver() == 1) {
			if (this.game.getWinner() == this.player) {
				this.numberOfWins++;
				JOptionPane.showMessageDialog(null, "You won!");
			} else if (this.game.getWinner() == this.computer) {
				this.numberOfLosses++;
				JOptionPane.showMessageDialog(null, "You Lost :(");
			}
			this.resetGame();
		}
	}

	/*
	 * this method resets the game, it is only called once game.isGameOver()
	 * returns a value other than 0
	 */
	private void resetGame() {
		this.game.resetBoard();
		for (XOButton button : this.buttonsList) {
			button.setValue(' ');
			// button.setEnabled(true);
		}
		if (this.player == 'o') {
			this.computerPlay(this.game.generateComputerMove());
		}
		this.lblNumberOfWins.setText(String.valueOf(this.numberOfWins));
		this.lblNumberOfLosses.setText(String.valueOf(this.numberOfLosses));
		this.lblNumberOfTies.setText(String.valueOf(this.numberOfTies));
	}

	/* this method should be called when a key is pressed; to avoid redundency */
	private void XOButtonPressed(XOButton button) {
		this.computerMove = this.game.play(button.getButtonLocation());
		button.setValue(this.player);
		if (this.computerMove != null) {
			this.computerPlay(this.computerMove);
		}
		this.isGameOver();
	}
}
