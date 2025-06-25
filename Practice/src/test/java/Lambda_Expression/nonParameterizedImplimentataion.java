package Lambda_Expression;

public class nonParameterizedImplimentataion {

	public static void main(String[] args) {

		nonParameterized a = () -> {
			System.out.println("Lambda Expression");
		};
		
		a.B();
		
		nonParameterized b = () -> {
			System.out.println("Lambda Expression b");
		};
		
		b.B();
		
	}

}
