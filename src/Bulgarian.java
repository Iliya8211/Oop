public class Bulgarian extends Person {

    public Bulgarian(String name, String sex, String religion, boolean hasJob, long egn, String country) {
        super(name, sex, religion, "Bulgarian", "Bulgarian", hasJob, egn, country);
    }

    @Override
    public void sayHello() {
        System.out.println("Здравейте!");
    }
    public void danceHoro (){
        System.out.println("Играя хоро и се радвам");
    }
}

