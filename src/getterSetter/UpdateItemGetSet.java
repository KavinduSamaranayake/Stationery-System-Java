/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package getterSetter;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import projectoop.UPDATEItem;

/**
 *
 * @author ksama
 */
public class UpdateItemGetSet {
        
    // initialize varible
    private JTextField productsearchIdTxt;
    private JTextField productNameTxt;
    private JTextField categoryTxt;
    private JTextField priceTxt;
    private JTextField qtyTxt;
    private JTextField brandNameTxt;
    private JTextField addQtyBtn;
   
    
    // Declaration of private instance variables
    private String productId;
    private String productName;
    private String category;
    private String unitPrice;
    private String quantity;
    private String brandName;
    private String addQty;
     private int totalQty;
    

     

    //getters setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
         this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
         this.category = category;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
         this.unitPrice = unitPrice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
         this.quantity = quantity;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
         this.brandName = brandName;
    }

    public String getAddQty() {
        return addQty;
    }

    public void setAddQty(String addQty) {
         this.addQty = addQty;
    }
    

    public int getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(int totalQty, String quantity ) {
        this.totalQty = Integer.parseInt(quantity) + Integer.parseInt(addQty);
    }
        
        
        
}
