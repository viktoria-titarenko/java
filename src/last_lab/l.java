package last_lab;

import java.util.LinkedList;
import java.util.Scanner;

public class l {
    public static void main(String[] args) {
        teacher Ivanov = new teacher("Иванов");
        teacher Petrov = new teacher("Петров");
        teacher Sidorov = new teacher("Сидоров");
        teacher Komarov = new teacher("Комаров");
        lesson math1 = new lesson("математика", "25/12/2021", "лек");
        lesson math2 = new lesson("математика", "28/12/2021", "лаб");
        lesson math3 = new lesson("математика", "30/12/2021", "Пр");
        lesson inf = new lesson("информатика", "15/12/2021", "лек");
        lesson inf2 = new lesson("информатика", "26/12/2021", "лаб");
        lesson inf3 = new lesson("информатика", "29/12/2021", "Пр");
        lesson AIS = new lesson("ais", "15/12/2021", "лек");
        lesson AIS2 = new lesson("ais", "20/12/2021", "лаб");
        lesson AIS3 = new lesson("ais", "23/12/2021", "Пр");
        lesson java = new lesson("java", "13/12/2021", "лек");
        lesson java2 = new lesson("java", "18/12/2021", "лаб");
        lesson java3 = new lesson("java", "20/12/2021", "Пр");
        lesson pascal = new lesson("pascal", "13/12/2021", "лек");
        lesson pascal2 = new lesson("pascal", "17/12/2021", "лаб");
        lesson pascal3 = new lesson("pascal", "23/12/2021", "Пр");
        lesson python = new lesson("python", "15/12/2021", "лек");
        lesson python2 = new lesson("python", "19/12/2021", "лаб");
        lesson python3 = new lesson("python", "21/12/2021", "Пр");
        lesson vba = new lesson("вба", "19/12/2021", "лек");
        lesson vba2 = new lesson("вба", "22/12/2021", "лаб");
        lesson vba3 = new lesson("вба", "27/12/2021", "Пр");
        lesson ISIS = new lesson("исис", "17/12/2021", "лек");
        lesson ISIS2 = new lesson("исис", "20/12/2021", "лаб");
        lesson ISIS3 = new lesson("исис", "24/12/2021", "Пр");
        lesson history = new lesson("история", "19/12/2021", "лек");
        lesson history2 = new lesson("история", "23/12/2021", "лек");
        lesson history3 = new lesson("история", "24/12/2021", "Пр");
        lesson physics = new lesson("физика", "14/12/2021", "лек");
        lesson physics2 = new lesson("физика", "17/12/2021", "лаб");
        lesson physics3 = new lesson("физика", "19/12/2021", "Пр");
        lesson geometry = new lesson("геометрия", "16/12/2021", "лек");
        lesson geometry2 = new lesson("геометрия", "19/12/2021", "лаб");
        lesson geometry3 = new lesson("геометрия", "26/12/2021", "Пр");
        lesson OOP = new lesson("ооп", "13/12/2021", "Пр");
        lesson OOP2 = new lesson("ооп", "17/12/2021","лек");
        lesson OOP3 = new lesson("ооп", "20/12/2021","лаб");
        Ivanov.lessons.add(math1);
        Ivanov.lessons.add(math2);
        Ivanov.lessons.add(math3);
        Ivanov.lessons.add(inf);
        Ivanov.lessons.add(inf2);
        Ivanov.lessons.add(inf3);
        Ivanov.lessons.add(AIS);
        Ivanov.lessons.add(AIS2);
        Ivanov.lessons.add(AIS3);
        Petrov.lessons.add(java);
        Petrov.lessons.add(java2);
        Petrov.lessons.add(java3);
        Petrov.lessons.add(pascal);
        Petrov.lessons.add(pascal2);
        Petrov.lessons.add(pascal3);
        Petrov.lessons.add(python);
        Petrov.lessons.add(python2);
        Petrov.lessons.add(python3);
        Sidorov.lessons.add(vba);
        Sidorov.lessons.add(vba2);
        Sidorov.lessons.add(vba3);
        Sidorov.lessons.add(ISIS);
        Sidorov.lessons.add(ISIS2);
        Sidorov.lessons.add(ISIS3);
        Sidorov.lessons.add(history);
        Sidorov.lessons.add(history2);
        Sidorov.lessons.add(history3);
        Komarov.lessons.add(physics);
        Komarov.lessons.add(physics2);
        Komarov.lessons.add(physics3);
        Komarov.lessons.add(geometry);
        Komarov.lessons.add(geometry2);
        Komarov.lessons.add(geometry3);
        Komarov.lessons.add(OOP);
        Komarov.lessons.add(OOP2);
        Komarov.lessons.add(OOP3);
        LinkedList<teacher> teachers = new LinkedList<teacher>();
        teachers.add(Ivanov);
        teachers.add(Petrov);
        teachers.add(Sidorov);
        teachers.add(Komarov);
        System.out.println("Добрый день, выберите номер вашей фамилию");

        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(i + 1 + " " + teachers.get(i).Last_name + " ");
        }
        Scanner scanner = new Scanner(System.in);
        int teacher_number = scanner.nextInt();
        System.out.println("Напишите название предмета, котрый хотите провести.");
        LinkedList<String> Lessons_repeat = teachers.get(teacher_number - 1).predmet();
        for (int q = 0; q < Lessons_repeat.size(); q++) {
            System.out.println(Lessons_repeat.get(q));
        }
        String predmet = "";
        int k = 0;
        LinkedList<String> date = new LinkedList<>();
        do {
            predmet = scanner.next();
            for (int e = 0; e < teachers.get(teacher_number - 1).lessons.size(); e++) {
                if (teachers.get(teacher_number - 1).lessons.get(e).NameLesson.contains(predmet)) {
                    k = 2; break;
                } else {
                    k = 1;
                }
            }
            if (k == 1) {
                System.out.println("Данные введены некорректно, попробуйте еще раз");
            }
        } while (k == 1);

