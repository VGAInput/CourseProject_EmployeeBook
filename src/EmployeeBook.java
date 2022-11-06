public class EmployeeBook {

    private static Employee[] employees = new Employee[15];

    public EmployeeBook() {

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

        getEmployeesByDepartments();
    }

    /*
        –Реализованы метод добавления нового сотрудника.
    */
    public void addNewEmployee(String name, int salary, int department) {
        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(name, salary, department);
                break;
            }
        }
    }

    /*
        – Реализован метод удаления сотрудника.
    */
    public void removeEmployee(int findId) {
        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i].getId() == findId) {
                employees[i] = null;
                break;
            }
        }
    }

    /*
        – Реализован метод изменения зарплаты сотрудника.
    */
    public void changeSalary(int findId, int changeSalaryTo) {
        for (Employee e : employees) {
            if (e != null && e.getId() == findId) {
                e.setSalary(changeSalaryTo);
            }
        }
    }

    /*
        – Реализован метод изменения отдела.
    */
    public void changeDepartment(int findId, int changeDeptTo) {
        for (Employee e : employees) {
            if (e != null && e.getId() == findId) {
                e.setDepartment(changeDeptTo);
            }
        }
    }
        /*
           -Получить Ф. И. О. всех сотрудников по отделам (напечатать список отделов и их сотрудников).
        */
    public void getEmployeesByDepartments() {

        int ammountOfDepartments = 5;
        String emplyeeNames = "";

        for (int i = 1; i <= ammountOfDepartments; i++) {
            emplyeeNames = "";
            for (Employee e : employees) {

                if (e != null) {
                    if (e.getDepartment() == i) {
                        emplyeeNames += e.getName() + ", ";
                    }
                }
            }
            System.out.println("Employees of dept. #" + i + ": " + emplyeeNames);
        }

    }


}
