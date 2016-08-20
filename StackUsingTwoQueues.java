import java.util.Queue;

//Write a Java class which implements a stack of integers using 2 queues
//Suppose q1 has all the elements, q2 is empty
//push: enqueue in q2, then enqueue all the elements in q1 to q2, switch the name
//pop:dequeue q1


public class StackUsingTwoQueues {
	
	ArrayQueue q1=new ArrayQueue(),q2=new ArrayQueue();	
	
	public void push(int x){
		q2.enqueue(x);
		while(!q1.isEmpty()){
			q2.enqueue(q1.dequeue());
		}
		ArrayQueue t = q1;q1=q2;q2=t;
	}
	
	public int pop(){
		return (int) q1.dequeue();
	}

}
