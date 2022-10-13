public class BottleOfWater extends Product {
    private Double volume;
    
    public BottleOfWater(String name, Double cost, Double calories, Double volume){
        this.name = name;
        this.cost = cost;
        this.calories = calories; 
        this.volume = volume;
    }

    public Double getVolume(){
        return volume;
    }

    public Double setVolume(Double volume){
        return this.volume = volume;
    }

    @Override
    public String toString() {

        return "Название: " + name + " Цена: " + cost + " Калорийность: " + calories + " Объем: " + volume;
    }
}
