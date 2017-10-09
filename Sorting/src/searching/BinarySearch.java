/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

/**
 *
 * @author root
 */
public class BinarySearch {

    public static Integer search(int searchValue, int... sortedArr) {
        int lowerBound = 0;
        int upperBound = sortedArr.length - 1;
        int pivot;
        while (true) {
            pivot = ( lowerBound + upperBound ) / 2;//Set the pivot to middle
            System.out.println("--- Pivot: " + pivot);
            if(sortedArr[pivot] == searchValue ) {//if pivot matches then retun it
              return pivot;
            }else if(lowerBound > upperBound){// if no element is found
                return null;
            }else if(sortedArr[pivot] < searchValue){//Element lies in upper bound
                lowerBound = pivot + 1;
            }else{//element lies in lower bound
                upperBound = pivot - 1;
            }
        }
    }

}
