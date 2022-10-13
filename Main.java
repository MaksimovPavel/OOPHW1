import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        Logger lg = Logger.getAnonymousLogger();

        lg.info(vm.getWaterByName("Evian").toString());
        lg.info(vm.getChipsByTastr("Chicken").toString());
        lg.info(vm.getChocolateBySize("2x").toString());
    }
}
