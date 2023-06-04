public class Main {
    public static void main(String[] args) {
    Person person= new Person("John", "male", "orthodox", "English", "English",true,8211235060L, "England");
    Bulgarian bulgarian = new Bulgarian("Iliya", "male", "orthodox", true, 8211235060L, "Bulgaria");
    Italian italian = new Italian ("Joseppe", "male", "catholic", false, 6511235060L, "Italy");
    American american = new American("Sam", "male", "orthodox", true, 7411235060L, "USA");
    Child child = new Child("Sasha", "male", "orthodox", "English", "English",true, 7311235060L, "Bulgaria");

    child.setCountry(child.getCountry());
    child.setName(child.getName());
    child.setSex();
   child.setReligion("My religion is " + "'"+ child.getReligion()+ "'");
   child.setNationality("My nationality is " + child.getNationality());
  child.canTakeLoan();
    }
}