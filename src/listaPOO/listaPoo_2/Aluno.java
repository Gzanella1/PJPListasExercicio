package listaPOO.listaPoo_2;

public class Aluno {

	private String nome;
	private String matricula;
	private String curso;
	private String[] disciplinas = new String[3];
	private double[] notas = new double[3];
	
	
	public Aluno() {
	}

	public Aluno(String nome, String matricula, String curso, String[] disciplinas, double[] notas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplinas = disciplinas;
		this.notas = notas;
	}

	public boolean aprovado(String diciplina) {
		for (int i = 0; i < this.disciplinas.length; i++) {
			if (this.disciplinas[i].equalsIgnoreCase(diciplina)) {
				return this.notas[i] >= 7;
			}
		}
		return false;
	}

	public void consultar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Curso: " + this.curso);

		System.out.println("\n--- Notas por Disciplina ---");
		for (int i = 0; i < 3; i++) {
			System.out.println("Disciplina: " + this.disciplinas[i] + " | Nota: " + this.notas[i] + " | Aprovado: "
					+ this.aprovado(disciplinas[i]));
		}

	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		String[] disciplinas = { "a", "b", "v" };
		double[] nota = { 7, 2, 3 };

		aluno.nome = "gio";
		aluno.curso = "dsd";
		aluno.matricula = "1993939";
		aluno.disciplinas = disciplinas;
		aluno.notas = nota;

		aluno.consultar();

	}


}
