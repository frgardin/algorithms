package cses;

import java.util.Scanner;

public class Repetitions {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] ca = s.toCharArray();
		int counter = 0, max = 0;
		char acc;
		for(int i = 0; i < ca.length; i++){
			if (i == 0){
				counter++;
				continue;
			}
			if (counter  > max)			max = counter;
			if (!(ca[i - 1] == ca[i])) 	counter = 0;
			counter++;
		}
		System.out.println(Math.max(max, counter));
		sc.close();
	}    

}
