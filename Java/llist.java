import java.util.*;
public class llist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(4);
        list.add(-1);
        list.add(9);

        // System.out.println(list.toString());

        // list.forEach(element -> System.out.println(element));
        // list.forEach(System.out::println);
        // print
        // for(int i: list){
        //     System.out.println(i);
        // }

        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(i));
        // }

        // Iterator<Integer> it = list.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        list.stream().filter(e -> e%2!=0).forEach(System.out::println);  //using Lambda to filter out values with desired conditions 



    }
}
