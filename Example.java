/*import java.util.*;
import java.io.*;

public class Example{
   public static void main(String args[]) throws IOException {
      BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
      System.out.println("How many elements you want to add to the array: ");
      int n = Integer.parseInt(in.readLine());
      String[] name = new String[n];
      
      for(int i = 0; i < n; i++) {
         name[i] = in.readLine();
      }
      List<String> list = Arrays.asList(name); 
      System.out.println();
      
      for(String li: list) {
         String str = li;
         System.out.print(str + " ");
      }
   }
}*/

//comparing elements 

/*import java.util.Collections; 
import java.util.Set;
import java.util.TreeSet;

public class Example {
   public static void main(String[] args) {
      String[] coins = { "Penny", "nickel", "dime", "Quarter", "dollar" };
      Set set = new TreeSet();
      
      for (int i = 0; i < coins.length; i++)set.add(coins[i]);
      System.out.println(Collections.min(set));
      System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));
      
      for(int i=0; i<=10;i++)System.out.print('-');
      System.out.println(Collections.max(set));
      System.out.println(Collections.max(set, 
      String.CASE_INSENSITIVE_ORDER));
   }
}*/

// Convert into Array

/*import java.util.*;

public class Example{
   public static void main(String[] args){
      List<String> list = new ArrayList<String>();
      list.add("Hello "); 
      list.add("how  "); 
      list.add("are");
      list.add(" you ");
      list.add("doing?");
      String[] s1 = list.toArray(new String[0]); 
      
      for(int i = 0; i< s1.length; ++i) {
         String contents = s1[i];
         System.out.print(contents);
      } 
   }
}*/

//

/*import java.util.*;

public class Example {
	public static void main(String[] args) {
		System.out.println("Tree Map Example!\n");
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.put(1, "Sunday");
		tMap.put(2, "Monday");
		tMap.put(3, "Tuesday");
		tMap.put(4, "Wednesday");
		tMap.put(5, "Thursday");
		tMap.put(6, "Friday");
		tMap.put(7, "Saturday");
		System.out.println("Keys map: " + tMap.keySet());
		System.out.println("Values map: " + tMap.values());
		System.out.println("Key: 5 value: " + tMap.get(5) + "\n");
		System.out.println("First key: " + tMap.firstKey() + " Value: " + tMap.get(tMap.firstKey()) + "\n");
		System.out.println("Last key: " + tMap.lastKey() + " Value: " + tMap.get(tMap.lastKey()) + "\n");
		System.out.println("Removing first data: " + tMap.remove(tMap.firstKey()));
		System.out.println(" map Keys: " + tMap.keySet());
		System.out.println(" map contain: " + tMap.values() + "\n");
		System.out.println("Removing last data: " + tMap.remove(tMap.lastKey()));
		System.out.println(" map Keys: " + tMap.keySet());
		System.out.println(" map contain: " + tMap.values());
	}
}*/

//Collection Read only

/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Example {
	public static void main(String[] argv) throws Exception {
		List stuff = Arrays.asList(new String[] { "a", "b" });
		List list = new ArrayList(stuff);
		list = Collections.unmodifiableList(list);
		try {
			list.set(0, "new value");
		} catch (UnsupportedOperationException e) {
		}
		Set set = new HashSet(stuff);
		set = Collections.unmodifiableSet(set);
		Map map = new HashMap();
		map = Collections.unmodifiableMap(map);
		System.out.println(" read-only");
	}
}*/

//

/*import java.util.*;

public class Example {
	public static void main(String[] args) {
		int size;
		HashSet<String> collection = new HashSet<String>();
		String str1 = "Snigdha", str2 = "Pochi", str3 = "Saavi", str4 = "Sadhvi";
		Iterator iterator;
		collection.add(str1);
		collection.add(str2);
		collection.add(str3);
		collection.add(str4);
		System.out.print(" Data: ");
		iterator = collection.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		collection.remove(str2);
		System.out.println("After removing [" + str2 + "]\n");
		System.out.print(" Current Data: ");
		iterator = collection.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		size = collection.size();
		System.out.println("Collection size: " + size + "\n");
	}
}*/

//Reverse Collection

/*import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Example {
   public static void main(String[] args) {
      String[] coins = { "S", "N", "I", "G", "D", "H", "A" };
      List<String> l = new ArrayList();
      
      for (int i = 0; i < coins.length; i++)l.add(coins[i]);
      ListIterator liter = l.listIterator();
      System.out.println("Before");
      
      while (liter.hasNext())System.out.println(liter.next());
      Collections.reverse(l);
      liter = l.listIterator();
      System.out.println("After");
      while (liter.hasNext())System.out.println(liter.next());
   }
}*/

//Shuffling a number 

/*import java.util.ArrayList;
import java.util.Collections;

public class Example {
   public static void main(String[] argv) throws Exception {
      ArrayList<String> obj = new ArrayList<String>();
      obj.add("P");
      obj.add("O");
      obj.add("C");
      obj.add("H");
      obj.add("I");
      Collections.shuffle(obj);
      System.out.println(obj);
   }   
}*/

//min and max print

/*import java.util.*;

public class Example{
   public static void main(String[] args) {
      List list = Arrays.asList("one two three".split(" "));
      System.out.println(list);
      System.out.println("max: " + Collections.max(list));
      System.out.println("min: " + Collections.min(list));
   }
}*/


























