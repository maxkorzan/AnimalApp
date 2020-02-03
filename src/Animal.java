public class Animal {
    private String name;
    private String type;
    private String description;
    private double price;
    private boolean isInStock;

    //default constructor
    public Animal(){
    }

    //overloaded constructor


    //setters and getters
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }
    public void setInStock(boolean isInStock){
        this.isInStock = isInStock;
    }
    public boolean getInStock(){
        return this.isInStock;
    }

    //getPet method to print out data fields
    public void getPet(){
        Animal a = new Animal();

        a.setName("Sparky");
        a.setType("Dog");
        a.setDescription("A small, but loud, happy puppy");
        a.setPrice(399.95);
        a.setInStock(true);

        System.out.println("Animal name: "+ a.getName());
        System.out.println("Animal type: " + a.getType());
        System.out.println("Animal description: " + a.getDescription());
        System.out.println("Animal price: " + a.getPrice());
        System.out.println("Animal in stock: " + a.getInStock());

    }


}
