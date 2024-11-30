class polyy{
    void add(int a,int b){
        System.out.println("addition of two number"+(a+b));
    }
    void add(float a, float  b){
        System.out.println("addition of two float number"+(a+b));
    }
    class po{
        public static void main(String[] args) {
            polyy obj=new polyy();
            obj.add(10, 20);
            obj.add(11.4f, 1.23f);
        }
    }
}