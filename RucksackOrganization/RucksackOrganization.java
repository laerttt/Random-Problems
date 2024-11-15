import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.sql.Types.NULL;

public class RucksackOrganization {
    public static void main(String[] args) throws FileNotFoundException {
        //Part 1
        Part1();
        //Part 2
        Part2();
    }
    static char[] returnArr(String s) {        //Method to return a string to an array
        StringBuilder array = new StringBuilder(s);
        char[]arr = new char[array.length()];
        for(int i=0; i<array.length(); i++){
            arr[i] = array.charAt(i);
        }
        return arr;
    }
    static char findBadge(char[]arr){
        int i=0;
        for(; i<arr.length/2;i++){
            for (int j=(arr.length/2)+1; j<arr.length; j++){
                if(arr[i] == arr[j])
                    return arr[i];
            }
        }
        return 0;
    }
    static int numericEquivalent(char c){
        char[]arr= {
                'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
                'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
                 };
        for(int i=0; i<arr.length; i++){
            if(c==arr[i])
                return i+1;
        }
        return NULL;
    }
    static void Part1() throws FileNotFoundException{
        File file = new File("input.txt");
        Scanner input = new Scanner(file);
        int sum=0;
        while(input.hasNext())
            sum+= numericEquivalent(findBadge(returnArr(input.next())));
        System.out.println(sum);
    }
    static void Part2() throws FileNotFoundException{
        File file = new File("input.txt");
        Scanner input = new Scanner(file);
        int sum=0;
        char found=0;

        while(input.hasNextLine()){
            char[] arr1 = returnArr(input.next());
            System.out.println(arr1);
            char[] arr2 = returnArr(input.next());
            System.out.println(arr2);
            char[] arr3 = returnArr(input.next());
            System.out.println(arr3);
            for (char value : arr1) {
                for (char item : arr2) {
                    if (value == item) {
                        for (char element : arr3) {
                            if (item == element)
                                found = element;
                        }
                    }
                }
            }
            sum += numericEquivalent(found);
        }
        System.out.print(sum);
    }
}


