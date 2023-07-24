import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Rahul", 12);
        Employee f = new Employee("Messi", 13);
        Employee g = new Employee("Leo", 22);
        e.show();
        f.show();
        g.show();
        e.showNextId();
        f.showNextId();
        g.showNextId();
        {
            //It is sub block to keep the records of all the employee
            Employee x = new Employee("phuche", 5);
            Employee y = new Employee("phucheee", 6);
            x.show();
            y.show();
            x.showNextId();
            y.showNextId();
            x = y = null;
            System.gc();
            System.runFinalization();
        }
        e.showNextId();
    }
}