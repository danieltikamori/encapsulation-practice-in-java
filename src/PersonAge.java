public class PersonAge {
    private String personName;
    private int personAge;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public boolean isAdult(){
        if(personAge >= 18){
            System.out.println("Person is an adult.");
            return true;
        }else{
            System.out.println("Person is not an adult.");
            return false;
        }
    }
}
