package practice_8;

/**
 * Class of queue with added functionality:<br>
 *     <ul>
 *         <li>Removing element from any place of queue by its value;</li>
 *         <li>Moving element <i>(find in queue by value)</i> to the end of queue.</li>
 *     </ul><br>
 *     At all other sides it is simply {@link WaitList}.
 * @param <E> Type of stored data.
 * @see WaitList
 * @author Doronin Konstantin
 * @version 1.0
 */
public class UnfairWaitList<E> extends WaitList<E>{

    /**
     * Constructor - creates empty queue.
     * @see WaitList#WaitList()
     */
    public UnfairWaitList() {
        super();
    }

    /**
     * Method for removing element from queue by its value.
     * @param element Value for search and removing.
     * @see WaitList#remove()
     */
    public void remove(E element) {
        content.remove(element);
    }

    /**
     * Method for moving element to the end of queue.<br>
     *     Uses {@link UnfairWaitList#remove(Object)} and <i>(if something was removed)</i> {@link WaitList#add(Object)}.
     * @throws IllegalStateException {@link WaitList#content} is empty.
     * @param element Value to move.
     */
    public void moveToBack(E element){
        if (isEmpty()) {throw new IllegalStateException("UnfairWaitList is empty!");}
        remove(element);
        content.add(element);
    }
}
