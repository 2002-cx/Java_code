package Junit;

public class Test {


        //Junit属于白盒测试
        public static void main(String[] args) {
            calc c = new calc();
            int sum = c.add(1,2);
            System.out.println(sum);
        }
    }
