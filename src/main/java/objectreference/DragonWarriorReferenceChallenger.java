package objectreference;

public class DragonWarriorReferenceChallenger {

    public static void main(String... doYourBest) {
        StringBuilder warriorProfession = new StringBuilder("Dragon ");
        String warriorWeapon = "Sword ";
        changeWarriorClass(warriorProfession, warriorWeapon);

        System.out.println("Warrior=" + warriorProfession + " Weapon=" + warriorWeapon);
    }

    static void changeWarriorClass(StringBuilder warriorProfession, String weapon) {
        warriorProfession.append("Knight"); // warriorProfession points to the Real Object
        weapon = "Dragon " + weapon;

        weapon = null;
        warriorProfession = null;
    }
}


// By value VS by reference
// Immutable and mutable Objects
// primitive types by value or by reference?
