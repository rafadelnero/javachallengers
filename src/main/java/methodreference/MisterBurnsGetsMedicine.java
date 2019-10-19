package methodreference;

import java.util.List;

public class MisterBurnsGetsMedicine {

    public static void main(String... doYourBest) {
        MedicineSupplier medicine = Smithers::new;
        short shortTest = 1;
        medicine.provideMedicine(shortTest);
        medicine.provideMedicine(10);
        medicine.provideMedicine(shortTest);
    }

    static class Smithers {
        Smithers(int any) {
            System.out.printf("Smithers gives:%s to Mister Burns with int \n", any);
        }
        Smithers(short any) {
            System.out.printf("Smithers gives:%s to Mister Burns with short \n", any);
        }
        Smithers(Integer any) {
            System.out.printf("Smithers gives:%s to Mister Burns with Integer \n", any);
        }
    }

    private interface MedicineSupplier {
        Smithers provideMedicine(int quantity);
    }

}
