package POS;
import java.util.ArrayList;

import javax.swing.JFrame;

public class POS_Frame extends JFrame {
	public POS_Frame(int tableNum) {
		setTitle("버닝돈 POS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setContentPane(new POSPanel(POS_Frame.this,tableNum));

		setSize(1150,660);
		setVisible(true); 
	}
}


