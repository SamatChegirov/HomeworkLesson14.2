/*Fruits деген класс түзүңүз,аны Orange,Apple,Banana деген класстар мурастасын.(IS-A)
Orange,Apple,Banana класстардын кайсы витаминге бай полялары(класстары)болсун.(HAS-A)
Мейн класстан объекттерин түзүп,toString()колдонуп,консольго чыгарыңыз.*/

public class Main {
    public static void main(String[] args) {

        Vitamin vitamin = new Vitamin("E ");
        Orange orange = new Orange("Orange ","red ", vitamin);
        Banana banana = new Banana("Banana ","yellow ", vitamin);
        Apple apple = new Apple("Apple ", "green ", vitamin);
        System.out.println(banana + "\n" + orange + "\n" + apple);
    }
}