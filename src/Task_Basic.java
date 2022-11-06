public class Task_Basic {

    private static Employee[] employees = new Employee[10];

    public Task_Basic() {
        employees[0] = new Employee("Rahul Yutke", 70_000, 1);
        employees[1] = new Employee("Erik Augustyn", 75_000, 2);
        employees[2] = new Employee("Nuno Zulfiqar", 50_500, 3);
        employees[3] = new Employee("Fathi Annette", 30_650, 4);
        employees[4] = new Employee("Pietrina Yonah", 48_000, 5);
        employees[5] = new Employee("Tria Sok", 52_250, 1);
        employees[6] = new Employee("Steliana Norman", 68_000, 2);
        employees[7] = new Employee("Yeruti Precious", 75_000, 3);
        employees[8] = new Employee("Przemek Roch", 51_500, 4);
        employees[9] = new Employee("Pranay Lawrie", 30_650, 5);
        getAllEmployeeNames();
    }


    /*
        Получить список всех сотрудников со всеми имеющимися по ним данными
    */
    public static void printAllEmployees() {
        for (Employee e : employees) {
            System.out.print(e + "\n");
        }
    }


    /*
        Посчитать сумму затрат на зарплаты в месяц.
    */
    public static int getTotalSalary() {

        int total = 0;

        for (Employee e : employees) {
            total = total + e.getSalary();
        }
        return total;
    }


    /*
        Найти сотрудника с минимальной зарплатой.
    */
    private static Employee getEmployeeWithLesserSalary() {

        Employee lesserSalary = employees[0];
        int minimumSalary = lesserSalary.getSalary();

        for (Employee e : employees) {
            if (e.getSalary() < minimumSalary) {
                minimumSalary = e.getSalary();
                lesserSalary = e;
            }
        }
        return lesserSalary;
    }


/*
    Найти сотрудника с максимальной зарплатой.
*/
    private static Employee getEmployeeWithHighestSalary() {
        Employee higherSalary = employees[0];
        int maxSalary = higherSalary.getSalary();
        for (Employee e : employees) {
            if (e.getSalary() > maxSalary) {
                maxSalary = e.getSalary();
                higherSalary = e;
            }
        }
        return higherSalary;
    }



/*
    Найти сотрудника с максимальной зарплатой.
*/
    private static int getAverageSalary(){
        int averageSalary = 0;
        for (Employee e:employees) {
            averageSalary = averageSalary + e.getSalary();
        }
        averageSalary = averageSalary / employees.length;
        return averageSalary;
    }



/*
    Получить Ф. И. О. всех сотрудников (вывести в консоль).
*/
    private static void getAllEmployeeNames(){
        for (Employee e: employees) {
            System.out.println(e.getName());
        }
    }
}
