package swingTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ListTest2 extends JFrame {
	private JTextField tf;
	private JTextArea ta;
	private List list; //awt에 있는 리스트를 사용한다.(ArrayList 아님)
	private JCheckBox cb;
	
	public ListTest2() {
		setTitle("List예제2");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1 = new JPanel();
		tf = new JTextField(15);
		JButton btn = new JButton("추가");
		cb = new JCheckBox("다중선택");
		p1.setBackground(Color.GRAY);
		p1.add(tf); p1.add(btn); p1.add(cb);
		
		JPanel p2 = new JPanel(new GridLayout(1,2));
		list = new List();
		ta = new JTextArea();
		p2.add(list); p2.add(ta);
		
		ActionH ah = new ActionH();
		ItemH ih = new ItemH();
		
		btn.addActionListener(ah);//연결
		tf.addActionListener(ah);//엔터로 입력
		list.addItemListener(ih);//연결
		cb.addItemListener(ih);//연결
		
		
		add(BorderLayout.NORTH,p1);//패널 위치 선정
		add(BorderLayout.CENTER,p2);//패널 위치 선정
		
		setSize(400,400);//사이즈 설정
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ListTest2();

	}
	class ActionH implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(tf.getText().isEmpty()) return; //tf가 비어있다면 false, 들어있다면 true
			list.add(tf.getText());
			tf.setText("");
			
		}
		
	}//ActionEvent
	class ItemH implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			Object obj = e.getSource();
			if(obj==list) {//list가 이벤트 발생
				ta.setText("");
				if(list.isMultipleMode()) {//list가 다중선택
					String[] arr = list.getSelectedItems();
					for(int i=0; i<arr.length; i++) {
						ta.append(arr[i]+"\n");
					}
				}else {//list가 단일선택
				 //리스트(list)에서 선택한 내용을 TextArea(ta)에 출력하기
				 ta.setText(list.getSelectedItem());
				}
			}else if(obj==cb) {//checkBox가 이벤트 발생
				if(cb.isSelected()){//체크박스 선택 -> 리스트가 다중모드
					list.setMultipleMode(true);
				}else {//체크박스 해제 -> 리스트가 단일모드
					list.setMultipleMode(false);
				}
			
		}
		
	}//ItemH

  }//ListTest2
	
}//Class
