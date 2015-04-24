import javax.swing.*;

import java.awt.event.*;

public class XOButton extends JButton implements ActionListener {
	private Location location;
	ImageIcon x;
	ImageIcon o;
	char value;
	
	public Location getLocation(){
		return location;
	}
	public XOButton(int x, int y){
		this.location = new Location(x,y);
		this.x = new ImageIcon(getClass().getResource("X.png"));
		this.o = new ImageIcon(getClass().getResource("o.png"));
		addActionListener(this);
	}
	
@Override
	public void actionPerformed(ActionEvent e){
		switch(value){
		case 'x': 
			setIcon(x);
			this.setEnabled(false);
			break;
		case 'o':
			setIcon(o);
			this.setEnabled(false);
			break;
		 default:
			 setIcon(null);
			 this.setEnabled(true);
			 break;
		}
	}
	public void setValue(char value){
		this.value=value;
	}
}
