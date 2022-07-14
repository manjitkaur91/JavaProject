import java.util.Map;
import java.util.TreeMap;

public class learnMap {

    public static void main(String[] args) {


/*        Map<String ,Integer> number=new HashMap<>();

        // keys unique , values unique does not matter

        number.put("A",1);
        number.put("B",2);
        number.put("C",3);
        number.put("D",4);
        number.put("E",5);


   //     if (!number.containsKey("A"))
 // number.put("A",4);
        System.out.println(number.containsValue(3));
        System.out.println(number.isEmpty());
        System.out.println(number.remove(4));
//   number.putIfAbsent("A",4);
        System.out.println(number);

        for(Map.Entry<String,Integer> z:number.entrySet())

        {
            System.out.println(z);

             System.out.println(z.getKey());
            System.out.println(z.getValue());
        }
        for(String key: number.keySet()) {
            System.out.println(key);
        }
          for (Integer value: number.values())
          {
              System.out.println(value);
          }  */



        // TreeMap

        Map<String ,Integer> number=new TreeMap<>();

        // keys unique , values unique does not matter

        number.put("A",1);
        number.put("B",2);
        number.put("C",3);
        number.put("D",4);
        number.put("E",5);


        //     if (!number.containsKey("A"))
        // number.put("A",4);
        System.out.println(number.containsValue(3));
        System.out.println(number.isEmpty());
       // System.out.println(number.remove(4));
//   number.putIfAbsent("A",4);
        System.out.println(number);

        for(Map.Entry<String,Integer> z:number.entrySet())

        {
            System.out.println(z);

            System.out.println(z.getKey());
            System.out.println(z.getValue());
        }
        for(String key: number.keySet()) {
            System.out.println(key);
        }
        for (Integer value: number.values())
        {
            System.out.println(value);
        }





    }
}
