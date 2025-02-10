import java.util.*;

class Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the no of row. ");
        int Row = sc.nextInt();
        System.out.println("Input the no of column. ");
        int Column = sc.nextInt();
        System.out.println("This is for Rectangle");
        
        for(int i = 1; i<=Row; i++){
            for(int j = 1; j <=Column; j++){
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("This is for Hollow Rectangle");
        for(int i = 1; i<=Row; i++){
            for(int j = 1; j <=Column; j++){
                if(i == 1 || i == Row || j == Column || j == 1 ){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("This is the code for Triangle.");
        for(int i = 1; i<=Row; i++){
            for(int j = 1; j <=i; j++){
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("This is the code for Reverse Triangle.");
        for(int i = 1; i<=Row; i++){
            for(int j = 1; j <=(Row+1-i); j++){
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("This is the code for Pyramid.");
        for(int i = 1; i<=Row; i++){
            for(int j = 1; j <=(Row-i); j++){
                System.out.print(" ");

            }
            System.out.println();
        }

    }
}