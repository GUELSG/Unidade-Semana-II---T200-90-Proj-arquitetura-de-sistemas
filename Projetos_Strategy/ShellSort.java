package Projetos_Strategy;

import java.util.ArrayList;

public class ShellSort extends SortStrategy {
    @Override
    public void sort(ArrayList<Integer> list){
        System.out.println("-> Iniciando ordenação ShellSort");
        int n = list.size();

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = list.get(i);
                int j;

                for (j = i; j >= gap && list.get(j - gap) > temp; j -= gap) {
                    list.set(j, list.get(j - gap));
                }
                list.set(j, temp);
            }
        }
    }
}