
public abstract class Product {
    protected String name;
    protected Double cost;
    protected Double calories;
    

    public String getName() {
        return name;
    }

    public Double getCost(){
        return cost;
    }

    public Double getCalories(){
        return calories;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCost(Double cost){
        this.cost = cost;
    }

    public void setCalories(Double calories){
        this.calories = calories;
    }
    @Override
    public String toString() {
        return "стоимость: " + cost;
    }
}