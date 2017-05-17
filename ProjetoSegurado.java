/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 31312020
 */
public class ProjetoSegurado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lerInt = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de segurados: ");
        int quantidade = lerInt.nextInt();
        
        Scanner lerLine = new Scanner(System.in);
        Scanner lerLong = new Scanner(System.in);
        
        ArrayList<Segurado> segurados = new ArrayList<Segurado>();
        ArrayList<PlanoSaude> planos = new ArrayList<PlanoSaude>();        
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print("\nDigite o nome do segurado: ");
            String nome = lerLine.nextLine(); 
            System.out.print("Digite o cpf do segurado: ");
            long cpf = lerLong.nextLong(); 
            
            Segurado segurado = new Segurado(nome,cpf); 
            segurados.add(i,segurado);             

            System.out.print("Digite o numero de autorizacao do Plano de Saude: ");
            int numeroAutorizacao = lerInt.nextInt();
            
            PlanoSaude plano = new PlanoSaude(numeroAutorizacao);
            planos.add(i,plano);
            
            segurado.getPlano().add(plano);
            plano.getSegurado().add(segurado);
            
            System.out.println("\nNome do segurado: "+ plano.getSegurado().get(0).getNome());
            System.out.println("Numero do plano de saude: "+ segurado.getPlano().get(0).getNumeroAutorizacao());
               
            Procedimento procedimento = new Procedimento();
            procedimento.tipoProcedimento();
            
            Autorizacao autorizacao = new Autorizacao();           
            autorizacao.autorizacao();
            
        }
        
        
        
        
        
    }
    
}
