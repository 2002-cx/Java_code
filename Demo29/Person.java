package Demo29;

import java.util.Comparator;

public class Person implements Comparable<Person>{
private int age;
private double height;
private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        //如果想比较年龄
        double result = this.getAge()-o.getAge();
        if(result>0)
        {
            return 1;
        }
        else if(result<0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }


    static class compare_ implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            //年龄相同比较身高
            int result=o1.getAge()-o2.getAge();
            if(result==0)
            {
                return (int) ((o1.getHeight())-(o2.getHeight()));
            }
            else {
                return result;
            }
        }
        //外部比较器
    }
}
