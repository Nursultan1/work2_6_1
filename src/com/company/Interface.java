package com.company;

public interface Interface<T> {
    abstract void runner(Object distance, Number speed);

    public interface Runnable<T, S> {
        public void runner(T distance, S speed);

    }
}
