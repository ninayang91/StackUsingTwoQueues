public class ArrayQueue<E> implements Queue<E> {
	
	//private int size;
	public static final int CAPACITY=1000;
	private E[] q;
	private int front=0;
	private int end=0;
	private int capacity;
	
	public ArrayQueue(){
		this(CAPACITY);
		capacity=CAPACITY;
	}
	public ArrayQueue(int capacity){
		q= (E[])new Object[capacity];
		this.capacity = capacity;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		//return size;
		return (capacity+end-front)%capacity;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (front==end);
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return (getSize()==capacity-1);
	}

	@Override
	public void enqueue(E e) {
		// TODO Auto-generated method stub
		if(isFull()){
			return;
		}else{
			q[end]=e;
			end=(end+1)%capacity;
		}
		
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			return null;
		}else{
			E e=q[front];
			q[front]=null;
			front=(front+1)%capacity;
			return e;
		}

	}

}