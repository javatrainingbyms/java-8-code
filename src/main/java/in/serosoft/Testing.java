package in.serosoft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Testing {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList();
		list.add("preetpal"); list.add("shubham");
		
		Map<String,Object> map=new HashMap<>();
		map.put("items", list);
		map.put("count", 2);
		
		List<String> names=(List<String>)map.get("items");
		System.out.println(names);
		Integer count=(Integer)map.get("count");
		System.out.println(count);

	}

}
