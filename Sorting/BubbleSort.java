import java.util.*;
class BubbleSort{

    Swap s=new Swap();
    public static void main(String[] args){

        Scanner inp=new Scanner(System.in);
        BubbleSort bs=new BubbleSort();
        PrintArray p=new PrintArray();
        System.out.print("Enter array Size :");
        int size=inp.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter "+size+" elements : ");
        for(int i=0;i<size;i++){
        	arr[i]=inp.nextInt();
        }
        p.printArray(arr);
        bs.bubbleSort(arr,size);
        System.out.println("\n\t*** After Sorting ***");
        p.printArray(arr);
    }
    void bubbleSort(int arr[],int size){
        int swapped;
        for(int i=0;i<size;i++){
            swapped=0;
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    s.arraySwapping(arr,j,j+1);
                    swapped=1;
                }
            }
            if(swapped==0){
                break;
            }
        }
    }
}