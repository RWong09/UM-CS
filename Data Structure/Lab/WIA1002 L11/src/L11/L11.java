/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L11;

/**
 *
 * @author HP
 */
public class L11 {
    public static void main(String[] args) {
        int[] neg={45,7,2,8,19,3};
        selectionSortSmallest(neg);
        System.out.print("Smallest selection sort: ");
        for(int Wong:neg){
            System.out.print(Wong+" ");
        }
        System.out.println();
        
        selectionSortLargest(neg);
        System.out.print("Largest selection sort: ");
        for(int Wong:neg){
            System.out.print(Wong+" ");
        }
        System.out.println();
        
        int[] JW={10,34,2,56,7,67,88,42};
        insertionSort(JW);
        System.out.print("Insertion sort for another array: ");
        for(int i=0;i<JW.length;i++){
            System.out.print(JW[i]+" ");
        }
        System.out.println();
    }
    
    public static void selectionSortSmallest(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex])
                    minindex=j;
            }
            
            if(minindex!=i){
                int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;
            }
        }
    }
    
    public static void selectionSortLargest(int[] arr){
        for(int i=0;i<arr.length;i++){
            int maxindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[maxindex])
                    maxindex=j;
            }
            
            if(maxindex!=i){
                int temp=arr[i];
                arr[i]=arr[maxindex];
                arr[maxindex]=temp;
            }
        }
    }
    
    public static void insertionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int j;
            for(j=i-1;j>=0 && current<arr[j];j--)
                arr[j+1]=arr[j];
            arr[j+1]=current;
        }
    }
}
