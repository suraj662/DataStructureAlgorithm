package org.example;

import java.util.Stack;


public class MinStack {
  Stack<Integer> stack;
  Stack<Integer> minStack;

  public MinStack(){
      stack = new Stack<>();
      minStack = new Stack<>();
  }

  // Push element onto stack
    public void push(int val){
      stack.push(val);

        // If minStack is empty or new value is smaller
        if(minStack.isEmpty()){
            minStack.push(val);
        }else {
            minStack.push(Math.min(val , minStack.peek()));
        }
    }

    // Remove top element
    public void pop(){
      stack.pop();
      minStack.pop();
    }

    //show top element
    public int top(){
      if(!stack.isEmpty()) {
          return stack.peek();
      }
      return -1;
    }

    //get minimum element
    public int getMin(){
      if(!minStack.isEmpty()){
          return minStack.peek();
      }
      return -1;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        // Example 1
        System.out.println("Pushing: -2");
        minStack.push(-2);

        System.out.println("Pushing: 0");
        minStack.push(0);

        System.out.println("Pushing: -3");
        minStack.push(-3);

        System.out.println("Minimum: " + minStack.getMin()); // -3

        minStack.pop();
        System.out.println("Top after pop: " + minStack.top()); // 0

        System.out.println("Minimum after pop: " + minStack.getMin()); // -2

        System.out.println("\n---- Second Example ----");

        // Example 2
        MinStack minStack2 = new MinStack();
        minStack2.push(5);
        minStack2.push(1);
        System.out.println("Minimum: " + minStack2.getMin()); // 1

        minStack2.push(3);
        minStack2.pop();
        System.out.println("Minimum after pop: " + minStack2.getMin()); // 1
        System.out.println("Top: " + minStack2.top()); // 1
    }

}
