package za.ac.cput.entity;

public class EmployeeGender
{
    private String genderId;
    private String employeeId;

    public EmployeeGender(EmployeeGender.Builder builder)
    {
        this.genderId=builder.genderId;
        this.employeeId=builder.employeeId;

    }
    public String getGenderId()
    {
        return genderId;
    }

    public String getEmployeeId() {
        return employeeId;
    }


    @Override
    public String toString() {
        return "EmployeeGender{" +
                "genderId='" + genderId + '\'' +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }


    public static class Builder
    {
        private String genderId;
        private String employeeId;

        public EmployeeGender.Builder setGenderId(String genderId) {
            this.genderId =genderId;
            return this;
        }

        public EmployeeGender.Builder setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }



        public EmployeeGender.Builder cody(EmployeeGender employee)
        {
            this.genderId=employee.genderId;
            this.employeeId=employee.employeeId;


            return this;
        }
        public EmployeeGender  Build()
        {
            return new EmployeeGender (this);
        }
    }

}
