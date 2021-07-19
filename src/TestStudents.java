import java.util.*;
import java.util.stream.Collectors;

public class TestStudents {
    public static void main(String[] args) {
        Student st5 = new Student("e", 'f', 40, 4, 9);
        Student st1 = new Student("a", 'f', 22, 3, 5);
        Student st2 = new Student("b", 'm', 23, 1, 6);
        Student st3 = new Student("c", 'f', 20, 2, 7);
        Student st4 = new Student("d", 'm', 19, 2, 4);


        List <Student> studentList = new ArrayList<>();
        studentList.add(st5);
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);

        int integerList = studentList.stream()
                    .mapToInt(st ->st.getAge())
                    .min().getAsInt();


        System.out.println(integerList);



//        studentList.stream().forEach(student -> System.out.println(student));
//        System.out.println("________________________________________________");
//        studentList.stream().filter(x->x.getAge()>=20).limit(2).forEach(student -> System.out.println(student));
//        System.out.println("________________________________________________");
//        studentList.stream().filter(x->x.getAge()>=20).skip(2).forEach(student -> System.out.println(student));


//        Map <Character, List<Student>> map = studentList.stream()
//                .map(student -> {
//                    student.setName(
//                            student.getName().toUpperCase());
//                    return student;})
//                .collect(Collectors.groupingBy(Student::getSex));
//
//        for (Map.Entry<Character, List<Student>> entry:map.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//
//        }
//
//        Map <Boolean, List<Student>> map1 = studentList.stream()
//                .map(student -> {
//                    student.setName(
//                            student.getName().toUpperCase());
//                    return student;})
//                .collect(Collectors.partitioningBy(student -> student.getAge()<20));
//
//        for (Map.Entry<Boolean, List<Student>> entry:map1.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//
//        }


//        Faculty f1 = new Faculty("F1");
//        Faculty f2 = new Faculty("F2");
//        f1.addStudentToFaculty(st1);
//        f1.addStudentToFaculty(st2);
//        f1.addStudentToFaculty(st3);
//        f2.addStudentToFaculty(st4);
//        f2.addStudentToFaculty(st5);
//
//        List <Faculty> facultyList = new ArrayList<>();
//        facultyList.add(f2);
//        facultyList.add(f1);
//
//
//        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
//                .forEach(student -> System.out.println(student.getName()));
    }
}
class Faculty {
    String name;
    List <Student> studentsOnFaculty;

    public Faculty (String name){
        this.name=name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List <Student> getStudentsOnFaculty (){
        return studentsOnFaculty;
    }

    public void addStudentToFaculty (Student student) {
        studentsOnFaculty.add(student);
    }
}
class Student {

    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}
