package com.company;

public class Marathon <T,S extends Number>   implements  Interface{
    private T distance;
    private S speed;

    public Marathon(T distance, S speed) {
        this.distance = distance;
        this.speed = speed;
    }

    public T getDistance() {
        return distance;
    }

    public S getSpeed() {
        return speed;
    }


    @Override
    public void runner(Object distance, Number speed) {


    }
}
