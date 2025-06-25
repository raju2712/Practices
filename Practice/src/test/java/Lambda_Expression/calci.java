package Lambda_Expression;

public class calci {

	public static void main(String[] args) {

		comput c = (x, y, z) -> {
			System.out.println(x + y + z);
		};
		c.calci(10, 20, 30);

		comput d = (x, y, z) -> {
			System.out.println(x - y - z);
		};
		d.calci(1000, 500, 100);
		
		comput e = (x, y, z) -> {
			System.out.println(x*y*z);
		};
		e.calci(800, 50, 1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}


