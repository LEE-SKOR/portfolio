package com.model;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.model.Friend;
import com.view.FriendDAOimpl;

import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class FriendView extends JFrame {
	
	private JPanel contentPane;
	private JSplitPane splitPane;
	private JPanel panel;
	private JTextField tfName;
	private JTextField tfBirth;
	private JTextField tfPhone;
	private JTextField tfAddr;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_2_1;
	private JButton btnView;

	private JButton btnUpdate;
	private JButton btnDelete;
	private JLabel label_2_1_1;
	private JTextField tfNum;
	private JSplitPane splitPane_1;
	private JScrollPane scrollPane;
	private JTextArea ta;
	private JPanel panel_1;
	private JComboBox jcb;
	private JTextField tfSearch;
	private JButton btnSearch;
	FriendDAOimpl dao = new FriendDAOimpl();

	
	Connection con;
	private JButton btnInsert1;
	
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

	public FriendView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 492);
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
			splitPane.setDividerLocation(300);
		}
		return splitPane;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getTfName());
			panel.add(getTfBirth());
			panel.add(getTfPhone());
			panel.add(getTfAddr());
			panel.add(getLabel());
			panel.add(getLabel_1());
			panel.add(getLabel_2());
			panel.add(getLabel_2_1());
			panel.add(getBtnView());
			panel.add(getBtnUpdate());
			panel.add(getBtnDelete());
			panel.add(getLabel_2_1_1());
			panel.add(getTfNum());
			panel.add(getBtnInsert1());
		}
		return panel;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(93, 72, 116, 21);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JTextField getTfBirth() {
		if (tfBirth == null) {
			tfBirth = new JTextField();
			tfBirth.setColumns(10);
			tfBirth.setBounds(93, 129, 116, 21);
		}
		return tfBirth;
	}
	private JTextField getTfPhone() {
		if (tfPhone == null) {
			tfPhone = new JTextField();
			tfPhone.setColumns(10);
			tfPhone.setBounds(93, 179, 116, 21);
		}
		return tfPhone;
	}
	private JTextField getTfAddr() {
		if (tfAddr == null) {
			tfAddr = new JTextField();
			tfAddr.setColumns(10);
			tfAddr.setBounds(93, 227, 116, 21);
		}
		return tfAddr;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("이름 : ");
			label.setFont(new Font("굴림", Font.BOLD, 12));
			label.setBounds(24, 75, 57, 15);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("생일 : ");
			label_1.setFont(new Font("굴림", Font.BOLD, 12));
			label_1.setBounds(24, 132, 57, 15);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("전화번호 : ");
			label_2.setFont(new Font("굴림", Font.BOLD, 12));
			label_2.setBounds(24, 182, 67, 15);
		}
		return label_2;
	}
	private JLabel getLabel_2_1() {
		if (label_2_1 == null) {
			label_2_1 = new JLabel("주소 : ");
			label_2_1.setFont(new Font("굴림", Font.BOLD, 12));
			label_2_1.setBounds(24, 230, 72, 15);
		}
		return label_2_1;
	}
	private JButton getBtnView() {
		if (btnView == null) {
			btnView = new JButton("전체보기");
			btnView.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ta.setText("");	
					 ArrayList<Friend> arr = dao.friendView();
					 for(Friend p : arr) {
						 ta.append("번호 >> "+p.getNum()+"\n");
						 ta.append("이름 >> "+p.getName()+"\n");
						 ta.append("생일 >> "+p.getBirth()+"\n");
						 ta.append("전화번호>> "+p.getPhone()+"\n");
						 ta.append("주소 >> "+p.getAddr()+"\n");
						 ta.append("\n");
					 }
					
				}
			});
			btnView.setBounds(24, 288, 94, 23);
		}
		return btnView;
	}
		
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("수정하기");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Friend f = new Friend();
					f.setNum(Integer.parseInt(tfNum.getText()));
					f.setName(tfName.getText());
					f.setBirth(tfBirth.getText());
					f.setPhone(tfPhone.getText());
					f.setAddr(tfAddr.getText());
					clearText();
					dao.friendUpdate(f);
					btnView.doClick();	
				}
			});
			btnUpdate.setBounds(24, 409, 94, 23);
		}
		return btnUpdate;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("삭제하기");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int num = Integer.parseInt(tfNum.getText());
					dao.friendDelete(num);
					btnView.doClick();
					clearText();
				}
			});
			btnDelete.setBounds(148, 409, 94, 23);
		}
		return btnDelete;
	}
	private JLabel getLabel_2_1_1() {
		if (label_2_1_1 == null) {
			label_2_1_1 = new JLabel("번호 :");
			label_2_1_1.setFont(new Font("굴림", Font.BOLD, 12));
			label_2_1_1.setBounds(34, 364, 57, 15);
		}
		return label_2_1_1;
	}
	private JButton getBtnInsert1() {
		if (btnInsert1 == null) {
			btnInsert1 = new JButton("친구등록");
			btnInsert1.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					Friend f = new Friend();
					f.setName(tfName.getText());
					f.setBirth(tfBirth.getText());
					f.setPhone(tfPhone.getText());
					f.setAddr(tfAddr.getText());
					clearText();
					dao.friendInsert(f);
					
				}
			});
			btnInsert1.setBounds(148, 288, 94, 23);
		}
		return btnInsert1;
	}
	private JTextField getTfNum() {
		if (tfNum == null) {
			tfNum = new JTextField();
			tfNum.setColumns(10);
			tfNum.setBounds(93, 361, 116, 21);
		}
		return tfNum;
	}
	private JSplitPane getSplitPane_1() {
		if (splitPane_1 == null) {
			splitPane_1 = new JSplitPane();
			splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
			splitPane_1.setLeftComponent(getScrollPane());
			splitPane_1.setRightComponent(getPanel_1());
			splitPane_1.setDividerLocation(300);
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
			ta.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseReleased(MouseEvent arg0) {
					
					int num = Integer.parseInt(ta.getSelectedText().trim());
					Friend f = dao.friendDetail(num);
					tfNum.setText(num+"");
					tfName.setText(f.getName());
					tfBirth.setText(f.getBirth());
					tfPhone.setText(f.getPhone());
					tfAddr.setText(f.getAddr());
				}
			});
		}
		return ta;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.add(getJcb());
			panel_1.add(getTfSearch());
			panel_1.add(getBtnSearch());
		}
		return panel_1;
	}
	private JComboBox getJcb() {
		if (jcb == null) {
			jcb = new JComboBox();
			jcb.setModel(new DefaultComboBoxModel(new String[] {"선택", "이름", "주소"}));
			jcb.setBounds(56, 46, 90, 21);
		}
		return jcb;
	}
	private JTextField getTfSearch() {
		if (tfSearch == null) {
			tfSearch = new JTextField();
			tfSearch.setBounds(158, 46, 152, 21);
			tfSearch.setColumns(10);
		}
		return tfSearch;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("검색");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ta.setText("");
					int idx = jcb.getSelectedIndex();
					String key = "";
					if(idx ==1) {
						key = "name";
					}else if(idx == 2) {
						key ="addr";
					} 
					ArrayList<Friend> arr = dao.friendSearch(key,tfSearch.getText());
					for(Friend f : arr) {
						ta.append("번호 >> "+f.getNum()+"\n");
						ta.append("이름 >> "+f.getName()+"\n");
						ta.append("생일 >> "+f.getBirth()+"\n");
						ta.append("전화번호 >> "+f.getPhone()+"\n");
						ta.append("주소 >> "+f.getAddr()+"\n");
						ta.append("\n");
					}
				}
			});
			btnSearch.setBounds(322, 45, 81, 23);
		}
		return btnSearch;
	}
	private void clearText() {
		tfNum.setText("");
		tfName.setText("");
		tfBirth.setText("");
		tfPhone.setText("");
		tfAddr.setText("");
		
	}

}
