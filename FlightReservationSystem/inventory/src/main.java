public class main {
 public static void main(String[] args)
 {
     Product iphone12 = new Product(1,"macbook pro",200000,150000,200,true);
     Product ipad = new Product(3,"I pad Air");

     System.out.println(iphone12.name);
     System.out.println(iphone12.salesPrice);
     System.out.println(iphone12.getProfitOrLoss());
     System.out.println(iphone12.isBelowThreshold());

     Product iphone13 = new Product(iphone12);
     iphone13.name="Iphone 13 MAX PRO ULTRA";

     System.out.println(iphone13.name);
     System.out.println(iphone13.salesPrice);
     System.out.println(iphone13.getProfitOrLoss());
 }
}
