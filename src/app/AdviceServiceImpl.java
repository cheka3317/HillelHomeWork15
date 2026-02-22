package app;

public class AdviceServiceImpl implements AdviceService {

    @Override
    public void advise(Day day) {
        if (day == null) {
            System.out.println("День не може бути null.");
            return;
        }

        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Порада для продуктивності: Сьогодні час підкорювати світ! Почни з кави, склади план і зроби хоча б одну справу, за яку майбутній ти скаже “красунчик”.");
                break;

            case FRIDAY:
                System.out.println("Happy Friday!");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Рекомендації для вихідних: Час наповнювати батарейки! Зроби щось, що дарує енергію.");
                break;

            default:
                System.out.println("Невідомий день.");
        }
    }
}
