package ru.babushkina.week3.adtask._main;

import ru.babushkina.week3.adtask.model.Bear;
import ru.babushkina.week3.adtask.util.EventSimulator;

public class _Main {
    public static void main(String[] args) {
        Bear bear = new Bear();
        EventSimulator eventSimulator = new EventSimulator();
        eventSimulator.launchSimulator(bear);
    }
}
