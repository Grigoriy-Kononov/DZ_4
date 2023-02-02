import java.util.LinkedList;

// 2.Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class MiQueue {
	private LinkedList<String> list = new LinkedList<>();

	MiQueue(int capacity) {
		LinkedList<String> list = new LinkedList<>();
	}

	LinkedList<String> enqueue(String e) {
		list.addLast(e);
		return list;
	}

	String dequeue() {
		return list.remove(0);

	}

	String first() {
		return list.get(0);
	}
}
