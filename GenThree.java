/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int max = Integer.parseInt (args [0]);
		int min = Integer.parseInt (args [1]);
		int first_num = (int)(Math.random()*(max - min) ) + min;
		int sec_num = (int)(Math.random()*(max - min) ) + min;
		int third_num = (int)(Math.random()*(max - min) ) + min;
		int temp_min = Math.min (first_num, sec_num);
		int final_min = Math.min (temp_min, third_num);
		System.out.println(first_num + "\n" + sec_num + "\n" + third_num);
		System.out.println("The minimal generated number was " + final_min); 		
	}
}
