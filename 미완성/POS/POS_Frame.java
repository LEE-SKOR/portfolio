package POS;
import javax.swing.JFrame;

public class POS_Frame extends JFrame {
	public POS_Frame() {
		setTitle("버닝돈");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setContentPane(new POSPanel());

		setSize(1150,660);
		setVisible(true);
	}
}
