package lesson5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add("Smith", "+375291326548");
        book.add("Johns", "+375442369875");
        book.add("Peterson", "+375291956348");
        book.add("Smith", "+375339865325");
        book.add("Fishman", "+375333268512");
        book.add("Williams", "+375298956234");
        book.add("Davidson", "+375443684217");
        book.add("Smith", "+375447569823");
        book.add("Johns", "+375332983564");
        book.add("Smith", "+375446031582");
        String surname = "Johns";
        List<String> numbers = book.get(surname);
        if (!numbers.isEmpty()) {
            System.out.println("Phone numbers for " + surname + ": ");
            for (String number : numbers) {
                System.out.println(number);
            }
        } else {
            System.out.println("There is no phone numbers for " + surname);
        }
    }
}