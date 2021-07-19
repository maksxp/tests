import java.util.Objects;

class Person implements Comparable<Person>{

    private String name;
    private int age;
    public Person(String name, int age){

        this.name=name;
        this.age=age;
    }
    public String getName(){return name;}

    public int getAge(){return age;}

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "}" ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public int compareTo(Person o) {
        return this.age-o.getAge();
    }
}