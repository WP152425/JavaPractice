/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_IPhone
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 15.
 * </pre>
 * 
 * @author : USER
 * @version : 1.8
 */
public class IPhone extends SmartPhone{
	public IPhone(){
		
	}
	
	public IPhone(String model, String company, int price){
		super(model, company, price);
	}
	
	public void pay(){
		System.out.print("애플 ");
		super.pay();
	}
	public void useAirDrop(){
		System.out.println("AirDrop 기능을 사용합니다.");
	}
	
}
