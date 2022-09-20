package StringMethods;

public class UseLaptop {
	public static void main(String[]Args) {
		Laptop laptop1=new Laptop();
		laptop1.brand="lenavo is Poewrful";
		laptop1.price=70000;
		laptop1.color="Red";
		System.out.println(laptop1.brand.toUpperCase());
		System.out.println(laptop1.color.toLowerCase());
		System.out.println(laptop1.brand.length());
		System.out.println(laptop1.brand.concat(laptop1.color));
		System.out.println(laptop1.color.contains("a"));
		System.out.println(laptop1.brand.startsWith("D"));
		System.out.println(laptop1.brand.endsWith("l"));
		System.out.println(laptop1.color.equals("Red"));
		System.out.println(laptop1.color.equalsIgnoreCase("RED"));
		System.out.println(laptop1.color.indexOf("e"));
		System.out.println(laptop1.brand.charAt(laptop1.brand.length()-1));
				
	}

}
