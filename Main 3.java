import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
  int numero ;
  int fatorial = 1;
    System.out.println("Insira um valor:");
    numero = sc.nextInt();
    
    for (int i = 1; i <= numero; i ++){
      fatorial = fatorial * i;
    }    
  
  System.out.println("O fatorial de " + numero + " é " + fatorial);  
  }
  }