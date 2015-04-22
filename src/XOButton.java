import javax.swing.*;
import java.awt.event.*;

public class XOButton extends JButton implements ActionListener {
	ImageIcon x;
	ImageIcon o;
	int value = 0;
	
	public XOButton(){
		x = new ImageIcon(getClass().getResource("X.png"));
		o = new ImageIcon(getClass().getResource("o.png"));
		addActionListener(this);
	}
	
@Override
	public void actionPerformed(ActionEvent e){
		value++;
		value%=3;
		switch(value){
		case 0:
			setIcon(null);
			break;
		case 1: 
			setIcon(x);
			break;
		case 2:
			setIcon(o);
			break;
		}
	}
	public void setValue(int value){
		this.value=value;
	}
}
