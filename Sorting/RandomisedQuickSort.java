import java.util.*;
class RandomisedQuickSort{

    Swap s=new Swap();
    //PrintArray p=new PrintArray();
    public static void main(String[] args){

        Scanner inp=new Scanner(System.in);
        RandomisedQuickSort rqs=new RandomisedQuickSort();
        PrintArray p=new PrintArray();
        System.out.print("Enter array Size :");
        int size=inp.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter "+size+" elements : ");
        for(int i=0;i<size;i++){
        	arr[i]=inp.nextInt();
        }
        p.printArray(arr);
        rqs.quickSort(arr,0,size-1);
        System.out.println("\n\t*** After Sorting ***");
        p.printArray(arr);
    }

    void quickSort(int arr[],int low,int high){

    	if(low<high){
    		int pivotIndex=partition(arr,low,high);
    		quickSort(arr,low,pivotIndex-1);
    		quickSort(arr,pivotIndex+1,high);
    	}
    }
    int partition(int arr[],int low,int high){
        
        System.out.println("1st pivot="+high);
        //Random rand=new Random(); 
        //int random=rand.nextInt(high-low) + low;
        int random=(int)(Math.random()*(high-low))+low;
        s.arraySwapping(arr,random,high);
        System.out.println("2nd pivot="+high);
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
        	if(arr[j]<=pivot){
        		i=i+1;
        		s.arraySwapping(arr,i,j);
        	}
        }
        s.arraySwapping(arr,i+1,high);
        return(i+1);
    }
}