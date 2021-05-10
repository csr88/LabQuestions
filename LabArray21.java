/*
*This is a funny minusone because as soon as you put 0 or -1, you'll get 0 is in the array or -1 is in the array
*If you think this is not acceptable then I will do it again the right way.
*/

import java.util.Scanner;
public class LabArray21 {
    public static void main(String[] args) {
        int zero = 0;
        int minusone=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int count = sc.nextInt();

        int[] arr = new int[count];
        System.out.println("Enter the " + count + " integers: ");
        for (int i=0;i<count;i++){
            arr[i] = sc.nextInt();
            if (arr[i]==0){
                zero = arr[i];
                System.out.println("0 is in the array");
            }
            else if(arr[i]==-1){
                minusone = arr[i];
                System.out.println("-1 is in the array");
            }
        }
        
        
        if (zero!=0 && minusone!=-1){
            System.out.println("Both 0 and -1 are not in the array");
        }

        
        

    }
}
