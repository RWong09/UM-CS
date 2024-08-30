/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T7;

/**
 *
 * @author HP
 */
public class Q3_Q4_Q5 {
    /**Q3:
     * a) 1 4 5 2 3
     * b) No. Since when 1 is printed but 2 is not printed, 2 is enqueued, whereas 3 is printed and 4 is not
     *    printed but enqueued. Lastly, 5 is printed. Thus the queue will be: [2,4]. The output will be 
     *    1 3 5 2 4.
     * c) true true true true true
     *    true true true true false
     *    true true false false false
     * 
     * Q4:
     * a) 5
     * b) 7
     * c) 7 removed
     * d) 9
     * 
     * Q5:

        import java.util.LinkedList;

        class Queue<E> {
            LinkedList<E> list = new LinkedList<>();

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public E peek() {
            return list.getFirst();
        }

        public boolean contains(E e) {
            return list.contains(e);
        }
    }
     */
}
