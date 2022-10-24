package lab7;

public abstract class Basket {
    protected int weight;
    protected String name;
    /**
     * Constructor
     * @param weight Basket weight
     * @param name Basket name
     */
    public Basket(int weight, String name)
    {
        this.name = name;
        this.weight = weight;
    }
    /**
     * Methods returns Basket weight
     */
    public int getWeight() {
        return weight;
    }
    /**
     * Methods returns Basket name
     */
    public String getName() { return name; }
    public void printData()
    {
        System.out.println("Name:" + name);
        System.out.println("Weight:" + weight);
    }
}

