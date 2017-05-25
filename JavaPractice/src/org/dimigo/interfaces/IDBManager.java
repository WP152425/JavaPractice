/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_IDBManager
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author : USER
 * @version : 1.8
 */
public interface IDBManager {
	final String ORACLE_DATABASE = "ORACLE";
	final String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	
	static IDBManager getDBObject(String database){
		
		if (database.equals(ORACLE_DATABASE)){
			OracleDB o = new OracleDB();
			return o;
		}
		else {
			SybaseDB s = new SybaseDB();
			return s;
		}
		
	};
}
