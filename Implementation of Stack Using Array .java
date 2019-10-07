////// Impplementation of Stack DataStructure Using Array //////


public class Stack{
    
    public int MAX = 5;
    public int top;
    
    int a[] = new int[MAX];
    
    public Stack(){
        top = - 1;
        
    }
    
    boolean push(int x){
     
        if (top >= (MAX - 1)) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else { 
            a[++top] = x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
       
    }
    
    int pop(){
        if(top<0){
            System.out.println("Stack is Empty");
            return 0;
        }
        else{
            int x = a[top--];
            return x;
        }
        
    }
    
    int peek(){
        int x = a[top];
        return x;
        
    }
    
    void printStack(){
        for(int x=0;x<top+1;x++){
            System.out.println(a[x]);
        }
    }

    public static void main(String []args){
        
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.pop()+" pop out from stack");
        stack.printStack();
    }
}
