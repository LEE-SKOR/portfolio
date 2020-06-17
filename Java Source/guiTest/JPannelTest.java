package guiTest;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JPannelTest extends JFrame implements ActionListener{
	JTextField tf1;
	public JPannelTest() {
		JButton b1 = new JButton("버튼1");
		JButton b2 = new JButton("버튼2");
		tf1 = new JTextField(20);
		JTextArea ta = new JTextArea(5,20);
		TextArea tta = new TextArea(5,10);
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(tf1);
		add(ta);
		add(tta); 
		b1.addActionListener(this);
		b2.addActionListener(this);
		setSize(300, 400);//크기를 300,400
		setVisible(true);//화면에 보이기
	}
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		Container con = getContentPane();
		if(str.contentEquals("버튼1")) {
			System.out.println("버튼1 클릭");
			getContentPane().setBackground(Color.BLUE);
			System.out.println(tf1.getText());
		}else {
			System.out.println("버튼2 클릭");
			con.setBackground(Color.CYAN);
			tf1.setText("");
		}
	}

	public static void main(String[] args) {
		new JPannelTest();
		
	}
		
}

