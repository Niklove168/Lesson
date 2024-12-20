import java.util.Arrays;

public class Employee {

    String name;
    String position;
    String email;
    int phoneNumber;
    double salary;
    int age;

    public Employee(String name, String position, String email, int phoneNumber, double salary, int age) {

        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return
                ("Name: " + name + ',' + "Position: " + position + ',' + "E-mail: " + email + ',' + "Phone number: " + phoneNumber + ',' + "Salary: " + salary + ',' + "Age: " + age + "\n");
    }

    public void print() {
        System.out.println("Name:" + name);
        System.out.println("Position:" + position);
        System.out.println("E-mail:" + email);
        System.out.println("Phone number:" + phoneNumber);
        System.out.println("Salary:" + salary);
        System.out.println("Age:" + age);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John Smith", "manager", "jsmith@gmail", 823274871, 5050.50, 32);
        employee.print();
        Employee[] employeeArr = new Employee[5];
        employeeArr[0] = new Employee("Mary Johns", "actress", "mjohns@yandex", 958745631, 4040.40, 34);
        employeeArr[1] = new Employee("John Smith", "director", "jsmith@gmail", 823274871, 5050.50, 32);
        employeeArr[2] = new Employee("Stephen Todd", "producer", "stodd@mail", 147963852, 7575.75, 42);
        employeeArr[3] = new Employee("Sophie Peterson", "make-up artist", "speterson@gmail", 369875214, 3535.35, 31);
        employeeArr[4] = new Employee("David Clarke", "operator", "dclarke@yandex", 852714396, 4545.45, 38);

        System.out.println(Arrays.toString(employeeArr));
        System.out.println();
    }
}