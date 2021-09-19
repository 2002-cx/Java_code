package Demo21;

import java.util.Arrays;

public class String_ {
    public static void main(String[] args) {
        String ch = "张三";
        System.out.println(ch);
        System.out.println(ch.length());
        System.out.println(ch.substring(0 ));
        //构建空字符串
        String str = new String();
        //  public String() {
        //        this.value = "".value;
        //    }
        //带参构造器
        String str1 =new String("abc");
        //带参-->字符数组
        String str2 = new String(new char[]{'a','b'});
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2.length());
        System.out.println("字符串是否为空:"+str.isEmpty());
        System.out.println(str2.charAt(0));
        String str3  = new String("abc");
        String str4 = new String("abc");
        //equals比较值,==比较地址
        boolean is_true = str3.equals(str4);
        System.out.println(str3==str4);
        System.out.println(is_true);
        String str5= new String("abcdefg");
        String str6 = str5.substring(1);//substring-->字符串截取
        System.out.println(str6);
        System.out.println(str5.substring(2, 5));//左闭右开，不包括右边[2,5)
        //concat--字符串拼接
        System.out.println(str6.concat("hijk"));//bcdefghijk
        //replace--字符串替换
        System.out.println(str5.replace("a", "-"));
        String str7 = new String("a-b-c-d-e-f-g");
        //split--字符串切割，返回一个字符串数组
        String []str8 = str7.split("-");
        System.out.println(Arrays.toString(str8));
        //字符串转大小写；
        System.out.println(str7.toUpperCase());//转大写
        System.out.println(str7.toLowerCase());//转小写
        //trim()去除首尾空格
        String str9 = new String("    a   b  c    ");
        System.out.println(str9.trim());//a   b  c

    }
}
