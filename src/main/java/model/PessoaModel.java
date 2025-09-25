package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cadastro")
public class PessoaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private int idade;
	private String email;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "pessoa_missao",
        joinColumns = @JoinColumn(name = "pessoa_id"),
        inverseJoinColumns = @JoinColumn(name = "missao_id")
    )
    private List<MissoesModel> missoes = new ArrayList<>();

	
	public PessoaModel() {
	}


	public PessoaModel(String name, int idade, String email) {
		this.name = name;
		this.idade = idade;
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public List<MissoesModel> getMissoes() {
		return missoes;
	}


	public void setMissoes(List<MissoesModel> missoes) {
		this.missoes = missoes;
	}
	
	
	
}
