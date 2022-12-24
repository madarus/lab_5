import controller.ErrMsgLog;
import controller.Preloader;
import models.AlcoCoctail;
import models.Coctail;
import models.Cooking;
import models.Ingredient;

import java.io.IOException;
import java.util.*;

public class Main {
    public static Properties prop;
    public static ArrayList<Coctail> lists;
    public static LinkedList<Coctail> lists2;
    public static LinkedList<Coctail> testlist = new LinkedList<Coctail>();
    public static List<Double> scores= new ArrayList<>();
    public static List<Double> scores2= new ArrayList<>();

    static void controller() throws IOException {
        model();
        loadProp();
        switchMenu();


    }

    static void model() throws IOException {

    }

    public static void main(String[] args) throws IOException {
        controller();
        //ModelsControl.addModels(10);
    }

    static void switchMenu() throws IOException {
        System.out.println("Добро пожаловать — "+prop.getProperty("username"));
        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Чтение данных из файла");
        System.out.println("2 - Создать модели(автоматически)");
        System.out.println("3 - Создать модель(вручную)");
        System.out.println("4 - Запись в файл");
        System.out.println("5 - Вывод данных");
        System.out.println("3 - Создать модель(вручную)");
        System.out.println("6 - Удалить модель");
        System.out.println("7 - Изменить модель");
        System.out.println("8 - Нарисовать графики общего времени для ArrayList");
        System.out.println("9 - Нарисовать графики среднего времени для ArrayList");
        System.out.println("10 - Нарисовать графики общего времени для ArrayLinked");
        System.out.println("11 - Нарисовать графики среднего времени для ArrayLinked");
        System.out.println("12 - Quit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Scanner in1 = new Scanner(System.in);
                System.out.print("Введите количество считываемых моделей: ");
                int num1 = in1.nextInt();
                ModelsControl.readModelsFromFile(num1);

                break;
            case 2:
                Scanner in = new Scanner(System.in);
                System.out.print("Введите количество создаваемых моделей: ");
                int num = in.nextInt();
                ModelsControl.addModels(num);
                break;
            case 3:
                System.out.print("Создать модель");
                Scanner in2 = new Scanner(System.in);
                System.out.print("Введите количество создаваемых моделей: ");
                int n2 = in2.nextInt();
                ModelsControl.createModel(n2);
                break;
            case 4:
                ModelsControl.addModelstoFile();
                break;
            case 5:
                ModelsControl.printModels();
                break;
            case 6:
                Scanner in3 = new Scanner(System.in);
                System.out.print("Введите номер удаляемой модели ");
                int n3 = in3.nextInt();
                ModelsControl.deleteModel(n3);
                break;
            case 7:
                System.out.print("Создать модель");
                Scanner in4 = new Scanner(System.in);
                System.out.print("Введите номер изменяемой модели: ");
                int n4 = in4.nextInt();
                ModelsControl.updateModel(n4);
                break;
            case 8:
                scores.clear();
                scores2.clear();
                GraphControl.DrawArrayAddGraph();
                GraphControl.DrawArrayRemoveGraph();
                switchMenu();
                break;
            case 9:
                scores.clear();
                scores2.clear();
                GraphControl.DrawArrayMedianGraph();
                GraphControl.DrawArrayRemoveMedianGraph();
                switchMenu();
                break;
            case 10:
                scores.clear();
                scores2.clear();
                GraphControl.DrawArrayAddGraphLinked();
                GraphControl.DrawArrayRemoveGraphLinked();
                switchMenu();
                break;
            case 11:
                scores.clear();
                scores2.clear();
                GraphControl.DrawArrayMedianGraphLinked();
                GraphControl.DrawArrayRemoveMedianGraphLinked();
                switchMenu();
                break;

            case 12:
                // Perform "quit" case.
                System.out.println("Программа завершена");

                break;
            default:
                // The user input an unexpected choice.
        }
    }

    static void loadProp(){
        try {
            prop = new Properties();
            Preloader PRL = new Preloader("config.ini", prop);
            boolean run = true;
        } catch (Exception e) {
            System.err.println("Ошибка - "+e.getMessage());
        }
    }


}