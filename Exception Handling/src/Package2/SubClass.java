package Package2;

import Package1.ParentClass;

public class SubClass extends ParentClass {

    public void show(){
        MethodProtected(); // I accessed the protected method
    }

    public static void main(String[] args) {
        SubClass SC = new SubClass();
        SC.show();
    }

}
