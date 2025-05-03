/*Crie um programa que receba um número inteiro positivo como entrada e imprima apenas o último dígito desse número.*/

package aula007;
import java.util.Scanner;
public class Aula007 {
    public static void main(String[] args) {
        
    Scanner porr = new Scanner(System.in);

// Solicita um número inteiro positivo
    System.out.print("Digite um número inteiro positivo: ");
    int numero = porr.nextInt();
    
    // Obtem o último dígito
    int ultimoDigito = numero % 10;
    
    // Exibe o último digito
    System.out.println("O último dígito é: " + ultimoDigito);
    
    porr.close();
}

}
    
    
    

