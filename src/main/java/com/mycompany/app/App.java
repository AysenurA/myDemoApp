package com.mycompany.app;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
public static boolean search(ArrayList<Integer> array, int x,int y) {
        System.out.println("inside search");
	int a=0;
        if (array == null) 
		return false;
        for (int elt : array) {
          if (elt*x == y)
		return true;
        }
	for (int e : array){
           if(e==0)
		a++;
	 }
	if (a==array.size())
		return false;
        return false;   
	}
}
