package extra2.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(-5, 2, 11, -52, 6, 90, -21, 4, 12, 5);

        // MAP
        // 1. create a new list containing doubled values of the list
        List<Integer> doubledList = list.stream().map(x -> x*2).collect(Collectors.toList());
        System.out.println(doubledList);

        // 2. create a new string list contains "odd" and "even" accordingly to the values in the list
        List<String> oddEvenList = list.stream().map(x -> x%2==0 ? "even" : "odd").collect(Collectors.toList());
        System.out.println(oddEvenList);

        // 3. create a new list containing values of the list plus 1
        List<Integer> incrementList = list.stream().map(x -> x+1).collect(Collectors.toList());
        System.out.println(incrementList);

        // 4. create a new string list contains "negative" and "positive" accordingly to the values in the list
        List<String> nevPosList = list.stream().map(x -> x>=0 ? "positive" : "negative").collect(Collectors.toList());
        System.out.println(nevPosList);

        List<Employee> employees = createEmployeeList();
        // 5. double the salary of each employee

        // 6. create a list containing the employee who are developer

        // 7. change the posision of all employees who are not manager to "employee"

        List<Student> students = createStudentList();

        // 8. create a list containing all students whose id is less than 5 and are frontend developer

        // 9. create a list containing all students whose names are 3 letter long

        List<Company> companyList = createCompanyList();

        // 10. create a set containing all companies name

        // 11. create a set containing all industries company is doing business

        // 12. create a list of companies which have positive profit

        // 13. create a list containing all tech companies
    }

    private static List<Student> createStudentList() {

        Student giang = new Student(1, "Giang", "Fronend");
        Student hai = new Student(2, "Hai", "Backend");
        Student hao = new Student(3, "Hao", "Database");
        Student hoa = new Student(4, "Hoa", "Tester");
        Student huong = new Student(5, "Huong", "Designer");
        Student hoang = new Student(6, "Hoang", "Game Developer");
        Student hieu = new Student(7, "Hieu", "Mobile");
        Student hien = new Student(8, "Hien", "QA");

        return Arrays.asList(giang, hai, hao, hoa, huong, hoang, hieu, hien);
    }

    private static List<Employee> createEmployeeList() {
        Employee alex = new Employee("Alex", "Developer", 56000);
        Employee john = new Employee("John", "UX Designer", 756000);
        Employee marry = new Employee("Marry", "Manager", 126000);
        Employee jack = new Employee("Jack", "Tester", 36000);
        Employee thomas = new Employee("Thomas", "Developer", 54000);

        return Arrays.asList(alex, john, marry, jack, thomas);
    }

    private static List<Company> createCompanyList() {
        Company fox = new Company("Fox", 2000, 1200, "Entertainment");
        Company apple = new Company("Apple", 4000, 2500, "Tech");
        Company google = new Company("Google", 3200, 1800, "Tech");
        Company fedEx = new Company("FedEx", 200, 420, "Delivery");
        Company amazon = new Company("Amazon", 5000, 4500, "Tech");
        Company nyTimes = new Company("NyTimes", 10, 6, "Newspaper");

        return Arrays.asList(fox, apple, google, fedEx, amazon, nyTimes);
    }


}
