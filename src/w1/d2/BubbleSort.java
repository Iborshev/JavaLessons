package w1.d2;

/**
 * Класс для реализации алгоритма сортировки массива целых чисел.
 * В данной реализации используется сортировка пузырьком.
 */
public class BubbleSort {

    /**
     * Метод для сортировки массива целых чисел методом пузырька.
     *
     * @param array Массив целых чисел для сортировки.
     * @throws IllegalArgumentException Если входной массив равен null.
     */
    public void sort(Integer[] array) throws IllegalArgumentException {
        if (array == null) {
            throw new IllegalArgumentException("Входной массив не может быть null.");
        }

        for (Integer element : array) {
            if (element == null) {
                throw new IllegalArgumentException("Элементы массива не могут быть null.");
            }
        }

        // Процесс сортировки пузырьком
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;

            // Проходим по массиву, сравнивая элементы попарно
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмен элементов
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    // Устанавливаем флаг, что был обмен
                    swapped = true;
                }
            }

            // Если в текущем проходе не было обменов, массив отсортирован
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Метод для печати массива на экран.
     *
     * @param array Массив целых чисел для печати.
     */
    public void printArray(Integer[] array) {
        if (array == null) {
            System.out.println("Массив пуст.");
            return;
        }
        for (Integer number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
