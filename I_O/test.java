package I_O;

import java.io.File;

public class test {
    public static void main(String[] args) {
        File f= new File("D:\\a.txt");
        System.out.println(f.exists());
    }
}
