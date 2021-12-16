package green.kr.ca.Hello;


/*
 *  10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
	1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
 */
public class Ex01 {
	public static void main(String[] args) {
		 multiple(1000);
	}
	static void multiple(int n) {
		int sum = 0;
		for(int i=3;i<n;i++) {
			if(i%3==0 || i%5==0) sum += i;
		}
		System.out.print(sum);
	}
}
