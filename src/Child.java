public class Child extends Person {
    public Child(String name, String sex, String religion, String languageSpoken, String nationality, boolean hasJob, long egn, String country) {
        super(name, sex, religion, languageSpoken, nationality, hasJob, egn, country);
    }

    @Override
    public void sayHello() {
        System.out.println("I am a child an say hello to everyone");
    }

    public void playGround(){
        System.out.println("I love to play with other kids in playground");
    }
}
