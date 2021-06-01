package Home_Lection3.queue;

public interface Queue<E> {

    boolean insert(E value);

    E remove();

    E peekFront();

    int size();

    boolean isEmpty();

    boolean isFull();
}
