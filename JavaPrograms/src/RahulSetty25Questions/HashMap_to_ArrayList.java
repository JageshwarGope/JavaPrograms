package RahulSetty25Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap_to_ArrayList {

	public static void main(String args[]) {

		Map<Integer, String> map = new HashMap<>();

		map.put(0, "rahul");
		map.put(1, "kumar");
		map.put(2, "Jagu");

		System.out.println(map);

		List<String> list = new ArrayList<>();

		for (int e : map.keySet()) {
			list.add(map.get(e));
		}

		System.out.println(list);

		System.out.println("---------------------");

		List<Integer> list2 = new ArrayList<>(map.keySet());

		for (int e : list2) {
			System.out.print(e+" ");
		}

		System.out.println("---------------------");
		
		List<String> list3 = new ArrayList<>(map.values());

		for (String e : list3) {
			System.out.print(e+" ");
		}

	}
}
