package test;

public class Strings {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		for(int i=0;i<26;i++)
		{
			char ch = (char)('a'+i);
			sb.append(ch);

		}
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
