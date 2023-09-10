package ExceptionHandling;

public class Product {
    public void getProductName(String productId){
        try{
            if(productId == null){
                throw new ProductNotFoundException("Product id is null");
            }
            else{
                System.out.println("searching for product id: " + productId);
            }
            throw new NullPointerException();
        }
        catch(ProductNotFoundException pnf){
            pnf.printStackTrace();
            System.out.println("catching product id due to exception");
        }
    }
}
