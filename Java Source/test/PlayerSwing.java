package test;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PlayerSwing extends JFrame{
	JTextField[] tf = new JTextField[6];
	Connection con;
	public PlayerSwing() {
		dbCon();
		setTitle("Player Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,2));
		add(new PanelPane());//1��1��
		JTextArea ta = new JTextArea();
		JScrollPane jsp = new JScrollPane(ta);
		add(jsp);
		JPanel p1 = new JPanel();
		JButton insertBtn = new JButton("�߰�");
		JButton viewBtn = new JButton("����");
		JButton updateBtn = new JButton("����");
		JButton deleteBtn = new JButton("����");
		p1.add(insertBtn); p1.add(viewBtn);
		p1.add(updateBtn); p1.add(deleteBtn);
		add(p1);//2��1��
		
		//�߰�
		insertBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String sql = "INSERT INTO player VALUES+(player_sql.nextval,?,?,?,?,?)";
				try {
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1,tf[1].getText());
					ps.setString(2, tf[2].getText());
					ps.setDouble(3,Double.parseDouble(tf[3].getText()));
					ps.setDouble(4,Double.parseDouble(tf[4].getText()));
					ps.setString(5,tf[5].getText());
					ps.executeUpdate();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		//����
		viewBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		//����
		updateBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		//����
		deleteBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		JPanel p2 = new JPanel();
		JComboBox<String> jcb = new JComboBox<String>();
		jcb.addItem("�̸�");
		jcb.addItem("����");
		JTextField searchtf = new JTextField(10);
		JButton searchBtn = new JButton("�˻�");
		p2.add(jcb); p2.add(searchBtn);	p2.add(searchBtn);
		add(p2);//2��2��
		
		//�˻���ư
		searchBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		setSize(600,400);
		setVisible(true);
		
	}
	
	class PanelPane extends JPanel{
		private String[] text = {"��ȣ","�̸�","����","Ű","������","����"};
		public PanelPane() {
			setLayout(null);
			for(int i=0; i<text.length; i++) {
				JLabel la = new JLabel(text[i]);
						la.setHorizontalAlignment(JLabel.RIGHT);
						la.setSize(50,20);
						la.setLocation(30, 50+i*20);
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
	//DB����
	private void dbCon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "SCOTT";
			String pwd = "1234";
			con = DriverManager.getConnection(url,user,pwd);
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
	}
	
	public static void main(String[] args) {
		new PlayerSwing();

	}

}
