package Portfolio;
import javax.swing.JFrame;
 
public class MainProcess{
	POSTableFrame table;
    POSOrderFrame aa;

   
    public static void main(String[] args) {    	
        // 메인클래스 실행
        MainProcess main = new MainProcess();
        main.table = new POSTableFrame(); // 로그인창 보이기
        main.table.setMain(main); // 로그인창에게 메인 클래스보내기
        
    } 
}