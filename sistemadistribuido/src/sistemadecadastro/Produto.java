
package sistemadecadastro;

/**
 *
 * @author Pinhata
 */
public class Produto {
 
    private String nome;
    private String preco;
    
    public Produto(String nome, String preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setPreco(String preco){
        this.preco = preco;
    }
    
    public String getPreco(){
        return this.preco;
    }
    
}
