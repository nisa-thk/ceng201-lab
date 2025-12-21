package Ceng201HW_Assigments;

public class Patient {
	int Id;
    String name;
    int severity;
    int age;
    public Patient(int Id,String name, int severity,int age){
        this.Id = Id;
        this.name = name;
        this.severity = severity;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Patient{id=" + Id + ", name='" + name + '\'' + ", severity=" + severity + ", age=" + age + "}";
    }
}
