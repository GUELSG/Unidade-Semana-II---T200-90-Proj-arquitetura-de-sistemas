package Projetos_Strategy;

import java.util.ArrayList;
import java.util.Collections;

public class HeapSort extends SortStrategy {
    @Override
    public void sort(ArrayList<Integer> list){
        System.out.println("-> Iniciando ordenação HeapSort");
        int n = list.size();

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            Collections.swap(list, 0, i);
            heapify(list, i, 0);
        }
    }

    private void heapify(ArrayList<Integer> list, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && list.get(left) > list.get(largest)) {
            largest = left;
        }

        if (right < n && list.get(right) > list.get(largest)) {
            largest = right;
        }

        if (largest != i) {
            Collections.swap(list, i, largest);
            heapify(list, n, largest);
        }
    }
}