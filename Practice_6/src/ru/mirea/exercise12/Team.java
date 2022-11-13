package ru.mirea.exercise12;

import java.util.Stack;
import java.util.stream.IntStream;

public class Team {
    private interface Action {
        void undo();
    }

    private final StringBuilder stringBuilder;
    private final Stack<Action> actions = new Stack<>();

    private class DeleteAction implements Action{
        private final int size;
        public DeleteAction(int size) {
            this.size = size;
        }
        public void undo() {
            stringBuilder.delete(
                    stringBuilder.length() - size, stringBuilder.length());
        }
    }

    public Team() {
        stringBuilder = new StringBuilder();
    }

    public Team reverse() {
        stringBuilder.reverse();
        Action action = new Action() {
            public void undo() {
                stringBuilder.reverse();
            }
        };
        actions.add(action);
        return this;
    }

    public Team append(String str) {
        stringBuilder.append(str);
        Action action = new Action(){
            public void undo() {
                stringBuilder.delete(
                        stringBuilder.length() - str.length() -1,
                        stringBuilder.length());
            }
        };
        actions.add(action);
        return this;
    }

    public Team append(boolean b) {
        stringBuilder.append(b);
        Action action = new Action(){
            public void undo() {
                stringBuilder.delete(
                        stringBuilder.length() - Boolean.toString(b).length() -1,
                        stringBuilder.length());
            }
        };
        actions.add(action);
        return this;
    }

    public Team append(char c) {
        stringBuilder.append(c);
        Action action = new Action(){
            public void undo() {
                stringBuilder.delete(
                        stringBuilder.length() - 1 -1,
                        stringBuilder.length());
            }
        };
        actions.add(action);
        return this;
    }

    public Team append(char[] str) {
        stringBuilder.append(str);
        Action action = new Action(){
            public void undo() {
                stringBuilder.delete(
                        stringBuilder.length() - str.length -1,
                        stringBuilder.length());
            }
        };
        actions.add(action);
        return this;
    }

    public Team append(double d) {
        stringBuilder.append(d);
        Action action = new Action(){
            public void undo() {
                stringBuilder.delete(
                        stringBuilder.length() - Double.toString(d).length() -1,
                        stringBuilder.length());
            }
        };
        actions.add(action);
        return this;
    }

    public Team append(float f) {
        stringBuilder.append(f);
        Action action = new Action(){
            public void undo() {
                stringBuilder.delete(
                        stringBuilder.length() - Float.toString(f).length() -1,
                        stringBuilder.length());
            }
        };
        actions.add(action);
        return this;
    }

    public Team append(int i) {
        stringBuilder.append(i);
        Action action = new Action(){
            public void undo() {
                stringBuilder.delete(
                        stringBuilder.length() - Integer.toString(i).length() -1,
                        stringBuilder.length());
            }
        };
        actions.add(action);
        return this;
    }

    public Team append(long l) {
        stringBuilder.append(l);
        Action action = new Action(){
            public void undo() {
                stringBuilder.delete(
                        stringBuilder.length() - Long.toString(l).length() -1,
                        stringBuilder.length());
            }
        };
        actions.add(action);
        return this;
    }

    public Team append(CharSequence s) {
        stringBuilder.append(s);
        Action action = new Action(){
            public void undo() {
                stringBuilder.delete(
                        stringBuilder.length() - s.length() -1,
                        stringBuilder.length());
            }
        };
        actions.add(action);
        return this;
    }

    public Team append(Object obj) {
        stringBuilder.append(obj);
        Action action = new Action(){
            public void undo() {
                stringBuilder.delete(
                        stringBuilder.length() - obj.toString().length() -1,
                        stringBuilder.length());
            }
        };
        actions.add(action);
        return this;
    }

    public Team append(char[] str, int offset, int len) {
        stringBuilder.append(str);
        Action action = new Action(){
            public void undo() {
                stringBuilder.delete(
                        stringBuilder.length() - len -1,
                        stringBuilder.length());
            }
        };
        actions.add(action);
        return this;
    }

