package bank;


import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class AddCustomer {
	public void printCustomers(List<String> arrayList){


		Iterator<String> iterator=arrayList.iterator(); 
		System.out.println("Customers are : "); 
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			}
	}

	public static void main(String args[]){

	//Create reference of List and object of ArrayList
		List<String> list=new ArrayList<String>(); 
		list.add("Jack");
		list.add("Harry");
		list.add("Tabrez");
		list.add("Leezu");
		AddCustomer addCustomer=new AddCustomer();

		addCustomer.printCustomers(list);
		}
	}

	








