// Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre 
// os números superiores a cinquenta e suas respectivas posições. O programa deverá 
// mostrar mensagem se não existir nenhum número nessa condição

import java.util.Scanner;
public class Exercicio3{

public static void main (String[] args)
{
    int i;
    int num[] = new int[10];
    boolean achou;
    Scanner entrada;
    entrada = new Scanner(System.in);
    System.out.println("Mostrando números de um vetor > 50 e suas posições no vetor:");
    for (i=1;i<10;i++){
        System.out.println("Informe o"+i+"º número:");
        num[i] = entrada.nextInt();
        //System.out.println(num[i]);//alterado da web
    }
        achou = false;
        for (i=1;i<10;i++){
            if(num[i] > 50){
        System.out.println("Número maior que 50:"+num[ i ]+" - Posição "+i);
        achou = true;
            }else{
        System.out.println("Não foram informados números maiores que 50");
    }
        }
}
 }

