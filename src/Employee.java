import java.util.Objects;

public class Employee {

    public int id;

    private int salary;
    private int department;
    private String name;
    private static int count = 0;

    public Employee(String name, int salary, int department) {

        this.name = name;
        this.salary = salary;
        this.department = department;
        this.id = count++;

    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && department == employee.department && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, salary, department, name);
    }

    @Override
    public String toString() {
        return "Employee id: " + id +
                ", salary: " + salary +
                ", department: " + department +
                ", name: '" + name + '\'';
    }
}
