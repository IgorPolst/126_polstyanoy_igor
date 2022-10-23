public class Task_3 implements Task_3_base {
    @Override
    public int subtask_1_for(int n1, int n2, int a, int b) {
        // подсчитать, сколько чисел, кратных a, но не кратных b,
        // находится между числами n1 и n2 включительно
        int i = 0
        for (n1 <= n2){
            if (n1 %a == 0 && n1%b != 0)
                i++;
            n1++;
        }
        System.out.println(number+" чисел находиться между n1 и n2");
        return 0;
    }

    @Override
    public int subtask_2_for(int num) {
        // Последовательность чисел строится следующим образом:
        // сначала идет одна единица,
        // потом две двойки,
        // потом три тройки,
        // ...
        // потом n раз число n
        // ...
        // Найти, какое число будет находиться в этой последовательности
        // на позиции num
        int number = 0;
        int position = 0;
        for (int i = 1; num > position; i++)
        {
            position +=i;
            number = i;
        }
        System.out.println("На позиции"+ num +"стоит число "+ number);
        return 0;
    }

    @Override
    public int subtask_3_for(int num, int d, int cnt) {
        // Дана последовательность
        // a(0) = num
        // a(n) = a(n - 1) * d + 1
        // Найти сумму первых cnt элементов последовательности
        int sum = 0;
        int function = num;
        for (int i = 0; sum > i; i++ ){
            sum += function;
            num = function;
            function = num*d+1;
        }
        System.out.println("Сумма элементов = " + sum);

        return 0;
    }

    @Override
    public int subtask_4_for(int n) {
        // Вычислить сумму
        // S(n) = 1 + 1 * 2 + 1 * 2 * 3 + ... + n!
        // для заданного n
        // (n! - это n-факториал. Кто не знает - гуглите)
        int sum =0;
        for (int i = 1; i <= n; i++){
            int mult = 1;
            for(int j = 1; j <= i; j++)
                mult *=j;
            sum +=mult;
        }
        System.out.println("Факториал числа "+ n + " = " + sum);
        return 0;
    }
}
