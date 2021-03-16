package Algorithms;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Locale;

public class CountingDuplicates {
    public static int duplicateCount(String text) {

        char[] array = text.toCharArray();
        int[] count = new int[text.length()-2];
        int k=0;
        for (int i = 0;  i < array.length-1; i++){
            array[i] = Character.toLowerCase(array[i]);
            for(int j=i+1; j<array.length; j++){
                if (array[i] == array[j]){
                    array = ArrayUtils.remove(array, j);
                    count[i] = count[i] + 1;
                    j--;
                }
            }
            if(count[i] != 0){
                k++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(count));
        return k;
    }

}
