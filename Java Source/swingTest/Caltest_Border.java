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
	private JTextField tf1, tf2, tf3; // 전역변수 선언
	
	public Caltest_Border() {
		setTitle("계산기BorderLayout"); //BorderLayout 사용
		//setLayout(new BorderLayout()); //JFrame의 기본 Layout은 BorderLayout이다. (기본 Layout은 생략가능하다.)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1 = new JPanel(); //패널1 추가
		JPanel p2 = new JPanel(); //패널2 추가
		JPanel p3 = new JPanel(); //패널3 추가 
		tf1 = new JTextField(5); //숫자1
		tf2 = new JTextField(5); //숫자2
		tf3 = new JTextField(15); //결과
		
		JButton b1 = new JButton("+");
		JButton b2 = new JButton("-");
		JButton b3 = new JButton("*");
		JButton b4 = new JButton("/");
		
		//p1.setLayout(new FlowLayout()); // JPanel의 기본 Layout은 FlowLayout이다. (기본 Layout은 생략가능하다.)
		p1.add(new JLabel("숫자1")); //패널에 부착
		p1.add(tf1); //패널에 부착
		p1.add(new JLabel("숫자2")); //패널에 부착
		p1.add(tf2); //패널에 부착
		p2.add(b1); p2.add(b2); p2.add(b3); p2.add(b4); //패널에 부착
		p3.add(new JLabel("결과")); //패널에 부착
		p3.add(tf3); //패널에 부착
		add(BorderLayout.NORTH,p1); //패널1 => 상단
		add(BorderLayout.CENTER,p2); //패널2 => 중간
		add(BorderLayout.SOUTH,p3); //패널3 => 하단 //패널을 JFrame에 부착
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		setSize(400,150);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) { //Action event 생성
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
	  }catch(NumberFormatException n) { //오류 처리
		  tf3.setText("숫자를 입력하세요");
	  }catch(ArithmeticException a) { //오류 처리
		  tf3.setText("0으로 나눌 수 없습니다.");
	  }
		
	}
	public static void main(String[] args) {
		new Caltest_Border();

	}
	

}
