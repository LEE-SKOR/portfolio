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
	private List list; //awt�� �ִ� ����Ʈ�� ����Ѵ�.(ArrayList �ƴ�)
	private JCheckBox cb;
	
	public ListTest2() {
		setTitle("List����2");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1 = new JPanel();
		tf = new JTextField(15);
		JButton btn = new JButton("�߰�");
		cb = new JCheckBox("���߼���");
		p1.setBackground(Color.GRAY);
		p1.add(tf); p1.add(btn); p1.add(cb);
		
		JPanel p2 = new JPanel(new GridLayout(1,2));
		list = new List();
		ta = new JTextArea();
		p2.add(list); p2.add(ta);
		
		ActionH ah = new ActionH();
		ItemH ih = new ItemH();
		
		btn.addActionListener(ah);//����
		tf.addActionListener(ah);//���ͷ� �Է�
		list.addItemListener(ih);//����
		cb.addItemListener(ih);//����
		
		
		add(BorderLayout.NORTH,p1);//�г� ��ġ ����
		add(BorderLayout.CENTER,p2);//�г� ��ġ ����
		
		setSize(400,400);//������ ����
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ListTest2();

	}
	class ActionH implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(tf.getText().isEmpty()) return; //tf�� ����ִٸ� false, ����ִٸ� true
			list.add(tf.getText());
			tf.setText("");
			
		}
		
	}//ActionEvent
	class ItemH implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			Object obj = e.getSource();
			if(obj==list) {//list�� �̺�Ʈ �߻�
				ta.setText("");
				if(list.isMultipleMode()) {//list�� ���߼���
					String[] arr = list.getSelectedItems();
					for(int i=0; i<arr.length; i++) {
						ta.append(arr[i]+"\n");
					}
				}else {//list�� ���ϼ���
				 //����Ʈ(list)���� ������ ������ TextArea(ta)�� ����ϱ�
				 ta.setText(list.getSelectedItem());
				}
			}else if(obj==cb) {//checkBox�� �̺�Ʈ �߻�
				if(cb.isSelected()){//üũ�ڽ� ���� -> ����Ʈ�� ���߸��
					list.setMultipleMode(true);
				}else {//üũ�ڽ� ���� -> ����Ʈ�� ���ϸ��
					list.setMultipleMode(false);
				}
			
		}
		
	}//ItemH

  }//ListTest2
	
}//Class
