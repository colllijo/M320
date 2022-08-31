public class QuickSort
{
    public static void quickSortRaceTimes(Ship[] arr) {quickSortRaceTimes(arr, 0, arr.length - 1);}

    public static void quickSortRaceTimes(Ship[] arr, int low, int high)
    {
        if (low < high)
        {
            int pi = partitionRaceTimes(arr, low, high);

            quickSortRaceTimes(arr, low, pi - 1);
            quickSortRaceTimes(arr, pi + 1, high);
        }
    }

    public static int partitionRaceTimes(Ship[] arr, int low, int high)
    {
        int pivot = arr[high].getTime();
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {
            if (arr[j].getTime() < pivot)
            {
                i++;
                swapShips(arr, i, j);
            }
        }
        swapShips(arr, i + 1, high);
        return (i + 1);
    }

    static void swapShips(Ship[] arr, int i, int j)
    {
        Ship temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
