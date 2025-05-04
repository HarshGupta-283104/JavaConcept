import java.util.*;
import java.util.Stack;

public class StackDemo {
	static int top= -1;
	static int[] arr= new int[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(12);
		push(8);
		pop();
		push(13);
		System.out.println(peek());
		System.out.println(isEmpty());
		push(1);
		push(2);
		push(3);
		System.out.println(isEmpty());
	}
	private static void push(int x) {
		++top;
		arr[top]= x;
	}
	private static void pop() {
		--top;
	}
	private static int peek() {
		return arr[top];
	}
	private static boolean isEmpty() { //has space to store more elements or notx
		return (top < arr.length - 1);
	}

}