package ex0810;

public class ExceptionExam {

	public static void main(String[] args) {
		System.out.println("**���� ����**");
		try {
			String data = args[0];
			System.out.println("data=" + data);

			int no = Integer.parseInt(data);
			System.out.println("��ȯ �� : no = " + no);

			int result = 100 / no;
			System.out.println("���� ��� : " + result);

		} catch (ArrayIndexOutOfBoundsException e) {

			// ���� �߻��� �ؾ��� �� �ۼ�
			System.out.println("�μ��� �� �־��ּ��� : e = " + e.toString());
		} catch (NumberFormatException e) {
			System.out.println("�ݵ�� ���ڸ� �Է����ּ��� :e.getMessage() : " + e.getMessage());
		}catch(Exception e){//��� exception�� �����ϰ��ִ� super�����̴�.catch�� ������ �ۼ��� �� �ݵ�� ����
			//Ŭ�������� �ۼ��Ѵ�.
			System.out.println("���ܰ� �߻��߽��ϴ�.");
			
			
			e.printStackTrace();//���� ������ ����  detail�ϰ� stack�� �׾Ƶξ����� �ѹ��� ��� �����Ҷ��� �����ؾ���!
			//��ü�� ����̴�
			
		}finally {
			System.out.println("���ܹ߻����ο� ������� �� ������ �����Ѵ�.");
			
		}

		System.out.println("***���γ�****");

	}

}
