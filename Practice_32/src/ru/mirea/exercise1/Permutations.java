package ru.mirea.exercise1;

public class Permutations {
    public static void main(String[] args) {
        System.out.println("Johnson-Trotter algorithm:");
        int length = 3;
        int[] elements = new int[length];
        for (int i = 1; i <= length; i++) {
            elements[i - 1] = i;
        }
        int[] directories = new int[length];
        for (int i = 1; i <= length; i++) {
            directories[i - 1] = -1;
        }
        int cnt = 1;
        while (true) {
            System.out.print(cnt + ": ");
            for (int element : elements) {
                System.out.print(element + " ");
            }
            System.out.println();
            int position = -1;
            for (int i = 0; i < length; i++) {
                if ((i + directories[i]) > -1 & (i + directories[i]) < length) {
                    if ((elements[i] > elements[directories[i] + i])) {
                        if (position == -1) {
                            position = i;
                        }
                        else if (elements[position] < elements[i]) {
                            position = i;
                        }
                    }
                }
            }
            if (position == -1){
                break;
            }
            for (int i = 0; i < length; i++) {
                if (elements[i] > elements[position]) {
                    directories[i] = -directories[i];
                }
            }
            change(position, elements, directories);
            cnt = cnt + 1;
        }
    }

    public static void change(int id, int[] element, int[] directory) {
        element[id + directory[id]] = element[id] + element[id + directory[id]];
        element[id] = element[id + directory[id]] - element[id];
        element[id + directory[id]] = element[id + directory[id]] - element[id];
        if (!(directory[id] == directory[id + directory[id]])) {
            directory[id] = -directory[id];
            directory[id - directory[id]] = -directory[id - directory[id]];
        }
    }
}
