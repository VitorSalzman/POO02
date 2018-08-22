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
public class Avaliacao {
    private int nota;
    private String descricao;

    public int getNota() {
        return nota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String toString() {
		System.out.println("gera Avaliacao");
		return null;
	}
    
}
