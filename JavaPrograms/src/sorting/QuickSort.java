package sorting;

public class QuickSort {

    public static int partition(int[] a, int l, int h) {
        int pivot = a[l];
        int i = l;
        int j = h;

        while (i < j) {
            while (i <= j && a[i] <= pivot) {
                i++;
            }
            while (j >= i && a[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(a, i, j);
            }
        }

        swap(a, l, j); // place pivot in correct position
        return j;
    }

    static void swap(int[] a, int l, int h) {
        int temp = a[l];
        a[l] = a[h];
        a[h] = temp;
    }

    public static void sort(int a[], int l, int h) {
        if (l < h) {
            int pivot = partition(a, l, h);
            sort(a, l, pivot - 1);
            sort(a, pivot + 1, h);
        }
    }

    public static void main(String[] args) {
        int a[] = { 4, 2, 6, 4, 9, 5, 7, 2 };

        sort(a, 0, a.length - 1);

        for (int b : a) {
            System.out.print(b + " ");
        }
    }
}
