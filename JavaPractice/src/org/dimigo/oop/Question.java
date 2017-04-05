/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 * 
 * @author : USER
 * @version : 1.8
 */
public class Question {

	
	public static void main(String[] args) {
		String[] question = {"가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?"};
		String[] answer = {"아이유", "이민정", "체육"};
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++){
			System.out.println(question[i]);
			String answered = scan.nextLine();
			if (answer[i].equals(answered)){
				System.out.println("정답입니다!");
			}
			else {
				System.out.println("틀렸습니다!");
			}
		}
		System.out.println("<< 결과 출력 >>");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 3; i++){
			sb.append(question[i]).append(" ").append(answer[i]).append("입니다.");
			System.out.println(sb);
			sb.delete(0,100);
		}

	}

}
