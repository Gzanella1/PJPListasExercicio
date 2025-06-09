package listaPOO.listaPoo_3;

public class Curso {
	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos =new Aluno[5];
	
	
	public void adicionarAluno(Aluno a) {
		for (int i = 0; i < alunos.length; i++) {
			alunos[i]=a;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
