public abstract class Funcionario {   // definindo classe abstrata
	protected String nome;             // protege a variavel nome
	protected String departamento;     // protege a variavel departamento
	protected double salario;          // protege a variavel salario
	protected String dataDeEntrada;    // protege a variavel dataDeEntrada
	protected String rg;                // protege a variavel rg
	protected boolean estaNaEmpresa;    // protege a variavel estaNaEmpresa
	
	public String getNome() {            // acessar o metodo publico nome
		return nome;                      //consultar o nome
	}
	public void setNome(String nome) {      // atribuir um nome
		this.nome = nome;                 // trabalhando com esses atributos da classe
	}
	public String getDepartamento() {        // acessar o metodo publico departamento
		return departamento;                  //consultar o departamento
	}
	public void setDepartamento(String departamento) {      // atribuir um departamento
		this.departamento = departamento;                    // trabalhando com esses atributos da classe
	}
	public double getSalario() {               // acessar o metodo publico salario
		return salario;                         //consultar o salario
	}
	public void setSalario(double salario) {       // atribuir um salario
		this.salario = salario;                    // trabalhando com esses atributos da classe
	}
	public String getDataDeEntrada() {          // acessar o metodo publico data de entrada
		return dataDeEntrada;                   //consultar a data de entrada
	}
	public void setDataDeEntrada(String dataDeEntrada) {     // atribuir uma data de entrada
		this.dataDeEntrada = dataDeEntrada;                   // trabalhando com esses atributos da classe
	}
	public String getRg() {                         // acessar o metodo publico rg
		return rg;                                   //consultar o rg
	}
	public void setRg(String rg) {                   // atribuir um rg
		this.rg = rg;                                // trabalhando com esses atributos da classe
	}
	public boolean isEstaNaEmpresa() {              // criando classe pra esta na empresa
		return estaNaEmpresa;                       // consultar 
	}
	public void setEstaNaEmpresa(boolean estaNaEmpresa) {      // atribuir um valor inalterável
		this.estaNaEmpresa = estaNaEmpresa;                      // trabalhando com esses atributos da classe
	}
	
	public void calculaSalario(double valor) {           // atribuir um valor inalterável para o calculo do salario
		this.salario = valor - (valor * 0.06);         // atributos do calculo do salario 
	}

	public void calculaSalario(double valor, double horaExtra) {   //  atribuir um valor inalterável para hora extra
		double valorHorasExtra = (valor/30) / 8 * horaExtra;       // calculando
		this.salario = valor - (valor*0.06) + valorHorasExtra;   // atributos do calculo feito
	}

	public double  calculaSalario() {                                  // atribuir um valor  
		return this.salario = this.salario - (this.salario * 0.06);    // retorno do calculo feito
	}

	public double bonifica(){                            // atribuir um valor 
		return this.salario * 0.10;                      // retorno do calculo 
	}
	
	public void demite() {                 
		estaNaEmpresa = false;
	}

	public double calculaGanhoAnual() {    
		return salario * 12;        // retorna o calculo do salrio
	}
	
	

}
