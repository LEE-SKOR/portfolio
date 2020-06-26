package swingTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Caltest2 extends JFrame {
	private JTextField tf1, tf2, tf3; // 전역변수 선언
	
	public Caltest2() {
		setTitle("계산기2");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tf1 = new JTextField(5); //숫자1
		tf2 = new JTextField(5); //숫자2
		tf3 = new JTextField(15); //결과
		
		JButton b1 = new JButton("+");
		JButton b2 = new JButton("-");
		JButton b3 = new JButton("*");
		JButton b4 = new JButton("/");
		
		add(new JLabel("숫자1"));
		add(tf1);
		add(new JLabel("숫자2"));
		add(tf2);
		add(b1); add(b2); add(b3); add(b4);
		add(new JLabel("결과"));
		add(tf3);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(tf1.getText());
				int b = Integer.parseInt(tf2.getText());
				tf3.setText(a+b+"\n");
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(tf1.getText());
				int b = Integer.parseInt(tf2.getText());
				tf3.setText(a-b+"\n");
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(tf1.getText());
				int b = Integer.parseInt(tf2.getText());
				tf3.setText(a*b+"\n");
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(tf1.getText());
				int b = Integer.parseInt(tf2.getText());
				tf3.setText(a/b+"\n");
				
			}
		});
		setSize(500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Caltest2();

	}
	

}
