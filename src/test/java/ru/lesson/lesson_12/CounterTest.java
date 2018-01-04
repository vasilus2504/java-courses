package ru.lesson.lesson_12;

import org.junit.Test;

import java.io.Reader;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void increase() throws InterruptedException{
        final Counter counter = new Counter();
        final List<Reader> readers = Arrays.asList(
                new Reader(counter),new Reader(counter),new Reader(counter),new Reader(counter),new Reader(counter),
                new Reader(counter),new Reader(counter),new Reader(counter),new Reader(counter),new Reader(counter));
        for(final Reader reader : readers){
            reader.start();
        }

        Thread.sleep(10001);
        assertEquals(1001, counter.increase());
    }

    private static final class Reader extends Thread{
        private final Counter counter;

        public Reader(Counter counter){
            this.counter = counter;
        }

        @Override
        public void run(){
            for (int i=0; i!=100; ++i){
                System.out.format("%s : %s\n", Thread.currentThread().getId(), this.counter.increase());
            }
        }

    }
}