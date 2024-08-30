package assignment5;



import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Debug{
	public <T> void showRecords(Set<String> set){
		if(!set.isEmpty()){
			Iterator<String> iterator=set.iterator();
			while(iterator.hasNext()){
				System.out.println(iterator.next());
		}
}else {
	System.out.println("Set is an empty set");
	}
}

public static void main(String args[]){ 
	Set<String> set = new HashSet<String>();
	set.add("Lourie");
	set.add("Amy"); 
	set.add("Richard"); 
	set.add("Mark");
	Debug debug=new Debug(); 
	System.out.println("Printing the records....."); 
	debug.showRecords(set);
	}
}
