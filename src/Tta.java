public class Tta extends Autocredit {

    private String subCompany;
    private String subCeo;
    private String CTO;
    
    public Tta(String Products, String subProducts, String Ceo, int Year, String subCompany, String subCeo) {
        super(Products, subProducts, Ceo, Year);
        this.subCompany = subCompany;
        this.subCeo = subCeo;
    }

    //Overloaded Method
    public Tta(String Products, String subProducts, String CTO, String Ceo, int Year, String subCompany, String subCeo) {
        super(Products, subProducts, Ceo, Year);
        this.subCompany = subCompany;
        this.subCeo = subCeo;
        this.CTO = CTO;

    }

    public static void main(String[] args) {
        Tta myTta = new Tta("Monicredit", "Moniwave", "Coolchi", 2020, "Tta", "Leo");
        myTta.displayInfo();
        System.out.println("SubCompany: " + myTta.subCompany + " SubCeo: " + myTta.subCeo);

        Tta myNewTta = new Tta("Monicredit", "Moniwave", "Horpschenzy", "Coolchi", 2020, "Tta", "Leo");
        myNewTta.displayInfo();
        System.out.println("SubCompany: " + myNewTta.subCompany + " SubCeo: " + myNewTta.subCeo + " CTO: " + myNewTta.CTO);
    }


    
}
