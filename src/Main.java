public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 180; // Вводится рост в см
        double weight = 74.2; // Вводится вес в кг
        double bmi = service.calculate(180, 59);
        System.out.println("Индекс массы тела ИМТ");
        System.out.println("при росте: " + height + " см. и весе: " + weight + " кг. составляет: " + bmi + "  кг/м²");

    }
}
