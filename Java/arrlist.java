import java.util.*;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> arrl = new ArrayList<>();
        arrl.add(20);
        arrl.add(-2);
        arrl.add(0);
        arrl.add(70);

        Collections.sort(arrl);
        System.out.println(arrl.toString());

        // ArrayList ----  Memory insufficient-- fetching data is fast but adding data is slow
                        // Delete operation is slow and inefficient
                        // List interface implements
                        // Stores similar Data
                        // Static memory allocation
                        // 1D, 2D,3D and Multidimentional
        
        
        // Linkedlist --- Memory sufficient -- fetching data is slow but adding data is fast
                    //   single, double and circular
                    //   List interface implements
                    //   Stores different Data
                    //   Dynamic Memory allocation
                    //   Deletion operation is fast and efficient
    }
}

