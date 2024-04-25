import java.math.BigDecimal;
class Ordering{
    private String orderNo;
    private String product;
    private int totalItem;
    private BigDecimal price;
    private String seller;
    private String customer;

    public String getOrderNo(){
        return orderNo;
    }
    public void setOrderNo(String orderNo){
        this.orderNo = orderNo;
    }
    public String getProduct(){
        return product;
    }
    public void setProduct(String product){
        this.product = product;
    }
    public int getTotalItem(){
        return totalItem;
    }
    public void setTotalItem(int totalItem){
        this.totalItem = totalItem;
    }
    public BigDecimal getPrice(){
        return price;
    }
    public void setPrice(BigDecimal price){
        this.price = price;
    }
    public String getSeller(){
        return seller;
    }
    public void setSeller(String seller){
        this.seller = seller;
    }
    public String getCustomer(){
        return customer;
    }
    public void setCustomer(String customer){
        this.customer = customer;
    }
}