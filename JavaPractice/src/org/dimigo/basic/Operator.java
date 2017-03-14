/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_Operator
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 * 
 * @author : USER
 * @version : 1.8
 */
public class Operator {
	public static void main(String[] args) {
		long mon_avg_sal = 1700000;
		long employee = 3;
		long building = 1500;
		long year_person = mon_avg_sal * 12 * employee * building;
		//mon_avg_sal = String.format("%,d", mon_avg_sal);
		//building = String.format("%,d", building);
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", mon_avg_sal));
		System.out.println("점포 내 직원 수 : " + String.format("%,d", employee) + "명");
		System.out.println("점포 수 : " + String.format("%,d", building) + "개");
		System.out.println("연간 인건비 : " + String.format("%,d", year_person) + "원");
	}
}
