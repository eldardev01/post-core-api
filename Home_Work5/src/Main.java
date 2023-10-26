public class Main {
    public static void main(String[] args)
    {
        //5.1
        int dlina = 5;
        int wirina = 5;

        if (dlina == wirina)
        {
            System.out.println("Квадрат");
        }
        else{
            System.out.println("Прямоугльник");
        }

        //5.2

        int total = 6000;
        double newTotal;

        if (total >= 5000)
        {
            newTotal = total * 0.9;
            System.out.println(newTotal);
        }
        else{
            System.out.println(total);
        }

        //5.3

        int grade = 100;
        char letterGrade = 0;

        if (grade >= 0 && grade <= 25) {
            letterGrade = 'F';
        } else if (grade > 25 && grade <= 45) {
            letterGrade = 'E';
        } else if (grade > 45 && grade <= 50) {
            letterGrade = 'D';
        } else if (grade > 50 && grade <= 60) {
            letterGrade = 'C';
        } else if (grade > 60 && grade <= 80) {
            letterGrade = 'B';
        } else if (grade > 80 && grade <= 100) {
            letterGrade = 'A';
        } else {
            System.out.println("Некорректное значение");
        }

        System.out.println("Grade: " + grade + ", letter: " + letterGrade);

        //5.4


    }
}