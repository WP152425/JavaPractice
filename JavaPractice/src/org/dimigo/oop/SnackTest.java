/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_SnackTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 * 
 * @author : USER
 * @version : 1.8
 */
public class SnackTest {

	
	public static void main(String[] args) {
		Snack[] snack = new Snack[3];
		snack[0] = new Snack("새우깡", "농심", 1100, 2);
		snack[1] = new Snack("콘칲", "크라운", 1200, 1);
		snack[2] = new Snack("허니버터칲", "해태", 1500, 4);
		int sum = 0;
		
		for (int i = 0;i<3;i++){
			System.out.println(snack[i].toString());
			sum += snack[i].calcPrice();
		}
				
		System.out.println("총 구매 금액 : " + String.format("%,d", sum) + "원");
	}

}
