package Demo28;

public class MyLinkedlist {
    //链中的首节点
    Node first;
    //链中尾节点
    Node last;
    //计数器
    int count=0;

    public MyLinkedlist() {
    }

    //添加元素的方法
    public void add(Object o){
        if(first==null){
            //没有元素，则将添加到首节点
            Node n=new Node();
            n.setBefore(null);
            n.setObj(o);
            n.setNext(null);
            //当前链中第一个和最后一个节点都变为n,因为只有一个元素，所以头和尾节点是同一个
            first=n;
            last=n;
        }else{
            //添加的不是第一个元素
            Node n =new Node();
            n.setBefore(last);
            n.setObj(o);
            //当前节点的下一个元素指向n，因为为双向链表
            last.setNext(n);
            last=n;
        }
        count++;
    }

    //通过下标、获取元素
    public Object get(int index){
        //获取链表的头元素
        Node n = first;
        for (int i = 0; i < index; i++) {
            n=n.getNext();
        }
        return n.getObj();
    }

    public int getCount(){
        return count; 
    }

}
