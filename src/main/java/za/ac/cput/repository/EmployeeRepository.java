package za.ac.cput.repository;

import za.ac.cput.entity.Employee;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepository implements IEmployee{
    private static EmployeeRepository repository =null;
    private Set<Employee> EmployeeDB;
    private EmployeeRepository(){
        EmployeeDB= new HashSet<Employee>();

    }

    public static EmployeeRepository getRepository(){
        if (repository==null) {
            repository = new EmployeeRepository();
        }
        return repository;

    }

    @Override
    public Employee create(Employee employee) {
        boolean success=EmployeeDB.add(employee);
        if(!success)
            return null;
        return employee;

    }

    @Override
    public Employee read(String employeeId) {
        Employee employee=EmployeeDB.stream().
                filter(e ->e.getEmployeeId().equals(employeeId))

                .findAny().orElse(null);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {

        Employee oldEmployee=read(employee.getEmployeeId());
        if (oldEmployee !=null)
        {


            EmployeeDB.remove(oldEmployee);

            EmployeeDB.add(employee);
            return  employee;
        }
        return null;
    }

    @Override
    public boolean delete(String employeeId) {
        Employee deleteEmployee= read(employeeId);
        if (deleteEmployee ==null)
        {
            return false;
        }
        EmployeeDB.remove(deleteEmployee);
        System.out.println("Delete Sucessfull");
        return true;
    }

    @Override
    public Set<Employee> getAll() {
        return EmployeeDB;
    }

}