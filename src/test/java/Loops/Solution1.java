package Loops;

import java.io.*;
import java.math.*;
import java.security.*;
import java.sql.Array;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {

        /*
        1-kullanicidan n tane sayi al. n o 0 ile 100 esit arasinda
        array tanimla ve icine  n tane sayi koy,  arrayin icindeki sayilar -100 ile 100 olacak
        ilk once negatif zero pozitif tanimla
        for loop ile dondur her birini kontrol et eger negatif ise negatife ekle
         zero ise zeroya ekle pozitif ise pozitide ekle (kontrol et -100 ile 100 arasinda mi)
         negatif toplam syisi bolu n, pozitif bolu n, zero bolu
          sonuc direk ekrandan*/

        int n = 5;
        int[] arr1 = {1, 1, 0, -1, -1};
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < 0) {
                negativeCount++;
            } else if (arr1[i] == 0) {
                zeroCount++;

            } else if (arr1[i] > 0) {
                positiveCount++;
            }
        }
        double negativeRatio = (double) negativeCount / n;
        double positiveRatio = (double) positiveCount / n;
        double zeroRatio = (double) zeroCount / n;

        System.out.println(negativeRatio);
        System.out.println(positiveRatio);
        System.out.println(zeroRatio);

        //-100 till 100 write one array
        // dondur her bir arrayi n=index i=arrrayin variable
        //int[] arr1= {3,4,5,6,7};
    }

}

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