    public Team append(CharSequence s, int start, int end) {
        stringBuilder.append(s);
        Action action = new Action(){
            public void undo() {
                stringBuilder.delete(
                        stringBuilder.length() - s.length() -1,
                        stringBuilder.length());
            }
        };
        actions.add(action);
        return this;
    }

    public Team append(StringBuffer sb) {
        stringBuilder.append(sb);
        Action action = new Action(){
            public void undo() {
                stringBuilder.delete(
                        stringBuilder.length() - sb.toString().length() -1,
                        stringBuilder.length());
            }
        };
        actions.add(action);
        return this;
    }

    public Team appendCodePoint(int codePoint) {
        int lengthBefore = stringBuilder.length();
        stringBuilder.appendCodePoint(codePoint);
        actions.add(new DeleteAction(stringBuilder.length() - lengthBefore));
        return this;
    }

    public Team delete(int start, int end) {
        String deleted = stringBuilder.substring(start, end);
        stringBuilder.delete(start, end);
        actions.add(() -> stringBuilder.insert(start, deleted));
        return this;
    }

    public Team deleteCharAt(int index) {
        char deleted = stringBuilder.charAt(index);
        stringBuilder.deleteCharAt(index);
        actions.add(() -> stringBuilder.insert(index, deleted));
        return this;
    }

    public Team replace(int start, int end, String str) {
        String deleted = stringBuilder.substring(start, end);
        stringBuilder.replace(start, end, str);
        actions.add(() -> stringBuilder.replace(start, end, deleted));
        return this;
    }

    public Team insert(int index, char[] str, int offset, int len) {
        stringBuilder.insert(index, str, offset, len);
        actions.add(() -> stringBuilder.delete(index, len));
        return this;
    }

    public Team insert(int offset, String str) {
        stringBuilder.insert(offset, str);
        actions.add(() -> stringBuilder.delete(offset, str.length()));
        return this;
    }

    public Team insert(int offset, boolean b) {
        stringBuilder.insert(offset, b);
        actions.add(() -> stringBuilder.delete(offset, Boolean.toString(b).length()));
        return this;
    }

    public Team insert(int offset, char c) {
        stringBuilder.insert(offset, c);
        actions.add(() -> stringBuilder.delete(offset, 1));
        return this;
    }

    public Team insert(int offset, char[] str) {
        stringBuilder.insert(offset, str);
        actions.add(() -> stringBuilder.delete(offset, str.length));
        return this;
    }

    public Team insert(int offset, double d) {
        stringBuilder.insert(offset, d);
        actions.add(() -> stringBuilder.delete(offset, Double.toString(d).length()));
        return this;
    }

    public Team insert(int offset, float f) {
        stringBuilder.insert(offset, f);
        actions.add(() -> stringBuilder.delete(offset, Float.toString(f).length()));
        return this;
    }

    public Team insert(int offset, int i) {
        stringBuilder.insert(offset, i);
        actions.add(() -> stringBuilder.delete(offset, Integer.toString(i).length()));
        return this;
    }

    public Team insert(int offset, long l) {
        stringBuilder.insert(offset, l);
        actions.add(() -> stringBuilder.delete(offset, Long.toString(l).length()));
        return this;
    }

    public Team insert(int dstOffset, CharSequence s) {
        stringBuilder.insert(dstOffset, s);
        actions.add(() -> stringBuilder.delete(dstOffset, s.length()));
        return this;
    }

    public Team insert(int dstOffset, CharSequence s, int start, int end) {
        stringBuilder.insert(dstOffset, s);
        actions.add(() -> stringBuilder.delete(dstOffset, s.length()));
        return this;
    }

    public Team insert(int offset, Object obj) {
        stringBuilder.insert(offset, obj);
        actions.add(() -> stringBuilder.delete(offset, obj.toString().length()));
        return this;
    }

    public void undo(){
        if(!actions.isEmpty()){
            actions.pop().undo();
        }
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

    public static void main(String[] args){
        Team builder = new Team();
        builder.append("This is just a test ");
        builder.append(" number 1");
        builder.toString();
        System.out.println("\n Before the undo operation: \n" + builder);
        builder.undo();
        System.out.println("\n After the undo operation: \n" + builder);
    }
}
