package Home_Lection3.dequeue;



public class DeQueueImpl<E> implements DeQueue<E> {

    private static final int HEAD_DEFAULT = 0;
    private static final int TAIL_DEFAULT = -1;

    private final E[] data;
    private int size;

    private int tail;
    private int head;


    @SuppressWarnings("unchecked")
    public DeQueueImpl(int maxSize){
        this.data = (E[]) new Object[maxSize];
        this.head = HEAD_DEFAULT;
        this.tail = TAIL_DEFAULT;
    }

    @Override
    public boolean insertLeft(E value) {
        if (isFull()) {
            return false;
        }

        if (head == HEAD_DEFAULT) {
            head = data.length;
        }

        data[--head] = value;
        size++;

        return true;
    }

    @Override
    public E removeRight() {
        if (isEmpty()) {
            return null;
        }

        if (tail == TAIL_DEFAULT) {
            tail = data.length - 1;
        }

        E value = data[tail--];
        size--;

        return value;
    }

    @Override
    public boolean insert(E value) {
        if (isFull()) {
            return false;
        }

        if (tail == data.length - 1) {
            tail = TAIL_DEFAULT;
        }

        data[++tail] = value;
        size++;

        return true;
    }

    @Override
    public E remove() {
        if (isEmpty()) {
            return null;
        }

        if (head == data.length) {
            head = HEAD_DEFAULT;
        }

        E value = data[head++];
        size--;

        return value;
    }

    @Override
    public E peekFront() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }
}
