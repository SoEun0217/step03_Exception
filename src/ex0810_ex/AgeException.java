package ex0810_ex;

/**
 * ����� ���� Exception :����ڰ� ���� Ŭ������ ������ ������ �Ǳ� ���ؼ� �ݵ�� XxxException ��ü ���� �ϳ���
 * ��ӹ޴´�.
 * 
 * ���� ���� 1)üũ �̼��� 2)��üũ �̼���(throws)-RuntimeException�� ���� Ŭ������
 */

public class AgeException extends Exception {
//�����ڰ� �ʿ��ϴ�. ������ ������ ù�ٿ� super("�ֵ��� ����"); ����
/*	public AgeException() {
		super("�ֵ��� ����");
	}

	public AgeException(String message) {
		super(message);

	}
*/
	static int count;
	public AgeException() {}
	public AgeException(String message) {
		super(message);
		count++;
	}
}