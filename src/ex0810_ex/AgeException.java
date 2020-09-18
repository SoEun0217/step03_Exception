package ex0810_ex;

/**
 * 사용자 정의 Exception :사용자가 만든 클래스가 예외의 종류가 되기 위해서 반드시 XxxException 객체 중의 하나를
 * 상속받는다.
 * 
 * 예외 종류 1)체크 이셉션 2)비체크 이셉션(throws)-RuntimeException의 하위 클래스들
 */

public class AgeException extends Exception {
//생성자가 필요하다. 생성자 구현부 첫줄에 super("애들은 가라"); 세팅
/*	public AgeException() {
		super("애들은 가라");
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