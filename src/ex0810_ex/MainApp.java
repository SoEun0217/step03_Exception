package ex0810_ex;

import java.util.Random;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("****Shop Open*****");		
		ShoppingMall sp=new ShoppingMall();
		//난수발생 전용 클래스
		Random r=new Random();
		
		for(int i=0;i<10;i++) {
			try {
				//타입별로 난수를 발생할 수 있음
				//0부터 55전까지 0~54
				int age=r.nextInt(55)+1;//1에서 55사이에 난수발생
				sp.agesearch(age);
			}catch(AgeException e) {
				System.out.println(e.getMessage());
				
			}
			System.out.println();
		}
		
		System.out.println("****Shop Close*****");
		System.out.println(AgeException.count+"명의 예외 발생");//static으로 해야 공유변수로 사용가능
	}

}
