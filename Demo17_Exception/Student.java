package Demo17_Exception;

public class Student {
    private int age;
    private String name;
    private String sex;

    public Student(){};
    public Student(int age, String name, String sex) throws Exception{
        this.age = age;
        this.name = name;
        if("男".equals(sex)||"女".equals(sex)){
            this.sex = sex;
        }
        else
        {
            throw new My_Exception("s2性别输入有误！");
        }

    }

    public Student(int age) {
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) throws My_Exception {
        if("男".equals(sex)||"女".equals(sex))
        {
            this.sex = sex;
        }
        else
        {
            throw new My_Exception("s1性别输入有误");
        }

    }
}
