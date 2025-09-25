package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String missao;
	private String dificuldade;


	@ManyToMany(mappedBy = "missoes")
	private List<PessoaModel> pessoa = new ArrayList<>();






	public MissoesModel() {
		super();
	}

	public MissoesModel( String missao, String dificuldade, PessoaModel pessoa) {
		this.missao = missao;
		this.dificuldade = dificuldade;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMissao() {
		return missao;
	}

	public void setMissao(String missao) {
		this.missao = missao;
	}

	public String getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}
	public List<PessoaModel> getPessoas() {
		return pessoa;
	}
	public void setPessoas(List<PessoaModel> pessoa){ 
		this.pessoa = pessoa;
	}


}
