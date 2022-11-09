public class Task_Advanced {

    private static Employee[] employees = new Employee[10];

    public Task_Advanced() {

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

        getTotalSalaryByDepartment(1);

    }

    /*
        Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
    */
    private static void increaseSalaryByPercent(double percent) {
        for (Employee e : employees) {
            if (e != null) {
                e.setSalary((int) (e.getSalary() + (e.getSalary() * (percent / 100))));
            }
        }
    }

/* ============================================================================
    Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
   ============================================================================ */

    /*
    - Сотрудника с минимальной зарплатой.
    */
    private static Employee getLeastSalaryByDepartment(int department) {

        Employee employeeWithLeastSalary = getAllEmployeesFromDepartment(department)[0];

        for (Employee e : employees) {
            if (e != null && e.getDepartment() == department) {
                if (e.getSalary() < employeeWithLeastSalary.getSalary()) {
                    employeeWithLeastSalary = e;
                }
            }
        }
        return employeeWithLeastSalary;
    }

    /*
     - Сотрудника с максимальной зарплатой.
     */

    private static Employee getHighestSalaryByDepartment(int department) {

        Employee employeeWithHighestSalary = getAllEmployeesFromDepartment(department)[0];

        for (Employee e : employees) {
            if (e != null && e.getDepartment() == department) {
                if (e.getSalary() > employeeWithHighestSalary.getSalary()) {
                    employeeWithHighestSalary = e;
                }
            }
        }
        return employeeWithHighestSalary;
    }

    /*
      - Сумму затрат на зарплату по отделу.
    */
    private static int getTotalSalaryByDepartment(int department) {

        int total = 0;
        for (Employee e : getAllEmployeesFromDepartment(department)) {
            if (e != null && e.getDepartment() == department) {
                total = total + e.getSalary();
            }
        }

        return total;

    }

    /*
       - Среднюю зарплату по отделу
    */
    private static int getAverageSalaryinDepartment(int department) {

        int employeesAmmount = 0;
        int averageSalary = 0;

        for (Employee e : getAllEmployeesFromDepartment(department)) {
            if (e != null && e.getDepartment() == department) {
                averageSalary = averageSalary + e.getSalary();
                employeesAmmount++;
            }
        }
        averageSalary = averageSalary / employeesAmmount;

        System.out.println(averageSalary);

        return averageSalary;
    }

    /*
    Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
    */
    private static void increaseSalaryByPercentInDepartment(int department, double percent) {
        for (Employee e : getAllEmployeesFromDepartment(department)) {
            if (e != null && e.getDepartment() == department) {
                e.setSalary((int) (e.getSalary() + (e.getSalary() * (percent / 100))));
            }
        }
    }

    /*
    Напечатать всех сотрудников отдела (все данные, кроме отдела).
    */
    private static void getAllEmployeeNamesInDepartment(int department) {
        for (Employee e : getAllEmployeesFromDepartment(department)) {
            if (e != null && e.getDepartment() == department) {
                System.out.println(e.getName() + ": salary: " + e.getSalary() + ", id: " + e.getId());
            }
        }
    }

/*================================================
    Получить в качестве параметра число и найти:
==================================================*/

    /*
        Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
    */
    private static void findEmployeeSalaryLessThan(int salary) {
        for (Employee e : employees) {
            if (e != null && e.getSalary() < salary) {
                System.out.println(e.getName() + ": salary: " + e.getSalary() + ", id: " + e.getId());
            }
        }
    }

    /*
    Всех сотрудников с зарплатой больше (или равно) числа
    (вывести id, Ф. И. О. и зарплатой в консоль).
*/
    private static void findEmployeeSalaryMoreThan(int salary) {
        for (Employee e : employees) {
            if (e != null && e.getSalary() >= salary) {
                System.out.println(e.getName() + ": salary: " + e.getSalary() + ", id: " + e.getId());
            }
        }
    }
    private static Employee[] getAllEmployeesFromDepartment(int department) {
        int arrayLength = 0;
        Employee[] employeesFromDept;
        for (Employee e : employees) {
            if (e != null && e.getDepartment() == department) {
                arrayLength++;
            }
        }
        employeesFromDept = new Employee[arrayLength];
        arrayLength = 0;
        for (Employee e : employees) {
            if (e != null && e.getDepartment() == department) {
                employeesFromDept[arrayLength] = e;
                arrayLength++;
            }
        }

        System.out.println(employeesFromDept.length);

        return employeesFromDept;
    }

}
