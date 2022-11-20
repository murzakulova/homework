public class Student {
    private String name;
    private  String surName;
    private int age ;

    public Student() {
    }

    public Student(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "=========================="+"\n"+
                " Student: " + "\n"+
                " 1.name: " + name + "\n" +
                " 2.surNam: " + surName + "\n" +
                " 3. age: " + age;
    }
}
