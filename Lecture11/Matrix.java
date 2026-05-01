import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();
        System.out.println("Input the Given number");
        int n = sc.nextInt();

        int numbers [][] = new int [rows][column];
        // input 
        for(int i = 0; i<rows; i++) {
            for (int j = 0; j<column; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // output 
        for(int i = 0; i <rows; i++){
            for(int j=0; j <column; j++) {
                if(numbers[i][j] == n) {
                    System.out.print ("The number is founf in index (" + i + ", "+ j +")");
                }
            }
        }
        
     }    
}


