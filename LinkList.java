import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
        import java.lang.Integer;
        import java.util.Iterator;
        import java.util.List;

public class LinkList
{
    public static void main(String[] args) {

       List<Integer> studentList =new LinkedList<>();
        studentList.add(1);
        studentList.add(2);
        studentList.add(3);
        studentList.add(4);
        System.out.println(studentList);
        studentList.add(5);
        studentList.add(6);
        studentList.add(7);
        System.out.println(studentList);

// Add the element at any index  point
        studentList.add(1 , 50);
        System.out.println(studentList);

 // Add all old elements at new list
        List newList=new ArrayList();
        newList.add(8);
        newList.add(21);
        newList.add(31);
        studentList.addAll(newList);
        System.out.println(studentList);

//       get any particular element
        System.out.println(studentList.get(1));
/*
// remove the particlular element from index value
        List studentList=new LinkedList();
        studentList.add(10);
        studentList.add(20);
        studentList.add(30);
        studentList.add(40);
        studentList.add(50);

        for(int i=0; i<=studentList.size(); i++)
            System.out.println("the element "+studentList.get(i));

        for (Object element:studentList)
        {
            System.out.println("for each element " + element);

        }
        Iterator<Integer> it=studentList.iterator();
        {
            while(it.hasNext())
            {
                System.out.println("iterator" +it.next());
            }
        }

        /*   studentList.remove(1);
        System.out.println(studentList);

// big o(n)
 // remove element value

        studentList.remove(Integer.valueOf(30));
        System.out.println(studentList);

// clear all the list
       // studentList.clear();
        //System.out.println(studentList);
  // set the value of particular value

    studentList.set(1,330);
    System.out.println(studentList);


        System.out.println(studentList.contains(10));*/
    }
}
