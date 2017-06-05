/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 *   |_Music
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 5.
 * </pre>
 * 
 * @author : USER
 * @version : 1.8
 */
public class Music {
	private String title;
	private String singer;
	
	public Music(String title, String singer){
		this.title = title;
		this.singer = singer;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the singer
	 */
	public String getSinger() {
		return singer;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param singer the singer to set
	 */
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public String toString(){
		return title + "(" + singer + ")";
	}
}
