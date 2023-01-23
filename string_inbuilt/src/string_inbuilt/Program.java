package string_inbuilt;
public class Program {
	public static void main(String[] args)
	{
		String s = "Alia Ranbir Kapoor";
		System.out.println(s);
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.startsWith("katrina"));
		System.out.println(s.startsWith("Alia"));
		System.out.println(s.startsWith("alia"));
		System.out.println(s.endsWith("Alia"));
		System.out.println(s.endsWith("Kapoor"));
		System.out.println(s.contains("Alia"));
		System.out.println(s.endsWith("dhoni"));
		System.out.println(s.indexOf('K'));
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));
	}
}
