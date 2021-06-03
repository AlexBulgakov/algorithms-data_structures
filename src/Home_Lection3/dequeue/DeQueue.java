package Home_Lection3.dequeue;

import Home_Lection3.queue.Queue;

public interface DeQueue<E> extends Queue<E> {

    boolean insertLeft(E value);

    E removeRight();


}
