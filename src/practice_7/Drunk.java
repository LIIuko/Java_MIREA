package practice_7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Drunk {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList();
        LinkedList<Integer> linkedList2 = new LinkedList();
        ArrayDeque<Integer> arrayDeque1 = new ArrayDeque<>();
        ArrayDeque<Integer> arrayDeque2 = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            //linkedList1.addLast(scanner.nextInt());
            arrayDeque1.add(scanner.nextInt());
        }
        for (int i = 0; i < 5; i++){
            //linkedList2.addLast(scanner.nextInt());
            arrayDeque2.add(scanner.nextInt());
        }
        //gameDoubleList(linkedList1, linkedList2);
        gameDequeue(arrayDeque1, arrayDeque2);
    }

    private static void gameDoubleList(LinkedList<Integer> deck1, LinkedList<Integer> deck2){
        int count = 0;
        while(!deck1.isEmpty() && !deck2.isEmpty()){
            if(deck1.peekFirst() > deck2.peekFirst() || (deck1.peekFirst() != 9 && deck1.peekFirst() != 0)){
                deck1.addLast(deck2.peekFirst());
                deck1.addLast(deck1.peekFirst());
                deck1.removeFirst();
                deck2.removeFirst();
            } else if(deck1.peekFirst() < deck2.peekFirst() || (deck1.peekFirst() != 0 && deck1.peekFirst() != 9)){
                deck2.addLast(deck1.peekFirst());
                deck2.addLast(deck2.peekFirst());
                deck2.removeFirst();
                deck1.removeFirst();
            }
            count++;
            if(deck1.isEmpty()){
                System.out.println("first " + count);
                return;
            }
            if(deck2.isEmpty()){
                System.out.println("second " + count);
                return;
            }
            if(count == 106){
                System.out.println("botva");
                return;
            }
        }
    }

    private static void gameDequeue(ArrayDeque<Integer> deck1, ArrayDeque<Integer> deck2){
        int count = 0;
        while(!deck1.isEmpty() && !deck2.isEmpty()){
            if(deck1.peekFirst() > deck2.peekFirst() || (deck1.peekFirst() != 9 && deck1.peekFirst() != 0)){
                deck1.addLast(deck2.peekFirst());
                deck1.addLast(deck1.peekFirst());
                deck1.removeFirst();
                deck2.removeFirst();
            } else if(deck1.peekFirst() < deck2.peekFirst() || (deck1.peekFirst() != 0 && deck1.peekFirst() != 9)){
                deck2.addLast(deck1.peekFirst());
                deck2.addLast(deck2.peekFirst());
                deck2.removeFirst();
                deck1.removeFirst();
            }
            count++;
            if(deck1.isEmpty()){
                System.out.println("first " + count);
                return;
            }
            if(deck2.isEmpty()){
                System.out.println("second " + count);
                return;
            }
            if(count == 106){
                System.out.println("botva");
                return;
            }
        }
    }
}
