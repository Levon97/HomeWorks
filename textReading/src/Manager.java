import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.ArrayList;


public class Manager {
    public static Student[] studentsFromList(File file) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(file));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }

//      Creating and filling array by Student objects thats contains  in txt file
        Student[] studentObjects = new Student[list.size()];
        for (int i = 0; i < list.size(); i++) {

            int k = list.get(i).indexOf(',');
            int k1 = list.get(i).indexOf(',', k + 1);
            int k2 = list.get(i).indexOf(',', k1 + 1);
            int k3 = list.get(i).indexOf(',', k2 + 1);

            String name = list.get(i).substring(0, k);

            String lastName = list.get(i).substring(k + 1, k1);

            String sYear = list.get(i).substring(k1 + 1, k2);
            int year = Integer.parseInt(sYear);

            String sGender = list.get(i).substring(k2 + 1, k3);
            char gender = sGender.charAt(0);

            String sMark = list.get(i).substring(k3 + 1, list.get(i).length());
            double mark = Double.parseDouble(sMark);

            Student gago = new Student();
            gago.setMark(mark);
            gago.setGender(gender);
            gago.setYear(year);
            gago.setLastName(lastName);
            gago.setName(name);
            studentObjects[i] = gago;


        }


        return studentObjects;

    }

    public static void getInfo(Student gago) {
        System.out.println("Students name is---- " + gago.getName());
        System.out.println("Students last name is---- " + gago.getLastName());
        System.out.println("Student born in---- " + gago.getYear());
        System.out.println("Students gender---- " + gago.getGender());
        System.out.println("Students mark is---- " + gago.getMark());
    }

    //    Task 1 Printing names
    public static void printNames(File file) throws Exception {
        Student[] arr = studentsFromList(file);
        System.out.println("--------------Name of Students--------------");
        for (Student x : arr) {
            System.out.println(x.getName());
        }
        System.out.println("--------------------------------------------");
    }

    //    Task 2  Print Male Students
    public static void printMales(File file) throws Exception {
        Student[] arr = studentsFromList(file);
        System.out.println("----------------Male Students---------------");
        for (Student x : arr) {
            if (x.getGender() == 'm') {
                getInfo(x);
                System.out.println("--------------------------------------------");
            }
        }

    }

    //    Task 3 Print all female students who has mark greater then 50.4
    public static void greaterThen(File file) throws Exception {
        Student[] arr = studentsFromList(file);
        System.out.println("---------female students who has mark greater then 50.4---------------");
        for (Student x : arr) {
            if (x.getGender() == 'f' && x.getMark() > 50.4) {
                getInfo(x);
                System.out.println("--------------------------------------------");
            }
        }
    }

    //    Task 4: Print student information having the minimal mark
    public static void minMark(File file) throws Exception {
        System.out.println("----- Print student information having the minimal mark-----");
        Student[] arr = studentsFromList(file);
        Student studentWithMinMark = arr[0];
        double mark = 101;
        for (int i = 0; i < arr.length; i++) {
            if (mark > arr[i].getMark()) {
                mark = arr[i].getMark();
                studentWithMinMark = arr[i];
            }
        }
        getInfo(studentWithMinMark);
        System.out.println("-----------------------------------------------");
    }

    //    Task 5: Print biggest male student information
    public static void biggestMale(File file) throws Exception {
        System.out.println("-----Print biggest male student information-----");
        Student[] arr = studentsFromList(file);
        Student biggestMale = arr[0];
        int smallestYear = 2020;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getGender() == 'm' && smallestYear > arr[i].getYear()) {
                smallestYear = arr[i].getYear();
                biggestMale = arr[i];
            }
        }
        getInfo(biggestMale);
        System.out.println("-----------------------------------------------");
    }

    //    Task 6: Print students sorted by mark
    public static void sortedByMark(File file) throws Exception {
        Student[] arr = studentsFromList(file);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].getMark() > arr[j + 1].getMark()) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("---------Print students sorted by mark---------");
        for (Student x : arr) {
            getInfo(x);
            System.out.println("-----------------------------------------------");

        }
    }

    //    Task 7: Print female students sorted by year
    public static void sortedByYear(File file) throws Exception {
        Student[] arr1 = studentsFromList(file);
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j].getYear() > arr1[j + 1].getYear()) {
                    Student temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;

                }
            }
        }
        System.out.println("-------Print female students sorted by year------");
        for (Student x : arr1) {
            if (x.getGender() == 'f') {
                getInfo(x);
                System.out.println("---------------------------------------------");
            }

        }
    }
}




