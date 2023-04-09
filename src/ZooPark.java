public class ZooPark extends Animal {

    Animal[] zooParks = new Animal[10];

    public void addAnimalInZoo(Animal abc) {
        for (int i = 0; i < zooParks.length; i++) {
            if (zooParks[i] == null) {
                zooParks[i] = abc;
                zooParks[i].nomer = i + 1;
                break;
            }
        }

    }

    public int getInfoZoo(Animal[] zooParks) {
        int num = 0;
        for (int i = 0; i < zooParks.length; i++) {
            if (zooParks[i] != null) {
                num++;
            }
        }
        return num;
    }

    public void delete(int del) {
        for (int i = 0; i < zooParks.length; i++) {
            if (zooParks[i].nomer == del) {
                zooParks[i] = null;
                break;
            }

        }

    }

    public String information() {
        String word="";
        for (Animal s : zooParks) {
            if (s != null) {
                word=word+s.toSpring()+"\n";
            }
        }
    return  word;
    }
}

