package POS;

import java.awt.EventQueue;
import java.util.ArrayList;

public class POS_Main {
	public  static ArrayList<Menu> arr= new ArrayList<Menu>();
	public static Object[] tableArr = new Object[6];
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
}