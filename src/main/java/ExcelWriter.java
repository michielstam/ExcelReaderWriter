import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;




public class ExcelWriter {

    public class Employee {
        private String name;
        private String email;
        private Date dateOfBirth;
        private double salary;

        public Employee(String name, String email, Date dateOfBirth, double salary) {
            this.name = name;
            this.email = email;
            this.dateOfBirth = dateOfBirth;
            this.salary = salary;
        }
    }

    private static String[] columns = {"Name", "Email", "Date Of Birth", "Salary"};
    private static List<Employee> employees =  new ArrayList<>();

    // Initializing employees data to insert into the excel file
    static {
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(1992, 7, 21);
        employees.add(new Employee("Rajeev Singh", "rajeev@example.com",
                dateOfBirth.getTime(), 1200000.0));

        dateOfBirth.set(1965, 10, 15);
        employees.add(new Employee("Thomas cook", "thomas@example.com",
                dateOfBirth.getTime(), 1500000.0));

        dateOfBirth.set(1987, 4, 18);
        employees.add(new Employee("Steve Maiden", "steve@example.com",
                dateOfBirth.getTime(), 1800000.0));
    }

}


