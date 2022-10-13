import java.util.ArrayList;

public class VendingMachine {
    ArrayList<BottleOfWater> bottleOfWaters = new ArrayList<>();
    ArrayList<Chips> chips = new ArrayList<>();
    ArrayList<Chocolate> chocolates = new ArrayList<>();

    public VendingMachine(){
        bottleOfWaters.add(new BottleOfWater("Bon Aqua", 50.0, 3.0, 0.5));
        bottleOfWaters.add(new BottleOfWater("Saint Spring", 40.0, 4.0, 0.5));
        bottleOfWaters.add(new BottleOfWater("Evian", 150.0, 5.0, 0.5));

        chips.add(new Chips("Lays", 75.0, 450.0, "Cheese"));
        chips.add(new Chips("Pringles", 125.0, 375.0, "Barbeque"));
        chips.add(new Chips("Russian Potato", 55.0, 400.0, "Chicken"));

        chocolates.add(new Chocolate("Twix", 55.0, 240.0, "2x"));
        chocolates.add(new Chocolate("Bounty", 75.0, 300.0, "3x"));
        chocolates.add(new Chocolate("Snikers", 55.0, 260.0, "2x"));
    }

    public BottleOfWater getWaterByName(String name){
        for(BottleOfWater water: bottleOfWaters){
            if(water.getName().equals(name))
                return water;
    }
    return null;
    }

    public Chips getChipsByTastr(String taste){
        for(Chips chipons : chips){
            if(chipons.getTaste().equals(taste))
                return chipons;
    }
    return null;
}

    public Chocolate getChocolateBySize(String size){
        for(Chocolate candy: chocolates){
            if(candy.getSize().equals(size))
                return candy;
    }
    return null;
}

}
