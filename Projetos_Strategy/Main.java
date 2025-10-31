package Projetos_Strategy;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static void setupAndSort(MyList ml, List<Integer> initialData) {
        for (int val : initialData) {
            ml.add(val);
        }
        ml.sort();
    }

    public static void main(String[] args) {

        List<Integer> initialData = Arrays.asList(5, 2, 8, 1, 9, 4, 7, 3, 6);

        System.out.println("=== Padrão Strategy com Algoritmos Reais ===");

        // 1. Teste QuickSort
        MyList ml1 = new MyList();
        System.out.println("\n[Teste 1] Estratégia Inicial (QuickSort):");
        setupAndSort(ml1, initialData);

        // 2. Teste ShellSort
        MyList ml2 = new MyList();
        SortStrategy shells = new ShellSort();
        ml2.setSortStrategy(shells);
        System.out.println("[Teste 2] Muda para ShellSort:");
        setupAndSort(ml2, initialData);

        // 3. Teste HeapSort
        MyList ml3 = new MyList();
        SortStrategy heaps = new HeapSort();
        ml3.setSortStrategy(heaps);
        System.out.println("[Teste 3] Muda para HeapSort:");
        setupAndSort(ml3, initialData);
    }
}