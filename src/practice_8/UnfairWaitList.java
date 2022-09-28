package practice_8;

public class UnfairWaitList<E> extends WaitList<E>{

    public UnfairWaitList() {
    }

    public void remove(E element) {
        content.remove(element);
    }

    /**
     * Перемещает элемент в конец очереди
     * */
    public void moveToBack(E element){
        content.remove(element);
        content.addLast(element);
    }
}
