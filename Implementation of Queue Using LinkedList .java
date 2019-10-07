///// Implementation of Queue Using LinkedList /////

public class Queue{
    
    Qnode front, rear; 
    public Queue(){
        this.front = this.rear = null;
    }
    
    class Qnode{
        int data;
        Qnode next;
        Qnode(int d){
            data = d;
            next = null;
        }
    }
    
    public void enqueue(int d){
        
        Qnode temp = new Qnode(10);
        
        if(rear == null){
            this.rear = temp;
            this.front = temp;
            System.out.println("Enqueue :"+ d);
            return;
        }
        
        this.rear.next = temp;
        this.rear = temp;
        System.out.println("Enqueue :"+ d);
    }
    
    
    public Qnode dequeue(){
        
        if (this.front == null){
            return null; 
        }
        System.out.println("Dequeue :"+ this.front.data);
        Qnode temp = this.front;
        this.front = this.front.next;
        
        if(this.front == null){
            this.rear = null;
        }

        return temp;
    }
 
 ////// Main Function (Driver Function) //////  

    public static void main(String []args){
     
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.dequeue();
      
     }
}
