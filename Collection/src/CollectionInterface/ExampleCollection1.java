package CollectionInterface;

import java.util.*;

public class ExampleCollection1 {
	
public static void main(String[] args) {
	
Collection c=new ArrayList();

c.add(7);
c.add("Chinu");
c.add("yashwant");

System.out.println("c :" +c);

Collection c1=new ArrayList();


c1.add(6);
c1.add("Shruti");
c1.add("AbhiRaj");

System.out.println("c1 :" +c1);

	
c1.addAll(c);
System.out.println("c1 :" +c1);

c1.add(c);
System.out.println("c1 :" +c1);

System.out.println("size " +c1.size());


System.out.println(c1.containsAll(c));

System.out.println("c: " +c);
}

}
