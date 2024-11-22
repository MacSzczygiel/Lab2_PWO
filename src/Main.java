import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witamy studencie");
        List<Student> sts = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {

           sts.add(new Student("Student name"+i,"Surname "+i,i));
        }
        System.out.println("Lista studentów");
        System.out.println(sts);
    }
}