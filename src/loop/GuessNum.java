package loop;

import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int num = (int)(Math.random()*100+1);
		int count = 0;
		int input;
		do {
			input = in.nextInt();
			count = count + 1;
			if(input > num){
				System.out.println("太大");
			}
			else if(input < num){
				System.out.println("太小");
			}
		}while(input != num);
		
		System.out.println("恭喜你猜中了！你猜了"+count+"次。");
	}

}
