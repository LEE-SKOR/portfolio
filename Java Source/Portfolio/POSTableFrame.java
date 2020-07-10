package Portfolio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

 
public class POSTableFrame extends JFrame{
    private MainProcess main;
   
    private JButton btnLogin;
    private JButton btnInit;
    private JPasswordField passText;
    private JTextField userText;
    private boolean bLoginCheck;

	public static String[] MenuList = new String[19];  //리스트
	public static int TableCnt = 6;  //테이블 갯수
	public static int[] MenuPrice = new int[19];  //가격   
	public static int [][] table_info = null;
	
    public static void main(String[] args) {
        //new LoginView();
    }
 
    public POSTableFrame() {
    	
        // setting
    	setTitle("버닝돈");
    	setBounds(100, 100, 410, 500);
    	
    	
        setResizable(false);
        setLocation(800, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        // panel
        JPanel panel = new JPanel();
        placeLoginPanel(panel);       
        add(panel);       
        setVisible(true);
        menuset();
        priceset();
        table_info = new int[TableCnt][MenuList.length];
    }
    
    public void menuset() {
    	MenuList[0] = "된장찌개";
        MenuList[1] = "김치찌개";
        MenuList[2] = "";
        MenuList[3] = "";
        MenuList[4] = "";
        MenuList[5] = "";
        MenuList[6] = "";
        MenuList[7] = "";
        MenuList[8] = "";
        MenuList[9] = "";
        MenuList[10] = "";
        MenuList[11] = "";
        MenuList[12] = "";
        MenuList[13] = "";
        MenuList[14] = "";
        MenuList[15] = "";
        MenuList[16] = "";
        MenuList[17] = "";
        MenuList[18] = "";
    }
    

    
    public void priceset() {
    	MenuPrice[0] = 5000;
    	MenuPrice[1] = 10000;
    	MenuPrice[2] = 0;
    	MenuPrice[3] = 0;
    	MenuPrice[4] = 0;
    	MenuPrice[5] = 0;
    	MenuPrice[6] = 0;
    	MenuPrice[7] = 0;
    	MenuPrice[8] = 0;
    	MenuPrice[9] = 0;
    	MenuPrice[10] = 0;
    	MenuPrice[11] = 0;
    	MenuPrice[12] = 0;
    	MenuPrice[13] = 0;
    	MenuPrice[14] = 0;
    	MenuPrice[15] = 0;
    	MenuPrice[16] = 0;
    	MenuPrice[17] = 0;
    	MenuPrice[18] = 0;
    }
   
    public void placeLoginPanel(JPanel panel){
        panel.setLayout(null);     
        JButton btn1 = new JButton("테이블 1");
        btn1.setBounds(12, 10, 180, 100);
        btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				POSOrderFrame frame = new POSOrderFrame(1);
				frame.setVisible(true);
			}
		});
        panel.add(btn1);
        
        JButton btn2 = new JButton("테이블 2");
        btn2.setBounds(212, 10, 180, 100);
        btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				POSOrderFrame frame = new POSOrderFrame(2);
				frame.setVisible(true);
			}
		});
        panel.add(btn2);
        
        JButton btn3 = new JButton("테이블 3");
        btn3.setBounds(12, 130, 180, 100);
        btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				POSOrderFrame frame = new POSOrderFrame(3);
				frame.setVisible(true);
			}
		});
        panel.add(btn3);
        
        JButton btn4 = new JButton("테이블 4");
        btn4.setBounds(212, 130, 180, 100);
        btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				POSOrderFrame frame = new POSOrderFrame(4);
				frame.setVisible(true);
			}
		});
        panel.add(btn4);
        
        JButton btn5 = new JButton("테이블 5");
        btn5.setBounds(12, 250, 180, 100);
        btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				POSOrderFrame frame = new POSOrderFrame(5);
				frame.setVisible(true);
			}
		});
        panel.add(btn5);
        
        JButton btn6 = new JButton("테이블 6");
        btn6.setBounds(212, 250, 180, 100);
        btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				POSOrderFrame frame = new POSOrderFrame(6);
				frame.setVisible(true);
			}
		});
        panel.add(btn6);
        
    }
    
    public void setMain(MainProcess main) {
        this.main = main;
    }
}