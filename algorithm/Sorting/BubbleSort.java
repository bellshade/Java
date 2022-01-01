// Bubble sort adalah algoritma pengurutan
// Cara kerjanya adalah melakukan komparasi elemen yang bersebelahan
// Jika elemen kiri lebih besar dari yang di kanan maka tukar posisinya
// Struktur Data: Array
// Time Complexity: O(n^2)


class BubbleSort
{
    void bubbleSort(int arr[], int n)
    {
        if (n <= 1) {
            return;
        }

        System.out.print("Before: ");
        printArr(arr, n);

        int decreasedSize = n - 1;
        int i = 0;
        int loop = 1;
        while (loop <= decreasedSize*n) {
            // Jika elemen kiri lebih besar dari yang di kanan maka tukar posisinya
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            // increment akan kembali ke 0 jika mencapai n - 1
            // Ini dilakukan sampai looping ke n*n
            i = (i + 1) % decreasedSize;
            loop++;
        }

        System.out.print("After: ");
        printArr(arr, n);
    }

    void printArr(int arr[], int n)
    {
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        BubbleSort bs = new BubbleSort();
        int n = 5;
        int[] arr = new int[n];
        arr[0] = 4;
        arr[1] = 1;
        arr[2] = 3;
        arr[3] = 9;
        arr[4] = 7;
        bs.bubbleSort(arr, n);
    }
}
