import java.util.*;

public class Test{

    public static void main(String[] args){
    LinkedList<Integer> list1 = new LinkedList<>();
    LinkedList<Integer> list2 = new LinkedList<>();

    list1.add(1);   list1.add(3); list1.add(4); list1.add(9);
    list2.add(2); list2.add(5); list2.add(5); list2.add(11); list2.add(17); list2.add(22);
    //creating a array and putting those value
        ArrayList<Integer> aList = new ArrayList<>();

        //traversing thorugh each linked list and adding them into array
        for(int i=0; i<list1.size(); i++){
            aList.add(list1.get(i));
        }
        for(int j=0; j<list2.size(); j++){
            aList.add(list2.get(j));
        }
        Collections.sort(aList);
        System.out.println(aList);


    }
}