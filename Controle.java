public class Controle {
	private double totalDebonus;
	
	public double getTotalDeBonus() {
		return this.totalDebonus;
	}
	
	public double calculaTotalDeBonus(Funcionario f) {
		return this.totalDebonus = this.totalDebonus + f.bonifica();
	}
}

