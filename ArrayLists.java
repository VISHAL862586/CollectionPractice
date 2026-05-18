import java.util.ArrayList;
import java.util.Collections;


class ArrayLists{
    public static void main(String args []){
        ArrayList <Integer> list = new ArrayList<>();
      
        //add element
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);

        //get element
        int ele =list.get(0);
        System.out.println(ele);

        //add ele in btwn
        list.add(1, 1);
        System.out.println(list);

        //set element
        list.set(0, 5);
        System.out.println(list);

        //remove ele by index
        list.remove(3);
        System.out.println(list);

        //remove ele by value
        list.remove(Integer.valueOf(6));
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //Sort
        Collections.sort(list);
        System.out.println(list);

        //if we dont specify class, you can put anything inside list

        ArrayList list1= new ArrayList();
        list1.add("Vishal");
        list1.add(22);
        list1.add(true);
        System.out.println(list1);


    }
}