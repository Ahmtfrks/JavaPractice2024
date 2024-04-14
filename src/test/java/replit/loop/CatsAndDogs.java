package replit.loop;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW
        int cat=0;
        int dog=0;
        for(int i=0;i<str.length()-2;i++){
            String input= str.toLowerCase().substring(i,i+3);


            if(input.equals("cat")){
                cat++;
            }else if(input.equals("dog")){
                dog++;
            }
        }
        if(cat==dog){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

}