import java.util.*;
public class SortAsc {    
    public static void main(String[] args) {        
        Scanner get = new Scanner(System.in);    
        //Initialize array     
        int[] arr = new int[20];
        System.out.print("Enter length of input: ");
        int x=get.nextInt();
        int temp = 0;    
        for(int i=1;i<=x;i++){
            System.out.print("Enter value "+i+" : ");
            arr[i]=get.nextInt();
        }    
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 1; i <= x; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 1; i <=x; i++) {     
            for (int j = i; j <= x; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 1; i <=x; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}    
