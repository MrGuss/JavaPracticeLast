package ru.mirea.exercise2;

import java.util.Iterator;
import java.util.List;

public class NewIterator<T> implements Iterator<T> {
    public int pointer = 0;
    public List<T> list;

    public NewIterator(List<T> list){
        this.list = list;
    }

    @Override
    public boolean hasNext(){
        return this.pointer < this.list.size();
    }

    @Override
    public T next(){
        return this.list.get(this.pointer++);
    }
}
