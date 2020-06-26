package swingTest;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Caltest_Border extends JFrame implements ActionListener{
	private JTextField tf1, tf2, tf3; // �������� ����
	
	public Caltest_Border() {
		setTitle("����BorderLayout"); //BorderLayout ���
		//setLayout(new BorderLayout()); //JFrame�� �⺻ Layout�� BorderLayout�̴�. (�⺻ Layout�� ���������ϴ�.)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1 = new JPanel(); //�г�1 �߰�
		JPanel p2 = new JPanel(); //�г�2 �߰�
		JPanel p3 = new JPanel(); //�г�3 �߰� 
		tf1 = new JTextField(5); //����1
		tf2 = new JTextField(5); //����2
		tf3 = new JTextField(15); //���
		
		JButton b1 = new JButton("+");
		JButton b2 = new JButton("-");
		JButton b3 = new JButton("*");
		JButton b4 = new JButton("/");
		
		//p1.setLayout(new FlowLayout()); // JPanel�� �⺻ Layout�� FlowLayout�̴�. (�⺻ Layout�� ���������ϴ�.)
		p1.add(new JLabel("����1")); //�гο� ����
		p1.add(tf1); //�гο� ����
		p1.add(new JLabel("����2")); //�гο� ����
		p1.add(tf2); //�гο� ����
		p2.add(b1); p2.add(b2); p2.add(b3); p2.add(b4); //�гο� ����
		p3.add(new JLabel("���")); //�гο� ����
		p3.add(tf3); //�гο� ����
		add(BorderLayout.NORTH,p1); //�г�1 => ���
		add(BorderLayout.CENTER,p2); //�г�2 => �߰�
		add(BorderLayout.SOUTH,p3); //�г�3 => �ϴ� //�г��� JFrame�� ����
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		setSize(400,150);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) { //Action event ����
		String str = e.getActionCommand();
		try {
		int a = Integer.parseInt(tf1.getText());
		int b = Integer.parseInt(tf2.getText());
		switch(str) {
		case "+": tf3.setText(String.valueOf(a+b));break;
		case "-": tf3.setText(a-b+"");break;
		case "*": tf3.setText(a*b+"");break;
		case "/": tf3.setText(a/b+"");break;
		}
	  }catch(NumberFormatException n) { //���� ó��
		  tf3.setText("���ڸ� �Է��ϼ���");
	  }catch(ArithmeticException a) { //���� ó��
		  tf3.setText("0���� ���� �� �����ϴ�.");
	  }
		
	}
	public static void main(String[] args) {
		new Caltest_Border();

	}
	

}
