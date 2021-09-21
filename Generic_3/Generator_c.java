package Generic_3;

public class Generator_c implements Generator_i<String>{
    //重写接口,如果没有使用泛型，则默认为Object
    //如果使用了泛型，则返回类型要和泛型类型一致
    public String getT(){
        return "Hello Generator ";
    };
}
