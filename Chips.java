public class Chips extends Product {
    private String taste;

    public Chips(String name, Double cost, Double calories, String taste){
        this.name = name;
        this.cost = cost;
        this.calories = calories; 
        this.taste = taste;
    }

    public String getTaste(){
        return taste;
    }

    public String setTaste(String taste){
        return this.taste = taste;
    }

    @Override
    public String toString() {

        return "Название: " + name + " Цена: " + cost + " Калорийность: " + calories + " Вкус: " + taste;
    }
}
