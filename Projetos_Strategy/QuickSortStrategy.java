package Projetos_Strategy;

import java.util.ArrayList;
import java.util.Collections;

public class QuickSortStrategy extends SortStrategy {
    @Override
    public void sort(ArrayList<Integer> list){
        System.out.println("-> Iniciando ordenação QuickSort");
        quickSort(list, 0, list.size() - 1);
    }

    private void quickSort(ArrayList<Integer> list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    private int partition(ArrayList<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (list.get(j) <= pivot) {
                i++;
                Collections.swap(list, i, j);
            }
        }
        Collections.swap(list, i + 1, high);

        return i + 1;
    }
}