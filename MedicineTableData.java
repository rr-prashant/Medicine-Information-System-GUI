/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicineis;

/**
 *
 * @author Prashant R. Rai
 */
public class MedicineTableData {
    private int SerialNumTxt, PriceTxt;
    private String NameTxt, TypeTxt,MfgTxt, ExpTxt, CategoryBox;
    
    public MedicineTableData(int serialNo,String name,String type, String category,int Price, String mfgDate, String Expire ){
        this.SerialNumTxt = serialNo;
        this.NameTxt = name;
        this.TypeTxt = type;
        this.CategoryBox = category;
        this.PriceTxt = Price;
        this.MfgTxt = mfgDate;
        this.ExpTxt = Expire;       
    }

    public int getSerialNumTxt() {
        return SerialNumTxt;
    }
    
    public String getSN()
    {
        return String.valueOf(SerialNumTxt);
    }
    
    public int getPriceTxt() {
        return PriceTxt;
    }
    
    public String getPrice()
    {
        return String.valueOf(PriceTxt);
    }
    
        
    public String getNameTxt() {
        return NameTxt;
    }
    
    public String getTypeTxt() {
        return TypeTxt;
    }
    
    public String getMfgTxt() {
        return MfgTxt;
    }

    public String getExpTxt() {
        return ExpTxt;
    }

    public String getCategoryBox() {
        return CategoryBox;
    }
    
    
}
