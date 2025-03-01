package practice.seminar1;

public class Student {
    String nume;
    float medie;
    public Student(String nume, float medie) {
        super();
        this.nume = nume;
        this.medie = medie;
    }
    public Student() {
        this.nume = new String("Neindentificat");
        this.medie = 0;
    }
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public float getMedie() {
        return medie;
    }
    public void setMedie(float medie) {
        this.medie = medie;
    }
    @Override
    protected Object clone() {
        Student copie = new Student(this.nume, this.medie);
        return copie;
    }
}
