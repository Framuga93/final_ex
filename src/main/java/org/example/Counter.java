package org.example;

public class Counter implements AutoCloseable{
    private int count = 0;

    public Counter start() {
        count++;
        return this;
    }

    public void add() {
        count++;
    }

    @Override
    public void close() throws Exception {
        if (count != 1) {
            throw new Exception("Invalid usage: Counter should be used in try-with-resources block");
        }
    }
}
