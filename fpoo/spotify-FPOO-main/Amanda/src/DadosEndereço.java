
public class DadosEndereço {
	private String Cep;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	//INICIO CEP//
		public void setCep(String Cep) {
			
			if(Cep.isEmpty()) {
				System.out.println("INFORME SEU CEP");
				System.exit(0);
			}else {
				int tamanho = Cep.length();
				if(tamanho < 3) {
					System.out.println("MINÍMO DE TRÊS CARACTERES");
				}else {
					this.Cep = Cep;
				}
			}
			
		}
	//FIM CEP//
		

	public String getLogradouro() {
			return logradouro;
		}


		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}


		public String getNumero() {
			return numero;
		}


		public void setNumero(String numero) {
			this.numero = numero;
		}


		public String getBairro() {
			return bairro;
		}


		public void setBairro(String bairro) {
			this.bairro = bairro;
		}


		public String getCidade() {
			return cidade;
		}


		public void setCidade(String cidade) {
			this.cidade = cidade;
		}


		public String getEstado() {
			return estado;
		}


		public void setEstado(String estado) {
			this.estado = estado;
		}


		public String getCep() {
			return Cep;
		}


		//INICIO LOGRADOURO//
		public void setlogradouro(String logradouro) {
			
			if(logradouro.isEmpty()) {
				System.out.println("INFORME SEU LOGRADOURO");
				System.exit(0);
			}else {
				int tamanho = logradouro.length();
				if(tamanho < 3) {
					System.out.println("MINÍMO DE TRÊS CARACTERES");
				}else {
					this.logradouro = logradouro;
				}
			}
		}
	//FIM LOGRADOURO//

		
	//INICIO NUMERO//
		public void setnumero(String numero) {
	
			if(numero.isEmpty()) {
				System.out.println("INFORME SEU NUMERO");
				System.exit(0);
			}else {
		int tamanho = numero.length();
		if(tamanho < 2) {
			System.out.println("MINÍMO DE DOIS CARACTERES");
		}else {
			this.numero = numero;
			}
		}
	}
	//FIM NUMERO//


	//INICIO BAIRRO//
		public void setbairro(String bairro) {
	
			if(bairro.isEmpty()) {
				System.out.println("BAIRRO OBRIGATÓRIO");
				System.exit(0);
			}else {
				this.bairro = bairro;
			}
		}
	//FIM BAIRRO//
	
	
	//INICIO CIDADE//
		public void setcidade(String cidade) {
		
			if(cidade.isEmpty()) {
				System.out.println("CIDADE OBRIGATÓRIO");
				System.exit(0);
			}else {
				this.cidade = cidade;
		}
	}
	//FIM CIDADE//


	//INICIO ESTADO//
		public void setestado(String estado) {
	
			if(estado.isEmpty()) {
		System.out.println("SIGLA DE SEU ESTADO OBRIGATÓRIO");
		System.exit(0);
			}else {
				int tamanho = estado.length();
				if(tamanho < 2) {
					System.out.println("MINÍMO DE DOIS CARACTERES");
				}else {
					this.estado = estado;
				}
			}
		}
	}
	//FIM ESTADO//


