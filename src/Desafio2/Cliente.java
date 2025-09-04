package Desafio2;

public class Cliente extends Pessoa {

   private int numeroFidelidade;
   public Cliente (String nome, int numeroFidelidade){

       super(nome);
       this.numeroFidelidade = numeroFidelidade;
   }

    @Override
    public void saudacao() {
        super.saudacao();
        System.out.println("cliente número "+ numeroFidelidade + ".");
    }
}
