public class Product {


    private String title;
    private int id;
    private int cost;

    public Product( int id,String title, int cost) {
        this.title = title;
        this.id = id;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public int getCost() {
        return cost;
    }
}