        if (k == 2) {
            for (int y = 0; y < teachers.get(teacher_number - 1).lessons.size(); y++) {
                if (predmet.contains(teachers.get(teacher_number - 1).lessons.get(y).NameLesson)) {
                    date.add(teachers.get(teacher_number - 1).lessons.get(y).DateLesson);
                }
            }
        }
        System.out.println("Выберете дату");
        for (int i1 = 0; i1 < date.size(); i1++) {
            System.out.println(i1 + 1 + " " + date.get(i1));
        }
        int index_date = scanner.nextInt();
        System.out.println("Пара будет проходить в очном формате? y/n");
        String in_person = scanner.next();
        if (in_person.contains("y")) {
            System.out.println("Преподаватель: " + teachers.get(teacher_number - 1).Last_name + System.lineSeparator()
                    + "Название предмета: "+ predmet + System.lineSeparator() +
                    "Тип пары: " + teachers.get(teacher_number-1).lessons.get(index_date-1).Type +
                    System.lineSeparator() + "Дата проведения занятия: " + date.get(index_date - 1) +
                    System.lineSeparator() + "Пара будет проведена очно");
        }
        else {
            System.out.println("Пара будет проведена с использованием ЭИОС? y/n");
            String remote = scanner.next();
            if (remote.contains("y")) {
                System.out.println("Преподаватель: " + teachers.get(teacher_number - 1).Last_name + System.lineSeparator()
                        + "Название предмета :"+ predmet + System.lineSeparator() +
                        "Тип пары: " + teachers.get(teacher_number-1).lessons.get(index_date-1).Type +
                        System.lineSeparator() + "Дата проведения занятия: " + date.get(index_date - 1) +
                        System.lineSeparator() + "Пара будет проведена дистанционно: https://eios.tspu.edu.ru/login/" );
            } else {
                System.out.println("Отправьте ссылку, по которой будетете проводить занятие");
                String link = scanner.next();
                System.out.println("Преподаватель: " + teachers.get(teacher_number - 1).Last_name + System.lineSeparator()
                        + "Название предмета: "+ predmet + System.lineSeparator() +
                        "Тип пары: " + teachers.get(teacher_number-1).lessons.get(index_date-1).Type +
                        System.lineSeparator() + "Дата проведения занятия: " + date.get(index_date - 1) +
                        System.lineSeparator() + "Пара будет проведена дистанционно: " + link);
            }
        }

    }
}
class teacher {
    public teacher(String last_name) {
        Last_name = last_name;
    }

    LinkedList<lesson> lessons = new LinkedList<>();
    String Last_name;

    public LinkedList<String> predmet() {
        LinkedList<String> Lessons_without_repeat = new LinkedList<>();
        for (int j = 0; j < lessons.size(); j++) {
            if (Lessons_without_repeat.contains(lessons.get(j).NameLesson)) continue;
            else {
                Lessons_without_repeat.add(lessons.get(j).NameLesson);
            }
        }
        return Lessons_without_repeat;
    }
}

class lesson {
    String Type;
    String NameLesson;
    String DateLesson;

    public lesson(String nameLesson, String dateLesson, String type) {
        NameLesson = nameLesson;
        DateLesson = dateLesson;
        Type = type;
    }
}
