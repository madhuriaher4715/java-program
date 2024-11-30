interface pra2 {
    void accept(); // default
}

class mmm implements pra2 {
    public void accept() { // public
        System.out.println("this is pratice");
    }

    public static void main(String[] args) {
        mmm obj = new mmm();
        obj.accept();
    }
}
