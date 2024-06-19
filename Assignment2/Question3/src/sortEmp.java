
public class sortEmp {
    public static void insertionSortBySalaryDescending(Employee[] employees) {
        int n = employees.length;
        for (int i = 1; i < n; ++i) {
            Employee key = employees[i];
            int j = i - 1;

            // Move elements of employees[0..i-1], that are less than key.salary,
            // to one position ahead of their current position
            while (j >= 0 && employees[j].getSalary() > key.getSalary()) {
                employees[j + 1] = employees[j];
                j = j - 1;
            }
            employees[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("virat", 50000),
            new Employee("rohit", 60000),
            new Employee("mahi", 45000),
            new Employee("dhawan", 70000)
        };

        insertionSortBySalaryDescending(employees);

        System.out.println("Employees sorted by salary in descending order:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
