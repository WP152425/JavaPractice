/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_SybaseDB
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author : USER
 * @version : 1.8
 */
public class SybaseDB implements IDBManager{

	/* (non-Javadoc)
	 * @see org.dimigo.interfaces.IDBManager#insert()
	 */
	@Override
	public void insert() {
		System.out.println("Sybase DB 저장");
		
	}

	/* (non-Javadoc)
	 * @see org.dimigo.interfaces.IDBManager#search()
	 */
	@Override
	public void search() {
		System.out.println("Sybase DB 조회");
		
	}

	/* (non-Javadoc)
	 * @see org.dimigo.interfaces.IDBManager#update()
	 */
	@Override
	public void update() {
		System.out.println("Sybase DB 변경");
		
	}

	/* (non-Javadoc)
	 * @see org.dimigo.interfaces.IDBManager#delete()
	 */
	@Override
	public void delete() {
		System.out.println("Sybase DB 삭제");
		
	}

}
