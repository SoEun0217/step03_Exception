package ex0810;

import java.io.IOError;
import java.io.IOException;

import javax.management.RuntimeErrorException;

/**
 * 예외의 종류
 * 1)체크 Exception :반드시 예외처리 필수
 * 2)비체크 Exception : 실행도중 발생하므로 예외처리 선택
 * */

class Adult{
	public void setAge(int age) {
		if(age<18) {
			try {
			//예외 발생시키기
			throw new IOException("나이는 18이상만 가능합니다.");     //throw는 예외를 발생시키는 것, 체크 이셉션이므로 오류
			//인수로 오류메시지 넣을 수 있다.!!
			//throw new RuntimeException();//예외처리 선택
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
		System.out.println("*****메인 시작*********");
		Adult ad=new Adult();
		ad.setAge(15);
		
		System.out.println("*******메인 끝**********");
	}

}
