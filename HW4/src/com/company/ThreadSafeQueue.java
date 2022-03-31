package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadSafeQueue<T>{
    private Queue<T> threadSafeQueue;
    private Object objLock = new Object();

    //constructor
    public ThreadSafeQueue(){
        threadSafeQueue = new LinkedList<>();
    }

    public void add(T data){
        synchronized (objLock){
            threadSafeQueue.add(data);
        }
    }
    public T remove(){
        synchronized (objLock){
            return threadSafeQueue.remove();
        }
    }

    public T peek(){
        synchronized (objLock){
            return threadSafeQueue.peek();
        }
    }

    public boolean isEmpty(){
        synchronized (objLock){
            return threadSafeQueue.isEmpty();
        }
    }




}
