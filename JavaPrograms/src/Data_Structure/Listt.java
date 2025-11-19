package Data_Structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Listt {
	
	public static void arrayList() {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);		
		list.add(2);		
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(4);		
		list.add(5);		
		list.add(6);	
		System.out.println(list);   // [1, 2, 3] --  It is a List of Integer 
		
		list.add(1, 5);
		list.set(0, 7);
		list.set(list.size()-1, 9); // update in last
		System.out.println(list);
		
//		list.add(9, 8);
//		System.out.println(list);  // indexOutOfBoundsException:
		
		list.remove(0); // remove by index
		list.remove(Integer.valueOf(9)); // remove by value
		list.removeIf(n -> n == 3);  // remove by value it will remove all value 3
		
		System.out.println(list);

		ListIterator<Integer> it = list.listIterator();  // remove while iterating but it will not show in same iteration again need print to show removed element
		while(it.hasNext()) {
			int a = it.next();
			if(a == 4) {
				it.remove();
			}
			System.out.println(a);
			
		}
		
		list.add(6);
		list.add(5);
		list.add(5);
		System.out.println(list);
		
		
//		for(int e : list) {  // will throw this error - ConcurrentModificationException because we cannot remove while iterating using for while and forEach loop
//			list.remove(0);
//		}
//		
		
		boolean b = list.contains(3);
		System.out.println(b);
		int a = list.get(0);
		System.out.println(a);
		System.out.println(list);
		
		System.out.println(list.indexOf(5)); 
		System.out.println(list.lastIndexOf(5)); 
		System.out.println(list.isEmpty()); 
		
		list.clear();
		System.out.println(list.isEmpty()); 
		System.out.println(list); 
		
		list.add(8);		
		list.add(5);		
		list.add(3);
		list.add(3);
		System.out.println(list); 
		
		Integer[] listToArray = list.toArray(new Integer[0]); // list to wrapper Integer
		System.out.println(Arrays.toString(listToArray));
		
		int[] listToArray2 = list.stream().mapToInt(i -> i).toArray(); // list to primitive int
		System.out.println(Arrays.toString(listToArray2));
		
		
		Collections.sort(list); // sort
		System.out.println(list); 
	}
	
	public static void arrlistChar() {
		
		List<Character> charList = new ArrayList<>();
		charList.add('a');
		charList.add('b');
		charList.add('d');
		charList.add('c');
		
		System.out.println(charList);
		
		
		Character[] listToChar = charList.toArray(new Character[0]);  // Character[0] - Just a way to indicate type, JVM allocates correct size
		System.out.println(Arrays.toString(listToChar));
		
		char[] listTochar2 = new char[charList.size()];
		for(int i = 0; i<=charList.size()-1; i++) {
			listTochar2[i] = charList.get(i);
		}
		
	//	char[] aa = charList.stream().mapToChar(i -> i).toArray(); // this is wrong this is only works for int
		
		System.out.println(Arrays.toString(listTochar2));
		
	}
	
	public static void preemitiveToList() {
		int[] a = {1,2,3,4,5};
		String[] s = {"abc","xyz","jkl"};
		char[] c = {'a','b','c'};
		
		List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
		
		list.add(6);
		System.out.println(list);
		
		System.out.println("--------String to List---------");
		
		List<String> sToList = Arrays.asList(s); // 
		System.out.println(sToList);
		
//		sToList.add("ccc"); // -- cannot add and remove it is a fixed size but can change
		sToList.set(0, "a");
		System.out.println(sToList);
		
		System.out.println("--------String to List---------");
		
		List<String> sToList2 = new ArrayList<>(Arrays.asList(s)); // we can add remove update anything
		System.out.println(sToList2);
		
		sToList2.add("ccc"); 
		sToList2.set(0, "b");
		sToList2.remove(1);
		System.out.println(sToList2);
		
		System.out.println("--------String to List---------");
		
		List<String> sToList3 = Arrays.stream(s).collect(Collectors.toList()); // we can add remove update anything
		System.out.println(sToList3);
		
		sToList3.add("ccc"); 
		sToList3.set(0, "b");
		sToList3.remove(1);
		System.out.println(sToList3);
		System.out.println("--------String to List---------");
		
		List<Character> cToList = new String(c).chars().mapToObj(ch -> (char) ch).collect(Collectors.toList());
		System.out.println(cToList);
		 
	}
	

	public static void main(String[] args) {
		arrayList();
		arrlistChar();
		preemitiveToList();

	}

}
