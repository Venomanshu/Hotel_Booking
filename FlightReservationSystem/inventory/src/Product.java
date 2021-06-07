public class Product {
    int id;
    String name;
    float salesPrice;
    float cost;
    int quantity;
    boolean active;

    Product(int productId, String productName)
    {
        id = productId;
        name = productName;
    }
    ///args constructor
    Product(int productId, String productName, float productSalesPrice, float productCost, int productQuantity, boolean productActive)
    {
       this(productId,productName);
        salesPrice = productSalesPrice;
        cost = productCost;
        quantity = productQuantity;
        active=productActive;
    }
    Product()
    {
        id = 100;
    }

    Product(Product oldProduct)
    {
        this(oldProduct.id + 1, "Iphone", oldProduct.salesPrice +(float) (oldProduct.salesPrice * 0.2),oldProduct.cost-(float) (oldProduct.cost* 0.1),oldProduct.quantity + 10000,oldProduct.active);
    }
    float getProfitOrLoss()
    {
        return salesPrice - cost;
    }

    void activate()
    {
        active = true;
    }
    void deactivate()
    {
        active = false;
    }

    boolean isBelowThreshold()
    {
        if(quantity<100)
        {
            return true;
        }else{
            return false;
        }
    }
}
