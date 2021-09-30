/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;
import static java.time.Clock.system;
import javax.swing.JOptionPane;
import produto.Produto;

/**
 *
 * @author Aluno
 */
public class Principal {
    
    
    public static void main(String[] args){
        
        Produto p = new Produto(0,"Celular Lg k40","Celular com tecnologia do século 40",0,12345);
        
        JOptionPane.showMessageDialog(null, 
                "O primeiro produto possui id " + p.getId() +
                        "\nO nome é "+ p.getNome() +
                        "\nA descrição é "+ p.getDescricao() +
                        "\nO número de série é " + p.getNúmero_de_serie(), "Exibindo primeiro cadastro", 1);
        
        Produto p2 = new Produto();
        
        p2.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o novo id:")));
        p2.setNome(JOptionPane.showInputDialog("Digite o novo nome:"));
        p2.setDescricao(JOptionPane.showInputDialog("Digite a nova descrição:"));
        p2.setNúmero_de_serie(Integer.parseInt(JOptionPane.showInputDialog("Digite novo número de serie:")));
        
         
        JOptionPane.showMessageDialog(null, 
                "O novo produto possui id " + p2.getId() +
                        "\nO nome é "+ p2.getNome() +
                        "\nA descrição é "+ p2.getDescricao() +
                        "\nO número de série é " + p2.getNúmero_de_serie(), "Exibindo primeiro cadastro", 1);
        
        
    }
    
    
    
    
}
