package HerancaJPA;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class ClienteD extends Pessoa{
						
	private String email;
	
	private String endereco;
	
	private String telefone;
	
	public ClienteD() {
		// TODO Auto-generated constructor stub
	}

	public ClienteD(String email, String endereco, String telefone) {
		super();
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
