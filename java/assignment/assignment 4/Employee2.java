public class Employee2 {
    int empId1;
    String empName1;
   
    //parameterized constructor with two parameters
    Employee2(int ID, String name) {
        this.empId1 = ID;
        this.empName1 = name;
    }
    void info() {
        System.out.println("Id: "+empId1+" Name: "+empName1);
    }
   
    public static void main(String args[]){
        Employee2 obj1 = new Employee2(1044,"Fraser");
        Employee2 obj2 = new Employee2(1045,"Ryan");
        obj1.info();
        obj2.info();
    }
}

/*
1) Create a class Employee2
2) Create an instance and int two items.
3) Turn them into parametrized objects and feed them into a print.
4) In main, create two objects, assign them values from Employee2
5) Call info on the objects

This prints out the data assigned to the objects
*/
   