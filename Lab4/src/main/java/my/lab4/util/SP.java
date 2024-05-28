package my.lab4.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import my.lab4.model.Item;

public class SP {
	public static Map<Integer, Item> item = new HashMap<>(); 
//	static {
//		item.put(1, new Item(1,"Iphone" , 23.0, 0,"ip.jpg"));
//		item.put(2, new Item(2,"samsung" , 12.0, 0,"sam.jpg"));
//		item.put(3, new Item(3,"TV" , 33.0, 0,"tv.jpg"));
//		item.put(4, new Item(4,"Laptop" , 42.0, 0,"lap.png"));
//	}
	
	public static List<Item> list =  new ArrayList<Item>();
	static {
		list.add(new Item(1,"Iphone" , 23.0, 0,"ip.jpg"));
		list.add(new Item(2,"samsung" , 12.0, 0,"sam.jpg"));
		list.add(new Item(3,"TV" , 33.0, 0,"tv.jpg"));
		list.add(new Item(4,"Laptop" , 42.0, 0,"lap.png"));
	}
	
}
