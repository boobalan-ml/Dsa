import java.util.*;

public class stack{
   static int top = -1;
    static int [] arr = new int[3];
    static void push(int x){
         if(top == arr.length - 1 ){
            System.err.println("overflow");
         }
         else{
            top++;
            arr[top]=x;
         }
    }
   static void pop(){
    if(top == -1 ){
        System.out.println("stack is empty");
    }
    else{
     System.out.println((arr[top]));
     top--;
    }
   }
   static void peek(){
    System.out.println(arr[top]);
   }
   public static void main(String[] args){
     push(10);
    push(20);
    push(30);
    pop();
    peek();
   }
}