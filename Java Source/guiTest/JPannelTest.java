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
		JButton b1 = new JButton("��ư1");
		JButton b2 = new JButton("��ư2");
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
		setSize(300, 400);//ũ�⸦ 300,400
		setVisible(true);//ȭ�鿡 ���̱�
	}
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		Container con = getContentPane();
		if(str.contentEquals("��ư1")) {
			System.out.println("��ư1 Ŭ��");
			getContentPane().setBackground(Color.BLUE);
			System.out.println(tf1.getText());
		}else {
			System.out.println("��ư2 Ŭ��");
			con.setBackground(Color.CYAN);
			tf1.setText("");
		}
	}

	public static void main(String[] args) {
		new JPannelTest();
		
	}
		
}

