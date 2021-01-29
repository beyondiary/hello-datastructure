package com.beyondiary.hello.datastructure.array;

/**
 * @author Beyondiary
 * @author <a href="mailto:beyondefined@gmail.com">Mark Chung</a>
 * @date 2021-01-30 00:52
 */
public class Basic {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int[] scores = new int[]{100, 90, 85};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        scores[0] = 95;
        for (final int score : scores) {
            System.out.println(score);
        }

        Array array = new Array(20);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);
        array.add(1, 100);
        System.out.println(array);
        array.addLast(5);
        System.out.println(array);

        array.remove(2);
        System.out.println(array);

        array.removeAllElement(5);
        System.out.println(array);

        array.removeFirst();
        System.out.println(array);

        array.removeLast();
        System.out.println(array);
    }
}
