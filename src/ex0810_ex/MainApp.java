package ex0810_ex;

import java.util.Random;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("****Shop Open*****");		
		ShoppingMall sp=new ShoppingMall();
		//�����߻� ���� Ŭ����
		Random r=new Random();
		
		for(int i=0;i<10;i++) {
			try {
				//Ÿ�Ժ��� ������ �߻��� �� ����
				//0���� 55������ 0~54
				int age=r.nextInt(55)+1;//1���� 55���̿� �����߻�
				sp.agesearch(age);
			}catch(AgeException e) {
				System.out.println(e.getMessage());
				
			}
			System.out.println();
		}
		
		System.out.println("****Shop Close*****");
		System.out.println(AgeException.count+"���� ���� �߻�");//static���� �ؾ� ���������� ��밡��
	}

}
