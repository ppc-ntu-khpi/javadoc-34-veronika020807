package domain;

/**
 * Клас {@code Editor} є підкласом {@code Artist}, який додає специфічну характеристику —
 * уподобання редагування (електронне чи паперове).
 */
public class Editor extends Artist {

    /**
     * Вказує, чи редактор надає перевагу електронному редагуванню.
     */
    private boolean electronicEditing;

    /**
     * Повний конструктор для створення редактора з усіма параметрами.
     *
     * @param electronicEditing чи є електронне редагування
     * @param skiils            масив навичок редактора
     * @param name              ім’я працівника
     * @param jobTitle          посада
     * @param level             рівень працівника
     * @param dept              відділ
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор для створення редактора з навичками та уподобанням редагування.
     *
     * @param electronicEditing чи є електронне редагування
     * @param skiils            масив навичок
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор для створення редактора лише з уподобанням редагування.
     *
     * @param electronicEditing чи є електронне редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор за замовчуванням. Електронне редагування встановлюється як true.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає рядкове представлення об’єкта, включаючи тип редагування.
     *
     * @return текстовий опис об'єкта
     */
    @Override
    public String toString() {
        String s = super.toString() + "\nEditing preferences= ";
        if (electronicEditing)
            s = s + "electronic";
        else
            s = s + "paper";
        return s;
    }

    /**
     * Повертає уподобання редагування.
     *
     * @return true, якщо електронне редагування; false, якщо паперове
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює уподобання редагування.
     *
     * @param electronic true для електронного, false для паперового
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}
