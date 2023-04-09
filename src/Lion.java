public class Lion extends Animal {
    private String tip;
    private int mediumKg;
    public Lion() {
        super();
    }
    public Lion(String color, int maxAgeLife, String typeEats, String tip, int mediumKg) {
        super(color, maxAgeLife, typeEats);
        this.tip = tip;
        this.mediumKg = mediumKg;
    }

    public String say() {
        return color+" "+tip + ": Рычит";
    }


    public String lionPlay() {
        return color+" "+tip + ": Играется";
    }

    public String lionRun() {
        return color+" "+tip + ":Бегает";
    }


    public String getName() {
        return tip;
    }

    public void setName(String name) {
        this.tip = name;
    }



    public void setMediumKg(int mediumKg) {
        this.mediumKg = mediumKg;
    }

    public int getMediumKg() {
        return mediumKg;
    }

    public String toSpring() {
        return "имя :" + tip + ", В средним весит: " + mediumKg + super.toSpring();
    }
}
