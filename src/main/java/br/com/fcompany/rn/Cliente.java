/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fcompany.rn;

/**
 *
 * @author agner
 */
public class Cliente {

        //Atributos
    private Integer id;
    private String nome;
    private int numeroTelefone;
    private String cpf;
    private String email;

    public Cliente(){
        
    }
        //Contrutor --> Serve para construir uma instancia de 
        //   objeto da classe que inicializa os atributos
    
    
     public Cliente(String nome, int numeroTelefone, String cpf, String email){
         this.nome = nome;
         this.numeroTelefone = numeroTelefone;
         this.cpf = cpf;
         this.email = email;
     }
    //GETTER E SETTER

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }  
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "Nome=" + nome + ", NumeroDeTelefone= " + numeroTelefone + ", Cpf= " + cpf + ", E-mail=" + email + '}';
    }

     
    

}
