import java.util.Scanner;

public class Menu {
	
	DadosPessoais objDadosPessoais;
	DadosdeContato objDadosdeContato;
	DadosEndereço objDadosEndereco;
	
	public void exibirMenu() {
		
		int opcao = 0;
		Scanner objScanner = new Scanner(System.in);
		
		while (opcao != 5) {
			
			System.out.println("ESCOLHA UMA OPÇÃO PELO NUMERO: ");
			System.out.println("1- DIGITE OS DADOS PESSOAIS");
			System.out.println("2- DIGITE OS DADOS DE CONTATO ");
			System.out.println("3- DIGITE OS DADOS DE ENDEREÇO ");
			System.out.println("4- EXIBIR DADOS");
			System.out.println("5- SAIR ");
		
			opcao = objScanner.nextInt();

			switch (opcao) {
			
			case 1:
				objDadosPessoais = new DadosPessoais();
				System.out.println("DIGITE O SEU NOME:");
				objDadosPessoais.setNome(objScanner.next());
				
				System.out.println("DIGITE O SEU SOBRENOME:");
				objDadosPessoais.setsobreNome(objScanner.next());
				
				System.out.println("DIGITE SUA DATA DE NASCIMENTO (MÍNIMO 10 CARACTERES -> DD/MM/AAAA):");
				objDadosPessoais.setDataNascimento(objScanner.next());
				
				System.out.println("DIGITE O SEU GENERO:");
				objDadosPessoais.setGenero(objScanner.next());
				break;
				
			case 2:
				objDadosdeContato = new DadosdeContato();
				System.out.println("DIGITE O SEU EMAIL:");
				objDadosdeContato.setemail(objScanner.next());
				
				System.out.println("DIGITE O SEU TELEFONE COM (XX) XXXXX-XXXX:");
				objDadosdeContato.settelefone(objScanner.next());
				break;
				
			case 3:
				objDadosEndereco = new DadosEndereço();
				System.out.println("DIGITE O SEU CEP:");
				objDadosEndereco.setCep(objScanner.next());
				
				System.out.println("DIGITE O SEU LOGRADOURO:");
				objDadosEndereco.setlogradouro(objScanner.next());
				
				System.out.println("DIGITE O NUMERO DE SUA RESINDENCIA:");
				objDadosEndereco.setnumero(objScanner.next());
				
				System.out.println("DIGITE O SEU BAIRRO:");
				objDadosEndereco.setbairro(objScanner.next());
				
				System.out.println("DIGITE O SEU CIDADE:");
				objDadosEndereco.setcidade(objScanner.next());
				
				System.out.println("DIGITE A SIGLA DE SEU ESTADO:");
				objDadosEndereco.setestado(objScanner.next());
				break;
				
			case 4:
				System.out.println("EXIBIR DADOS: ");
			
				System.out.println("NOME: " + objDadosPessoais.getNome());
				System.out.println("SOBRENOME: " + objDadosPessoais.getSobreNome());
				System.out.println("DATA DE NASCIMENTO: " + objDadosPessoais.getDataNascimento());
				System.out.println("GENERO: " + objDadosPessoais.getGenero());
				
				System.out.println("EMAIL: " + objDadosdeContato.getEmail());
				System.out.println("TELEFONE: " + objDadosdeContato.getTelefone());
				
				System.out.println("CEP: " + objDadosEndereco.getCep());
				System.out.println("LOGRADOURO: " + objDadosEndereco.getLogradouro());
				System.out.println("NUMERO: " + objDadosEndereco.getNumero());
				System.out.println("BAIRRO: " + objDadosEndereco.getBairro());
				System.out.println("CIDADE: " + objDadosEndereco.getCidade());
				System.out.println("ESTADO: " + objDadosEndereco.getEstado());
			}
		}
	}
}

