package StringMethods;

public class StringRelax {
	public static void main(String[]args) {
		String sentance="#All2 %is3 @well4";
		String[] exp=sentance.split("\\D");
		System.out.println(exp[0]);
		
		
	}

}
