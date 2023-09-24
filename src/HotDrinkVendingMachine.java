import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private List <Product> products;
    
    public HotDrinkVendingMachine (List <Product> products){
        this.products=products;
    }
  @Override
    public Product getProduct(String name) {
           for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        return null;
    }
    public HotDrink getProduct(String name, int volume, int temperature) {
        for (Product product: products) {
            if (product instanceof HotDrink)
                if ((product.getName().toLowerCase().equals(name.toLowerCase()))&&
                (((HotDrink) product).getVolume()==volume)&&
                (((HotDrink) product).getTemperature()==temperature))
                    return (HotDrink) product;
        }
        return null;
    }
}

  
