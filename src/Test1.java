import java.util.UUID;

public class Test1 {
    public static void main(String[] arg){
        Test1 a = new Test1();


        a.doA();
    }

    public String doA(){
        //啦啦啦啦
        String s = UUID.randomUUID().toString();
        //修改啊
        System.out.println(s+"|"+s.length());
        s=s.substring(0, 8) + s.substring(9, 13) + s.substring(14, 18) + s.substring(19, 23) + s.substring(24);

        System.out.println(s+"|"+s.length());
        return  s;
    }
}
