public class Funcionario extends Pessoa {
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario(); 

	}
	

	public static void main(String[] args) {
		
	
	Pessoa w = new Funcionario();
	
	w.setNome("William da Cunha");
	w.setTelefone("(83) 98888-8888");
	w.setEndereco("Av. Esperança da Paz, 001");
	w.setCargo("BackEnd");
	w.setProfissao("Programador");
	w.setSalario(6500.0); //nesta linha vai ser gerado o salário + 10% de bonificação.
	
	
	System.out.println(w.getNome() +"\n"+ w.getTelefone() +"\n"+ w.getEndereco() 
						+"\n"+ w.getProfissao() +" - "+ w.getCargo() +"\n"+ w.getBonificacao());

	
	
	}
}
