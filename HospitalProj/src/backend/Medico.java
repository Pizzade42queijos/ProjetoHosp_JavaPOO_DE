package backend;

import java.util.ArrayList;

public class Medico extends Pessoa {
private String EspecMedico;

public Medico( String nome, String especialidade) {
	super(nome);
	if (especialidade == null) {
		setEspecMedico("Cardiologista"); //primeira op��o do combobox por ordem alfab�tica
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
		 idMed = (Medico.Medicos.get(Medico.Medicos.size() -1).getId()) + 1; //pega o ID do ultimo item da lista (index tamanho - 1) e retorna um novo id que � um numero a mais. dessa forma cada novo objeto Paciente ter� um id diferente e imut�vel, independente se itens anteriores foram deletados
	}else {
		idMed = 0; //significa que se nenhum item for deletado o index sempre ser� igual ao id
	}
	return idMed;
	
}

}
