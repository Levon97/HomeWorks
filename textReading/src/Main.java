
import java.io.File;


public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Arman\\Desktop\\txt.txt");
//        Task 1
        Manager.printNames(file);

//        Task 2
        Manager.printMales(file);

//        Task 3
        Manager.greaterThen(file);

//        Task4
        Manager.minMark(file);

//        Task 5
        Manager.biggestMale(file);

//        Task 6
        Manager.sortedByMark(file);

//        Task 7
        Manager.sortedByYear(file);
    }
}
