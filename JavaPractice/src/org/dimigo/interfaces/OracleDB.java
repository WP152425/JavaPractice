/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_OracleDB
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author : USER
 * @version : 1.8
 */
public class OracleDB implements IDBManager {

	@Override
	public void insert() {
		
		System.out.println("Oracle DB 저장");
		
	}
	
	@Override
	public void search() {
		System.out.println("Oracle DB 조회");
		
	}
	
	@Override
	public void update() {
		System.out.println("Oracle DB 변경");
		
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB 삭제");
		
	}

}
