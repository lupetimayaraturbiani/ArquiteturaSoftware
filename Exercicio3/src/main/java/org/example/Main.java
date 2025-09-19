package org.example;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {5, 3, 8, 4, 2};

        Ordenador ordenador = new Ordenador(new InsertionSort());
        ordenador.ordenar(vetor);
        System.out.println("Insertion Sort: " + java.util.Arrays.toString(vetor));

        vetor = new int[]{5, 3, 8, 4, 2};

        ordenador.setStrategy(new SelectionSort());
        ordenador.ordenar(vetor);
        System.out.println("Selection Sort: " + java.util.Arrays.toString(vetor));

        vetor = new int[]{5, 3, 8, 4, 2};

        ordenador.setStrategy(new BubbleSort());
        ordenador.ordenar(vetor);
        System.out.println("Bubble Sort: " + java.util.Arrays.toString(vetor));
    }
}