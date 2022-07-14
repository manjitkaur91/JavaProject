import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

    public static void main(String[] args) {


        // hashset
      /*  Set<Integer> set=new HashSet<>();

        set.add(32);
        set.add(37);
        set.add(62);
        set.add(82);
        set.add(22);

        System.out.println(set);

        set.remove(62);

        System.out.println(set);

        System.out.println(set.contains(45));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set); */


        // linked Hash set


        /*   Set<Integer> set=new LinkedHashSet<>();

        set.add(32);
        set.add(37);
        set.add(62);
        set.add(82);
        set.add(22);

        System.out.println(set);

        set.remove(62);

        System.out.println(set);

        System.out.println(set.contains(45));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);*/



        //Tree set  (order of set sorted ) big o (n)

          /*  Set<Integer> set=new TreeSet<>();

        set.add(32);
        set.add(37);
        set.add(62);
        set.add(82);
        set.add(22);

        System.out.println(set);

        set.remove(62);

        System.out.println(set);

        System.out.println(set.contains(45));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set); */

//  how to  differnate emoloyee with id

Set<employee> employeeSet =new HashSet();

        employeeSet.add(new employee( "Manjit" ,13));
        employeeSet.add(new employee( "gunveer" ,23));
        employeeSet.add(new employee( "savi" ,33));
        employeeSet.add(new employee( "manseerat" ,13));

        employee e1=new employee("manjit",13);
        employee e2=new employee("manseerat",13);

        System.out.println(e1.equals(e2));


        System.out.println(employeeSet);



    }
}
