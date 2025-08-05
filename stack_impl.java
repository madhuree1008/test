import java.util.Scanner;
public class stack_impl {
    static int N;
    static int top=-1;
    static int laddo=0;
    static int stack[]=new int[N];
    public stack_impl(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the stack:");
        N=input.nextInt();
        int stack[]=new int[N];
        stack_impl.stack=stack;
    }
    public static void main(String[] args) {

        new stack_impl();
        push(10);
        push(20);
        push(30);
        peek();
        pop();
        display();

    }

    private static void peek() {
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("The top element of the stack is "+stack[top]);
        }
    }

    private static void pop() {
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Deleted element from the stack is "+stack[top]);
            top--;
        }
    }

    private static void display() {
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            for(int i=top;i>=0;i--){
                System.out.println(" "+stack[i]);
            }
        }
    }

    private static void push(int x) {
        if(top==N-1){
            System.out.println("Stack is full");
        }
        else{
            top++;
            stack[top]=x;
        }
    }
}

