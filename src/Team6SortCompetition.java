public class Team6SortCompetition extends SortCompetition{

    public int challengeOne(int[] arr)
    {
        int i = 0;
        int j = arr.length-1;
        int median = 0;
        int[] sortedArr = quickSort(arr,0,arr.length-1);
        while(i != j)
        {
            i++;
            j--;
            if((i+1) == j || (j-1) == i)
            {
                int total = sortedArr[i] + sortedArr[j];
                median = (total/2);
                break;
            }
            else
            {
                median = sortedArr[i];
            }
        }
        return median;
    }

    public int challengeTwo(String[] arr, String query)
    {
        //return index of the first instance of that string, or -1 if not found;
    }

    public int challengeThree(int[] arr)
    {
        //return median;
    }

    public int challengeFour(int[][] arr)
    {
        //return median of the median array;
    }

    public int challengeFive(Comparable[] arr, Comparable query)
    {
        //return position of the object, or -1 if not found;
    }

    public String greeting()
    {
        //return any;
    }

    public int[] quickSort(int[] arr, int left, int right)
    {
        if(left<right)
        {
            int pivot = partition(arr,left,right);
            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }
    }

    public int partition(int[] arr, int left, int right)
    {
        int temp;
        int pivot = arr[right];
        int i = left-1;
        for(int j = left; j<right; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i+1];
        arr[i+1]=arr[right];
        arr[right]=temp;
        return i+1;
    }
}
