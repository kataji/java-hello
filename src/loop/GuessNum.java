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
				System.out.println("̫��");
			}
			else if(input < num){
				System.out.println("̫С");
			}
		}while(input != num);
		
		System.out.println("��ϲ������ˣ������"+count+"�Ρ�");
	}

}
