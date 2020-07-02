package POS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Portfolio.POSOrderFrame;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class POSTableFrame extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel DrinkPanel_1;
	private JButton btnTable1;
	private JButton btnTable2;
	private JButton btnTable3;
	private JButton btnTable4;
	private JButton btnTable5;
	private JButton btnTable6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					POSTableFrame frame = new POSTableFrame();
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
	public POSTableFrame() {
		setTitle("버닝돈");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(12, 10, 372, 441);
			panel.setLayout(null);
			panel.add(getDrinkPanel_1());
		}
		return panel;
	}
	private JPanel getDrinkPanel_1() {
		if (DrinkPanel_1 == null) {
			DrinkPanel_1 = new JPanel();
			DrinkPanel_1.setBounds(0, 0, 372, 441);
			DrinkPanel_1.setLayout(new GridLayout(0, 2, 0, 0));
			DrinkPanel_1.add(getBtnTable1());
			DrinkPanel_1.add(getBtnTable2());
			DrinkPanel_1.add(getBtnTable3());
			DrinkPanel_1.add(getBtnTable4());
			DrinkPanel_1.add(getBtnTable5());
			DrinkPanel_1.add(getBtnTable6());
		}
		return DrinkPanel_1;
	}
	private JButton getBtnTable1() {
		if (btnTable1 == null) {
			btnTable1 = new JButton("테이블 1");
			btnTable1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					POS_Frame Frame = new POS_Frame();
					Frame.setVisible(true);
					dispose();
				}
			});
			btnTable1.setBackground(Color.WHITE);
		}
		return btnTable1;
	}
	private JButton getBtnTable2() {
		if (btnTable2 == null) {
			btnTable2 = new JButton("테이블2");
			btnTable2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					POS_Frame Frame = new POS_Frame();
					Frame.setVisible(true);
					dispose();
				}
			});
			btnTable2.setBackground(Color.WHITE);
		}
		return btnTable2;
	}
	private JButton getBtnTable3() {
		if (btnTable3 == null) {
			btnTable3 = new JButton("테이블 3");
			btnTable3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					POS_Frame Frame = new POS_Frame();
					Frame.setVisible(true);
					dispose();
				}
			});
			btnTable3.setBackground(Color.WHITE);
		}
		return btnTable3;
	}
	private JButton getBtnTable4() {
		if (btnTable4 == null) {
			btnTable4 = new JButton("테이블 4");
			btnTable4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					POS_Frame Frame = new POS_Frame();
					Frame.setVisible(true);
					dispose();
				}
			});
			btnTable4.setBackground(Color.WHITE);
		}
		return btnTable4;
	}
	private JButton getBtnTable5() {
		if (btnTable5 == null) {
			btnTable5 = new JButton(" 테이블 5");
			btnTable5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					POS_Frame Frame = new POS_Frame();
					Frame.setVisible(true);
					dispose();
				}
			});
			btnTable5.setBackground(Color.WHITE);
		}
		return btnTable5;
	}
	private JButton getBtnTable6() {
		if (btnTable6 == null) {
			btnTable6 = new JButton("테이블 6");
			btnTable6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					POS_Frame Frame = new POS_Frame();
					Frame.setVisible(true);
					dispose();
				}
			});
			btnTable6.setBackground(Color.WHITE);
		}
		return btnTable6;
	}
}
