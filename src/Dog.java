public class Dog extends Animal {
    private String name;
    private String poroda;
    private int mediumKg;

    public Dog() {
        super();
    }

    public Dog(String color, int maxAgeLife, String typeEats, String name, String poroda, int mediumKg) {
        super(color, maxAgeLife, typeEats);
        this.name = name;
        this.poroda = poroda;
        this.mediumKg = mediumKg;
    }

    public String dogJump() {
        return name + ": Прыгает";
    }

    public String say() {
        return name + ": Лает";
    }

    public String dogKycb() {
        return name + ": Кусает";
    }

    public String dogPlay() {
        return name + ": Играется";
    }

    public String dogRun() {
        return name + ":Бегает";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public void setMediumKg(int mediumKg) {
        this.mediumKg = mediumKg;
    }

    public int getMediumKg() {
        return mediumKg;
    }

    public String toSpring() {
        return "имя :" + name + ", Порода: " + poroda + ", В средним весит: " + mediumKg + super.toSpring();
    }
}