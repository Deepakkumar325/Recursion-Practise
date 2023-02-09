public class printArray {
    static void printArray(int[] arr, int idx){
        // base case
        if(idx == arr.length){
            return;
        }
        // self work
        System.out.println(arr[idx]); // 5
        // recursive work - sub problem
        printArray(arr, idx+1); // 6, 7, 8
    }

    

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
//         
         printArray(arr, 0);
    }
}