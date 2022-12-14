package ru.mirea.exercise1;

import java.util.Stack;

public class Tree {
    public Node root;
    public int dir = 1;

    public Tree() {
        root = null;
    }

    public void addNode(int value) {
        Node cur = root;
        if (root == null) {
            root = new Node(value);
        }
        else {
            while (true) {
                if (dir == 1) {
                    if (cur.getData() == value) {
                        return;
                    }
                    else {
                        if (cur.getData() > value) {
                            if (cur.nextL == null) {
                                cur.nextL = new Node(value);
                                cur.nextL.setPrev(cur);
                                return;
                            }
                            else {
                                cur = cur.nextL;
                            }
                        }
                        else {
                            if (cur.nextR == null) {
                                cur.nextR = new Node(value);
                                cur.nextR.setPrev(cur);
                                return;
                            }
                            else {
                                cur = cur.nextR;
                            }
                        }
                    }
                }
                else {
                    if (cur.getData() == value) {
                        return;
                    }
                    else {
                        if (cur.getData() > value) {
                            if (cur.nextR == null) {
                                cur.nextR = new Node(value);
                                cur.nextR.setPrev(cur);
                                return;
                            }
                            else {
                                cur = cur.nextR;
                            }
                        }
                        else {
                            if (cur.nextL == null) {
                                cur.nextL = new Node(value);
                                cur.nextL.setPrev(cur);
                                return;
                            }
                            else {
                                cur = cur.nextL;
                            }
                        }
                    }
                }
            }
        }
    }

    public int height() {
        return height(root);
    }

    private int height(Node cur) {
        int h1 = 0;
        int h2 = 0;
        if (cur == null) {
            return 0;
        }
        if (cur.nextL != null) {
            h1 = height(cur.nextL);
        }
        if (cur.nextR != null) {
            h2 = height(cur.nextR);
        }
        return(Math.max(h1, h2) + 1);
    }

    public void reverse() {
        dir = -dir;
        reverse(root);
    }

    private void reverse(Node cur) {
        Node temp;
        if (cur != null) {
            if ((cur.nextL != null) & (cur.nextR != null)) {
                temp = cur.nextL;
                cur.nextL = cur.nextR;
                cur.nextR = temp;
                reverse(cur.nextL);
                reverse(cur.nextR);
            }
            else if ((cur.nextL != null) & (cur.nextR == null)) {
                cur.nextR = cur.nextL;
                cur.nextL = null;
                reverse(cur.nextR);
            }
            else if ((cur.nextL == null) & (cur.nextR != null)) {
                cur.nextL = cur.nextR;
                cur.nextR = null;
                reverse(cur.nextL);
            }
        }
    }

    public String lookup(int target) {
        return lookup(root, target);
    }

    private String lookup(Node cur, int target) {
        if (cur == null) {
            return "No";
        }
        else {
            if (target == cur.data) {
                return "Yes";
            }
            else {
                if (dir == 1) {
                    if (target < cur.data) {
                        return (lookup(cur.nextL, target));
                    }
                    else {
                        return (lookup(cur.nextR, target));
                    }
                }
                else {
                    if (target < cur.data) {
                        return (lookup(cur.nextR, target));
                    }
                    else {
                        return (lookup(cur.nextL, target));
                    }
                }
            }
        }
    }

    public int getMaxWidth()
    {
        int maxWdth = 0;
        for (int i = 1; i <= this.height(); i++) {
            if (this.getWidth(i) > maxWdth) {
                maxWdth = this.getWidth(i);
            }
        }
        return maxWdth;
    }

    public int getWidth(int level) {
        return getWidth(root, level);
    }

    private int getWidth(Node root,int level) {
        if (root == null) {
            return 0;
        }
        if (level == 1) {
            return 1;
        }
        else if (level > 1) {
            return getWidth(root.nextL, level - 1) + getWidth(root.nextR, level - 1);
        }
        else {
            return 0;
        }
    }

    public void printTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int gaps = (int)Math.pow(2, height());
        boolean isRowEmpty = false;
        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for (int j = 0; j < gaps; j++) {
                System.out.print(" ");
            }
            while (globalStack.isEmpty() == false) {
                Node temp = (Node)globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.getData());
                    localStack.push(temp.nextL);
                    localStack.push(temp.nextR);
                    if (temp.nextL != null || temp.nextR != null) {
                        isRowEmpty = false;
                    }
                }
                else {
                    System.out.print("__");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < gaps * 2 - 2; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            gaps = gaps / 2;
            while (localStack.isEmpty() == false) {
                globalStack.push(localStack.pop());
            }
        }
    }
}
