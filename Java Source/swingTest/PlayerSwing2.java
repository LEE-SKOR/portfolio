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
		add(new PanelPane()); //1행1열
		JTextArea ta = new JTextArea();
		JScrollPane jsp = new JScrollPane(ta);
		add(jsp);//1행2열
		
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
		JButton insertBtn = new JButton("추가");
		JButton viewBtn = new JButton("보기");
		JButton updateBtn = new JButton("수정");
		JButton deleteBtn = new JButton("삭제");
		
		p1.add(insertBtn); p1.add(viewBtn);
		p1.add(updateBtn); p1.add(deleteBtn);
		add(p1); //2행 1열
		
		//추가
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
		//보기
		viewBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
			 ArrayList<Player> arr = dao.playerView();
			 for(Player p : arr) {
				 ta.append("번호 >> "+p.getNum()+"\n");
				 ta.append("이름 >> "+p.getName()+"\n");
				 ta.append("생일 >> "+p.getBirth()+"\n");
				 ta.append("키 >> "+p.getHeight()+"\n");
				 ta.append("몸무게 >> "+p.getWeight()+"\n");
				 ta.append("종목 >> "+p.getKind()+"\n");
				 ta.append("\n");
			 }
			}
		});
		//수정
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
		//삭제
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
		jcb.addItem("이름");
		jcb.addItem("종목");
		JTextField searchtf = new JTextField(10);
		JButton searchBtn = new JButton("검색");
		p2.add(jcb); p2.add(searchtf); p2.add(searchBtn);
		add(p2); //2행 2열
		
		//검색버튼
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
					ta.append("번호 >> "+p.getNum()+"\n");
					ta.append("이름 >> "+p.getName()+"\n");
					ta.append("생일 >> "+p.getBirth()+"\n");
					ta.append("키 >> "+p.getHeight()+"\n");
					ta.append("몸무게 >> "+p.getWeight()+"\n");
					ta.append("종목 >> "+p.getKind()+"\n");
					ta.append("\n");
				}
			}
		});
		
		setSize(600,400);
		setVisible(true);
			
	}
	
	class PanelPane extends JPanel {
		private String[] text = {"번호","이름","생일","키","몸무게","종목"};
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

	