package org.example;

public abstract class Soldado {
    //Atributos
    public static int qtdSoldado; //atributo estático
    private String nome;
    private long cpf;
    private ItemEspecial item;

    //Construtores
    public Soldado(String nome, long cpf) {
        qtdSoldado++;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Soldado(String nome, long cpf, ItemEspecial item) {
        qtdSoldado++;
        this.nome = nome;
        this.cpf = cpf;
        this.item = item;
    }

    //Métodos
    //Mostrar info
    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }

    //Usar item
    public void usandoItem(){
        if(item != null){
            System.out.println(this.nome + " utilizando item especial");
            System.out.println("Item especial: " + this.item.tipo);
        }
        else{
            System.out.println(this.nome + " não tem item especial para utilizar");
        }
    };

    //Getters
    public String getNome() {
        return nome;
    }

    public ItemEspecial getItem() {
        return item;
    }
}
