// // class Main {
// //     void sum(){
// //         System.out.println("hello");}
// //     public static void main (String[] args){
// //         Main obj=new Main();
// //         obj.sum();
// //     }
// // }

// // import p1.A;
// // public class Main {

// //     public static void main(String[]args){
// //         A s1=new A();
// //         s1.sleep();
// // }


// // }

// import java.util.HashMap;

// public class Main {

//     public static void main(String[]args){
//         HashMap<Integer,Integer>map=new HashMap<>();
// map.put(1, 10);
// map.put(2, 50);
// System.out.println(map);
//    System.out.println(map.get(1)); 
// System.out.println(map.getOrDefault(11, 0));
// for(int x: map.keySet()){
//     System.out.println(map.get(x));
// }
// }
// }

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class hello {
public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(1);
    list.add(0);
    list.add(5);
    Collections.sort(list);
    System.out.println(list);
}
    
}