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

public class ListTest3 extends JFrame{
	private JTextField tf;
	private JTextArea ta;
	private List list; //awt�� �ִ� ����Ʈ�� ����Ѵ�.(ArrayList �ƴ�)
	private JCheckBox cb;
	
	public ListTest3() {
		setTitle("List����3");
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
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().isEmpty()) return; //tf�� ����ִٸ� false, ����ִٸ� true
				list.add(tf.getText());
				tf.setText("");	
			}
		});//class�� ������ �ʰ� �ٷ� actionPerformed ����
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().isEmpty()) return; //tf�� ����ִٸ� false, ����ִٸ� true
				list.add(tf.getText());
				tf.setText("");				
			}
		});//class�� ������ �ʰ� �ٷ� actionPerformed ����
		list.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
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
			}
		});//class�� ������ �ʰ� �ٷ� ItemStateChanged ����
		cb.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(cb.isSelected()){//üũ�ڽ� ���� -> ����Ʈ�� ���߸��
					list.setMultipleMode(true);
				}else {//üũ�ڽ� ���� -> ����Ʈ�� ���ϸ��
					list.setMultipleMode(false);
				}	
			}
		});//class�� ������ �ʰ� �ٷ� ItemStateChanged ����
		
		
		add(BorderLayout.NORTH,p1);//�г� ��ġ ����
		add(BorderLayout.CENTER,p2);//�г� ��ġ ����
		
		setSize(400,400);//������ ����
		setVisible(true);		
	}
	public static void main(String[] args) {
		new ListTest3();

	}
	
	

}
