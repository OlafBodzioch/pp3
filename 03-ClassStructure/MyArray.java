public class MyArray {
    
    static int even(int[] arr)
    {
        int count = 0;
        for (int i=0; i<arr.length ; i++) {
            if(arr[i]%2==0){
                count = count + 1;
            }
            
        }
        return count;
    }

    static int positiveOdd(int[] arr)
    {
        int count = 0;
        for (int i=0; i<arr.length ; i++) {
            if(arr[i]%2==1){
                if(arr[i]>0)  
                    count = count + 1;
                
            }
            
        }
        return count;
    }

    public static int[] different(int[] arr1, int[] arr2)
    {
        int len = arr1.length;

        if(arr1.length<arr2.length)
            len = arr2.length;
        int count = 0;

        int result[];
        result = new int[len];

        for(int i=0; i<arr1.length ; i++)
        {
            
            for(int j=0; j<arr2.length ; j++)
            {
                if (arr1[i]==arr2[j]) 
                {
                    break;    
                }

                if (j==arr2.length-1) 
                {
                    result[count] = arr1[i];
                    count = count+1;    
                }

                

            }

        }

        int result1[];

        result1 = new int[count-1];

        for(int i=0; i<count-1; i++)
        {
            result1[i]=result[i];
        }    

        return result1;
    }

    public static int[] reverse(int[] arr)
    {
        int result[];
        result = new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            result[i]=arr[arr.length-i-1];
        }

        return result;
    }

    //e
    public static void main(String[] args)
    {

        int[] arr = {1,2,3,4,5};
        int[] arr2 = {1,9,6,8};

        System.out.println("even:\n");
        System.out.println(even(arr)+"\n");

        System.out.println("positiveodd:\n");
        System.out.println(positiveOdd(arr)+"\n");

        System.out.println("reverse:\n");
        int [] arrReverse = reverse(arr);

        for(int i=0; i<arrReverse.length;i++)
            System.out.println(arrReverse[i]);



        System.out.println("different:\n");
        int[] arr3 = different(arr, arr2);

        for(int i=0; i<arr3.length;i++)
            System.out.println(arr3[i]);

    }

}
