package org.example;

public class Main {
    public static void main(String[] args) {
        //Inicialização de itens
        ItemEspecial item1 = new ItemEspecial("Faca AK-47");
        ItemEspecial item2 = new ItemEspecial("Colete balístico");
        ItemEspecial item3 = new ItemEspecial("Kit médico");

        //Inicialização de soldados
        Sargento sargento1 = new Sargento(
                "Sérgio",
                123456789,
                item1,
                "Combate corpo-a-corpo",
                400
        );
        Sargento sargento2 = new Sargento(
                "Antônio",
                123789456,
                "Combate a distância",
                100
        );
        Oficial oficial1 = new Oficial(
                "Policarpo Quaresma",
                123123123,
                item2,
                "Presidente honorário"
        );
        Oficial oficial2 = new Oficial(
                "Marcelo",
                456456456,
                "Vice presidente honorário"
        );
        MedicoMilitar medicoMilitar1 = new MedicoMilitar(
                "Mary Sue",
                40028922,
                item3,
                20,
                900
        );
        MedicoMilitar medicoMilitar2 = new MedicoMilitar(
                "Gary Stu",
                147896325,
                5,
                500
        );

        //Inicialização de exército
        Exercito exercito = new Exercito("57º Batalhão de Morro Alto de Baixo",sargento1);

        //Execução dos métodos de exército
        exercito.addSoldado(oficial1);
        exercito.addSoldado(medicoMilitar1);
        exercito.addSoldado(sargento2);
        exercito.addSoldado(oficial2);
        exercito.addSoldado(medicoMilitar2);
        exercito.mostraInfo();

        //quantidade de soldados criados
        System.out.println("\nQuantidade de soldados no batalhão: " + Soldado.qtdSoldado);
    }
}