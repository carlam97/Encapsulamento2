public class Gerente extends Funcionario{
	private String login;      // // restringindo o acesso a variável login
	private String senha;     // restringindo o acesso a variável senha
	
	public String getLogin() {    // acessar o metodo login
		return login;             // consultar o login
	}
	public void setLogin(String login) {     // atribuir um valor ao login
		this.login = login;        // atributos do login
	}
	public String getSenha() {     // acessar o metodo senha
		return senha;            // retorna a senha
	}
	public void setSenha(String senha) {  // atribuir valor a senha
		this.senha = senha;       // atributos do calculo feito
	}
		
	public double bonifica(){     // acessar bonifica
		return this.salario * 0.15;    // retorna o calculo do salario
	}
	
	
	public void autentica(String login, String senha) {      // atribuir um valor inalterável
		if((this.login == login) && (this.senha == senha)) {     // definindo condição
			System.out.println("Acesso Permitido!");   // imprime mensagem na tela
		}else{                                        // se não
			System.out.println("Acesso Negado!");     // imprime mensagem na tela
		}
	}
}
