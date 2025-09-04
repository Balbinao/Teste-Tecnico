package Desafio1;

public class Main {
    public static void main(String[] args) {
        Item item = new Item ("Caneta Azul", 50);


        System.out.println("Status do item antes da retirada: ");
        item. mostrarDadosItem();
        System.out.println("------------------------------------");
        item.retirada(10);

        System.out.println("Status do item após a retirada de 10 unidades do estoque: ");
        item.mostrarDadosItem();
    }
}
