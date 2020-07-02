package POS;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class POSPanel extends JPanel {
	
	

	JButton[] MBtn = new JButton[13];
	String[] FoodMenu = {
			"이판","사판","삼세판",
			"생삼겹살","생목살","가브리살",
			"된장찌개","김치찌개","계란찜","냉면",
			"볶음밥","치즈추가","공기밥"};
	int[] Menuprice = {
			36000,53000,71000,
			9500,9500,10500,
			3000,5000,2000,5000,
			2000,2000,1000};
	
	JButton[] DBtn = new JButton[5];
	String[] DrinkMenu = {
			"소주","맥주","매실마을",
			"복분자","음료수"};
	int [] Drinkprice = {
			4000,4000,7000,
			10000,2000};
	
	JTextField tf = new JTextField(30);
	JButton[] SBtn = new JButton[4];
	String[] Str = {"품목취소","전체취소","주문완료","결제"};
	String [] ColName = {"품명","수량","가격"};
	String [][] Data ;
	int count =1;
	DefaultTableModel model = new DefaultTableModel(Data,ColName);
	JTable table = new JTable(model);
	
	class Screen extends JPanel{
		Screen(){
			setBackground(Color.BLACK);
			DefaultTableModel m = (DefaultTableModel)table.getModel();
			table.setRowHeight(50);
			table.getTableHeader().setFont(new Font("맑은고딕", Font.BOLD, 15));
			add(new JScrollPane(table));
		}
	}
	
	class MenuBtn extends JPanel{
		MenuBtn(){
			setLayout(new GridLayout(6,3,3,3));
			setBackground(Color.BLACK);
			for(int i=0;i<MBtn.length;i++) {
				MBtn[i]= new JButton(FoodMenu[i]);
				add(MBtn[i]);
			}
		}
	}
	
	class DrinkBtn extends JPanel{
		DrinkBtn(){
			setLayout(new GridLayout(6,3,3,3));
			setBackground(Color.BLACK);
			for(int i=0;i<DBtn.length;i++) {
				DBtn[i]= new JButton(DrinkMenu[i]);
				add(DBtn[i]);
			}
		}
	}
	
	class StrBtn extends JPanel{
		StrBtn(){
			setBackground(Color.BLACK);
			setLayout(new GridLayout(1,4,3,3));
			
			for(int i=0;i<Str.length;i++) {
				SBtn[i]= new JButton(Str[i]);
				add(SBtn[i]);
			}
		}
	}
	
	public POSPanel() {
	
		setLayout(null);
		setBackground(Color.BLACK);
		MenuBtn mbtn = new MenuBtn();
		DrinkBtn dbtn = new DrinkBtn();
		StrBtn sbtn = new StrBtn();
		Screen sc = new Screen();
		JLabel l = new JLabel();
		
		//금액란
		tf.setSize(450, 70);
		tf.setLocation(50, 480);
		add(tf);
		
		sc.setSize(500, 500);
		sc.setLocation(25, 20);
		add(sc);
				
		mbtn.setSize(400, 430);
		mbtn.setLocation(530, 23);
		add(mbtn);
		
		dbtn.setSize(133, 430);
		dbtn.setLocation(950,23);
		add(dbtn);
		
		sbtn.setSize(400, 70);
		sbtn.setLocation(530, 480);
		add(sbtn);
		
		//음식주문
		for(int i=0;i<MBtn.length;i++) {
			final int index =i;
			MBtn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton MBtn = (JButton)e.getSource();
					DefaultTableModel m = (DefaultTableModel)table.getModel();
					m.addRow(new Object[]{FoodMenu[index],count,Menuprice[index]});
				}
			});
		}
		//음료주문
		for(int i=0;i<DBtn.length;i++) {
			final int index =i;
			DBtn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent d) {
					JButton DBtn = (JButton)d.getSource();
					DefaultTableModel m = (DefaultTableModel)table.getModel();
					m.addRow(new Object[]{DrinkMenu[index],count,Drinkprice[index]});
				}
			});
		}
		
			//품목취소
		SBtn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				DefaultTableModel m = (DefaultTableModel)table.getModel();
				int row=-1;
				row = table.getSelectedRow();
				if(row==-1) {
					JOptionPane.showMessageDialog(null, "품목을 선택하세요");
				}else {
					m.removeRow(row);
				}
				
			}
		});
		
		
		//전체취소
		SBtn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				DefaultTableModel m = (DefaultTableModel)table.getModel();
				
				m.setRowCount(0);
				tf.setText(String.valueOf(""));
			}
		});
		
		//주문완료
			SBtn[2].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				POSTableFrame frame = new POSTableFrame();
				frame.setVisible(true);
			
							
				
			
			}
		});
		
		//결제버튼
		SBtn[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				int rowCont = table.getRowCount();
				int sum =0;
				for(int i=0;i<rowCont;i++) {
					sum += (int)table.getValueAt(i, 2);
				}
				tf.setText(String.valueOf(" 총 금액 : "+sum));
				tf.setFont(new Font("맑은고딕", Font.BOLD, 40));
				JOptionPane.showMessageDialog(null, sum+"원이 결제되었습니다.");
			}
		});
	}
}

