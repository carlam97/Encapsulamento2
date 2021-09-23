public class Controle {              // declarando classe publica de controle
	private double totalDebonus;     // total de bonus variavel privada
	
	public double getTotalDeBonus() {
		return this.totalDebonus;
	}
	
	public double calculaTotalDeBonus(Funcionario f) {
		return this.totalDebonus = this.totalDebonus + f.bonifica();
	}
}

