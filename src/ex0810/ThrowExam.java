package ex0810;

import java.io.IOError;
import java.io.IOException;

import javax.management.RuntimeErrorException;

/**
 * ������ ����
 * 1)üũ Exception :�ݵ�� ����ó�� �ʼ�
 * 2)��üũ Exception : ���൵�� �߻��ϹǷ� ����ó�� ����
 * */

class Adult{
	public void setAge(int age) {
		if(age<18) {
			try {
			//���� �߻���Ű��
			throw new IOException("���̴� 18�̻� �����մϴ�.");     //throw�� ���ܸ� �߻���Ű�� ��, üũ �̼����̹Ƿ� ����
			//�μ��� �����޽��� ���� �� �ִ�.!!
			//throw new RuntimeException();//����ó�� ����
			}catch(IOException e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
	
}
/////////////////////////////////////////////////


public class ThrowExam {

	public static void main(String[] args) {
		System.out.println("*****���� ����*********");
		Adult ad=new Adult();
		ad.setAge(15);
		
		System.out.println("*******���� ��**********");
	}

}
