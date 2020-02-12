package projeto;

/*
 * @author Victor
 */
abstract class Funcionario implements Contrato{
    
    private String nome;
    private int idade;
    protected int salario;
    private String cpf;
    private String funcao;
    protected boolean disponibilidade = true;
    public int qntdFuncionario = 0;
    public int idFuncionario;
    Funcionario f1;
    
    public Funcionario(String pNome,int pIdade ,int pSalario ,String pCpf ,String pFuncao){
        
        this.nome = pNome;
        this.idade = pIdade;
        this.salario = pSalario;
        this.cpf = pCpf;
        this.funcao = pFuncao; 
        
        qntdFuncionario++;
        this.idFuncionario = qntdFuncionario;
    }

    @Override
    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    @Override
    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    @Override
    public void bonus(){
        this.salario = this.salario + 200;
    }
    
    @Override
    public void puniçao(){
        this.salario = this.salario - 200;
    }
}
