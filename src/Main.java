//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    static int Partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int pivotIndex = low-1;

        for (int i = low; i <= high-1; i++)
        {
            if (arr[i] < pivot)
            {
                pivotIndex++;
                Swap(arr, i, pivotIndex);
            }
        }

        Swap(arr, pivotIndex+1, high);
        return pivotIndex+1;
    }

    private static void Swap(int[] arr, int i, int pivotIndex)
    {
        int temp = arr[i];
        arr[i] = arr[pivotIndex];
        arr[pivotIndex] = temp;
    }


    static void QuickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int partitioningIndex = Partition(arr, low, high);
            QuickSort(arr, low, partitioningIndex-1);
            QuickSort(arr, partitioningIndex+1, high);
        }
    }
    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args)
    {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int N = arr.length;

        // Function call
        QuickSort(arr, 0, N - 1);
        System.out.println("Sorted array:");
        printArr(arr);
    }
}