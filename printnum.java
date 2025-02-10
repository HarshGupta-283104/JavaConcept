

public class printnum {


    public static void print(int Number) {
        
        if(Number == 11) return;
            System.out.print(Number+" ");
            print(Number+1);
        
    }
    public static void main(String[] args) {
        int cout = 1;
        print(cout);
    }
}