import java.util.Arrays;

public class Queshion2 {

    // (Q1)Sort an array in wave form
    void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }
    void sortInWave(int arr[],int n){
        Arrays.sort(arr);

        for (int i = 0; i <n-1 ; i+=2) {
            swap(arr,i,i+1);

        }
    }

    public static void main(String[] args) {
        Queshion2 ob = new Queshion2();
        int arr[]={10,321,16,11,115,1,6444,4,45,878};
        int n = arr.length;
        ob.sortInWave(arr,n);
        for (int i :arr)
            System.out.println(i +" ");
    }

}
