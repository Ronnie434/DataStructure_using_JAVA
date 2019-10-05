
/////// Implementation of Stack using LinkedList(LinkedNode) ///////

public class Stack{
    
    StackNode top;
    class StackNode{
        int data;
        StackNode next;
        StackNode(int d){
            data=d;
            next=null;
        } 
    }
    
    public void push(int d){
        StackNode node = new StackNode(d);
        if(top==null){
            top=node;
        }
        else{
            node.next= top;
            top = node;
        }
        System.out.println(d + " pushed to stack");
    }
    public int pop() 
    { 
        int popped = Integer.MIN_VALUE; 
        if (top == null) { 
            System.out.println("Stack is Empty"); 
            
        } 
        else { 
            popped = top.data; 
            top = top.next; 
        } 
        return popped; 
    } 
  
    public int peek() 
    { 
        if (top == null) { 
            System.out.println("Stack is empty"); 
            return top.data; 
        } 
        else { 
            return top.data; 
        } 
    } 
    
    public void printStack(){
        while(top!=null){
            System.out.println("Elements in Stack:" + top.data);
            top= top.next;
        }
    }
    
    ///////  Main Function (Driver Function)  ////////  
    
    public static void main(String []args){
        
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        // System.out.println(stack.pop()+" pop out from stack");
        // System.out.println(stack.peek()+" peek out from stack");
        // System.out.println(stack.pop()+" pop out from stack");
        // System.out.println(stack.pop()+" pop out from stack");
        // System.out.println(stack.pop()+" pop out from stack");
        // System.out.println(stack.pop()+" pop out from stack");
        stack.printStack();
    }
}
