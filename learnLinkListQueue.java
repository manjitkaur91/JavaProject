import java.util.LinkedList;
import java.util.Queue;

public class learnLinkListQueue {

    public static void main(String[] args)
    {
        Queue<Integer> qu=new LinkedList<>();


        qu.offer(10);
        qu.offer(20);
        qu.offer(30);
        qu.offer(40);


        System.out.println(qu);

        System.out.println(qu.poll());
        System.out.println(qu);


        System.out.println(qu.peek());





    }

}
