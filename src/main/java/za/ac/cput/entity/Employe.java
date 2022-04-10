package za.ac.cput.entity;
/*
Employee.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date April 9 2022
 */

public class Employe {
    private String employeeId;
    private String firstName;
    private String lastName;

    private Employe() {
    }
    private Employe(Builder builder){
        this.firstName= builder.firstName;
        this.lastName= builder.lastName;
        this.employeeId= builder.employeeId;

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String employeeId;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;

        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder copy(Employe employee) {
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
            this.employeeId = employee.employeeId;
            return this;

        }

        public Employe build() {
            return new Employe(this);
        }
    }
}

