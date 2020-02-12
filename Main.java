package projeto;

import java.util.*;
/*
 * @author Victor
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Conta> lc = new ArrayList();
        Conta c1;
        String aux;
        boolean j = true;
        int opcao = 0,numero;
        Menu m = new Menu();
        
        do{
            System.out.println("--Menu--");
            
            System.out.println("(1) Criar conta");
            System.out.println("2) Logar");
            System.out.println("3) Recuperar senha");
            System.out.println("4) Excluir conta");
            System.out.println("0) Sair");
            
            System.out.print("Escolha a opção:");
            while(j){
                try{
                    opcao = Integer.parseInt(in.next());
                    in.nextLine();
                    break;
                }catch(NumberFormatException e){
                    System.out.println("Digite apenas numeros inteiros!");
                }
            }
            
            switch (opcao){
                case 1:
                    c1 = new Conta();
                    
                    System.out.println("Digite seu nome");
                    aux = in.nextLine();
                    c1.setNome(aux);
                    
                    System.out.println("Digite sua senha");
                    String pSenha = in.nextLine();
                    c1.setSenha(pSenha);
                    
                    System.out.println("Digite seu cpf");
                    String pCpf = in.nextLine();
                    c1.setCpf(pCpf);             
                    
                    c1.DadosConta();
                    lc.add(c1);
                    
                    break;
                case 2:
                    System.out.println("Digite seu nome");
                    String nome = in.nextLine();
                    int id;
                    boolean existe = false;
                    boolean existes;
                    
                    for(Conta pesquisa : lc){
                        
                        if(pesquisa.verificadorNome(nome)){
                            id = pesquisa.getId();
                            existe = true;
                        }else{
                            System.out.println("Usuario não existe");
                        }
                    }
                    if(existe){
                        System.out.println("Digite sua senha");
                        String senha = in.nextLine();
                        
                        for(Conta pesquisa : lc){
                        
                            if(pesquisa.verificadorSenha(senha)){
                                id = pesquisa.getId();
                                existes = true;
                                if(existes){    
                                    System.out.println("Voce esta logado");
                                    m.Menu(pesquisa);
                                }
                            }else{
                                System.out.println("Usuario não existe");
                            }
                        }                 
                    } 
                    break;
                case 3:
                    System.out.println("Digite seu cpf");
                    String cpf = in.nextLine();
                    
                        lc.forEach((pesquisa) -> {                       
                            pesquisa.verificadorCpf(cpf);
                        });
                    
                    break;
                case 4:
                    
                    System.out.println("Deseja mesmo excluir sua conta?\n1- Sim\n2- Não");
                        int excluirE = in.nextInt();
                            if(excluirE == 1){
                                System.out.println("Digite seu cpf");
                                String cpf2 = in.nextLine();
                                in.nextLine();

                                for (Conta contaa : lc) {
                                    if(contaa.getCpf().equals(cpf2)){

                                        System.out.println("Digite sua senha");
                                        String senha2 = in.nextLine();                                      

                                        if(contaa.verificadorSenha(senha2)){
                                            contaa.setNome(null);
                                            contaa.setCpf("0");
                                            lc.remove(contaa);
                                            System.out.println("Conta excluída");
                                        }else{
                                            System.out.println("Senha incorreta\nOperação cancelada");
                                        }                                                                   
                                    }
                                    break;
                                }
                            }else{
                                System.out.println("Operação cancelada");
                            }
                    break;               
                default:
                    if(opcao == 0){
                        System.out.println("Deslogado");
                        
                    }
                    break;
            }
            
        }while(opcao!=0);
    }
}