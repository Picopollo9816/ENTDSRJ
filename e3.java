import java.util.Scanner;

public class Promedio {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int[] numero = new int[5];
    
    System.out.println("Ingrese 5 números:");
    for(int i=0; i<5; i++) {
      numero[i] = scanner.nextInt();
    }
    
    int suma = 0;
    for(int i=0; i<5; i++) {
      suma += numero[i];
    }
    
    double promedio = (double) suma / 5;
    
    System.out.println("La suma de los números es: " + suma);
    System.out.println("El promedio de los números es: " + promedio);
    
  }
  
}
