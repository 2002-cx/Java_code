package Generic_2;

import java.util.Scanner;

public class Generic_t1 {
    public static void main(String[] args) {
        Generic_c1<String> g_c1 = new Generic_c1<String>();
        Scanner s= new Scanner(System.in);
        System.out.print("请添加你想要的奖品(4个):");
        for (int i = 0; i <4 ; i++) {
            g_c1.addProduct(s.next());
        }
        System.out.println("你有三次抽奖的机会");
        for (int i = 0; i <3 ; i++) {
            String product = g_c1.getProduct();
            System.out.println("恭喜你，你获得奖品是:"+product);

        }
    }
}
