import java.util.*;
import java.io.*;
public class Collections_old {


    public static void main(String[] args) {

        //in older days before java 1.2 we have only the below collections and it is hard to
        //use and don't have connection between the classes
        int arr[]=new int[] {1,2,3,4,5};
        Vector<Integer> v=new Vector();
        Hashtable<Integer,String> h=new Hashtable();

        //for vector class we can use addElement() to add a element
        v.addElement(1);
        v.addElement(2);

        //for hashtable we can use put() method to add element
        h.put(1,"dog");
        h.put(2,"cat");

        //for printing the above collections
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        System.out.println(v);
        System.out.println(h);




    }




}
