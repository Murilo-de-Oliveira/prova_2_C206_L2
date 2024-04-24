package org.example;

public class MedicoMilitar extends Soldado implements Curar{
    //Atributos
    private int anosEsperiencia;
    private int capacidadeEmergencia;

    //Construtores
    public MedicoMilitar(String nome, long cpf, int anosEsperiencia, int capacidadeEmergencia) {
        super(nome, cpf);
        this.anosEsperiencia = anosEsperiencia;
        this.capacidadeEmergencia = capacidadeEmergencia;
    }

    public MedicoMilitar(String nome, long cpf, ItemEspecial item, int anosEsperiencia, int capacidadeEmergencia) {
        super(nome, cpf, item);
        this.anosEsperiencia = anosEsperiencia;
        this.capacidadeEmergencia = capacidadeEmergencia;
    }

    //Métodos
    //Mostrar info do soldado
    public void mostraInfo(){
        super.mostraInfo(); //método da classe abstrata
        System.out.println("Anos de experiência: " + this.anosEsperiencia + " anos");
        System.out.println("Capacidade de emergência: " + this.capacidadeEmergencia);
    }

    //Usar item
    public void usandoItem(){
        super.usandoItem(); //método da classe abstrata
        //verificação de nulos
        if(this.getItem() != null){
            this.capacidadeEmergencia += 100;
        }
    }

    //Curar
    @Override
    public void curar() {
        //verifica se capacidadeEmergia é suficiente
        if(this.capacidadeEmergencia > 920){
            System.out.println(this.getNome() + " curou um aliado");
        }
        else {
            System.out.println(this.getNome() + " não possui capacidade de emergência para curar um aliado");
        }
    }
}
