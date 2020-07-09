package PersonData;

import java.io.Serializable;

public class Job implements Serializable {
    public  String name; //Поле может быть null
    public Integer workExperience; //Значение поля должно быть больше 0
    public Integer salary; //Значение поля должно быть больше 0
    public House(String name, Integer workExperience, Integer salary) throws AllException {
        this.name = name; if (name==null) throw new AllException("поле name не может быть null");
        this.workExperience = workExperience; if (year<1) throw new AllException("Ошибка, возраст дома должен быть положительным");
        this.salary = salary; if (numberOfLifts<1) throw new AllException("Ошибка, в доме должен быть хотя бы один лифт");
    }
    public String getHouseName() {
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    public Integer getYear() {
        return workExperience;
    }
    public void setYear (Integer year){
        this.workExperience = workExperience;
    }
    public Integer salary() {
        return salary;
    }
    public void setSalary(Integer salary){
        this.salary = salary;
    }
    public House(){
        this.name=name;
        this.workExperience = workExperience;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return (
                "Место работы: " + name + ", стаж работы = "+ year +" лет, зарплата = "+ numberOfLifts);
    }
}
