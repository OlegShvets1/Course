package Lesson_5;

/* 2.  Find the information about the order of initialization, when you create a new object of a class:
       When constructors, initialization blocks are being executed.
       When fields are initialized with default values.  */


public class Task_2 {
   /*  Order of execution of Initialization blocks and Constructors in Java
Prerequisite : Static blocks, Initializer block, Constructor
In a Java program, operations can be performed on methods, constructors and initialization blocks.
Instance Initialization Blocks : IIB are used to initialize instance variables. IIBs are executed before constructors. They run each time when object of the class is created.
Initializer block : contains the code that is always executed whenever an instance is created. It is used to declare/initialize the common part of various constructors of a class.
Constructors : are used to initialize the object’s state. Like methods, a constructor also contains collection of statements(i.e. instructions) that are executed at time of Object creation.
Order of execution of Initialization blocks and constructor in Java
Static initialization blocks will run whenever the class is loaded first time in JVM
Initialization blocks run in the same order in which they appear in the program.
Instance Initialization blocks are executed whenever the class is initialized and before constructors are invoked. They are typically placed above the constructors within braces.
// Java code to illustrate order of
// execution of constructors, static
// and initialization blocks
class GFG {
    GFG(int x)
    {
        System.out.println("ONE argument constructor");
    }
    GFG()
    {
        System.out.println("No  argument constructor");
    }
    static
    {
        System.out.println("1st static init");
    }
    {
        System.out.println("1st instance init");
    }
    {
        System.out.println("2nd instance init");
    }
    static
    {
        System.out.println("2nd static init");
    }
    public static void main(String[] args)
    {
        new GFG();
        new GFG(8);
    }
}
Output
1st static init
2nd static init
1st instance init
2nd instance init
No  argument constructor
1st instance init
2nd instance init
ONE argument constructor
Note : If there are two or more static/initializer blocks then they are executed in the order in which they appear in the source code.
Now, predict the output of the following program-
// A tricky Java code to predict the output
// based on order of
// execution of constructors, static
// and initialization blocks
class MyTest {
    static
    {
        initialize();
    }
    private static int sum;
    public static int getSum()
    {
        initialize();
        return sum;
    }
    private static boolean initialized = false;
    private static void initialize()
    {
        if (!initialized) {
            for (int i = 0; i < 100; i++)
                sum += i;
            initialized = true;
        }
    }
}
public class GFG {
    public static void main(String[] args)
    {
        System.out.println(MyTest.getSum());
    }
}
Output:
9900
Explanation:
Loop in initialize function goes from 0 to 99. With that in mind, you might think that the program prints the sum of the numbers from 0 to 99. Thus sum is 99 × 100 / 2, or 4, 950. The program, however, thinks otherwise. It prints 9900, fully twice this value.
To understand its behavior, let’s trace its execution.The GFG.main method invokes MyTest.getSum. Before the getSum method can be executed, the VM must initialize the class MyTest. Class initialization executes static initializers in the order they appear in the source.
The MyTest class has two static initializers: the static block at the top of the class and the initialization of the static field initialized. The block appears first. It invokes the method initialize, which tests the field initialized. Because no value has been assigned to this field, it has the default boolean value of false.
Similarly, sum has the default int value of 0. Therefore, the initialize method does what you’d expect, adding 4, 950 to sum and setting initialized to true. After the static block executes, the static initializer for the initialized field sets it back to false, completing the class initialization of MyTest. Unfortunately, sum now contains the 4950, but initialized contains false.
The main method in the GFG class then invokes MyTest.getSum, which in turn invokes initialize method. Because the initialized flag is false, the initializeIf method enters its loop, which adds another 4, 950 to the value of sum, increasing its value to 9, 900. The getSum method returns this value, and the program prints it
 Об'єкт класу створюється за допомогою ключового слова “new”. Спеціальний метод, що називається 'конструктор', викликається, коли ми створюємо об'єкт з новим ключовим словом або коли об'єкт створюється за допомогою екземпляра.
Конструктор визначається як блок коду для ініціалізації об'єкта класу. Це ідентично методу, але це не метод. Однак це можна назвати 'особливим методом' на Java.
    Конструктор Java
    Конструктор Java використовується для ініціалізації щойно створеного об'єкта. Об’єкт повинен мати деякі дані, перш ніж він буде використаний у програмі. Отже, ми використовуємо конструктор, щоб ми могли присвоїти об’єкту деякі початкові дані.
        Як простий приклад розглянемо клас ABC, для якого нам потрібно створити об’єкт. Давайте створимо об’єкт ‘myObj’ для класу ABC, використовуючи нове ключове слово.
       ABC myObj = new ABC ();
        Наведений вище оператор створює об'єкт myObj. Коли створюється цей об'єкт, викликається конструктор для класу ABC без аргументу (ABC () зображує відсутність аргументів для конструктора). Оскільки для вищезазначеного конструктора немає аргументів, поля-члени myObj будуть ініціалізовані до початкових значень за замовчуванням.
        Для числових типів даних, таких як int, встановлено значення 0.
Значення змінної типу даних Char встановлюється як нульовий (‘ 0’) символ.
Посилання встановлюються як нульові.
У цьому підручнику ми детально обговоримо конструктори, а також різні конструктори, що використовуються в Java.
Як створити конструктор на Java
Щоб створити конструктор на Java, нам потрібно дотримуватися певних правил, наведених нижче.
Конструктор класу має те саме ім'я, що і ім'я класу.
Не може бути конструктора, який є остаточним, абстрактним, синхронізованим або статичним. Це пояснюється тим, що Фінал діє як константа, абстрактне не може бути створено. Хоча синхронізація використовується у випадку багатопоточності, а ключове слово static використовується на рівні класу.
Ми можемо використовувати модифікатори доступу з конструкторами.
Конструктор не може мати тип повернення.
Наприклад,давайте визначимо клас Student наступним чином:
class Student{ String name; int roll_no; }
Ми можемо створювати об’єкти вищевказаного класу, використовуючи нове ключове слово. Поки об’єкт створюється, ми можемо ініціалізувати двочленні змінні цього класу, надавши конструктор. Зауважте, що навіть якщо ми не надаємо конструктор і просто виконуємо наведену нижче заяву,
Студент = новий Студент ();
І все-таки Java виконає конструктор за замовчуванням, який ініціалізує двочленні змінні за замовчуванням. Тепер, якщо ми хочемо, щоб початкове значення Student.name було “Кіт”, а roll_no - 27, тоді для цього ми можемо створити такий метод конструктора.
Student () { name = 'Keith'; roll_no = 27; }
Коли ми створюємо об’єкт студентського класу з наведеним нижче твердженням
Student student = new Student ();
Тоді початковими значеннями змінних-членів name та roll_no будуть Кіт та 27 відповідно.
Тепер, коли конструктор створений, коли він буде викликаний?
Конструктор викликається кожного разу, коли об’єкт створюється з новим ключовим словом, як у наведеному вище випадку. Як уже зазначалося, якщо конструктор не надається, Java надає конструктор за замовчуванням, який викликається при створенні об'єкта за допомогою нового ключового слова.
Конструктор за замовчуванням у Java
Конструктор за замовчуванням також називається Порожній конструктор . Цей конструктор вставляється компілятором Java у код класу, де немає конструктора, реалізованого програмістом. Конструктор за замовчуванням вставляється під час компіляції, отже, він відображатиметься лише у файлі «.class», а не у вихідному коді.
Іноді для опису конструктора no-arg в Java використовується конструктор за замовчуванням. Але ці два терміни насправді різні. Конструктор No-Arg - це тип конструктора в Java, який визначається програмістом. Конструктор за замовчуванням - це конструктор, який вставляється компілятором Java.
Отже, хоча ці два терміни використовуються як взаємозамінні більшістю програмістів, бажано не плутати ці два терміни.
Коли Java вставляє конструктор за замовчуванням, якщо програма має будь-які змінні, то їм присвоюються значення за замовчуванням.
У таблиці нижче наведено значення за замовчуванням для кожного типу даних.
Тип	Значення за замовчуванням
char	u0000
Об'єкт	Посилання нульове
логічний	помилковий
байт	0
короткий	0
інт	0
довгота	0л
плавати	0,0f
подвійний	0,0д
# 1) Конструктор без аргументів
Конструктор без будь-яких аргументів називається конструктором no-args або no-argument. Якщо у нас немає конструктора без будь-яких аргументів, то компілятор Java не створює конструктор за замовчуванням для класу.
Загалом, якщо ми визначаємо конструктор у нашому класі, тоді конструктор за замовчуванням не вставляється компілятором Java.
Нижче наведено приклад конструктора No-arg
import java.io.*; class DemoClass { int num; String name; // no-args Constructor called when object is created DemoClass()
{ System.out.println('DemoClass::Constructor called'); System.out.println('Initial member variable values:');
 System.out.println('num = ' + num + ' name = ' + name); } } class Main{ public static void main (String[] args) { // this will invoke no-args Constructor DemoClass dc1 = new DemoClass(); } }
    */
}
