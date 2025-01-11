package generic.ex3;

public class AnimalHospitalV2 <T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }


    public void checkup() {
        //System.out.println("동물 이름: " + animal.getName());
        //System.out.println("동물 이름: " + animal.getSize());
        //animal.sound();

        animal.toString();
        animal.equals(null);
    }

    public T getBigger(T target){

        return null;
        //return  animal.getSize() > target.getSize() ? animal : target;
    }
}
