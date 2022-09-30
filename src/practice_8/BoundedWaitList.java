package practice_8;

/**
 * Class of queue with constant max {@link BoundedWaitList#capacity}.
 * @param <E> Type of stored data.
 * @see IWaitList
 * @see WaitList
 * @author Doronin Konstantin
 * @version 1.0
 */
public class BoundedWaitList<E> extends WaitList<E>{

    /**
     * Field for maximum capacity of the queue.
     */
    private int capacity;

    /**
     * Constructor - creating new object without any data and with maximum capacity.
     * @param capacity Maximum {@link BoundedWaitList#capacity} of queue.
     * @see WaitList#WaitList()
     * @throws IllegalArgumentException Maximum capacity equal or below zero.
     */
    public BoundedWaitList(int capacity) {
        if(capacity <= 0) throw new IllegalArgumentException("The maximum capacity must be greater than 0! Value received: " + capacity);
        this.capacity = capacity;
    }

    /**
     * Method to get property {@link BoundedWaitList#capacity}
     * @return Value of {@link BoundedWaitList#capacity}
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Method to add element into queue (at end).
     * @param element Value to be added.
     * @throws IllegalStateException Queue is full: reached maximum {@link BoundedWaitList#capacity}
     * @see WaitList#add(Object)
     */
    @Override
    public void add(E element) {
        if (content.size() == capacity){
            throw new IllegalStateException("BoundedWaitList is full!");
        }
        content.add(element);
    }

    @Override
    public String toString() {
        String string = "BoundedWaitList{\ncapacity=" + capacity+",\ncomponents=";
        for (E el: content){
            string += "  " + el + "\n";
        }
        return string.substring(0, string.length() - 1) + "\n}";
    }
}
