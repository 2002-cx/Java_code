package Demo29;

public class Teacher implements Comparable<Teacher>{
    private  int age;
    private String name;

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher(int age, String name) {
        this.age = age;
        this.name = name;
    }



    @Override
    public int compareTo(Teacher o) {
        return this.getAge()-o.getAge();

    }
}
