
public class Programa {       // declara classe publica
	public static void main(String[] args) {   // "Public" declara que esse método pode ser acessado por qualquer classe dentro e fora do projeto, "static" define esse método com estático, "void" é um tipo de retorno vazio, "main" é o nome do método, "String[] args" define o parâmetro de recebimento caso seja necessário o programa receber algum valor.
    Filme f = new Filme();           // Chamar o tipo da classe e o nome do objeto
    f.setCodigo(123);                // define o valor do código
    f.setNome("A Era do Gelo");      // define o nome
    f.setValor(2.50);                // define o valor
    f.devolver();                    // define a devolução
    f.mostra();                      //	define mostra
    f.retirar();                     // define a retirada
    f.mostra();                      // define mostra
    
    try {                               // bloco protegido
        f.retirar();                    // definição da retirada
    } catch (RuntimeException e) {      // caso ocorra um erro sofrerá o devido tratamento de erro
        System.out.println(e.getMessage());    // imprimir mensagem na tela
    }
    
    
}
}

		
		Vendedor v = new Vendedor();        // criando objeto para acessar outra classe
		v.setDataDeEntrada("10/01/2010");    // definido valor
		v.setDepartamento("Vendas");
		v.setEstaNaEmpresa(true);
		v.setNome("Eduardo");
		v.setRg("45");
		//v.calculaSalario();		
		 
		
		Gerente g1 = new Gerente();         // criando objeto para acessar outra classe
		g1.departamento = "Vendas";          // definido valor
		g1.dataDeEntrada = "03/02/1990";        
		g1.estaNaEmpresa = true;
		g1.nome = "Eric";		
		g1.rg = "48";
		g1.salario = 3500.0;
		//g1.calculaSalario();
		
		
		g1.setLogin("eric");
		g1.setSenha("123");
		
		Supervisor supervisor = new Supervisor();   // criando objeto para acessar outra classe
		supervisor.salario = 5000.0;                // definido valor
		
		ControleDeBonificacao controle = new ControleDeBonificacao();   // criando objeto para acessar outra classe
		controle.calculaTotalDeBonus(v);         // definindo valor
		controle.calculaTotalDeBonus(g1);         // definindo valor
		controle.calculaTotalDeBonus(supervisor); //definindo valor
			
		System.out.println(v.getDataDeEntrada());   // Imprime na tela a data de entrada
		System.out.println(v.getDepartamento()); // Imprime na tela o departamento
		System.out.println(v.getNome());          // Imprime na tela o nome
		System.out.println(v.getRg());            // Imprime na tela o rg
		System.out.println(v.getSalario());      // Imprime na tela o salario
		System.out.println(v.isEstaNaEmpresa());    // Imprime na tela esta na empresa
		System.out.println(v.bonifica());         // Imprime na tela bonifica
		
		
		System.out.println("//////////////////////////////");    // imprimi na tela para separar informações
		g1.autentica("eric", "124");
		System.out.println(g1.getDataDeEntrada());      // Imprime na tela a data de entrada
		System.out.println(g1.getDepartamento());       // Imprime na tela o departamento
		System.out.println(g1.getNome());                // Imprime na tela o nome
		System.out.println(g1.getRg());                  // Imprime na tela o rg
		System.out.println(g1.getSalario());	    	// Imprime na tela o salario
		System.out.println(g1.bonifica());            // Imprime na tela bonifica
		
		
		System.out.println("Total de bonus: R$" + controle.getTotalDeBonus());   // imprime na tela a mensagem
		
		
	}
}