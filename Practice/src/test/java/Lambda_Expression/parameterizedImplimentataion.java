package Lambda_Expression;

public class parameterizedImplimentataion {

	public static void main(String[] args) {

		parameterized P = (a,b) -> {
			System.out.println(a + b);
		};
		
		P.B(10, 20);
		
	}

}
