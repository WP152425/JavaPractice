/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *   |_Loop
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 * 
 * @author : USER
 * @version : 1.8
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] character = {"마법사", "영주", "기사", "농민"};
		int num = new Random().nextInt(4);
		Scanner scan = new Scanner(System.in);
		int choice, attack = 100;
		
		do {
			System.out.println("------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("4. 종료");
			System.out.println("------------");
			System.out.printf("메뉴 입력 => ");
			
			choice = scan.nextInt();
			
			switch (choice){
			case 1 :
				attack += 10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : " + attack);
				break;
			case 2 :
				attack -= 10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : " + attack);
				break;
			case 3 :
				System.out.println(character[num] + "(으)로 설정되었습니다.");
				num = new Random().nextInt(4);
				break;
			case 4 :
				System.out.println("이제 공부하세요!"); scan.close(); break;
			default :
				System.out.println("없는 메뉴입니다!!");
				
			}
		}while(choice != 4);
		
		
		
		
		
		
		
		
		
	}

}
