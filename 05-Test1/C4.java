public class C4 {
    
    public static int even(int[] x)
    {

        int count = 0;

        for(int i=0; i<x.length;i++)
        {
            if (x[i]%2==0) 
            {
                count = count+1;    
            }
        }

        return count;

    }

    public static int positiveOdd(int[] x)
    {

        int count = 0;

        for(int i=0; i<x.length;i++)
        {
            if (x[i]%2==1 && x[i]>0) 
            {
                count = count+1;    
            }
        }

        return count;

    }

    public static void main(String[] args) {
        
        int[] arr1 = {2,-6,5,8};
        int[] arr2 = {3,2,-5,4,1,-7}; 
        System.out.println(C4.even(arr1));
        System.out.println(C4.positiveOdd(arr2));


    }

}
