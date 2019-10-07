
///// Implementation of Queue Using Array In java /////


public class Queue{
    
    int capacity;
    int front, rear, size;
    int arr[];
    
    Queue(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.front = 0;
        this.rear = this.capacity - 1;
        arr = new int[this.capacity];
    }
    
    public boolean isEmpty(){
        if (this.size == 0){
            return true;
        }
        return false;
    }
    
    public boolean isFull(){
        if (this.size == this.capacity){
            return true;
        }
        return false;
    }
    
    
    public void enqueue(int d){
        
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        
        this.rear= (this.rear+1)%this.capacity;
        this.arr[this.rear] = d;
        this.size++;
        System.out.println("Enqueue :"+d);
        
        
    }
    
    public int dequeue(){
        
       if (isEmpty()) {
           System.out.println("Queue is Empty!!");
           return 0; 
       }
            
        int temp = this.arr[this.front];
        this.front = (this.front+1)%this.capacity;
        this.size--;
        System.out.println("Dequeue :" + temp);
        return temp;
        
    }
    
    public void front(){
        System.out.println("Front is here on :"+this.arr[this.front]);
    }
    
   public void rear() 
    { 
        System.out.println("rear is here on :"+this.arr[this.rear]);
    } 
    
///// Main Function (Driver Fucntion) /////

     public static void main(String []args){
         
         Queue q = new Queue(5);
         q.enqueue(10);
         q.enqueue(20);
         q.enqueue(30);
         q.enqueue(40);
         q.enqueue(50);
         q.dequeue();
         q.dequeue();
         q.front();
         q.rear();
       
     }
}
