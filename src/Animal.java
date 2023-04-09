public class Animal  {
    String color;
    int maxAgeLife;
    int nomer;

    String typeEats;


    public Animal(String color, int maxAgeLife, String typeEats) {
        this.color = color;
        this.maxAgeLife = maxAgeLife;
        this.typeEats = typeEats;

    }

    public Animal() {

    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String toSpring() {
        return ", Цвет :" + color + ", Доживает до: " + maxAgeLife + ", кушает: " + typeEats + " порядковый номер в зоопарке: "+ nomer;
    }
}
