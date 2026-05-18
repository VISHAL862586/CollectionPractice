import java.util.ArrayList;
import java.util.Collections;
public class ArrayListProblem1 {

    static void reverseList(ArrayList<Integer> list){
        int i=0; int j=list.size()-1;

        while(i<j){
            int temp=list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);

            i++;
            j--;
        }
    }



    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println("Orignal List :");
        System.out.println(list);
        System.out.println("After Reversing : ");
        //Collections.reverse(list) ==> build in method
        reverseList(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println("Ascending Order : "+ list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order : "+ list);
    }
    
}
