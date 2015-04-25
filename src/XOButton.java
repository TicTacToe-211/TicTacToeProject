import javax.swing.*;

import java.awt.event.*;

public class XOButton extends JButton {
	private Location location;
	ImageIcon x;
	ImageIcon o;
	char value;
	
	public Location getButtonLocation(){
		return location;
	}
	public XOButton(){
		
	}
	public XOButton(int x, int y){
		this.location = new Location(x,y);
		this.x = new ImageIcon(getClass().getResource("x.png"));
		this.o = new ImageIcon(getClass().getResource("O.png"));
	}
	

	public void setValue(char value){
		this.value=value;
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
}
