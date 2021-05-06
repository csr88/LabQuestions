import java.util.Scanner;
class LabArray9 {

   public static int secondbig(int[] number){
       int temp,secondb;
       int length = number.length;

       for (int i=0;i<length;i++){
           for (int j=i+1;j<length;j++){
               if (number[i]>number[j]){
                   temp = number[j];
                   number[j] = number[i];
                   number[i] = temp;
               }
           }
       }
       secondb = number[length-2];
       return secondb;
   }






    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int count = sc.nextInt();

        int[] arr =new int[count];

        System.out.println("Enter the array elements: ");
        for (int i=0;i<count;i++){
            arr[i] = sc.nextInt();
        }
        int sb = secondbig(arr);
        System.out.println("\nSecond largest element in the array: " + sb );

    }
}
