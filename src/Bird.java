public class Bird extends Animal {

    String familyBird;
    int maxFlyHeight;



    public Bird(String color, int maxAgelife, String typeEats,String familyBird,int maxFlyHeight){
        super(color,maxAgelife,typeEats);
        this.familyBird=familyBird;
        this.maxFlyHeight=maxFlyHeight;
    }
    public Bird(){
    super();
    }
    public String say(){
        return familyBird + ": Поёт";
    }
    public String  birdFight(){
       return familyBird + ": Клюёт";
    }
    public String birdWithAgs(){
      return   familyBird + ": Высижывает птенцов";
    }

    public void setFamilyBird(String familyBird) {
        this.familyBird = familyBird;
    }

    public String getFamilyBird() {
        return familyBird;
    }

    public void setMaxFlyHeight(int maxFlyHeight) {
        this.maxFlyHeight = maxFlyHeight;
    }

    public int getMaxFlyHeight() {
        return maxFlyHeight;
    }
    public String toSpring() {
        return "Семейство :" + familyBird + ", Максимальная высота полёты: " + maxFlyHeight + super.toSpring();
    }

}
