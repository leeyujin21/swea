import java.util.Scanner;

class Solution1938 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		int T1;
		T=sc.nextInt();
		T1=sc.nextInt();
		int sum = T+T1;
		int min = T-T1;
		int mul = T*T1;
		int div = T/T1;
		System.out.println(sum);
		System.out.println(min);
		System.out.println(mul);
		System.out.println(div);
	}
}
