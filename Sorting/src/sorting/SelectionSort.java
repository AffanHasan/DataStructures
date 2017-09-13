/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author root
 */
public class SelectionSort {

    //Sorts the int array
    static void sort(int... arr) {
        int[] firstSmallestItem;
        int secondSmallestItemIndex;
        for (int c = 0; c < (arr.length - 1); c++) {//This loop will run arrayLength - 1 times
            firstSmallestItem = new int[]{//At loop start consider the left most item as the smallest & and also consider it as the second smallest item also
                secondSmallestItemIndex = c, //index
                arr[c]//value
            };
            for (int c1 = c; c1 < arr.length; c1++) {//Search for smallest item
               if( arr[c1] < arr[secondSmallestItemIndex] ){
                   secondSmallestItemIndex = c1;
               }
            }
            //swap second smallest item with the left most item in the current iteration
            arr[ firstSmallestItem[0] ] = arr[secondSmallestItemIndex];
            arr[ secondSmallestItemIndex ] = firstSmallestItem[1];
        }
    }
}