package Task2;

public abstract class Tasks {

    public String number(){  // метод не абстрактный, наследуется напрямую
        return "1";  // возврат сгенерированного значения
    }

    public abstract int prioritet(); // метод абстрактный, требует реализации в классе наследнике

    public abstract long time(); // метод абстрактный, требует реализации в классе наследнике

    public abstract String name();

    }


