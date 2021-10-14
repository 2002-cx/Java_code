package Enum_3;

public enum Season implements enum_interface{
    //枚举类实现接口
    //在枚举类中，每个枚举常量都可以重写接口
    SPRING{
        public void show(){
            System.out.println("season_SPRING");
        }
    },

    WINTER{public void show(){
        System.out.println("season_WINTER");
    }},
    SUMMER{
        public void show(){
            System.out.println("season_SUMMER");
        }
    },
    AUTUMN{
        public void show(){
            System.out.println("season_AUTUMN");
        }
    };

}
