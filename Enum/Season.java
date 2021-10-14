package Enum;

public class Season {
    //定义枚举类--自定义枚举
    private final String seasonName;
    private final String seasonDesc;

    private Season(String seasonName,String seasonDesc)
    {
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }
    public static final Season Spring = new Season("春天","春暖花开");
    public static final Season Summer = new Season("夏天","烈日炎炎");
    public static final Season Winter = new Season("冬天","冰天雪地");
    public static final Season Autumn = new Season("秋天","硕果累累");
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
