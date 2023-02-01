import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

// 1.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

// 2.Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

// 3.Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор


/**
 * DZ_4
 */
public class DZ_4 {

	public static void main(String[] args) {
		System.out.println("Здравствуйте!");
        System.out.println("Вашему вниманию представлена домашняя работа по теме:");
        System.out.println("'Хранение и обработка данных ч1: приоритетные коллекции'");
        System.out.println("Задача №1:");
        System.out.println("Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.");
        System.out.println("Задача №2:");
        System.out.println("Реализуйте очередь с помощью LinkedList со следующими методами:" + 
		"enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, " + 
		"first() - возвращает первый элемент из очереди, не удаляя.");
		System.out.println("Задача №3:");
        System.out.println("Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор.");
        System.out.println("");
		task1();
		task2();
		task3();
		
	}

	static void task1(){
		LinkedList<Integer> list = new LinkedList<>();
		Random r = new Random();
        int lowerBound = 1;
        int upperBound = 10;
        int result = 0;
		System.out.println();

        for (int index = 0; index < upperBound; index++) { 
            result = r.nextInt(upperBound-lowerBound) + lowerBound;
            list.add(result);
        }

		System.out.println("Задача №1:");
		System.out.print("\nПервоначальный список: " + list);

		for (int index = 0; index < list.size() / 2; index++) {
            Integer temp = list.get(index);
            list.set(index, list.get(list.size() - index - 1));
            list.set(list.size() - index - 1, temp);
        }

        System.out.print("\nПеревернутый список: " + list);
		System.out.println("");
		System.out.println("");
	}

	static void task2(){
		MiQueue miQueue = new MiQueue(4);
		System.out.println("Задача №2:");
		miQueue.enqueue("a");
		miQueue.enqueue("b");
		miQueue.enqueue("c");
		miQueue.enqueue("d");
		System.out.println(miQueue.dequeue());
		System.out.println(miQueue.first());
		System.out.println("");
	}

	static void task3(){
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("Задача №3:");
		Random r = new Random();
        int lowerBound = 1;
        int upperBound = 10;
        int result = 0;
		System.out.println();

        for (int index = 0; index < upperBound; index++) { 
            result = r.nextInt(upperBound-lowerBound) + lowerBound;
            list.add(result);
        }

		System.out.print("Элементы списка: ");
		Iterator itr = list.iterator();
		int tempo = 0;
    	while(itr.hasNext()) {
        	Object element = itr.next();
        	System.out.print(element + " ");
			tempo = tempo + (Integer)element;
      	}

		System.out.println("");
      	System.out.println("Сумма элементов: " + tempo);
		System.out.println("Сохраненный список" + list);

	}

}