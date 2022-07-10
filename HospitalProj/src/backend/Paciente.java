package backend;


import java.util.ArrayList;

public class Paciente extends Pessoa {
private String SexoPaciente;
private int IdadePaciente;

public Paciente(String nome, int idade, String sexo) {
	super(nome);
	if(sexo == null) {
		setSexoPaciente("Masculino");
	}
	setSexoPaciente(sexo);
	setIdadePaciente(idade);
	setId(setIdEmLista());
}

public static ArrayList<Paciente> Pacientes = new ArrayList<Paciente>();

public String getSexoPaciente() {
	return SexoPaciente;
}

public void setSexoPaciente(String sexoPaciente) {
	SexoPaciente = sexoPaciente;
}

public int getIdadePaciente() {
	return IdadePaciente;
}

public void setIdadePaciente(int idadePaciente) {
	IdadePaciente = idadePaciente;
}

@Override
public int setIdEmLista() {
	int idPac;
	if (Paciente.Pacientes.size() >0) {
		 idPac = (Paciente.Pacientes.get(Paciente.Pacientes.size() -1).getId()) + 1; //pega o ID do ultimo item da lista (index tamanho - 1) e retorna um novo id que é um numero a mais. dessa forma cada novo objeto Paciente terá um id diferente e imutável, independente se itens anteriores foram deletados
	}else {
		idPac = 0; //significa que se nenhum item for deletado o index sempre será igual ao id
	}
	return idPac;
	
}

// podem ser feito metodos de cadastrar ou excluir cadastro do paciente similar a como funcionaria o marcar e desmarcar consulta

}
