class sumofArrayElements {
    public static int sumOfArrayElements (int[] arr,int i,int length,int sum)
    {
        if(i == length)
        {
            return sum;
        }
        sum = sum + arr[i];
        return sumOfArrayElements(arr,i+1,length,sum);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int length = arr.length;
        System.out.println(sumOfArrayElements(arr,0,length,0));
    }
}
