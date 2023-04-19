
public class Cliente extends Pessoa {
	public static void main(String[] args) {
		
	
	Pessoa c1 = new Cliente();
	
	c1.setNome("João");
	c1.setTelefone("(83) 99999-9999");
	c1.setEndereco("Rua Da Independência, 002");
	c1.setProfissao("Advogado");
	c1.setCargo("Assistente Jurídico Jr.");
	
	System.out.println(c1.getNome() +"\n"+ c1.getTelefone() +"\n"+ c1.getEndereco() 
						+"\n"+ c1.getProfissao() + " - " + c1.getCargo());
}
}