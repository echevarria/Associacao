/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploassociacao;

/**
 *
 * @author Avell B155 MAX
 */
public class ExemploAssociacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Aqui instanciamos um objeto do tipo Empresa
        Empresa google = new Empresa("Google");
        
        // Aqui instanciamos um objeto do tipo Empregado
        Empregado larry = new Empregado("Larry Page", "00876584738");
        
        // Aqui instanciamos um objeto do tipo Empregado
        Empregado sergey = new Empregado("Sergey", "85736478632");
        
        // Após os dois objetos do tipo Empregado criados, adicionamos eles na nossa Empresa criada
        google.adicionaEmpregado(larry);
        google.adicionaEmpregado(sergey);
        
        System.out.println("O total de empregados da nossa empresa é: " + google.totalEmpregados());
     
    }
    
}
