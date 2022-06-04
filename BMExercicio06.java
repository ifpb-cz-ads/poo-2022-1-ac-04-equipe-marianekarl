import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int numero = 1;
    
    while(numero != 0){
      System.out.print("Digite um número: ");
      Scanner num = new Scanner(System.in);
      numero = num.nextInt();
      
      switch(numero){
        case 1:
          System.out.println("domingo");
          break;
        case 2:
          System.out.println("segunda-feira");
          break;
        case 3:
          System.out.println("terça-feira");
          break;
        case 4:
          System.out.println("quarta-feira");
          break;
        case 5:
          System.out.println("quinta-feira");
          break;
        case 6:
          System.out.println("sexta-feira");
          break;
        case 7:
          System.out.println("sábado");
          break;
        default:
          System.out.println("não é possível realizar esta operação.");
      }
    }
  }
}