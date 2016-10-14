public class Student implements Comparable<Student>{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student student) {
         //To change body of generated methods, choose Tools | Templates.
        return this.getName().compareToIgnoreCase(student.getName());
    }
    
    

}
