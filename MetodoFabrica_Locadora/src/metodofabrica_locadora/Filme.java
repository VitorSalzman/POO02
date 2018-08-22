/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodofabrica_locadora;

import java.util.ArrayList;

/**
 *
 * @author Salzman
 */
public class Filme {
    private String nome;
    private ArrayList<String> atores;
    private ArrayList<String> diretores;
    private ArrayList<String> paises;
    private int duracao;
    private int valor;
    private String classificacao;
    private boolean ehLancamento;

    public String getNome() {
        return nome;
    }

    public ArrayList<String> getAtores() {
        return atores;
    }

    public ArrayList<String> getDiretores() {
        return diretores;
    }

    public ArrayList<String> getPaises() {
        return paises;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getValor() {
        return valor;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public boolean isEhLancamento() {
        return ehLancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAtores(ArrayList<String> atores) {
        this.atores = atores;
    }

    public void setDiretores(ArrayList<String> diretores) {
        this.diretores = diretores;
    }

    public void setPaises(ArrayList<String> paises) {
        this.paises = paises;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public void setEhLancamento(boolean ehLancamento) {
        this.ehLancamento = ehLancamento;
    }
    
    public String toString() {
		System.out.println("gera Filme");
		return null;
	}
}
