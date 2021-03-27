package com.github.alexandrenavarro.binarysearchsample;

import java.util.Arrays;

public class BinarySearchDemo {

    public static void main(String[] args) {
        final double[] list = {1.0, 2.0, 3.0};
        System.out.println("value < list[0] " + Arrays.binarySearch(list, 0.5));
        System.out.println("value == list[0] " + Arrays.binarySearch(list, 1.0));
        System.out.println("list[0] < value < list[1] " + Arrays.binarySearch(list, 1.5));
        System.out.println("value == list[1] " + Arrays.binarySearch(list, 2.0));
        System.out.println("list[1] < value < list[2] " + Arrays.binarySearch(list, 2.5));
        System.out.println("value == list[2] " + Arrays.binarySearch(list, 3.0));
        System.out.println("list[2] < value " + Arrays.binarySearch(list, 3.5));
        System.out.println(" ");
        System.out.println("value < list[0] " + binarySearch(list, 0.5));
        System.out.println("value == list[0] " + binarySearch(list, 1.0));
        System.out.println("list[0] < value < list[1] " + binarySearch(list, 1.5));
        System.out.println("value == list[1] " + binarySearch(list, 2.0));
        System.out.println("list[1] < value < list[2] " + binarySearch(list, 2.5));
        System.out.println("value == list[2] " + binarySearch(list, 3.0));
        System.out.println("list[2] < value " + binarySearch(list, 3.5));

        int result = 0;
        int index;
        // Result between index of the list or superior of last one
        if (result < -1) {
            index = -result - 2;
            // Result inferior of the first element
        } else if (result == -1) {
            index = 0;
            // Result in the list
        } else {
            index = result;
        }

        if (result < -1 && result != -list.length - 1) {
            // interpol between 2 points
        } else {
            //
            if (result == -1) {
                index = 0;
            } else if (result == -list.length - 1) {
                index = list.length - 1;
            } else {
                index = result;
            }
        }
    }

    private static int binarySearch(double[] list, double key) {
        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            double midVal = list[mid];
            if (midVal < key) {
                low = mid + 1;
            }
            else if (midVal > key)
                high = mid - 1;
            else {
                if (midVal == key) {
                    return mid;
                }
            }
        }
        return -(low + 1);
    }

}
