import java.util.ArrayList;

public class MyQueue<T> {
    ArrayList<T> queue = new ArrayList<T>();

    public void push(T item){
        queue.add(item);
    }

    public T pop(){
        if(queue.isEmpty()){
            return null;
        }
        return queue.remove(0);
    }

    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<Integer>();

        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.pop());
        myQueue.push(3);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
    }
}
