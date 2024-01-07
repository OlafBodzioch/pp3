public class Logic {
    
    private boolean[] arr;

    public Logic(boolean[] arr) {
        this.arr = arr;
    }

    public int different()
    {

        int i = 0;
        int count = 0;
                
        for (boolean b : arr) 
        {
            if(i==0 || i==arr.length-1)
                i++;
            else
            {
                if(arr[i-1]!=arr[i] && arr[i]!=arr[i+1])
                    count++;
                i++;
            }

        }

        return count;
        
    }

}
