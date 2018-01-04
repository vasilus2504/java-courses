package ru.lesson.lesson_12;

import java.beans.IntrospectionException;
import java.util.LinkedList;

/**
 * Ordinea de blocare
 *
 * @author Ticau Vasile
 * @since 04.01.2018
 */
public class BlockQueue<E> {
    public final LinkedList<E> queue = new LinkedList<E>();

    public void push(final E e){
        synchronized (this.queue){
            this.queue.add(e);
            this.queue.notifyAll();
        }
    }

    public E pool(){
        synchronized (this.queue){
            while (this.queue.isEmpty()){
                try{
                    this.queue.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            return this.queue.remove();
        }
    }
}
