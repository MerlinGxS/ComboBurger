public class Combo {

   public void CriarCombo(int tipo) {
      if (tipo == 1) {

         Bebida bebida = new Bebida("Itubaina", 4, 250);
         Sobremesa sobremesa = new Sobremesa("Sorvetato de milhor", 5, "pequeno");
         Burguer burguer = new Burguer("X-Pombo", 15, 160);

         System.out.println("Super Combo");
         System.out.println(bebida);
         System.out.println(burguer);
         System.out.println(sobremesa);

         double precoTotal = bebida.getPreco() + burguer.getPreco() + sobremesa.getPreco();

         System.out.println("preço Total: " + precoTotal);

      } else if (tipo == 2) {

         Bebida bebida = new Bebida("Coca zero", 6, 200);
         Sobremesa sobremesa = new Sobremesa("Milkshake de chocolate", 20, "grande");
         Burguer burguer = new Burguer("X-calabBacon", 25, 200);

         System.out.println("Combo Master");
         System.out.println(bebida);
         System.out.println(burguer);
         
         double precoTotal = bebida.getPreco() + burguer.getPreco() + sobremesa.getPreco();

         System.out.println("preço Total: " + precoTotal);

      }
   }

   @Override
   public String toString() {
      return "Obrigado";
   }
}