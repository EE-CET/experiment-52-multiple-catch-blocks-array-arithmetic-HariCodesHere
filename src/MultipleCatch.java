import java.util.Scanner;

public class MultipleCatch {
    
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] arr= new int[n];
                for (int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                }
                int a = sc.nextInt();
                int b=sc.nextInt();

                try{
                        int c = arr[a]/b;
                        System.out.println(c);
                }
                catch(ArithmeticException ex){
                        System.out.println("Divide by zero error");
                }
                catch (IndexOutOfBoundsException e){
                        System.out.println("Invalid Index");
                }
        }
}

