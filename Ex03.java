/*	A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때 총 페이지수를 
 *  리턴하는 프로그램이 필요하다고 한다.
	입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1)
	출력 : 총페이지수
	A씨가 필요한 프로그램을 작성하시오.
 * 
	m	n	출력
	0	1	0
	1	1	1
	2	1	2
	1	10	1
	10	10	1
	11	10	2
	 *
 */

package green.kr.ca.Hello;

import java.text.BreakIterator;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt();

		System.out.println(getCount(m, n));
	}
	public static int getCount(int all, int eachPage){
		int count=0;						//m이 0이면 0출력
		for(int i = 1; i<=all;i++) { 		//1~총건수
				if(i%eachPage==0) count++;	//i%게시물수 나머지가 0이면 count
		} 
		if(all%eachPage!=0)count++;			
		return count;
	}
}
