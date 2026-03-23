package day11;

public class object {
    String name;
    int id;
    double salary;
    
    void display(){
        System.out.println(name+" "+id);
    }

    void getSalary(){
        System.out.println(salary);
    }

    public static void main(String[]args){
        object emp1=new object();
        emp1.name="jhon";
        emp1.id=35;
        emp1.salary=10000;


        object emp2=new object();
        emp2.name="Rebaka";
        emp2.id=42;
        emp2.salary=30000;

        emp1.display();
        emp1.getSalary();
        emp2.display();
        emp2.getSalary();

    }
}
