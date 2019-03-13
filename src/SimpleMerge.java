/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int a=0, b=0, n=0;

        int[]arr=new int[arr1.length+arr2.length];
        while(a<arr1.length&&arr2.length){
            if(arr1[a]<arr2[b]){
                arr[n]=arr1[a];
                n++;
                a++;
            }
            else{
                arr[n]=arr2[b];
                n++;
                b++;
            }
        }
if(a>b){
    while(b<arr2.length){
        arr[n]=arr2[b];
        n++;
        b++;
    }
    else{
        while(a<arr1.length){
            arr[n]=arr1[a];
            n++;
            a++;
        }
    }
    return arr;
}
    }

}
