package projeto;

import java.util.*;

/**
 *
 * @author Victor
 */
public class AdmMenu {
    
    int opcaoadmMenu;
    Funcionario fun;
    Scanner in = new Scanner(System.in);
    ArrayList<Funcionario> fc = new ArrayList();
    boolean j = true;
    
    public boolean verificarDisponibilidade(){
        
        boolean disp1 = false;
        boolean disp2 = false;
        boolean disp3 = false;
        
        for(Funcionario fn: fc){
            if(fn.getFuncao().equals("Piloto")){
                disp1 = fn.getDisponibilidade();                
            }
            if(fn.getFuncao().equals("Aeromoça")){
                disp2 = fn.getDisponibilidade();                
            }
            if(fn.getFuncao().equals("Faxineiro")){
                disp3 = fn.getDisponibilidade();                
            }
            if(disp1 && disp2 && disp3){
                
                for(Funcionario fnAux: fc){
                    if(fnAux.getFuncao().equals("Piloto")){
                        fnAux.setDisponibilidade(false);                
                    }
                    if(fnAux.getFuncao().equals("Aeromoça")){
                        fnAux.setDisponibilidade(false);                
                    }
                    if(fnAux.getFuncao().equals("Faxineiro")){
                        fnAux.setDisponibilidade(false);                
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    
    public void agendaCancelada(){
        
        for(Funcionario fnn: fc){
            if(fnn.getFuncao().equals("Piloto")){
                if(!fnn.getDisponibilidade())
                fnn.setDisponibilidade(true);
            }
            if(fnn.getFuncao().equals("Aeromoça")){
                if(!fnn.getDisponibilidade())  
                fnn.setDisponibilidade(true);
            }
            if(fnn.getFuncao().equals("Faxineiro")){
                if(!fnn.getDisponibilidade())
                    fnn.setDisponibilidade(true);                
            }
            
        }
    }
    
    public void AdmMenu(){             
        opcaoadmMenu = 0;
        
        do{
            System.out.println("\t\t## Gestao dos Funcionários :: ##");
            System.out.println("\n                  ==============================");
            System.out.println("                  |     1 - Adicionar funcionário              |");
            System.out.println("                  |     2 - Demitir funcionário                |");
            System.out.println("                  |     3 - Ver lista de funcionários          |");
            System.out.println("                  |     4 - Alterar dados do funcionário       |");
            System.out.println("                  |     5 - Bonificar funcionário              |");
            System.out.println("                  |     6 - Punir funcionário              |");
            System.out.println("                  |     0 - Sair                               |");
            System.out.println("                  ==============================\n");
            System.out.print("Digite sua Opcao -> ");
            
            try {
                opcaoadmMenu = in.nextInt();
            } catch (java.util.InputMismatchException e) {
                in.nextLine();
                continue;
            }
            
                switch(opcaoadmMenu){
                    case 0:
                        //System.out.println(c1.DadosConta());
                        System.out.println("Saindo do modo gerenciador");
                        break;
                    case 1:    
                        System.out.println("Deseja adicionar um funcionário?\n1- Sim\n2- Não");
                        int adicionar = 0;

                        while(j){
                            try{
                                adicionar = in.nextInt();
                                in.nextLine();
                                break;
                            }catch(NumberFormatException e){
                                System.out.println("Digite apenas os valores listados");
                            }
                        }
                            
                        
                        if(adicionar == 1){
                            System.out.println("Digite os dados do funcionário");                          
                            
                            System.out.println("Digite o nome do funcionário");
                            String fNome = in.nextLine();

                            System.out.println("Digite a idade do funcionário");
                            int fIdade = 0;
                                while(j){
                                    try{
                                        fIdade = in.nextInt();
                                        in.nextLine();
                                        break;
                                    }catch(InputMismatchException e){
                                        in.nextLine();
                                        System.out.println("Digite apenas numeros inteiros");
                                    }
                                }
                                while(j){
                                    if(fIdade > 80 || fIdade < 18){
                                        System.out.println("Digite uma idade vÃ¡lida");
                                        while(j){
                                            try{
                                                fIdade = in.nextInt();
                                                break;
                                            }catch(NumberFormatException e){
                                                System.out.println("Digite apenas numeros inteiros");
                                            }
                                        }
                                    }else break;
                                }

                            System.out.println("Digite o cpf do funcionário");
                            String fCpf = in.nextLine();

                            System.out.println("Escolha a função do funcionário:\n1- Piloto\n2-Aeromoça(o)\n3- Faxineiro");
                            int escolhafuncao = 0;
                            
                            while(j){
                                try{
                                    escolhafuncao = in.nextInt();
                                    break;
                                }catch(NumberFormatException e){
                                    System.out.println("Digite apenas os valores listados");
                                }
                            }
                            while(j){
                                if(escolhafuncao < 1 || escolhafuncao > 3){
                                    System.out.println("Digite apenas os valores listados");
                                    while(j){
                                        try{
                                            escolhafuncao = in.nextInt();
                                            break;
                                        }catch(NumberFormatException e){
                                            System.out.println("Digite apenas os valores listados");
                                        }
                                    }
                                }else break;
                            }
                            String fFuncao;
                                    
                            if(escolhafuncao == 1){
                                fFuncao = "Piloto";
                            }else if(escolhafuncao == 2){
                                fFuncao = "Aeromoça";
                            }else{
                                fFuncao = "Faxineiro";
                            }

                            System.out.println("Digite o salário");
                            int fSalario = 0;
                            
                            while(j){
                                try{
                                    fSalario = in.nextInt();
                                    break;
                                }catch(NumberFormatException e){
                                    System.out.println("Digite apenas valores válidos (Números inteiros)");
                                }
                            }
                            while(j){
                                if(fSalario < 998 || fSalario > 75000){
                                    System.out.println("Digite apenas valores válidos (N > 998 ou 75000 < N)");
                                    fSalario = in.nextInt();
                                }else break;
                            }
                            
                            
                            switch (fFuncao) {
                                case "Piloto":                            
                                    fun = new Piloto(fNome,fIdade,fSalario,fCpf,fFuncao);
                                    fc.add(fun);
                                    break;
                                case "Aeromoça":
                                    fun = new Aeromoça(fNome,fIdade,fSalario,fCpf,fFuncao);
                                    fc.add(fun);
                                    break;
                                case "Faxineiro":
                                    fun = new Faxineiro(fNome,fIdade,fSalario,fCpf,fFuncao);
                                    fc.add(fun);
                                    break;
                                default:
                                    System.out.println("Digite o nome corretamente!");
                                    break;
                            }

                            System.out.println("Funcionario adicionado co sucesso!");
                        }       
                        
                        break;
                    case 2:
                        System.out.println("Deseja demitir um funcionário\n1- Sim\n2- Não");
                        int demitir = 0;
                        
                        while(j){
                            try{
                                demitir = in.nextInt();
                                break;
                            }catch(NumberFormatException e){
                                System.out.println("Digite apenas valores válidos");
                            }
                        }
                        while(j){
                            if(demitir < 1 || demitir > 2){
                                System.out.println("Digite apenas os valores listados");
                                while(j){
                                    try{
                                        demitir = in.nextInt();
                                        break;
                                    }catch(NumberFormatException e){
                                        System.out.println("Digite apenas valores válidos");
                                    }
                                }
                            }else break;
                        }
                        
                        
                        if(demitir ==  1){                           
                            System.out.println("Digite os dados do funcionário");
                            System.out.println("Digite o cpf do funcionário");
                            String fCpf2 = in.nextLine();

                            for(Funcionario fdemitir : fc){
                                if(fCpf2.equals(fdemitir.getCpf())){    
                                    System.out.println(fdemitir.getCpf());
                                    System.out.println(fdemitir.getNome());
                                    System.out.println(fdemitir.getIdade());
                                    System.out.println(fdemitir.getFuncao());
                                    System.out.println(fdemitir.getSalario());

                                    System.out.println("Deseja demiti-lo?\n1- Sim\n2- Não");
                                    int demissao = in.nextInt();

                                    if(demissao == 1){
                                        fdemitir.setCpf("0");
                                        fdemitir.setNome(null);
                                        fc.remove(fdemitir);
                                    }
                                    break;
                                }                  
                            }
                        }   
                        
                        break;
                    case 3:
                        System.out.println("Deseja ver os funcionários contratados?\n1- Sim\n2- Não");
                        int lista = 0;
                               
                        while(j){
                            try{
                                lista = in.nextInt();
                                break;
                            }catch(NumberFormatException e){
                                System.out.println("Digite apenas valores válidos");
                            }
                        }        
                        while(j){
                            if(lista < 1 || lista >2){
                                System.out.println("Digite apenas os valores listados");
                            }else break;
                        }
                        
                        if(lista == 1){
                            fc.stream().map((listar) -> {
                                System.out.println("=======================================");
                                return listar;
                            }).map((listar) -> {
                                System.out.println(listar.getCpf());
                                return listar;
                            }).map((listar) -> {
                                System.out.println(listar.getNome());
                                return listar;
                            }).map((listar) -> {
                                System.out.println(listar.getIdade());
                                return listar;
                            }).map((listar) -> {
                                System.out.println(listar.getFuncao());
                                return listar;
                            }).map((listar) -> {
                                System.out.println(listar.getSalario());
                                return listar;
                            }).map((listar) -> {
                                System.out.println(listar.getDisponibilidade());
                                return listar;
                            }).forEachOrdered((_item) -> {
                                System.out.println("=======================================");
                            });
                        }  
                        
                        break;                       
                    case 4:
                        System.out.println("Deseja alterar os dados de algum funcionário?\n1- Sim\n2- Não?");
                        int alterar = 0;
                        
                        while(j){
                            try{
                                alterar = in.nextInt();
                                break;
                            }catch(NumberFormatException e){
                                System.out.println("Digite apenas os valores listados");
                            }
                        }
                        while(j){
                            if(alterar < 1 || alterar > 2){
                                System.out.println("Digite apenas os valores listados");
                            }else break;
                        }
                        
                        if(alterar == 1){    
                            System.out.println("Digite o cpf do funcionário");
                            String aCpf = in.nextLine();
        
                            fc.stream().filter((alterar2) -> (aCpf.equals(alterar2.getCpf()))).map((alterar2) -> {
                                System.out.println("Deseja alterar a idade?\n1- Sim\n2- Não");
                                return alterar2;
                            }).map((alterar2) -> {
                                int idadeA = in.nextInt();
                                if(idadeA == 1){
                                    System.out.println("Digite a nova idade");
                                    idadeA =  0;
                                    while(j){
                                        try{
                                            idadeA = in.nextInt();
                                            break;
                                        }catch(NumberFormatException e){
                                            System.out.println("Digite apenas valores válidos");
                                        }
                                    }
                                    if(idadeA < 18 || idadeA > 80){
                                        System.out.println("Digite apenas valores válidos (Idade > 18 ou Idade < 80)");
                                    }
                                    
                                    alterar2.setIdade(idadeA);
                                }
                                return alterar2;
                            }).map((alterar2) -> {
                                System.out.println("Deseja alterar o salário?\n1- Sim\n2- Não");
                                return alterar2;
                            }).forEachOrdered((alterar2) -> {
                                int salarioA = in.nextInt();
                                if (salarioA == 1) {
                                    System.out.println("Digite o novo idade");
                                    salarioA = in.nextInt();
                                    alterar2.setSalario(salarioA);
                                }
                            });
                        }
                        break;
                    case 5:                     
                            System.out.println("Digite o cpf do funcionario");
                            in.nextLine();
                            String cpff = in.nextLine();
                            
                            
                            for(Funcionario fg: fc){
                                if(fg.getCpf().equals(cpff)){
                                    fg.bonus();
                                    System.out.println("Funcionário bonificado");
                                }
                            }
                            
                        break;
                    case 6:
                            System.out.println("Digite o cpf do funcionário");
                            in.nextLine();
                            String cpff2 = in.nextLine();
                            
                            
                            for(Funcionario fg: fc){
                                if(fg.getCpf().equals(cpff2)){
                                    fg.puniçao();
                                    System.out.println("Funcionário punido");
                                }
                            }
                        break;
                     default:  System.out.println("Voce digitou uma opcao incorreta!!");					
                }
	}while(opcaoadmMenu != 0);     
    }
}
    

