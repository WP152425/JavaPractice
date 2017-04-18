/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_PiggyBankTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 * 
 * @author : USER
 * @version : 1.8
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FamilyMember[] family = {
				new FamilyMember("아빠"),new FamilyMember("엄마"),
				new FamilyMember("나"),new FamilyMember("남동생"),
		};
		
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney(family[0], 10000);
		PiggyBank.putMoney(family[1], 5000);
		PiggyBank.putMoney(family[2], 2000);
		PiggyBank.putMoney(family[3], 1000);
		
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(family[2], 1000);
		
		PiggyBank.printBalance();
	}

}
