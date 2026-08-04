
//interface implementation

interface student {

    void display1();

    void display2();
}

class Myclass implements student {

    public void display1() {
        System.out.println("This is display1 method");
    }

    public void display2() {
        System.out.println("This is display2 method");
    }

    public static void main(String[] args) {

        Myclass obj = new Myclass();

        obj.display1();
        obj.display2();
    }
}