class Demo
{
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int N = arr.length;
        int M = 5;

        System.out.println(findMinDiff(arr, N, M));
    }
    public static long findMinDiff (int[] a, int n, int m)
    {
        sortarr(a);
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i + m - 1 < n; i++){
            int diff = a[i + m -1] - a[i];
            if(diff < min){
                min = diff;
            }
        }
        return min;
    }
    
    public static void sortarr(int[] arr){
        boolean swaped = false;
        for(int i = 0; i < arr.length -1; i++){
            swaped = false;
            for(int j = i + 1; j < arr.length -i -1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }
        }
    }
    
    
}