package StringMethods;

public class UseSplit {
	public static void main(String[]args) {
		String device="Refridgerater";
		String[] name=device.split("r");
		int size=name.length;
		System.out.println(name[0]);
		System.out.println(name[name.length-1]);
		System.out.println(size);
		String employee="Praveen";
		String[] dev=employee.split("e");
		System.out.println(dev[2]);
		
	}

}