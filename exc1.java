public class exc1 {
    void age(int a){
        if(a<18){
            throw new ArithmeticException("access denied,try again");
        }else{
            System.out.println("access granted");
        }
    }
   public static void main(String[] args) {
       exc1 obj=new exc1();
       obj.age(20);
   } 
}
