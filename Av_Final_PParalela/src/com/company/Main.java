package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;


class Main implements Callable<String>{

    ExecutorService executor = Executors.newFixedThreadPool(10);

    ExecutorService executorService =
            new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,
                    new LinkedBlockingQueue<Runnable>());


    @Override
    public String call() throws Exception {
        return null;
    }

    public interface Callable<V> {
        V call() throws Exception;
    }

    Callable<String> callableTask = () -> {
        TimeUnit.MILLISECONDS.sleep(300);
        return "Task's execution";
    };

    List<Callable<String>> callableTasks = new ArrayList<>();



    /* Main - Driver Code */

    public static String ordenarString(String inicial) {

        char tempArray[] = inicial.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static void main(String[] args) {

        String inicial = "Eu gosto da computação e sou bom aluno. " +
                "Faço as atividades e sempre pratico em casa. " +
                "Hoje tenho com uma prova para estudar.";
        String saida = ordenarString(inicial).trim();

        System.out.println("Entrada : " + inicial);
        System.out.println("Saída   : " + saida);
    }
}
