package Home_Lection3.dequeue;

import Home_Lection3.queue.Queue;

public interface DeQueue<E> extends Queue<E> {
    @Override
    boolean insert(E value);

    @Override
    E remove();

    @Override
    E peekFront();

    @Override
    int size();

    @Override
    boolean isEmpty();

    @Override
    boolean isFull();
}
