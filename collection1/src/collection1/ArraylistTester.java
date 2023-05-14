package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistTester {

public static void main(String[] args) {
	
List<Customer> cust = new ArrayList<Customer>();
 cust.add(0, null);
 Iterator<Customer> itr = cust.iterator();
 
while(itr.hasNext())
{
  Customer cust1  = itr.next();
       System.out.println(cust1);
}
 
}
}
