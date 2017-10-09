/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;
import searching.BinarySearch;

/**
 *
 * @author root
 */
public class EntryPoint {

    public static void main(String... args) {
//        {
////      Binary Search Test
//            final int[] arr = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
////        Selection Sort Test
//            SelectionSort.sort(arr);
////        Display sorted list
//            System.out.println(Arrays.toString(arr));
//        }
        {
//      Binary Sort Test
            final int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            Integer searchIndex = BinarySearch.search(10, arr);
            System.out.println("Binary Search, search index: " + searchIndex);
        }
    }

}
