package guiTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JGugudan extends JFrame implements ActionListener{
	JTextArea ta;
	JTextField dan;
	public JGugudan() {
		setTitle("������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b = new JButton("������");
		dan = new JTextField(13);
		ta = new JTextArea(10,20);
		setLayout(new FlowLayout());
		add(dan);
		add(b);
		add(ta);
		b.addActionListener(this);
		dan.addActionListener(this);
		setSize(300,400);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new JGugudan();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		ta.setText("");
		try {
			
		
		int d = Integer.parseInt(dan.getText());
			for(int i=1; i<=9; i++) {
				//System.out.println(d+"X"+i+"="+d*i); //�ֿܼ� ���
				ta.append(d+"X"+i+"="+d*i+"\n");
			}
		}catch(NumberFormatException n) {
			dan.setText("���� ���ڸ� �Է��ϼ���.");
		}
		
	}
	
}