package ex0810;

class Test {

	public void aa(int i)throws ArithmeticException {
		System.out.println("aa()�޼ҵ� ȣ���....");
		try {
			this.bb(i);
		//}catch(ArithmeticException e) {
		//	System.out.println(e.getMessage()+"�߻��߾��");
		}finally {
		
		System.out.println("aa()�޼ҵ� ��...");
		}
	}

	public void bb(int i) throws ArithmeticException, NumberFormatException {
		System.out.println("bb()�޼ҵ� ȣ���");
		try {
		int result = 100 / i;
		System.out.println("���� ��� : " + result);
		}finally {
		System.out.println("bb()�޼ҵ� ȣ�ⳡ...");
		}

	}
}

public class ThrowsExam {

	public static void main(String[] args) {
		System.out.println("**���� ������**");
		Test t = new Test();
		try {
		t.aa(0);
		}catch(ArithmeticException | NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("**���� ������***");

	}

}
