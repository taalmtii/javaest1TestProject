import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class EmployeeTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/employee.csv"})
    public void  salaryBelow1000Test(String name, Integer salary, String email, String phone, Integer age){

        assertTrue(salary > 1000);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/employee.csv"})
    public void ageAbove16Test(String name, Integer salary, String email, String phone, Integer age){
        Employee employee = new Employee(name, salary, email, phone, age);
        assertTrue(employee.getAge() > 16);
    }


}
