package homework10;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Colors.values()));

        Weekday weekday = Weekday.MONDAY;
        printWeekDays(weekday);

        Student student1 = new Student();
        student1.setGrade(5);
        Student student2 = new Student();
        student2.setGrade(10);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        for (Student list : studentList) {
            System.out.println(list);
        }
        System.out.println();

        PhoneBook book = new PhoneBook();
        boolean isExit = false;
        Scanner scanChoice = new Scanner(System.in);
        Scanner scanAdd1 = new Scanner(System.in);
        Scanner scanAdd2 = new Scanner(System.in);
        Scanner scanSearch = new Scanner(System.in);
        Scanner scanUpdate1 = new Scanner(System.in);
        Scanner scanUpdate2 = new Scanner(System.in);



        while (!isExit) {
            System.out.println(
                    "Press 1 to list numbers" + "\n" +
                            "Press 2 to add new phone number" + "\n" +
                            "Press 3 to find number" + "\n" +
                            "Press 4 to update info" + "\n" +
                            "Press 0 to exit"
            );

            int choice = scanChoice.nextInt();


            switch (choice) {
                case 1 -> {
                    book.printBook();
                }
                case 2 -> {
                    System.out.println("Enter your phone number");
                    String add1 = scanAdd1.nextLine();
                    System.out.println("Enter name");
                    String add2 = scanAdd2.nextLine();
                    book.addBook(add1,add2);
                }
                case 3 -> {
                    System.out.println("Enter the subscriber's name for search");
                    String search = scanSearch.nextLine();
                    book.findBook(search);
                }
                case 4 -> {
                    System.out.println("Enter the number of the subscriber to be updated");
                    String update1 = scanUpdate1.nextLine();
                    System.out.println("Enter a new name");
                    String update2 = scanUpdate2.nextLine();
                    book.updateBookName(update1, update2);
                }
                case 0 -> {
                    isExit = true;
                    System.out.println("You have left the main menu");
                }
                default -> {
                    System.out.println("The entered value is incorrect");
                }
            }

        }

        ArrayListColors colors = new ArrayListColors();
        colors.addList("Green", "Yellow","Purple");
        colors.printList();

        //Напишите программу для сравнения двух ArrayList списков.

        ArrayList <Integer> int1 = new ArrayList<>();
        int1.add(15);
        int1.add(20);
        int1.add(38);

        ArrayList <Integer> int2 = new ArrayList<>();
        int2.add(1);
        int2.add(20);
        int2.add(38);

        System.out.println(int1.equals(int2));

        //Напишите программу для замены второго элемента списка ArrayList на указанный элемент.

        swapInt(int1, 12);
        System.out.println(int1);

        //Напишите программу для получения первого и последнего вхождения
        // указанных элементов в связном списке.

        printFirstAndLast(int2);

        //Напишите программу для замены двух элементов в связном списке.

        LinkedList <Integer> linkList = new LinkedList<>();
        linkList.add(90);
        linkList.add(54);
        linkList.add(76);
        linkList.add(54);
        swapLinkedList(linkList, 2, 5);
        System.out.println(linkList);

        //Напишите программу для сравнения двух HashSet
        //и сохранения элементов, одинаковых в обоих HashSet.

        HashSet <String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Avacado");

        HashSet <String> fruits1 = new HashSet<>();
        fruits1.add("Apple");
        fruits1.add("Banana");
        fruits1.add("greip");
        fruits1.add("Avacado");

        HashSet <String> fruits2 = new HashSet<>();

        System.out.println(fruits);
        System.out.println(fruits1);

        containsSet(fruits, fruits1);

        //Напишите программу для проверки того, является ли HashSet пустым или нет.
        boolean isSetEmpty = fruits.isEmpty();
        System.out.println(isSetEmpty);

        //Напишите программу для копирования всех записей из одной HashMap в другую.

        HashMap <String, String> cities = new HashMap<>();
        cities.put("Казахстан", "Астана");
        cities.put("Россия", "Москва");
        HashMap <String, String> citiesClone = new HashMap<>();
        citiesClone = (HashMap) cities.clone();
        System.out.println(citiesClone);

        //Напишите программу для проверки, содержит ли HashMap запись для указанного значения.
        if (cities.containsValue("Астана")) {
            System.out.println("True");
        }

    }
    public static void printWeekDays(Weekday weekday) {
        for (Weekday day : Weekday.values()) {
            if (weekday.isWeekDay(day)) {
                System.out.println(day + " - Это будний день");
            }
        }
    }

    public static void swapInt(ArrayList list, Integer newInt) {
        list.set(1,newInt);
    }

    public static void printFirstAndLast(ArrayList list) {
        System.out.println("Первый элемент = " + list.getFirst() + "/ Последний  элемент = " + list.getLast());

    }

    public static void swapLinkedList(LinkedList list, int newInt1, int newInt2) {
        list.set(1,newInt1);
        list.set(2,newInt2);
    }

    public static void containsSet(HashSet set1, HashSet set2) {
        set1.retainAll(set2);
        System.out.println(set1);
    }


}
