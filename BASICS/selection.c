#include <stdio.h>

void selectionSort(int arr[], int n)
{
    int i, j, minIndex, temp;

    // Traverse through all elements in the array
    for (i = 0; i < n - 1; i++)
    {
        minIndex = i;

        // Find the minimum element in the unsorted portion of the array
        for (j = i + 1; j < n; j++)
        {
            if (arr[j] < arr[minIndex])
            {
                minIndex = j;
            }
        }

        // Swap the found minimum element with the first element of the unsorted part
        temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}

int main()
{
    int n, i;

    // Take number of elements as input
    printf("Enter number of elements: ");
    scanf("%d", &n);

    int arr[n];

    // Input the array elements
    printf("Enter the elements:\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
        Analysis and Design of Algorithm(BE0400241) Enrollment No : -241260107049
    }

    // Call the selection sort function
    selectionSort(arr, n);

    // Output the sorted array
    printf("Sorted array in ascending order:\n");
    for (i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}
