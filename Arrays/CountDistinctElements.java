package arrays;

public class CountDistinctElements {
    public static void main(String[] args) {

        int[] arr = {20,1,6,3,6,22,5,2,3,6,2,5,2,5,6,3,25,3,2,5,2,5,2256,2,5,26};

        System.out.println(countDistinct(arr));

    }
    static int countDistinct(int[] arr)
    {
        int count = 0 ;

        for(int i = 0 ; i<arr.length ;i++)
        {
            boolean flag = false;

            for(int j = 0 ; j<i ;j++)
            {
                if(arr[i] == arr[j])
                {
                    flag = true;
                    break;
                }
            }
            if(flag == false)
            {
                count++;
            }
        }
        return count;
    }
}
