/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodofabrica_locadora;

/**
 *
 * @author Salzman
 */
public class Cliente {
    private String nome;
    private String sobrenome;
    private String email;
    private String nascimento;

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    
    public String toString() {
		System.out.println("gera Cliente");
		return null;
	}
}
