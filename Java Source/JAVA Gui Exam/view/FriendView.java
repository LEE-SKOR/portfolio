package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.model.Friend;
import com.model.FriendDAOImpl;

import javax.swing.JSplitPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class FriendView extends JFrame {

	private JPanel contentPane;
	private JSplitPane splitPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField tfName;
	private JTextField tfBirth;
	private JTextField tfPhone;
	private JTextField tfAddr;
	private JButton btnView;
	private JButton btnInsert;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JLabel lblNewLabel_4;
	private JTextField tfNum;
	private JSplitPane splitPane_1;
	private JScrollPane scrollPane;
	private JTextArea ta;
	private JPanel panel_1;
	private JTextField tfSearch;
	private JComboBox jcb;
	private JButton btnSearch;
	FriendDAOImpl dao = new FriendDAOImpl();

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FriendView frame = new FriendView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FriendView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getSplitPane(), BorderLayout.CENTER);
	}

	private JSplitPane getSplitPane() {
		if (splitPane == null) {
			splitPane = new JSplitPane();
			splitPane.setLeftComponent(getPanel());
			splitPane.setRightComponent(getSplitPane_1());
			splitPane.setDividerLocation(250);
		}
		return splitPane;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getLblNewLabel_1());
			panel.add(getLblNewLabel_2());
			panel.add(getLblNewLabel_3());
			panel.add(getTfName());
			panel.add(getTfBirth());
			panel.add(getTfPhone());
			panel.add(getTfAddr());
			panel.add(getBtnView());
			panel.add(getBtnInsert());
			panel.add(getBtnUpdate());
			panel.add(getBtnDelete());
			panel.add(getLblNewLabel_4());
			panel.add(getTfNum());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("이름");
			lblNewLabel.setBounds(12, 24, 57, 15);
			lblNewLabel.setFont(new Font("굴림", Font.BOLD, 12));
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("생일");
			lblNewLabel_1.setBounds(12, 89, 57, 15);
			lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 12));
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("전화번호");
			lblNewLabel_2.setBounds(12, 160, 57, 15);
			lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 12));
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("주소");
			lblNewLabel_3.setBounds(12, 223, 57, 15);
			lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 12));
		}
		return lblNewLabel_3;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(71, 21, 153, 21);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JTextField getTfBirth() {
		if (tfBirth == null) {
			tfBirth = new JTextField();
			tfBirth.setBounds(71, 86, 153, 21);
			tfBirth.setColumns(10);
		}
		return tfBirth;
	}
	private JTextField getTfPhone() {
		if (tfPhone == null) {
			tfPhone = new JTextField();
			tfPhone.setBounds(71, 157, 153, 21);
			tfPhone.setColumns(10);
		}
		return tfPhone;
	}
	private JTextField getTfAddr() {
		if (tfAddr == null) {
			tfAddr = new JTextField();
			tfAddr.setBounds(71, 220, 153, 21);
			tfAddr.setColumns(10);
		}
		return tfAddr;
	}//전체보기 버튼
	private JButton getBtnView() {
		if (btnView == null) {
			btnView = new JButton("전체보기");
			btnView.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ta.setText("");
					 ArrayList<Friend> arr = dao.friendView();
					 for(Friend p : arr) {
						 ta.append("번호 : "+p.getNum()+"\n");
						 ta.append("이름 : "+p.getName()+"\n");
						 ta.append("생일 : "+p.getBirth()+"\n");
						 ta.append("전화번호 : "+p.getPhone()+"\n");
						 ta.append("주소 : "+p.getAddr()+"\n");
					}
				}
			});
			btnView.setBounds(12, 275, 97, 23);
		}
		return btnView;
	}//친구등록 버튼
	private JButton getBtnInsert() {
		if (btnInsert == null) {
			btnInsert = new JButton("친구등록");
			btnInsert.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Friend f = new Friend();
					f.setName(tfName.getText());
					f.setBirth(tfBirth.getText());
					f.setPhone(tfPhone.getText());
					f.setAddr(tfAddr.getText());
				
					dao.friendInsert(f);
					
				}
			});
			btnInsert.setBounds(140, 275, 97, 23);
		}
		return btnInsert;
	}//수정하기 버튼
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("수정하기");
			btnUpdate.setBounds(12, 340, 97, 23);
		}
		return btnUpdate;
	}//삭제하기 버튼
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("삭제하기");
			btnDelete.setBounds(140, 340, 97, 23);
		}
		return btnDelete;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("번호");
			lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 12));
			lblNewLabel_4.setBounds(12, 315, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JTextField getTfNum() {
		if (tfNum == null) {
			tfNum = new JTextField();
			tfNum.setBounds(71, 310, 153, 21);
			tfNum.setColumns(10);
		}
		return tfNum;
	}
	private JSplitPane getSplitPane_1() {
		if (splitPane_1 == null) {
			splitPane_1 = new JSplitPane();
			splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
			splitPane_1.setLeftComponent(getScrollPane());
			splitPane_1.setRightComponent(getPanel_1());
			splitPane_1.setDividerLocation(250);
		}
		return splitPane_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTa());
		}
		return scrollPane;
	}
	private JTextArea getTa() {
		if (ta == null) {
			ta = new JTextArea();
		}
		return ta;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.add(getTfSearch());
			panel_1.add(getJcb());
			panel_1.add(getBtnSearch());
		}
		return panel_1;
	}
	private JTextField getTfSearch() {
		if (tfSearch == null) {
			tfSearch = new JTextField();
			tfSearch.setBounds(151, 91, 160, 21);
			tfSearch.setColumns(10);
		}
		return tfSearch;
	}
	private JComboBox getJcb() {
		if (jcb == null) {
			jcb = new JComboBox();
			jcb.setModel(new DefaultComboBoxModel(new String[] {"선택...", "이름", "주소"}));
			jcb.setForeground(Color.BLACK);
			jcb.setFont(new Font("굴림", Font.BOLD, 12));
			jcb.setBounds(26, 91, 88, 21);
		}
		return jcb;
	}//검색 버튼
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("검색버튼");
			btnSearch.setBounds(350, 90, 97, 23);
		}
		return btnSearch;
	}
}