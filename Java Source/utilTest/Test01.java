package utilTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		// 1���� 20������ ���� 10���� map�� �����ÿ�.
		// ��, �ߺ��� ������ ������� �ʴ´�.
		HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
		for(int i=1; i<11; i++) {
			while(true){
				int value = (int)(Math.random()*20)+1;
			if(!hm.containsValue(value)) {
				hm.put(i,value);
				break;
			}
			
		  }//while
			
		}//for
		System.out.println(hm);//���� + key
		for(Integer s : hm.values()) {
			System.out.print(s+"\t");//value�� ������
		}
		System.out.println();
		List<Integer>list = new ArrayList<Integer>(hm.values());
		
		Collections.sort(list);
		for(int i : list) {
			System.out.print(i+"\t");
		}
		System.out.println();
		Collections.reverse(list);
		for(int i : list) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("�ִ밪 : "+Collections.max(list));
		System.out.println("�ִ밪 : "+Collections.min(list));
	}
	
}