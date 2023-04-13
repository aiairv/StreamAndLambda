package org.example;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
//        Stream API:

//        1. Найти среднее значение чисел в списке:
           List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
           OptionalDouble average = numbers1.stream().mapToInt(s->s).average();
           if(average.isPresent()) {
               System.out.println(average.getAsDouble());
           }

//        2. Получить список квадратов чисел в списке:
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> square = numbers2.stream().map(q-> q*q).collect(Collectors.toList());
        System.out.println(square);

//        3. Отфильтровать элементы списка, оставив только четные числа:
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers3.stream().filter(e->e%2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

//        4. Проверить, содержит ли список число 3:
        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5);
        boolean ifThreeExist = numbers4.stream().anyMatch(i->i == 3);
        System.out.println(ifThreeExist);

//        5. Соединить элементы списка в одну строку через запятую:
        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
        String joined = strings.stream().collect(Collectors.joining(","));
        System.out.println(joined);

//        6. Получить первые три элемента списка:
        List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> threeFirst = numbers6.stream().limit(3).collect(Collectors.toList());
        System.out.println(threeFirst);

//        7. Извлечь из списка все уникальные элементы:
        List<Integer> numbers7 = Arrays.asList(1, 2, 3, 4, 5, 3, 4, 6);
        List<Integer> unique = numbers7.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);

//        8. Найти максимальное значение в списке:
        List<Integer> numbers8 = Arrays.asList(1, 2, 3, 4, 5);
        int max = numbers8.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);

//        9. Отсортировать список в обратном порядке:
        List<Integer> numbers9 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> reversedSoring = numbers9.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reversedSoring);

//        Лямбда-выражение:

//        1. Напишите лямбда-выражение, которое умножает каждый элемент списка на 2.
        List<Integer> numbers11 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> multiplyToTwo = numbers11.stream().map(a->a*2).collect(Collectors.toList());
        System.out.println(multiplyToTwo);

//        2. Напишите лямбда-выражение, которое находит сумму двух чисел.
         BinaryOperator<Integer> sum12 = (a, b)->a+b;

//        3. Напишите лямбда-выражение, которое возвращает True, если переданное число больше 10.
         Predicate<Integer> isMoreThanTen = j->j>10;

//        4. Напишите лямбда-выражение, которое возвращает True, если переданная строка содержит более 5 символов.
         Predicate<String> lengthIsMoreThanFive = k->k.length()>5;

//        5. Напишите лямбда-выражение, которое возвращает длину переданной строки.
        Function<String, Integer> stringLength = t-> t.length();

//        6. Напишите лямбда-выражение, которое возвращает квадрат переданного числа.
        UnaryOperator<Integer> square16 = l->l*l;

//        7. Напишите лямбда-выражение, которое возвращает сумму элементов списка.
        Function<List<Integer>, Integer> sum17 = v -> v.stream().mapToInt(Integer::intValue).sum();

//        8. Напишите лямбда-выражение, которое возвращает True, если переданная строка начинается с буквы "A"
        Predicate<String> firstIsA = f->f.startsWith("A");

//        9. Напишите лямбда-выражение, которое возвращает список квадратов элементов исходного списка
        Function<List<Integer>, List<Integer>> square19 = g->g.stream().map(c->c*c).collect(Collectors.toList());
    }
}