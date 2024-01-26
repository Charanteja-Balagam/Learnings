package test;

import java.util.ArrayList;

public class ArrList {


	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(10);

			list.add(22);
			list.add(33);
			list.add(44);
			list.add(55);
			list.add(66);
			list.add(77);
			System.out.println(list.contains(33) );

			System.out.print(list);
		}
}
