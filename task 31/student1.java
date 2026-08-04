
//constructor getter setter


class Student1 {

    private int id;
    private String name;
    private int mark;

    
     public Student1() {
              }

   
    Student1(int id, String name, int mark) 
    {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

 
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public int getMark() {
        return mark;
    }

   
    public void setMark(int mark) 
    {
        this.mark = mark;
    }

    public static void main(String[] args) {

  
        Student1 s1 = new Student1();
        s1.setId(101);
        s1.setName("Hema");
        s1.setMark(90);

        System.out.println("ID = " + s1.getId());
        System.out.println("Name = " + s1.getName());
        System.out.println("Mark = " + s1.getMark());

       
        Student1 s2 = new Student1(102, "Karthik", 85);

        System.out.println("ID = " + s2.getId());
        System.out.println("Name = " + s2.getName());
        System.out.println("Mark = " + s2.getMark());
    }
}