/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   |_MelonGenreChart
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 12.
 * </pre>
 * 
 * @author : USER
 * @version : 1.8
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		List<Music> Dlist = new ArrayList<>();
		List<Music> Blist = new ArrayList<>();
		Dlist.add(new Music("팔레트", "아이유"));
		Blist.add(new Music("I LUV IT", "PSY"));
		Blist.add(new Music("맞지?", "언니쓰"));
		
		System.out.println("--<<멜론 장르별 차트>>--");
		map.put("발라드", Dlist);
		map.put("댄스", Blist);
		printMap(map);
		
		System.out.println("--<<댄스 2위 곡 변경 >>--");
		Blist.set(1, new Music("SIGNAL", "트와이스"));
		map.put("댄스", Blist);
		printMap(map);
		
		System.out.println("--<<댄스 1위 곡 삭제 >>--");
		Blist.remove(0);
		map.put("댄스", Blist);
		printMap(map);
		
		System.out.println("--<<전체 리스트 삭제>>--");
		map.clear();
		printMap(map);
	}
	
	public static void printMap(Map<String, List<Music>> map){
		for (String key : map.keySet()){
			int i = 1;
			System.out.println("[" + key + "]");
			for (Music l : map.get(key)){
				System.out.println(i + ". " + map.get(key).get(i-1));
				i++;
			}
		}
		System.out.println();
	}

}
