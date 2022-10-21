public class Task_2 implements Task_2_base {
    @Override
    public int subtask_1_while(int num) {
        // Найти максимальное число, являющееся полным квадратом,
        // не превосходящее заданное натуральное num
        int i = 0;
        while (Math.pow(i,2) <= num)
            i++;
        return i;
    }

    @Override
    public int subtask_2_while(int num) {
        // Последовательность целых чисел p(n) определяется следующим образом:
        // p(0) = 1
        // p(k) = 2 * p(k - 1) + 6, k > 0
        //Найти элемент последовательности с номером num
        int function = 1;
        int save_box = 1;
        for (int i = 1; i <= num; i++ ){
            save_box = function;
            function = 2*save_box+6;
        }
        return 0;
    }

    @Override
    public boolean subtask_3_while(int num, int base) {
        // Проверить, является ли число num натуральной степенью числа base
        int i = 1;
        int base2 = base;
        while (num > base2){
            base2 *= base;
            i++;
        }
        if (Math.pow(base,i) == num)
            System.out.println("num является натуральной степенью числа base");
        else
            System.out.println("num не является натуральной степенью числа base");
        return false;

    }

    @Override
    public int subtask_4_while(int start, int end) {
        // Вычислить, за какое минимальное число операций
        // вычесть 1
        // поделить на 2
        // число start можно превратить в end. Гарантируется, что start >= end >= 1

        int i = 0;
        while (start > end) {
            if (start % 2 == 0 && start / 2 > end)
                start /= 2;
            else
                start -= 1;
            i++;
        }
        System.out.println(i+"минимальное кол-во раз");
        return 0;
    }
}
