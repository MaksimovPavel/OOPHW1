public class Chocolate extends Product {
    private String size;

    public Chocolate(String name, Double cost, Double calories, String size){
        this.name = name;
        this.cost = cost;
        this.calories = calories; 
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String setSize(String size){
        return this.size = size;
    }
    @Override
    public String toString() {

        return "Название: " + name + " Цена: " + cost + " Калорийность: " + calories + " Размер: " + size;
    }
}
