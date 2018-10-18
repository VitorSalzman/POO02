/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptercliente;
import adaptercliente.model.ICliente;
import lib.ClienteExterno;
/**
 *
 * @author vitorsalzman
 */
public class AdapterClienteExterno implements ICliente{
    ClienteExterno cliente;
    
    String novonome = cliente.getNome() + " " + cliente.getSobreNome();
    String novocelular = cliente.getDddCelular() +  cliente.getCelular();
    String novotelefone = cliente.getDddTelefone() + cliente.getTelefone();
    String email = cliente.getEmail();
    
    @Override
    public String getNomeCompleto() {
        return novonome;
    }

    @Override
    public void setNomeCompleto(String nomeCompleto) {
        this.novonome=nomeCompleto;
    }

    @Override
    public String getTelefone() {
        return novotelefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.novotelefone = telefone;
    }

    @Override
    public String getEmail() {
       return email;
    }

    @Override
    public void setEmail(String email) {
        this.email=email;
    }

    @Override
    public String getCelular() {
       return novocelular;
    }

    @Override
    public void setCelular(String celular) {
        this.novocelular=celular;
    }
    
}

