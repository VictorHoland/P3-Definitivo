package projeto;

/*
 * @author Victor
 */
public class Conta {
    private String cpf;
    private final int id;
    private String nome;
    private String senha;
    static int qtdcontas = 0;
    
    public Conta (){        
        qtdcontas++;
        this.id = qtdcontas;
    }
    
    public void setNome(String pNome){
        this.nome = pNome;
    }
    
    public  String getNome(){
        return this.nome;
    } 
    
    public  int getId(){
        return this.id;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String pCpf){
        this.cpf = pCpf;
    }
    
    public String getSenha(){
        return this.senha;
    }
    
    public void setSenha(String pSenha){
        this.senha = pSenha;
    }
    
    public boolean verificadorNome(String n){
        return n.equals(this.nome);
    }
    
     public boolean verificadorSenha(String s){
        return s.equals(this.senha);
    }
     
     public void verificadorCpf(String pCpf){
        if(pCpf.equals(this.cpf)){
            System.out.println(getSenha());
        }else{
            System.out.println("Cpf não cadastrado ou Inválido");
        }
    }
        
            
    public void DadosConta(){
        System.out.println("Dados da Conta");
        System.out.println("Seja bem vindo(a)"+ getNome());
    }
    
    
            
}