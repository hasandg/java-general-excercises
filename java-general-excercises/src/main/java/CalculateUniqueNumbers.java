import java.util.*;
import java.util.stream.Collectors;

public class CalculateUniqueNumbers {
    public static void main(String[] args) {

       // old solution
        List<Integer> my_list = Arrays.asList(5, 10, 10, 1, 4, 5, 11, 22, 22);
        System.out.println("Result: " + calculateUniqueNumbers(my_list));

        // better solution
        Map<Integer, Long> counts =
                my_list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        for (Integer i : counts.keySet()) {
            System.out.println(i + " -> " + counts.get(i));
        }
    }

    public static HashMap calculateUniqueNumbers(List myList){
        HashMap mymap = new HashMap();

        for (Object object : myList) {
             if(mymap.containsKey(object)){
                 mymap.replace(object,((int)mymap.get(object))+1);
             }else{
                 mymap.put(object,1);
             }

        }

        return mymap;
    }
}