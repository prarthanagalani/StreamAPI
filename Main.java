package StreamAPI;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        arr.stream().forEach(n -> System.out.println(n));

        //usecase2
        System.out.println("Usecase2: ");
        arr.stream().map(n -> n*2).forEach(n -> System.out.println(n));
    }
    
}
