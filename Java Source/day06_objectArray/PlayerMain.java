package day06_objectArray;

public class PlayerMain {

   public static void showMenu() {
	   System.out.println("선택하세요...");
		System.out.println("1.선수등록");
		System.out.println("2.선수보기");
		System.out.println("3.선수찾기");
		System.out.println("4.종료");
		System.out.print("선택");
   }
	public static void main(String[] args) {
		PlayerManager pm = new PlayerManager();
		while(true) {
		 	PlayerMain.showMenu();
		 	int choice = BookMain.sc.nextInt();
		 	BookMain.sc.nextLine();
		 	switch(choice) {
		 	case 1:  pm.insertPlayer();break;
		 	case 2:  pm.viewPlayer();break;  // 이름, 나이
		 	case 3:  pm.searchPlayer();break;
		  	case 4:  System.out.println("종료");
		 					System.exit(0);
		 	default: System.out.println("입력오류");
		 	}

		}
	}

}