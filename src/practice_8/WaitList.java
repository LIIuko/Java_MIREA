package practice_8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;


/**
 * Base class WaitList with base functionality and minimum needed field - {@link WaitList#content} for storing data.
 * @param <E> Type of stored data.
 * @see IWaitList
 * @author Doronin Konstantin
 * @version 1.0
 */
public class WaitList<E> implements IWaitList<E>{

    /**
     * Field for storing data. FIFO queue from standard library.
     */
    protected ConcurrentLinkedQueue<E> content;

    /**
     * Constructor - creating new object with empty data queue.
     * @see WaitList#WaitList(Collection)
     */
    public WaitList() {
        content = new ConcurrentLinkedQueue<>();
    }

    /**
     * Constructor - creating new object with data from some collection.
     * @param c Collection with data to store.
     * @see WaitList#WaitList()
     */
    public WaitList(Collection<E> c) {
        content = new ConcurrentLinkedQueue<>(c);
    }

    /**
     * Method to add element at the end of queue.
     * @param element Value to be added.
     * @see IWaitList#add(Object)
     * @see ConcurrentLinkedQueue#add(Object)
     */
    @Override
    public void add(E element) {
        content.add(element);
    }

    /**
     * Method to remove first element of the queue.
     * @return Removed element.
     * @throws IllegalStateException {@link WaitList#content} is empty.
     * @see IWaitList#remove()
     * @see ConcurrentLinkedQueue#remove()
     */
    @Override
    public E remove() {
        if (isEmpty()) {throw new IllegalStateException("Queue is empty!");}
        return content.remove();
    }

    /**
     * Method to check, is value equal to element in queue. Difficulty - O(n).
     * @param element Value for search.
     * @return True - element find, false - not find.
     * @see IWaitList#contains(Object)
     */
    @Override
    public boolean contains(E element) {
        for (E el: content){
            if (el.equals(element)){
                return true;
            }
        }
        return false;
    }

    /**
     * Method to check, are all values equal to elements of collection in queue.<br>
     *     If <i>c</i> has two equal elements, both will be find in {@link WaitList#content} by one element.
     * @param c Collection with values for search.
     * @return True - founded all elements, false - some element was not found.
     * @see IWaitList#containsAll(Collection)
     */
    @Override
    public boolean containsAll(Collection<E> c) {
        for(E el: c){
            boolean flag = false;
            for(E elContent: content){
                if (el.equals(elContent)) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {return false;}
        }
        return true;
    }

    /**
     * Method to check, is {@link WaitList#content} empty.
     * @return True - {@link WaitList#content} has no elements, false - no any element in it.
     * @see IWaitList#isEmpty()
     * @see ConcurrentLinkedQueue#isEmpty()
     */
    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    /**
     * Method to get information about this list in String type.
     * @return String-value of this list.
     */
    @Override
    public String toString() {
        String string = "WaitList{\n";
        for (E el: content){
            string += "  " + el + "\n";
        }
        return string.substring(0, string.length() - 1) + "\n}";
    }
}
