import java.util.Scanner;

/*
In this section we will see how to find last occurrence of any given number in array.
________________________________________________________________________________________
Question : write a program to find last occurrence of given element of x in array.
_______________________________________________________________________________________
Approach : first we take user from input as in from of x then we will match it to array and when it meeter than we
           will simply print it.
 */
public class LastOccurrenceOfnElement {
    static int lastOccurrence(int arr[] ,int x){
        int index = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                index = i ;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :" );
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Now the length of array :" + a);
        System.out.println("Now enter the number you wish as a value in array :");
        for (int i =0;i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.println("Now print the value of array : " + i);
            //System.out.println("Now print the value of array : " + arr[i]);
        }
        System.out.println("Enter the number you wish to check the last occurrence : ");
        int x = sc.nextInt();
        System.out.println("Now printing the last index of given array : " + lastOccurrence(arr , x));
    }
}
