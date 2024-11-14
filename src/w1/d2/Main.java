package w1.d2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Создаем объект для сортировки
        BubbleSort sorter = new BubbleSort();

        // Создаем массив из 300 случайных чисел
        Integer[] array = new Integer[1000];
        Random rand = new Random();

        // Заполняем массив случайными числами от 1 до 1000
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000) + 1;  // Число от 1 до 1000
        }


        // Печатаем исходный массив
        System.out.println("Исходный массив:");
        sorter.printArray(array);

        try {
            // Сортируем массив
            sorter.sort(array);

            // Печатаем отсортированный массив
            System.out.println("Отсортированный массив:");
            sorter.printArray(array);
        } catch (IllegalArgumentException e) {
            // Обработка исключений
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}

