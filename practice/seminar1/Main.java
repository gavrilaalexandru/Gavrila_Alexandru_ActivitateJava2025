package practice.seminar1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");

        Student student1 = new Student("Alex", 10);
        System.out.println("Numele studentului: " + student1.getNume() + ", Media studentului: " + student1.getMedie());

        Student studentShallow = student1;
        studentShallow.setMedie(5.55f);
        System.out.println("Numele studentului: " + student1.getNume() + ", Media studentului: " + student1.getMedie());
        System.out.println("Numele studentului: " + studentShallow.getNume() + ", Media studentului: " + studentShallow.getMedie());

        Student studentDeepCopy = (Student)student1.clone();
        studentDeepCopy.setMedie(9.80f);
        System.out.println("Numele studentului: " + studentDeepCopy.getNume() + ", Media studentului: " + studentDeepCopy.getMedie());
        System.out.println("Numele studentului: " + student1.getNume() + ", Media studentului: " + student1.getMedie());
        System.out.println("Numele studentului: " + studentShallow.getNume() + ", Media studentului: " + studentShallow.getMedie());
    }
}