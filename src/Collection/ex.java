package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class ex {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("c");
		list.add("java");
		list.add("c++");

		list.add(2, "python");
		System.out.println(list);
// set not allow duplicate values and we can not insert value in based on position

// hashset store  values in each bucket based on hashfunction(hashcode) 
		Set<String> set = new HashSet<String>();
		set.add("java");
		set.add("c");
		set.add("c++");
		set.add("java");
		System.out.println(set);
		set.add("java");

		// tree set store values in sorted order
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("java");
		tree.add("c");
		tree.add("c++");
		tree.add("python");
		tree.add("java");
		System.out.println(tree);
		System.out.println(tree.floor("krishna"));

		// hashset insertion order not preserved
		HashSet<String> hashset = new HashSet<String>();

		hashset.add("java");
		hashset.add("c");
		hashset.add("c++");
		hashset.add("python");
		System.out.println(hashset);

		Queue<String> queue = new PriorityQueue<String>();

		queue.add("java");
		queue.add("c");
		queue.add("c++");
		queue.add("python");
		queue.add("java");

		System.out.println("queue " + queue);

		String str = "welcome to java world";
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		char[] character = str.toCharArray();
		for (char c : character) {
			Integer integer = hashMap.get(c);
			if (integer == null) {
				hashMap.put(c, 1);
			}
		}

	}

}
