package Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{
    private int empId;
    private String name; // In string class data is immutable
    private int salary;

    private List<String> skillList; // since this is a reference, in shallow copy both the object have reference to same ArrayList

    public Employee(int empId, String name, int salary) {
        super();
        skillList = new ArrayList<>();
        skillList.add("Java");
        skillList.add("Spring");

        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void addSkill(String skill) {
        skillList.add(skill);
    }

    public List<String> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<String> skillList) {
        this.skillList = skillList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", skillList=" + skillList +
                '}';
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee clonedEmployee = (Employee) super.clone(); // don't blindly depend on the clone method provided by Object class
        List<String> clonedSkillList = new ArrayList<>(skillList); // this is a deep copy showing that both the object maintain entirely different references
        clonedEmployee.setSkillList(clonedSkillList);
        return clonedEmployee;
    }

}
