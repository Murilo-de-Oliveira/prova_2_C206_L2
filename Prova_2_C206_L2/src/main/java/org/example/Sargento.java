package org.example;

public class Sargento extends Soldado implements Defesa{
    //Atributos
    private String especializacao;
    private int experienciaCombate;

    //Construtores
    public Sargento(String nome, long cpf, String especializacao, int experienciaCombate) {
        super(nome, cpf);
        this.especializacao = especializacao;
        this.experienciaCombate = experienciaCombate;
    }

    public Sargento(String nome, long cpf, ItemEspecial item, String especializacao, int experienciaCombate) {
        super(nome, cpf, item);
        this.especializacao = especializacao;
        this.experienciaCombate = experienciaCombate;
    }

    //Métodos
    //Mostra info do soldado
    public void mostraInfo(){
        super.mostraInfo(); //método da classe abstrata
        System.out.println("Especialização: " + this.especializacao);
        System.out.println("Experiência em combate: " + this.experienciaCombate);
    }

    //Usar item
    public void usandoItem(){
        super.usandoItem();
        if(this.getItem() != null){
            this.experienciaCombate += 300;
        }
    }

    //Defender
    @Override
    public void defender() {
        //verificação se experiênciaCombate é suficiente
        if(this.experienciaCombate > 650){
            System.out.println(this.getNome() + " conseguiu defender");
        }
        else {
            System.out.println(this.getNome() + " não se defendeu");
        }
    }
}
