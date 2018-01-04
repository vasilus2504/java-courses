package ru.lesson.lesson_12;

/**
 * MultiThread
 *
 * @author Ticau Vasile
 * @since 04.01.2018
 */
public class Counter {
    /**
     * Realizarea clasei Counter
     */
    private int amount;

    /**
     * Incrementare
     * @return incrementul valorii
     */
    public synchronized int increase(){
        amount++;
        return amount;
    }
}
