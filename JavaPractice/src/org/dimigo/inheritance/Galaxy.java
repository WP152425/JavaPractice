/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_Galaxy
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 15.
 * </pre>
 * 
 * @author : USER
 * @version : 1.8
 */
public class Galaxy extends SmartPhone{
	public Galaxy(){
		
	}
	
	public Galaxy(String model, String company, int price){
		super(model, company, price);
	}
	
	public void pay(){
		System.out.print("삼성 ");
		super.pay();
	}
	public void useWirelessCharging(){
		System.out.println("무선 충전 기능을 사용합니다.");
	}
}
