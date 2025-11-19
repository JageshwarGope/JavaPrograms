package Data_Structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sett {

	public static void hashSet() {

		Set<Integer> set = new HashSet<>();

		System.out.println("----------Hash set------");

		set.add(4);
		set.add(4);
		set.add(1);
		set.add(5);
		set.add(1);
		set.add(3);
		set.add(3);

		System.out.println(set);

		set.remove(5);

		System.out.println(set);

	}

	public static void linkedHashSet() {

		Set<Integer> set = new LinkedHashSet<>();

		System.out.println("----------Linked Hash set------");

		set.add(4);
		set.add(4);
		set.add(1);
		set.add(5);
		set.add(1);
		set.add(3);
		set.add(3);

		System.out.println(set);

		set.remove(4);

		System.out.println(set);
	}

	public static void treeSet() {

		Set<Integer> set = new TreeSet<>();

		System.out.println("----------Linked Hash set------");

		set.add(4);
		set.add(4);
		set.add(1);
		set.add(5);
		set.add(1);
		set.add(3);
		set.add(3);

		System.out.println(set);
		set.remove(3);

		System.out.println(set);
	}

	public static void removeDuplicate() {
		System.out.println("----------removeDuplicate------");

		int[] a = { 1, 2, 1, 4, 6, 8, 3, 2, 1 };

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(2);

		System.out.println(list);

		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);

		Set<Integer> set2 = new HashSet<>();

		for (int e : a) {
			set2.add(e);
		}

		System.out.println(set2);

	}

	public static void findDuplicat() {

		System.out.println("---------findDuplicat-----");

		int[] a = { 1, 2, 1, 4, 6, 8, 3, 2, 1 };

		List<Integer> list = new ArrayList<>();

		Set<Integer> set = new HashSet<>();

		for (int e : a) {
			if (!set.add(e) && !list.contains(e)) {
				list.add(e);
			}
		}

		System.out.println(list);
	}

	public static void union() {

		System.out.println("----------union------");
		
		Set<Integer> set = new HashSet<>();

		set.add(4);
		set.add(5);
		set.add(1);
		set.add(3);
		set.add(3);

		System.out.println(set);
		
		Set<Integer> set2 = new HashSet<>();

		set2.add(4);
		set2.add(5);
		set2.add(1);
		set2.add(3);
		set2.add(6);
		set2.add(7);

		System.out.println(set2);
		
		set.addAll(set2);
		
		System.out.println(set);
		
	}
	
	public static void intersect() {

		System.out.println("----------intersect------");
		
		Set<Integer> set = new HashSet<>();

		set.add(4);
		set.add(5);
		set.add(1);
		set.add(3);
		set.add(3);
		set.add(10);
		set.add(11);

		System.out.println(set);
		
		Set<Integer> set2 = new HashSet<>();

		set2.add(4);
		set2.add(5);
		set2.add(1);
		set2.add(3);
		set2.add(6);
		set2.add(7);

		System.out.println(set2);
		
		set.retainAll(set2);
		
		System.out.println(set);
	
	}
	
	public static void remove() {

		System.out.println("----------remove------");
		
		Set<Integer> set = new HashSet<>();

		set.add(4);
		set.add(5);
		set.add(1);
		set.add(3);
		set.add(3);
		set.add(10);
		set.add(11);

		System.out.println(set);
		
		Set<Integer> set2 = new HashSet<>();

		set2.add(4);
		set2.add(5);
		set2.add(1);
		set2.add(3);
		set2.add(6);
		set2.add(7);

		System.out.println(set2);
		
		set.removeAll(set2);
		
		System.out.println(set);
	
	}

	public static void main(String[] args) {
		hashSet();
		linkedHashSet();
		treeSet();
		removeDuplicate();
		findDuplicat();
		union();
		intersect();
		remove();

	}

}
