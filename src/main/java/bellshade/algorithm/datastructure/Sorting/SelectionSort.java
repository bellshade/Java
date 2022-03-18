package bellshade.algorithm.datastructure.Sorting;

// Selection Sort adalah metode pengurutan yang mengimplementasikan nested loop
// Struktur Data: Array
// Time Complexity menjadi O(n^2)


class SelectionSort {

	void selectionSort(int arr[], int n) { 
		if (n <= 1) {
			return;
		}

        // Menyimpan indeks dengan nilai terkecil pd for loop dalam
		int min_index = 0;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			min_index = i;
			printArr(arr, n);
	    	for (int j = i; j < n; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
		    }
            // Jika elemen pada loop luar lebih besar dari yang di dalam maka tukar posisinya
	    	if (arr[i] > arr[min_index]) {
				temp = arr[i];
				arr[i] = arr[min_index];
				arr[min_index] = temp;
	    	}
	    }
	}

	void printArr(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int n = 5;
		int arr[] = new int[n];
		arr[0] = 4;
		arr[1] = 1;
		arr[2] = 3;
		arr[3] = 9;
		arr[4] = 7;
		SelectionSort ss = new SelectionSort();
		ss.selectionSort(arr, n);
	}

}
