import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sk, n=27;
        //two-dimensional array
        int [][] mas = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
        System.out.print("Ievadiet uzdevuma numuru (1 vai 2): ");
        sk = sc.nextInt();
        //command processing
        switch(sk){
            case 1: {
                //Outputs the numbers in the array in the correct order(A)
                for(int i=9; i>=0; i--){
                    if (i<=1) {
                        for(int j=9; j>=9-i; j--){
                            mas[i][j]=n--;
                        }
                    }
                    else {
                        for (int j = 11-i; j >= 9-i; j--) {
                            mas[i][j] = n--;

                        }
                    }

                }
                break;
            }
            case 2: {
                //Outputs the numbers in the array in the correct order(B)
                for(int i=0; i<=8; i++){
                    n=9;
                    for(int j=1+i; j<=9; j++){
                        mas[i][j]=n--;
                    }
                }
                break;
            }
            default: {
                System.out.println("mode error");
                sc.close();
                return;
            }
        }
        //output the result
        for(int i=0; i<=9; i++){
            for(int j=0; j<=9; j++){
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}