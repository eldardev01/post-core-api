package homework10;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static HashMap <String, String> book = new HashMap<>();

    public void addBook(String phone, String name) {
        book.put(phone, name);
    }

    public void printBook() {
        for (Map.Entry<String, String> entry: book.entrySet()) {
            System.out.printf("Номер:%s - Имя:%s %n", entry.getKey(), entry.getValue());
        }
    }

    public void findBook(String name) {
        for (Map.Entry<String, String> entry : book.entrySet()) {
            if (name.equals(entry.getValue())) {
                System.out.printf("Номер:%s - Имя:%s %n", entry.getKey(), entry.getValue());
            }
            else {
                System.out.println("Subscriber not found");
            }
        }
    }

    public void updateBookName(String number, String newName) {
        if (book.containsKey(number)) {
            book.put(number, newName);
        }
        else {
            System.out.println("This number is not in the database, press 2 to add");
        }
    }


}
