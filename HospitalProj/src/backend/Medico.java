package backend;

import java.util.ArrayList;

public class Medico extends Pessoa {
private String EspecMedico;

public Medico( String nome, String especialidade) {
	super(nome);
	if (especialidade == null) {
		setEspecMedico("Cardiologista"); //primeira opção do combobox por ordem alfabética
	} else {
	setEspecMedico(especialidade);
	}
	setId(setIdEmLista());
}

public static ArrayList<Medico> Medicos = new ArrayList<Medico>();

public String getEspecMedico() {
	return EspecMedico;
}

public void setEspecMedico(String especMedico) {
	this.EspecMedico = especMedico;
}

@Override
public int setIdEmLista() {
	int idMed;
	if (Medico.Medicos.size() >0) {
		 idMed = (Medico.Medicos.get(Medico.Medicos.size() -1).getId()) + 1; //pega o ID do ultimo item da lista (index tamanho - 1) e retorna um novo id que é um numero a mais. dessa forma cada novo objeto Paciente terá um id diferente e imutável, independente se itens anteriores foram deletados
	}else {
		idMed = 0; //significa que se nenhum item for deletado o index sempre será igual ao id
	}
	return idMed;
	
}

}
