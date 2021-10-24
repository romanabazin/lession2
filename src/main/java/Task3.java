public class Task3 {
    public static void main(String[] args){
        int [] arr =  {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for( int i=0; i<=arr.length-1; i++) {
            if (arr[i] <6) System.out.println(arr[i] * 2);
            else System.out.println(arr[i]);
        }
    }
}
