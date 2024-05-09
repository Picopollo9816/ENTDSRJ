import java.util.Scanner;

public class Promedio {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int[] numero = new int[5];
    
    System.out.println("Ingrese 5 números:");
    for(int i=0; i<5; i++) {
      numero[i] = scanner.nextInt();
    }
    
    int Restar = 0;
    for(int i=0; i<5; i++) {
      Restar += numero[i];
    }
    
    double promedio = (double) Restar/ 5;
    
    System.out.println("La suma de los números es: " + Restar);
    System.out.println("El promedio de los números es: " + promedio);
    
  }
  
}
