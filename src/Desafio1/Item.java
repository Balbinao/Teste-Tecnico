package Desafio1;

public class Item {
    private String nome;
    private int estoque;

    public Item(String nome, int quantidadeIni){
        this.nome = nome;
        this.estoque = quantidadeIni;
    }

    public void retirada (int itensRetirados){
        if(itensRetirados > 0 && itensRetirados <= estoque){
            estoque -= itensRetirados;
        }else{
            System.out.println("Não é possível retirar " + itensRetirados + "unidades deste item. Estoque insuficiente.");
        }
    }


    public void mostrarDadosItem(){
        System.out.println("Item [" + nome +"], Quantidade [" + estoque +"]");
    }
}
