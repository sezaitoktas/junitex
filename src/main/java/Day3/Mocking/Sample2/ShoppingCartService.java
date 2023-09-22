package Day3.Mocking.Sample2;

public class ShoppingCartService {
    private ProductManager productManager;

    public ShoppingCartService(ProductManager productManager) {
        this.productManager = productManager;
    }

    // test edilecek method
    public boolean addProductToCart(String productId){
      int stock_status = productManager.getStockStatus(productId);
        if(stock_status>0){
            productManager.decreaseStock(productId);
            return true;
        }
        else {return false;}
    }
}
