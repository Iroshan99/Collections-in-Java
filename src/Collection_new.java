import java.util.*;
public class Collection_new {

    public static void main(String[] args) {

        //use list interface for classes in collection framework
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new LinkedList<>();
        List<Integer> c=new Vector<>();

        //adding element to the array list
        a.add(1);
        a.add(2);
        a.add(3);

        //adding element to LinkedList
        b.add(1);
        b.add(2);
        b.add(3);

        //add element to the vector collection
        c.add(1);
        c.add(2);

        //printing the collection
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        //use the Same class to create a object for collections
        ArrayList<Integer> d=new ArrayList<>();
        LinkedList<Integer> e=new LinkedList<>();
        Vector<Integer> f=new Vector<>();

        //for these collections we can also use the above way for give and print elements


    }
}
