package Projetos_Strategy;

import java.util.ArrayList;

public class MyList {
    private SortStrategy strategy;
    private ArrayList<Integer> data;

    public MyList(){
        this.strategy = new QuickSortStrategy();
        this.data = new ArrayList<>();
    }

    public void add(int element) {
        this.data.add(element);
    }

    public void setSortStrategy( SortStrategy strategy){
        this.strategy = strategy;
    }

    public void sort(){
        System.out.print("Dados antes da ordenação:  ");
        printData();

        strategy.sort(this.data);

        System.out.print("Dados após a ordenação:   ");
        printData();
        System.out.println("---");
    }

    public void printData(){
        System.out.println(data.toString());
    }
}