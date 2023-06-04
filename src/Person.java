import java.time.LocalDate;

public class Person {
    private String name;
    private String sex;
    private String religion;
    private String languageSpoken;
    private String nationality;
    private boolean hasJob;
    private long egn;
    private String birthDate;
    private int age;
    private String country;

    public Person(String name, String sex, String religion, String languageSpoken, String nationality, boolean hasJob, long egn, String country) {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.languageSpoken = languageSpoken;
        this.nationality = nationality;
        this.hasJob = hasJob;
        setEgn(egn);
        setBirthDate(egn);
        setAge(egn);
        this.country = country;

    }

    public boolean isHasJob() {
        return hasJob;
    }

    public String getCountry() {
        return country;
          }

    public void setHasJob(boolean hasJob) {
        this.hasJob = hasJob;
    }

    public void setCountry(String country) {
        this.country = country;
        System.out.println(country);
    }

    private void setEgn(long egn) {
        int egnLength = Long.toString(egn).length();
        if (egnLength == 10) {
            this.egn = egn;
        } else {
            throw new RuntimeException("The provided EGN is not valid! The EGN must contain exactly 10 digits");
        }
    }

    private void setBirthDate(long egn) {
        String date = Long.toString(egn).substring(4, 6);
        String month = Long.toString(egn).substring(2, 4);
        String year = Long.toString(egn).substring(0, 2);
        this.birthDate = year + "-" + month + "-" + date;
    }

    private void setAge(long egn) {
        String birthYear = "19" + Long.toString(egn).substring(0, 2);
        int currentYear = LocalDate.now().getYear();
        this.age = currentYear - Integer.parseInt(birthYear);
            }

    public int getAge() {
        return age;
    }

    public void setSex() {
        if (sex == "male" || sex == "female") {
            this.sex = sex;
            System.out.println("Yes you enter the correct sex");
        } else {
            throw new RuntimeException("Sex must be only male or female");
        }
    }

    public void sayHello() {
        //switch (languageSpoken){
        //  case "Bulgarian":
        //    System.out.println("Здравейте!");
        //  break;
        //case "Italian":
        //  System.out.println("Ciao");
        // break;
        //default:
        System.out.println("Hello");
    }

    public void celebrateEaster() {
        if (religion == "orthodox" || religion == "catholic") {
            System.out.println("Happy Easter");
        } else if (religion == "Islam") {
            System.out.println("You dont celebrate Easter");
        } else {
            System.out.println("For purpose of this exercise there is only three option for religion");
        }
    }
    // поради заложената логика в момента на изчисляване на възрастта, в този случай няма как да влезем в опцията под 18
    public void isAdult() {
        int age1 = this.getAge();
       if (country == "Bulgaria" && age1 >=18){
            System.out.println("You are bulgarian adult");
        }
       else if (country == "Bulgaria" && age1 < 18){
           System.out.println("You are not old enough Bulgarian");
       }
        else if (country == "England" && age1 >=18) {
            System.out.println("You are english adult");
        }
        else if (country == "England" && age1 < 18){
           System.out.println("You are not old enough english man");
       }
        else if (country == "Italy" && age1 >=18){
            System.out.println("You are italian adult");
        }
        else if (country == "Italy" && age1 < 18){
           System.out.println("You are not old enough italian");
       }
        else if(country == "USA" && age1 >=21){
           System.out.println("You are american adult");
       }
        else if (country == "USA" && age1 < 21){
           System.out.println("You are not old enough american");
       }
        else {
            System.out.println("Some of the parameters between country and age are not proper one");
        }
           }

    public void canTakeLoan(){
        if (hasJob == true){
            System.out.println("Yes you can take a loan");
        }
        else {
            System.out.println("You cannot take loan");
        }
    }

    public void setLanguageSpoken() {
        if (languageSpoken == "Italian"){
            this.languageSpoken = languageSpoken;
            System.out.println("You are italian and speak italians");
        }
        else if (languageSpoken == "American English") {
            this.languageSpoken = languageSpoken;
            System.out.println("You are american and speak american english");
        }
        else if (languageSpoken == "Bulgarian"){
            this.languageSpoken = languageSpoken;
            System.out.println("Вие говорите български");
        }
        else if(languageSpoken == "English"){
            System.out.println("Yes i can speak english");
        }
        else {
            System.out.println("There is only three available languages");
        }
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setReligion(String religion) {
        this.religion = religion;
        System.out.println(religion);
    }

    public String getReligion() {
        return religion;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
        System.out.println(nationality);
    }

    public String getNationality() {
        return nationality;
    }

}


