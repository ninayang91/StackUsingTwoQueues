import javax.annotation.processing.FilerException;

public interface Queue<E> {
	
	public int getSize();
	public boolean isEmpty();
	public boolean isFull();
	public void enqueue(E e);// throws FilerException;
	public E dequeue();// throws EmptyQueueException;
	

}