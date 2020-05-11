import java.util.LinkedList;
import java.util.NoSuchElementException;

public class QueueAsList<T> {
    private LinkedList<T> list;
    
    public QueueAsList(QueueAsList<T> l) {
    	list = new LinkedList<>(l.list);
    }
    
    public QueueAsList(){
        list = new LinkedList<>();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public T dequeue() throws NoSuchElementException{
        return list.removeLast();
    }

    public void enqueue(T t){
        list.addFirst(t);
    }
    
    public int size() {
    	return list.size();
    }
}
