import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


Integer[] numArray = {50,25,80,5,15};
        Arrays.sort(numArray);
        Arrays.sort(numArray, Collections.reverseOrder());
        ArrayList<Integer> b = new ArrayList<>();

        for (int i : numArray) {
            System.out.println(i);
            b.add(i);
        }

        System.out.println(b);






        System.out.println(Arrays.toString(numArray));




//        System.out.println(Arrays.toString(Arrays.stream(newArray).sorted().toArray()));


//for (int i : newArray) {
//    System.out.println(i);
//}




    }
