package curso;

public class Contato {
 private int id;
 private String nome;
 private String nomeCoordenador;
 private int qtdalunos;
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getNomeCoordenador() {
	return nomeCoordenador;
}
public void setNomeCoordenador(String nomeCoordenador) {
	this.nomeCoordenador = nomeCoordenador;
}
public int getQtdalunos() {
	return qtdalunos;
}
public void setQtdalunos(int qtdalunos) {
	this.qtdalunos = qtdalunos;
}
@Override
public String toString() {
	return "id=" + id + ", nome=" + nome + ", nomeCoordenador =" + nomeCoordenador + ", qtdalunos=" + qtdalunos;
}
 
 
}
