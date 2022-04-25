/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapilhaencadeada;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mefma
 */
public class JavaPilhaEncadeada {
    
   static Tdado leiaDado(){
      Tdado x = new Tdado();
      Scanner sc = new Scanner(System.in);
      System.out.println("Site:"); 
      x.setUrl(sc.nextLine()); 
      System.out.println("Data e Hora:"); 
      x.setData_hora(sc.nextLine()); 
      return x;
   }  
   
   static int menu(){
     int op;
        Scanner sc = new Scanner(System.in);
	System.out.println("*** Estrutura de Dados I ***");
	System.out.println("*** Pilha Encadeada ***");
	System.out.println("1-Push (Inserir)");
	System.out.println("2-Pop  (Remover)");
	System.out.println("3-Top  (Topo)");
	System.out.println("0-Sair");
 	op = Integer.parseInt(sc.nextLine());
	return op;
   }

    public static void main(String[] args) throws IOException {
        Pilha minhaPilha = new Pilha();
        int op=0;
        Tdado x;
       do{
        op = menu();
        switch(op){
            case 1:    x = leiaDado();
                       minhaPilha.push(x);
                       System.out.println(minhaPilha);
            break;
            case 2:   if(!minhaPilha.isEmpty()){ 
                         x = minhaPilha.pop();
                         System.out.println(minhaPilha);
                         System.out.println("Removido:"+x.getUrl());
                      }else
                        System.out.println("Vazio\n");
            break;
            case 0: System.out.println("Saindo\n");           
        }// fim switch

       }while(op!=0);
    }// fim main
    
}
