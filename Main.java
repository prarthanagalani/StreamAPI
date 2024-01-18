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
        arr.add(4);

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

        //usecase6
        System.out.println("Max even number: ");
        System.out.println(arr.stream().filter(n -> n%2==0).max(Integer::compareTo).orElseThrow());

        System.out.println("Min even number: ");
        System.out.println(arr.stream().filter(n -> n%2==0).min(Integer::compareTo).orElseThrow());

        System.out.println("sum of list: ");
        System.out.println(arr.stream().reduce((a,b)->a+b).orElseThrow());

        System.out.println("average: ");
        System.out.println(arr.stream().mapToDouble(Integer::doubleValue).average());

        //usecase8
        System.out.println("All are even?");
        System.out.println(arr.stream().allMatch(n -> n%2==0));

        System.out.println("Atleast one even?");
        System.out.println(arr.stream().anyMatch(n -> n%2==0));
       
    }
    
}
