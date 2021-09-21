package Generic_3;

public class Son_one extends Parents<Integer>{
    public Son_one(){};

    @Override
    //如果子类没有使用泛型，则重写父类方法的话，则是Object类
    public Integer getT() {
        return super.getT();
    }
    public void setT(Integer t){
        super.setT(t);
    }
}
