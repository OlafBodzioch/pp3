public class Arrays {
 
    public static boolean arr(int[] arr1, int[] arr2)
    {
        int count1 = 0;
        int count2 = 0;

        for (int i : arr1)
        {
            if(i>=10 && i<=99)
                count1++;
        }

        for (int j : arr2)
        {
            if(j>=10 && j<=99)
                count2++;
        }

        if(count1 == count2)
            return true;
        else 
            return false;

    }
    
    public static void main(String[] args) {
        
        int[] arr1 = {15,8,2,37,49,117};
        int[] arr2 = {9,6,7,12,48,4,6,90,5};
        System.out.println(arr(arr1,arr2));


    }

}
