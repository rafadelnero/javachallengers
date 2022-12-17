package encapsulation;

import array.ArrayChallenge2;

public class SimpsonCharacter {

    private String name;
    private String familyName;
    private String age;
    private double height;
    private String style;

    public static void main(String[] args) {
        int counter = 0;
        while (counter <= 2) {
            counter = counter + 1;
            System.out.print(counter);
        }

        do {
            System.out.print(counter--);
        } while (counter > 2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}

class Pet {
    String name;

    Pet() { }

    Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
