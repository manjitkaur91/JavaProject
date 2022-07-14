import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class learnPriorityQueue {

    public static void main(String[] args) {

        Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder() );

        pq.offer(50);
        pq.offer(130);
        pq.offer(13);
        pq.offer(56);
        pq.offer(20);

        System.out.println(pq);

        pq.poll();

        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
