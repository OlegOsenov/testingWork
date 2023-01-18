package GBlesson_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sample04 {

    public static void main(String[] args) {

        String[] students = {
                "Григорьев Анатолий 4 5 2",
                "Фокин Глеб 1 5 2",
                "Шестаков Клим 4 3 2",
                "Хохлов Мартин 2 5 2",
                "Шубин Лазарь 4 5 2",
                "Соколов Илья 1 1 3",
                "Иванов Иван 5 5 5"
        };

        proccesStatistics(students);

    }

    public static void proccesStatistics(String[] students) {

        HashMap<Float, ArrayList<Student>> statistics = new HashMap<>();


        for (String s : students) {

            String[] parts = s.split(" ");
            int a = Integer.parseInt(parts[2]);
            int b = Integer.parseInt(parts[3]);
            int c = Integer.parseInt(parts[4]);
            float r = (float) (a + b + c) / 3;

            if (statistics.containsKey(r)) {
                ArrayList<Student> lst = statistics.get(r);
                lst.add(new Student(parts[1], parts[0], r));
            } else {
                ArrayList<Student> lst = new ArrayList<>();
                lst.add(new Student(parts[1], parts[0], r));
                statistics.put(r, lst);
            }

        }

        TreeMap<Float, ArrayList<Student>> sortedStatistics = new TreeMap<>(statistics);

        System.out.println("ТОП 3 худших студента: ");
        int counter = 1;

        for (Map.Entry<Float,ArrayList<Student>> element : sortedStatistics.entrySet()){
            System.out.printf("\n%d место - средний бал: %f\n\n", counter,element.getKey());
            for (Student student : element.getValue()){
                System.out.printf("%s %s\n", student.getSurname(),student.getName());
            }
            counter++;
            if (counter > 3)
                break;
        }



    }

}
