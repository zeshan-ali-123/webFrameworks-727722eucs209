package project1.demo.model;

public class Medicine {
    private int medicineId;
    private String medicineName;
    private String medicineFor;
    private String medicineBrand;
    private String manufacturedIn;
    private String medicinePrice;
    private String expiryDate;
    public void MedicineController(int medicineId,String medicineName,String medicineFor,String medicineBrand,String manufacturedIn,String medicinePrice,String expiryDate)
    {
        this.medicineId=medicineId;
        this.medicineName=medicineName;
        this.medicineFor=medicineFor;
        this.medicineBrand=medicineBrand;
        this.manufacturedIn=manufacturedIn;
        this.medicinePrice=medicinePrice;
        
    }
    public int getMedicineId() {
        return medicineId;
    }
    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }
    public String getMedicineName() {
        return medicineName;
    }
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }
    public String getMedicineFor() {
        return medicineFor;
    }
    public void setMedicineFor(String medicineFor) {
        this.medicineFor = medicineFor;
    }
    public String getMedicineBrand() {
        return medicineBrand;
    }
    public void setMedicineBrand(String medicineBrand) {
        this.medicineBrand = medicineBrand;
    }
    public String getManufacturedIn() {
        return manufacturedIn;
    }
    public void setManufacturedIn(String manufacturedIn) {
        this.manufacturedIn = manufacturedIn;
    }
    public String getMedicinePrice() {
        return medicinePrice;
    }
    public void setMedicinePrice(String medicinePrice) {
        this.medicinePrice = medicinePrice;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
