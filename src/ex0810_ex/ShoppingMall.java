package ex0810_ex;

public class ShoppingMall {
	public void agesearch(int age)throws AgeException {// throws AgeException
		// int age;�� �־��ָ� �ȵȴ�. �̹� �μ��� �޾ұ� ������
		if (age < 18) {
			// ���ܸ� �߻���Ų��.
			 AgeException ex= new AgeException(age+"�� �ֵ��� ����");
			 throw ex;
			/**try {
				throw new AgeException("�ֵ��� ����");
			} catch (AgeException e) {
				System.out.println(e.getMessage());
			}
			return;// ���ܸ� ��� ������������
			 	������ �ʰ� ���⼭ ���鶧 -1)*/
		}else

			System.out.println(age + "��� �����ϽŰ� ȯ���մϴ�.");
	}
}
