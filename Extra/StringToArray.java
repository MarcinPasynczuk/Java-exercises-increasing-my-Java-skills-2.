import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        String[] sArray = input.split(",");
//        System.out.println(Arrays.toString(sArray));

        int x = Integer.MAX_VALUE;
        for (String i : sArray) {
            if (Integer.parseInt(i) <x){
                x = Integer.parseInt(i);
            }
        }
        System.out.println(x);

// 9,8,7,4,5,6,2,1
//        System.out.println(input);
    }


}
