package forEach;

import java.util.Arrays;
import java.util.List;

public class forEach {
	  
	public static void main(String[] args)
	{
	
	List<Integer> values =  Arrays.asList(1,2,3,4,5);
	
	values.forEach(i -> System.out.print(i));

}
}
