package Demo17_Exception;

class My_Exception extends RuntimeException{

    static final long serialVersionUID = -3387516993124L;
    My_Exception(){};//空参构造器
    My_Exception(String str){
        super(str);
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

}


