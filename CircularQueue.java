import java.util.*;
class CircularQueue{
	static Scanner sc=new Scanner(System.in);
	static int queue[];
	static int front=0;
	static int rear=0;
	static int size;
	public static void main(String[] args){
		System.out.println("Enter the Size of Queue");
		size=sc.nextInt();
		queue=new int[size];
		int e=1;
		int d=1;
		while(e==1){
			System.out.println("Enter the Data");
			enqueue(sc.nextInt());
			System.out.println("Enter 1 if u want again to enter the data");
			e=sc.nextInt();
		}
		while(d==1){
			System.out.println(dequeue());
			System.out.println("Enter 1 if u want again to delete the data");
			d=sc.nextInt();
		}
		enqueue(25);
		enqueue(78);
		enqueue(89);
		display();
	}
	public static void enqueue(int data){
		if ((rear+1)%size==front)
			System.out.println("Queue is full");
		else{
			rear=(rear+1)%size;
			queue[rear]=data;
		}
	}
	public static int dequeue(){
		int x=-1;
		if (front==rear)
			System.out.println("Queue is Empty");
		else{
			front=(front+1)%size;
			x=queue[front];
		}
		return x;
	}
	// public static void display(){
		// int i=front+1;
		// if (front==rear){
			// System.out.println("Queue is Empty");
		// }else{
			// while(front<rear){
				// front=(front+1)%size;
				// System.out.println(queue[front]);
			// }
		// }
	// }
}