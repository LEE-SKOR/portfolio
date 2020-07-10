package Portfolio;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;


public class POSOrderFrame extends JFrame {

	private JPanel contentPane;
	private JPanel DrinkPanel;
	private JButton btnSoju;
	private JButton btnBeer;
	private JButton btnMaesil;
	private JButton btnBokbunja;
	private JButton btnMak;
	private JButton btnBeverage;
	private JPanel PayPanel;
	private JButton btnOrder;
	private JButton btnCancel;
	private JPanel Foodpanel;
	private JButton btnSide2;
	private JButton btnAdd1;
	private JButton btnSoup1;
	private JButton btnSoup2;
	private JButton btnSide1;
	private JButton btnAdd3;
	private JButton btnAdd2;
	private JButton btnSide3;
	private JButton btnMain1;
	private JButton btnMain3;
	private JButton btnMain2;
	private JButton btnSide4;
	private JButton btnSide5;
	private JPanel CostPanel;
	private JButton btnNull1;
	private JPanel MenuPanel;
	private JTextArea taMenu;
	private JButton btnPay;
	private JButton btnExit;
	
	private int bt2_cnt = 0; 
	private int table = 0;
	POSTableFrame table_frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	}

	/**
	 * Create the frame.
	 */
	public POSOrderFrame(int table_number) {
		table = table_number;
		System.out.println(table_frame.table_info[table][0]);
		setTitle("버닝돈 메뉴");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(getMenuPanel(), GroupLayout.PREFERRED_SIZE, 408, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(getFoodpanel(), GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
						.addComponent(getPanel_1_1(), GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(getDrinkPanel(), GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
						.addComponent(getPayPanel(), GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
					.addGap(21))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(getMenuPanel(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(getFoodpanel(), Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
						.addComponent(getDrinkPanel(), Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(getPanel_1_1(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(getPayPanel(), GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
					.addGap(35))
		);
		contentPane.setLayout(gl_contentPane);
	}

	private JPanel getDrinkPanel() {
		if (DrinkPanel == null) {
			DrinkPanel = new JPanel();
			DrinkPanel.setLayout(new GridLayout(0, 2, 0, 0));
			DrinkPanel.add(getButton_2());
			DrinkPanel.add(getButton_3());
			DrinkPanel.add(getButton_4());
			DrinkPanel.add(getButton_5());
			DrinkPanel.add(getButton_6());			
			DrinkPanel.add(getButton_7());
		}
		return DrinkPanel;
	}
	
	private JButton getButton_2() {
		if (btnSoju == null) {
			btnSoju = new JButton("소주");
			btnSoju.setBackground(Color.YELLOW);
		}
		return btnSoju;
	}
	private JButton getButton_3() {
		if (btnBeer == null) {
			btnBeer = new JButton("맥주");
			btnBeer.setBackground(Color.YELLOW);
		}
		return btnBeer;
	}
	private JButton getButton_4() {
		if (btnMaesil == null) {
			btnMaesil = new JButton("매실마을");
			btnMaesil.setBackground(Color.YELLOW);
		}
		return btnMaesil;
	}
	private JButton getButton_5() {
		if (btnBokbunja == null) {
			btnBokbunja = new JButton("복분자");
			btnBokbunja.setBackground(Color.YELLOW);
		}
		return btnBokbunja;
	}
	private JButton getButton_6() {
		if (btnMak == null) {
			btnMak = new JButton("막걸리");
			btnMak.setBackground(Color.YELLOW);
		}
		return btnMak;
	}
	private JButton getButton_7() {
		if (btnBeverage == null) {
			btnBeverage = new JButton("음료수");
			btnBeverage.setBackground(Color.YELLOW);
		}
		return btnBeverage;
	}
	private JPanel getPayPanel() {
		if (PayPanel == null) {
			PayPanel = new JPanel();
			PayPanel.setLayout(new GridLayout(0, 2, 0, 0));
			PayPanel.add(getBtnNewButton_8_1_1());
			PayPanel.add(getBtnCancel());
			PayPanel.add(getBtnPay());
			PayPanel.add(getBtnExit());
		}
		return PayPanel;
		
	}
	private JButton getBtnNewButton_8_1_1() {
		if (btnOrder == null) {
			btnOrder = new JButton("주문");
			btnOrder.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {	            	
	            	table_frame.table_info[table][0] = table_frame.table_info[table][0]+bt2_cnt;
	            	dispose();
	            }
	        });
        	
		}
		return btnOrder;
	}
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton("품목취소");
		}
		return btnCancel;
	}
	private JPanel getFoodpanel() {
		if (Foodpanel == null) {
			Foodpanel = new JPanel();
			Foodpanel.setLayout(new GridLayout(0, 4, 0, 0));
			Foodpanel.add(getBtnSoup1());
			Foodpanel.add(getBtnSoup2());
			Foodpanel.add(getBtnSide1());
			Foodpanel.add(getBtnSide2());
			Foodpanel.add(getBtnSide3());
			Foodpanel.add(getBtnSide4());
			Foodpanel.add(getBtnSide5());
			Foodpanel.add(getBtnNull1());
			Foodpanel.add(getBtnMain1());
			Foodpanel.add(getBtnMain2());
			Foodpanel.add(getBtnMain3());
			Foodpanel.add(getBtnAdd1());
			Foodpanel.add(getBtnAdd2());
			Foodpanel.add(getBtnAdd3());
		}
		return Foodpanel;
	}
	private JButton getBtnSide2() {
		if (btnSide2 == null) {
			btnSide2 = new JButton("냉면");
			btnSide2.setBackground(Color.GRAY);
			btnSide2.setForeground(Color.BLACK);
		}
		return btnSide2;
	}
	private JButton getBtnAdd1() {
		if (btnAdd1 == null) {
			btnAdd1 = new JButton("생삼겹살");
			btnAdd1.setBackground(Color.GREEN);
		}
		return btnAdd1;
	}
	private JButton getBtnSoup1() {
		if (btnSoup1 == null) {
			btnSoup1 = new JButton("된장찌개");
			btnSoup1.setBackground(Color.GRAY);
			btnSoup1.setForeground(Color.BLACK);
			btnSoup1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {	            	
	            	bt2_cnt++;
	            	getTaMenu().setText(table_frame.MenuList[0]+(table_frame.table_info[table][0]+bt2_cnt)+" 개");
	            }
	        });
		}
		return btnSoup1;
	}
	private JButton getBtnSoup2() {
		if (btnSoup2 == null) {
			btnSoup2 = new JButton("김치찌개");
			btnSoup2.setBackground(Color.GRAY);
			btnSoup2.setForeground(Color.BLACK);
		}
		return btnSoup2;
	}
	private JButton getBtnSide1() {
		if (btnSide1 == null) {
			btnSide1 = new JButton("계란찜");
			btnSide1.setBackground(Color.GRAY);
			btnSide1.setForeground(Color.BLACK);
		}
		return btnSide1;
	}
	private JButton getBtnAdd3() {
		if (btnAdd3 == null) {
			btnAdd3 = new JButton("가브리살");
			btnAdd3.setBackground(Color.GREEN);
		}
		return btnAdd3;
	}
	private JButton getBtnAdd2() {
		if (btnAdd2 == null) {
			btnAdd2 = new JButton("생목살");
			btnAdd2.setBackground(Color.GREEN);
		}
		return btnAdd2;
	}
	private JButton getBtnSide3() {
		if (btnSide3 == null) {
			btnSide3 = new JButton("볶음밥");
			btnSide3.setBackground(Color.GRAY);
			btnSide3.setForeground(Color.BLACK);
		}
		return btnSide3;
	}
	private JButton getBtnMain1() {
		if (btnMain1 == null) {
			btnMain1 = new JButton("이판");
			btnMain1.setBackground(Color.GREEN);
		}
		return btnMain1;
	}
	private JButton getBtnMain3() {
		if (btnMain3 == null) {
			btnMain3 = new JButton("삼세판");
			btnMain3.setBackground(Color.GREEN);
		}
		return btnMain3;
	}
	private JButton getBtnMain2() {
		if (btnMain2 == null) {
			btnMain2 = new JButton("사판");
			btnMain2.setBackground(Color.GREEN);
		}
		return btnMain2;
	}
	private JButton getBtnSide4() {
		if (btnSide4 == null) {
			btnSide4 = new JButton("치즈추가");
			btnSide4.setBackground(Color.GRAY);
			btnSide4.setForeground(Color.BLACK);
		}
		return btnSide4;
	}
	private JButton getBtnSide5() {
		if (btnSide5 == null) {
			btnSide5 = new JButton("공기밥");
			btnSide5.setBackground(Color.GRAY);
			btnSide5.setForeground(Color.BLACK);
		}
		return btnSide5;
	}
	private JPanel getPanel_1_1() {
		if (CostPanel == null) {
			CostPanel = new JPanel();
		}
		return CostPanel;
	}
	private JButton getBtnNull1() {
		if (btnNull1 == null) {
			btnNull1 = new JButton("");
			btnNull1.setActionCommand("");
			btnNull1.setBackground(Color.GRAY);
		}
		return btnNull1;
	}
	private JPanel getMenuPanel() {
		if (MenuPanel == null) {
			MenuPanel = new JPanel();
			MenuPanel.setLayout(new BorderLayout(0, 0));
			MenuPanel.add(getTaMenu());
		}
		return MenuPanel;
	}
	private JTextArea getTaMenu() {
		if (taMenu == null) {
			taMenu = new JTextArea();
		}
		return taMenu;
	}
	private JButton getBtnPay() {
		if (btnPay == null) {
			btnPay = new JButton("결제");
			btnPay.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int total = 0;
					for(int i=0; i<table_frame.table_info[table].length; i++) {
						total += table_frame.table_info[table][i]*table_frame.MenuPrice[i];
					}
					System.out.println("총금액:"+total);
				}
			});
		}
		return btnPay;
	}
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton("나가기");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
		}
		return btnExit;
	}
}

		
	

