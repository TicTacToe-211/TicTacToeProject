import javax.swing.ImageIcon;
import javax.swing.JButton;

public class XOButton extends JButton {
	private Location location;
	private ImageIcon x;
	private ImageIcon o;
	char value;

	public XOButton() {

	}

	public XOButton(int x, int y) {
		this.location = new Location(x, y);
		this.x = new ImageIcon(this.getClass().getResource("x.png"));
		this.o = new ImageIcon(this.getClass().getResource("O.png"));
	}

	public Location getButtonLocation() {
		return this.location;
	}

	public void setValue(char value) {
		assert (value == 'x') || (value == 'o');
		this.value = value;
		switch (value) {
		case 'x':
			this.setIcon(this.x);
			this.setEnabled(false);
			break;
		case 'o':
			this.setIcon(this.o);
			this.setEnabled(false);
			break;
		default:
			this.setIcon(null);
			this.setEnabled(true);
			break;
		}
	}
}
