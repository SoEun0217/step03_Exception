package ex0810_ex;

public class ShoppingMall {
	public void agesearch(int age)throws AgeException {// throws AgeException
		// int age;을 넣어주면 안된다. 이미 인수를 받았기 때문에
		if (age < 18) {
			// 예외를 발생시킨다.
			 AgeException ex= new AgeException(age+"살 애들은 가라");
			 throw ex;
			/**try {
				throw new AgeException("애들은 가라");
			} catch (AgeException e) {
				System.out.println(e.getMessage());
			}
			return;// 예외를 잡고 빠져나가야함
			 	던지지 않고 여기서 만들때 -1)*/
		}else

			System.out.println(age + "살님 입장하신걸 환영합니다.");
	}
}
