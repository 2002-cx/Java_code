package Enum;

enum Season_ {
    //在JDK1.5之后java有枚举类
    //提供枚举类是有限的，确定对象：--->enum枚举类要求对象（常量）必须放在最开始的位置
    //多个对象之间用(,)进行连接，最后一个对象后面用(;)
    Spring("春天","春暖花开"),
    Summer("夏天","烈日炎炎"),
    Winter("冬天","冰天雪地"),
    Autumn("秋天","硕果累累");
    //属性
    private final String seasonName;
    private final String seasonDesc;
    //利用构造器对属性进行赋值操作
    //构造器私有化，外界不能调用该构造器，只能Season内部自己进行调用
    private Season_(String seasonName,String seasonDesc)
    {
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }

     public String getName(){
        return seasonName;
    }
    public String getDesc(){
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
