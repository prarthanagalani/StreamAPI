package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        List<Integer>data = arr.stream().map(n -> n*2).collect(Collectors.toList());
        System.out.println(data);

        //usecase4
        System.out.println("Usecase4: ");
        data = arr.stream().filter(n -> n%2==0).collect(Collectors.toList());
        System.out.println(data);

        //usecase5
        System.out.println("Usecase5: ");
        System.out.println(arr.stream().filter(n -> n%2==0).findFirst().orElseThrow());
    }
    
}
