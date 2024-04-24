package org.example;

public class Exercito {
    //Atributos
    private String nome;
    private Soldado[] soldados = new Soldado[10];

    //Construtor do exército
    public Exercito(String nome, Soldado soldado) {
        this.nome = nome;
        this.soldados[0] = soldado; //já recebe um soldado quando instanciado
    }

    //Métodos
    //Adicionar soldado
    public void addSoldado(Soldado soldado){
        for(int i = 0; i < soldados.length; i++){
            //verificação de tipos nulos (só adiciona se for nulo)
            if(soldados[i] == null){
                soldados[i] = soldado;
                System.out.println("Soldado adicionado");
                break;
            }
        }
    }

    //Mostrar info dos soldados
    public void mostraInfo(){
        System.out.println("Nome do Exército: " + this.nome);
        System.out.println("Listagem de soldados");
        //loop para percorrer o array
        for(Soldado soldado : soldados){
            //verificação de tipos nulos
            if(soldado != null){
                System.out.println("======================================");
                //switch com verificação de tipo de instância
                switch(soldado){
                    //caso o soldddo seja da classe especificada, utiliza os métodos da classe especificada
                    case Sargento sargento -> {
                        sargento.usandoItem();
                        sargento.defender();
                    }
                    case Oficial oficial -> {
                        oficial.usandoItem();
                        oficial.defender();
                    }
                    case MedicoMilitar medicoMilitar -> {
                        medicoMilitar.usandoItem();
                        medicoMilitar.curar();
                    }
                    default -> System.out.println("Tipo inválido de soldado");
                }
                //mostra info do soldado
                soldado.mostraInfo();
            }
        }
    }
}
