public class Autocredit {
    
    private String Products;
    private String subProducts;
    private String Ceo;
    private int Year;

    public Autocredit(String Products, String subProducts, String Ceo, int Year) {
        this.Products = Products;
        this.Ceo = Ceo;
        this.subProducts = subProducts;
        this.Year = Year;
    }

    // Method to display information
    void Opens() {
        System.out.println("Autocredit opens 8:30 AM");
    }

    void Closes() {
        System.out.println("Autocredit is closes 5:00 PM");
    }

    public void displayInfo() {
        System.out.println("Company: " + Products + " SubProducts: " + subProducts + " Ceo: " + Ceo + " Year: " + Year);
    }

    public static void main(String[] args) {
        Autocredit myAutocredit = new Autocredit ("Monicredit", "Moniwave", "Coolchi", 2020);
        myAutocredit.displayInfo();
        myAutocredit.Opens();
        myAutocredit.Closes();
    }
}
