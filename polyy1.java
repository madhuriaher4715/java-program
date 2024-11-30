class polyy1{
    void  draw(){
        System.out.println("can not say type");
    }
}
class square extends  polyy1{
    @Override
    void draw(){
        super.draw();
        System.out.println("it's a square shape");
    }
}
class poo{
    public static void main(String[] args) {
        polyy1  r=new square();
        r.draw();
        
    }
}