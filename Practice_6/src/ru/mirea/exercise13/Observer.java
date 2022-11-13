package ru.mirea.exercise13;

import java.util.stream.IntStream;

interface OnStringBuilderChangeListener {
    void onChange(Observer stringBuilder);
}

public class Observer {
    private OnStringBuilderChangeListener onChangeListener;
    private final StringBuilder stringBuilder;

    public void setOnChangeListener(OnStringBuilderChangeListener onChangeListener) {
        this.onChangeListener = onChangeListener;
    }

    public Observer() {
        stringBuilder = new StringBuilder();
    }

    private void notifyOnStringBuilderChangeListener(){
        if(onChangeListener != null){
            onChangeListener.onChange(this);
        }
    }

    public Observer append(Object obj) {
        stringBuilder.append(obj);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer append(boolean b) {
        stringBuilder.append(b);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer append(char c) {
        stringBuilder.append(c);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer append(char[] str) {
        stringBuilder.append(str);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer append(double d) {
        stringBuilder.append(d);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer append(float f) {
        stringBuilder.append(f);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer append(int i) {
        stringBuilder.append(i);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer append(long l) {
        stringBuilder.append(l);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer append(CharSequence s) {
        stringBuilder.append(s);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer append(String str) {
        stringBuilder.append(str);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer append(char[] str, int offset, int len) {
        stringBuilder.append(str, offset, len);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer append(CharSequence s, int start, int end) {
        stringBuilder.append(s, start, end);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer append(StringBuffer sb) {
        stringBuilder.append(sb);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer appendCodePoint(int codePoint) {
        stringBuilder.appendCodePoint(codePoint);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public int capacity() {
        return stringBuilder.capacity();
    }

    public char charAt(int index) {
        return stringBuilder.charAt(index);
    }

    public IntStream chars() {
        return stringBuilder.chars();
    }

    public int codePointAt(int index) {
        return stringBuilder.codePointAt(index);
    }

    public int codePointBefore(int index) {
        return stringBuilder.codePointBefore(index);
    }

    public int codePointCount(int beginIndex, int endIndex) {
        return stringBuilder.codePointCount(beginIndex, endIndex);
    }

    public IntStream codePoints() {
        return stringBuilder.codePoints();
    }

    public Observer delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer deleteCharAt(int index) {
        stringBuilder.deleteCharAt(index);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public void ensureCapacity(int minimumCapacity) {
        stringBuilder.ensureCapacity(minimumCapacity);
    }

    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        stringBuilder.getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    public int indexOf(String str) {
        return stringBuilder.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        return stringBuilder.indexOf(str, fromIndex);
    }

    public Observer replace(int start, int end, String str) {
        stringBuilder.replace(start, end, str);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer insert(int index, char[] str, int offset, int len) {
        stringBuilder.insert(index, str, offset, len);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer insert(int offset, boolean b) {
        stringBuilder.insert(offset, b);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer insert(int offset, char c) {
        stringBuilder.insert(offset, c);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer insert(int offset, char[] str) {
        stringBuilder.insert(offset, str);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer insert(int offset, double d) {
        stringBuilder.insert(offset, d);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer insert(int offset, float f) {
        stringBuilder.insert(offset, f);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer insert(int offset, int i) {
        stringBuilder.insert(offset, i);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer insert(int offset, long l) {
        stringBuilder.insert(offset, l);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer insert(int dstOffset, CharSequence s) {
        stringBuilder.insert(dstOffset, s);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer insert(int dstOffset, CharSequence s, int start, int end) {
        stringBuilder.insert(dstOffset, s, start, end);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer insert(int offset, Object obj) {
        stringBuilder.insert(offset, obj);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public Observer insert(int offset, String str) {
        stringBuilder.insert(offset, str);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public int lastIndexOf(String str) {
        return stringBuilder.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return stringBuilder.lastIndexOf(str, fromIndex);
    }

    public int length() {
        return stringBuilder.length();
    }

    public int offsetByCodePoints(int index, int codePointOffset) {
        return stringBuilder.offsetByCodePoints(index, codePointOffset);
    }

    public Observer reverse() {
        stringBuilder.reverse();
        return this;
    }

    public void setCharAt(int index, char ch) {
        stringBuilder.setCharAt(index, ch);
    }

    public void setLength(int newLength) {
        stringBuilder.setLength(newLength);
    }

    public CharSequence subSequence(int start, int end) {
        return stringBuilder.subSequence(start, end);
    }

    public String substring(int start) {
        return stringBuilder.substring(start);
    }

    public String substring(int start, int end) {
        return stringBuilder.substring(start, end);
    }

    public void trimToSize() {
        stringBuilder.trimToSize();
    }

    public String toString() {
        return stringBuilder.toString();
    }
}

class Listener implements OnStringBuilderChangeListener {
    public void onChange(Observer stringBuilder) {
        System.out.println("CHANGED: " + stringBuilder.toString());
    }
}

class Main {
    public static void main(String[] args) {
        Observer observer = new Observer();
        observer.setOnChangeListener(new Listener());
        observer.append("This is just a test");
        observer.append(" number ");
        observer.append(1);
    }
}
