package Thread_;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <7 ; i++) {
            sum+=i;
            //36
        }
        int sum1=0;
        System.out.println(sum);
        for (int i = 0; i <=7 ; i++) {
            sum1+=i;
        }
        System.out.println(sum1);
        int result[]= new int[1000];
        for (int i = 0; i <1000 ; i++) {
            result[i] = new Random().nextInt(100);//产生一个0-99的随机数值
            if (result[i]==100||result[i]==0)
            {
                System.out.println("有了:\t"+result[i]);
                continue;
            }
            System.out.println(result[i]);

        }
    }
}
