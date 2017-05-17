/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 15.
 * </pre>
 * 
 * @author : USER
 * @version : 1.8
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] s = {
				new IPhone("iPhone 7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};

		for (SmartPhone phone : s){
			System.out.println(phone);
			phone.turnOn();
			phone.pay();
			phone.useSpecialFunction();
			phone.turnOff();
		}
	}

}
