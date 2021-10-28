package pct;

import java.util.Scanner;

/**
 *
 * @author Fernando note
 */
public class CalcNovafernando{
    //Realiza a leitura de dados enviados pelo usuário
    
    public static void main(String[] args) {
        //Variaveis
        int v1, v2, total, escolha;
        v1 = 0;
        v2 = 0;
        
        //Objeto que captura comandos do teclado
        Scanner entrada = new Scanner (System.in);
        
        do{
            //Apresentação
            System.out.println("\n\t Calculadora Simples \n");

            //Menu
            System.out.println("1 para adição ");
            System.out.println("2 para subtração ");
            System.out.println("3 para multiplicação");
            System.out.println("4 para divisão");
            System.out.println("5 para sair");

            //opção usuário
            System.out.print("\nEscolha a operação que deseja: ");
            escolha = entrada.nextInt();
            
            if (escolha > 0 && escolha < 5) {
                //Entrada de dados 
                System.out.print("\nDigite o primeiro número: ");
                v1 = entrada.nextInt(); //Grava o número que o usuario digita na váriavel 1  
                System.out.print("Digite o segundo número: ");
                v2 = entrada.nextInt(); //Grava o numero que o usuário digitar na variavel 2
            }    

           switch (escolha) {
               case 1:            
                    //Soma dos números            
                    total = v1 + v2;

                    //Saída
                    System.out.println("A soma dos valores é: " + total);
                    break;
                case 2:
                    // Subtração dos números
                    total = v1 - v2; 

                    //Saída
                    System.out.println("A subtração dos valores é: " + total);              
                    break;
                case 3:
                    // Subtração dos números
                    total = v1 * v2; 

                    //Saída
                    System.out.println("A multiplicação dos valores é: " + total);              
                    break;
                case 4:
                    // Subtração dos números
                    total = v1 / v2; 

                    //Saída
                    System.out.println(" A divisão dos valores é: " + total);              
                    break;
                case 5:
                    System.out.println("\nSaindo ....");              
                    break;
                default:    
                    System.out.printf("Opção %d inválida !!!\n\n",escolha);
            }
        }while(escolha!= 5);
    }
}
