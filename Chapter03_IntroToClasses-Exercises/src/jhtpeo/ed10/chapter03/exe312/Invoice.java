package jhtpeo.ed10.chapter03.exe312;

public class Invoice
{

  private double pricePerPart;
  private int numberOfPurchasedParts;
  private String partNumber;
  private String partDescription;

  public Invoice() {
    pricePerPart = 0.0;
    numberOfPurchasedParts = 0;
    partNumber = "";
    partDescription = "";
  } // [END_METHOD : Invoice()]


  public double getInvoiceAmount() {
    var invoiceAmount = 0.0;
    if (numberOfPurchasedParts < 0) {
      numberOfPurchasedParts = 0;
    }
    if (pricePerPart < 0) {
      pricePerPart = 0.0;
    }
    invoiceAmount = numberOfPurchasedParts * pricePerPart;
    return invoiceAmount;
  } // [END_METHOD : getInvoiceAmount()]

  public double getPricePerPart() {
    return pricePerPart;
  } // [END_METHOD : getPricePerPart()]

  public int getNumberOfPurchasedParts() {
    return numberOfPurchasedParts;
  } // [END_METHOD : getNumberOfPurchasedParts()]

  public String getPartNumber() {
    return partNumber;
  } // [END_METHOD : getPartNumber()]

  public String getPartDescription() {
    return partDescription;
  } // [END_METHOD : getPartDescription()]

  public void setNumberOfPurchasedParts(int newNumberOfPurchasedParts) {
    numberOfPurchasedParts = newNumberOfPurchasedParts;
  } // [END_METHOD : setNumberOfPurchasedParts()]

  public void setPartDescription(String newPartDescription) {
    partDescription = newPartDescription;
  } // [END_METHOD : setPartDescription()]

  public void setPartNumber(String newPartNumber) {
    partNumber = newPartNumber;
  } // [END_METHOD : setPartNumber()]

  public void setPricePerPart(double newPricePerPart) {
    pricePerPart = newPricePerPart;
  } // [END_METHOD : setPricePerPart()]


} // [END_CLASS : Invoice]
