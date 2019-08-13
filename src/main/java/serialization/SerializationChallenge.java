package serialization;

import java.io.*;

public class SerializationChallenge {

    public static void main(String... doYourBest) throws IOException, ClassNotFoundException {

        try (var fs = new FileOutputStream("SerTest.ser");
             var os = new ObjectOutputStream(fs)) {
            var xmen = new Xmen();
            xmen.name = "Wolverine";
            xmen.power = "Healing and defensive powers";
            xmen.weapon = "claws";
            xmen.costumeColor = "yellow";
            os.writeObject(xmen);
            xmen.costumeColor = "blue";
        }

        try (var fis = new FileInputStream("SerTest.ser");
             var ois = new ObjectInputStream(fis)) {
            var deserializedXmen = (Xmen) ois.readObject();
            System.out.println(deserializedXmen.name);
            System.out.println(deserializedXmen.power);
            System.out.println(deserializedXmen.weapon);
            System.out.println(deserializedXmen.costumeColor);
        }
    }
}

class Xmen implements Serializable {
    private static final long serialVersionUID = 632L;
    String name;
    transient String power;
    volatile String weapon;
    static String costumeColor;
}
