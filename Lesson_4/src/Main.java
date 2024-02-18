public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        Park.Attraction attraction = new Park.Attraction("Roller coaster",
                "from 9 to 18", 500);
        System.out.println(attraction);
    }

    public static void firstTask() {
        Employee employee = new Employee("Ivanov V. I.", "javaDev",
                "ivanov@test.com", "+7962777999", 100000, 28);
        System.out.println(employee);
    }

    public static void secondTask() {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Petrov M. M.", "javaDev",
                "petrov@test.com", "+7962888333", 120000, 30);
        empArray[1] = new Employee("Sidorov S. S.", "qaManual",
                "sidorov@test.com", "+7962555222", 80000, 22);
        empArray[2] = new Employee("Sergeev V. B.", "aqaJava",
                "sergeev@test.com", "+7963433777", 120000, 34);
        empArray[3] = new Employee("Mihailov R. R.", "aqaJava",
                "mihailov@test.com", "+7964999888", 150000, 37);
        empArray[4] = new Employee("Andreev P. I.", "javaDev",
                "andreev@test.com", "+7964666555", 110000, 24);
        for (Employee emp : empArray) {
            System.out.println(emp);
        }
    }
}
