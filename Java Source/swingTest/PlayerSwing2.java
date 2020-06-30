package swingTest;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PlayerSwing2 extends JFrame{
	JTextField[] tf = new JTextField[6];
	PlayerDBA dao = new PlayerDBA();
	public PlayerSwing2() { 
		
		setTitle("Player Test22");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,2));
		add(new PanelPane()); //1��1��
		JTextArea ta = new JTextArea();
		JScrollPane jsp = new JScrollPane(ta);
		add(jsp);//1��2��
		
		ta.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				int num = Integer.parseInt(ta.getSelectedText().trim());
				Player p = dao.playerDetail(num);
				tf[0].setText(num+"");
				tf[1].setText(p.getName());
				tf[2].setText(p.getBirth());
				tf[3].setText(p.getHeight()+"");
				tf[4].setText(p.getWeight()+"");
				tf[5].setText(p.getKind());
				dao.playerDetail(num);
			}
		});
		JPanel p1 = new JPanel();
		JButton insertBtn = new JButton("�߰�");
		JButton viewBtn = new JButton("����");
		JButton updateBtn = new JButton("����");
		JButton deleteBtn = new JButton("����");
		
		p1.add(insertBtn); p1.add(viewBtn);
		p1.add(updateBtn); p1.add(deleteBtn);
		add(p1); //2�� 1��
		
		//�߰�
		insertBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Player p = new Player();
				p.setName(tf[1].getText());
				p.setBirth(tf[2].getText());
				p.setHeight(Double.parseDouble(tf[3].getText()));
				p.setWeight(Double.parseDouble(tf[4].getText()));
				p.setKind(tf[5].getText());
				dao.playerInsert(p);
				viewBtn.doClick();
				
			}
		});
		//����
		viewBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
			 ArrayList<Player> arr = dao.playerView();
			 for(Player p : arr) {
				 ta.append("��ȣ >> "+p.getNum()+"\n");
				 ta.append("�̸� >> "+p.getName()+"\n");
				 ta.append("���� >> "+p.getBirth()+"\n");
				 ta.append("Ű >> "+p.getHeight()+"\n");
				 ta.append("������ >> "+p.getWeight()+"\n");
				 ta.append("���� >> "+p.getKind()+"\n");
				 ta.append("\n");
			 }
			}
		});
		//����
		updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player p = new Player();
				p.setNum(Integer.parseInt(tf[0].getText()));
				p.setName(tf[1].getText());
				p.setBirth(tf[2].getText());
				p.setHeight(Double.parseDouble(tf[3].getText()));
				p.setWeight(Double.parseDouble(tf[4].getText()));
				p.setKind(tf[5].getText());
				dao.playerUpdate(p);
				clearText();
				viewBtn.doClick();
			}
		});
		//����
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int num = Integer.parseInt(tf[0].getText());
			dao.playerDelete(num);
			viewBtn.doClick();
			clearText();
		    }
			
		});
		
		JPanel p2 = new JPanel();
		JComboBox<String> jcb = new JComboBox<String>();
		jcb.addItem("�̸�");
		jcb.addItem("����");
		JTextField searchtf = new JTextField(10);
		JButton searchBtn = new JButton("�˻�");
		p2.add(jcb); p2.add(searchtf); p2.add(searchBtn);
		add(p2); //2�� 2��
		
		//�˻���ư
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
				int idx = jcb.getSelectedIndex();
				String key = "";
				if(idx ==0) {
					key = "name";
				}else if(idx ==1) {
					key ="kind";
				}
				ArrayList<Player> arr = dao.playerSearch(key,searchtf.getText());
				for(Player p : arr) {
					ta.append("��ȣ >> "+p.getNum()+"\n");
					ta.append("�̸� >> "+p.getName()+"\n");
					ta.append("���� >> "+p.getBirth()+"\n");
					ta.append("Ű >> "+p.getHeight()+"\n");
					ta.append("������ >> "+p.getWeight()+"\n");
					ta.append("���� >> "+p.getKind()+"\n");
					ta.append("\n");
				}
			}
		});
		
		setSize(600,400);
		setVisible(true);
			
	}
	
	class PanelPane extends JPanel {
		private String[] text = {"��ȣ","�̸�","����","Ű","������","����"};
		public PanelPane() {
			setLayout(null);
			for(int i =0;i<text.length;i++) {
				JLabel la = new JLabel(text[i]);
						la.setHorizontalAlignment(JLabel.RIGHT);
						la.setSize(50,20);
						la.setLocation(30,50+i*20);
						add(la);
						tf[i] = new JTextField(50);
						tf[i].setHorizontalAlignment(JTextField.CENTER);
						tf[i].setSize(150,20);
						tf[i].setLocation(120,50+i*20);
						add(tf[i]);	
			}
			tf[0].setEditable(false);
		}
	}
	private void clearText() {
		for(int i=0; i<tf.length; i++) {
			tf[i].setText("");
		}
	}
		public static void main(String[] args) {
			new PlayerSwing2();
		}
}

	