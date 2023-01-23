package mutableexample;

public class program {
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity()); //16 
		sb.append("You are awesome");
		System.out.println(sb.capacity()); //16 
		System.out.println(sb); //you are awesome
		sb.append(" and great");
		System.out.println(sb.capacity()); //34
		System.out.println(sb);//you are awesome and great 
		sb.append(" if you revise daily");
		System.out.println(sb.capacity()); //70
		System.out.println(sb);
		}
	}

