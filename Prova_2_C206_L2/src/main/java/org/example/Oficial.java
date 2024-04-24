package org.example;

public class Oficial extends Soldado implements Defesa{
    //Atributos
    private String patente;

    //Construtores
    public Oficial(String nome, long cpf, String patente) {
        super(nome, cpf);
        this.patente = patente;
    }

    public Oficial(String nome, long cpf, ItemEspecial item, String patente) {
        super(nome, cpf, item);
        this.patente = patente;
    }

    //Métodos
    //Mostrar info do soldado
    public void mostraInfo(){
        super.mostraInfo(); //método da classe abstrata
        System.out.println("Patente: " + this.patente);
    }

    //Usar item
    public void usandoItem(){
        super.usandoItem(); //método da classe abstrata
    }

    //Defender
    public void defender() {
        //verificação de tipos nulos
        if(this.getItem() != null){
            System.out.println(this.getNome() + " conseguiu defender");
        }
        else {
            System.out.println(this.getNome() + " não se defendeu");
        }
    }
}
