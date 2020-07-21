package com.epam.collection;
import org.apache.logging.log4j.*;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        CustomList<String> list = new CustomList<String>();
		
		Scanner sc = new Scanner(System.in); 
		
		final Logger LOGGER = LogManager.getLogger(App.class);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        
        LOGGER.debug("the list is " + list.toString());
        
        String getFromList = list.get(2);
        LOGGER.debug("element at index 2 is " + getFromList);
        
        try
        {
        	LOGGER.info("enter index to access element at that index");
        	int index = sc.nextInt();
        	getFromList = list.get(index);
        	LOGGER.info("element at index " + index + " is " + getFromList);
        	
        	LOGGER.info("Enter index of element to remove");
        	index = sc.nextInt();
        	String removeFromList = list.remove(index);
        	LOGGER.debug("element removed is " + removeFromList);
        	
        }
        catch(IndexOutOfBoundsException exception)
        {
        	LOGGER.debug(exception);
        }
        
        LOGGER.info("contents of list are " + list.toString());
         
        list.remove(2);
        LOGGER.info("after removing element at index 2 the list is " + list.toString());
 
        LOGGER.info("size of list is " + list.size());
        
        LOGGER.info("elements of list are " + list.toString());
        
        sc.close();
	}
}