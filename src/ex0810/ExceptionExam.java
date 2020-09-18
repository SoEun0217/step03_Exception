package ex0810;

public class ExceptionExam {

	public static void main(String[] args) {
		System.out.println("**메인 시작**");
		try {
			String data = args[0];
			System.out.println("data=" + data);

			int no = Integer.parseInt(data);
			System.out.println("변환 후 : no = " + no);

			int result = 100 / no;
			System.out.println("나눈 결과 : " + result);

		} catch (ArrayIndexOutOfBoundsException e) {

			// 예외 발생시 해야할 일 작성
			System.out.println("인수를 꼭 넣어주세요 : e = " + e.toString());
		} catch (NumberFormatException e) {
			System.out.println("반드시 숫자만 입력해주세요 :e.getMessage() : " + e.getMessage());
		}catch(Exception e){//모든 exception을 포함하고있는 super조상이다.catch블럭 여러개 작성할 때 반드시 서브
			//클래스부터 작성한다.
			System.out.println("예외가 발생했습니다.");
			
			
			e.printStackTrace();//오류 정보를 가장  detail하게 stack에 쌓아두었따가 한번에 출력 배포할때는 제거해야함!
			//자체가 출력이다
			
		}finally {
			System.out.println("예외발생여부와 상관없이 난 무조건 실행한다.");
			
		}

		System.out.println("***메인끝****");

	}

}
