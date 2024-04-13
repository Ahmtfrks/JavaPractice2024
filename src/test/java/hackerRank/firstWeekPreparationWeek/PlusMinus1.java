package hackerRank;

import java.util.*;

import static java.util.stream.Collectors.joining;

class Loop {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter integer value between 0-100 ");
        int n = scanner.nextInt();

        if (n <= 0 || n > 100) {
            System.exit(-1);
        }

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("please enter integer value between -100 till +100 ");
            int  input = scanner.nextInt();//1, 1, 0, -1, -1
            if (input>100 || input<-100){
                System.exit(-1);
            }
            arr1[i] =input;




        }
        //arr-arr1-arr2


        // int[] arr1 = {1, 1, 0, -1, -1};

        /*
        1-kullanicidan n tane sayi al. n o 0 ile 100 esit arasinda
        array tanimla ve icine  n tane sayi koy,  arrayin icindeki sayilar -100 ile 100 olacak
        ilk once negatif zero pozitif tanimla
        for loop ile dondur her birini kontrol et eger negatif ise negatife ekle
         zero ise zeroya ekle pozitif ise pozitide ekle (kontrol et -100 ile 100 arasinda mi)
         negatif toplam syisi bolu n, pozitif bolu n, zero bolu
          sonuc direk ekrandan*/


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

        double positiveRatio = (double) positiveCount / n;
        double negativeRatio = (double) negativeCount / n;
        double zeroRatio = (double) zeroCount / n;

        System.out.printf("%.6f\n", positiveRatio);
        System.out.printf("%.6f\n", negativeRatio);
        System.out.printf("%.6f\n", zeroRatio);

        //-100 till 100 write one array
        // dondur her bir arrayi n=index i=arrrayin variable
        //int[] arr1= {3,4,5,6,7};
//0.400000
//0.400000
//0.200000
    }


}



