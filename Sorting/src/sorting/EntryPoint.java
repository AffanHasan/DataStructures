/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;

/**
 *
 * @author root
 */
public class EntryPoint {
    
    public static void main(String... args){
        final int[] arr = new int[]{10,9,8,7,6,5,4,3,2,1,0};
        SelectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
