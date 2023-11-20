import java.util.Scanner;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt(); // 출력할 #의 수를 입력받음
		for(int test_case = 1; test_case <= T; test_case++)
		{ // test_case가 1부터 T일때
			System.out.print("#"); // #을 출력
			//println은 줄바꿈이 되기 때문에 print를 써야함
		}
	}
}