package tugas3;

public class Employee implements Employeeinterface {
    private String en;
    private int empAge;
    private double salary;
    private String jd;

    public Employee(String empName, int age, double empSalary, String jobDescription) {
        en = empName;
        empAge = empAge;
        salary = empSalary;
        jd = jobDescription;
    }

    @Override
    public void e() {
        System.out.println("Employee Name: " + en);
        System.out.println("Age: " + empAge);
        System.out.println("Salary: $" + salary);
        System.out.println("Job Description: " + jd);
    }

    @Override
    public double c() {
        return salary * 12;
    }
    @Override
    public void s(double raisePercentage) {
        salary += (salary * raisePercentage / 100);
    }

}