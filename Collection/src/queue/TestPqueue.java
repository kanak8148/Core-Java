package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPqueue {
	
public static void main(String[] args) {
	
	//PriorityQueue ye quie mey sorting karke rkhti hai elements ko
		
		Queue q = new PriorityQueue();
		
		q.add("9");
		q.add("7");
		q.add("8");

		
		System.out.println(q);
		
	}
}
