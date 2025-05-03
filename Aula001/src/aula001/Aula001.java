//Leia um número inteiro e imprima o seu antecessor eseu sucessor.//

package aula001;
import java.util.Scanner;

public class Aula001 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Scanner → é uma classe do Java (fica em java.util.Scanner) que serve pra ler entradas de dados: teclado, arquivos, etc. 
        //teclado → é o nome da variável que você está criando. Você poderia chamar de qualquer nome, tipo entrada, leitor, etc.
        //new Scanner(System.in) → cria um novo objeto Scanner que vai ler os dados digitados pelo usuário via teclado (System.in. 
        
        System.out.println("Digite um numero:");
        int numero = teclado.nextInt(); //Esperar o usuário digitar um número inteiro 
                                        //O Scanner (teclado) vai ficar parado esperando o usuário digitar algo no terminal. Ler esse número
                                        //O método nextInt() lê um número inteiro digitado pelo usuário. Guardar o valor na variável numero
                                        //A variável numero, do tipo int, vai armazenar o valor digitado.


        
        
        
        
        
        
        int antecessor = numero -1, sucessor = numero + 1 ;
        
        System.out.println("O conteudo da variavel numero e: " + numero);
        
        System.out.println("O antecessor: " + antecessor );
        
        System.out.println("O sucessor: " + sucessor);
       
    }
    
}
