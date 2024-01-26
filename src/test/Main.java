package test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){

   int a = 19;
   Scanner sc = new Scanner(System.in);
   String name = "charan";

   int[][] roll = new int[3][2];
   for(int row=0; row<3;row++)
   {
	   for(int col=0;col<2;col++)
	   {
		   roll[row][col] = sc.nextInt();
	   }
   }
   for(int[] x: roll)
   {

		  System.out.println(Arrays.toString(x));

   }

	}
}
