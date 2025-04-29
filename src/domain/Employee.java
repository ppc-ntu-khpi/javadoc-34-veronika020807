package domain;

/**
 * Клас {@code Employee} представляє загального працівника з базовими атрибутами:
 * ім'я, посада, рівень, відділ та ID.
 */
public class Employee {

    /**
     * Ім'я працівника.
     */
    private String name;

    /**
     * Посада працівника.
     */
    private String jobTitle;

    /**
     * Унікальний ідентифікатор працівника.
     */
    private int ID;

    /**
     * Рівень працівника (1–3).
     */
    private int level;

    /**
     * Відділ, у якому працює працівник.
     */
    private String dept;

    /**
     * Повертає рядкове представлення працівника.
     *
     * @return інформація про працівника у вигляді тексту
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID +
               "\nName= " + name +
               "\nJobTitle= " + jobTitle +
               "\nLevel= " + level +
               "\nDept= " + dept;
    }

    /**
     * Повний конструктор, який ініціалізує всі атрибути працівника.
     * Перевіряє допустимість рівня (1–3).
     *
     * @param name     ім'я працівника
     * @param jobTitle посада працівника
     * @param level    рівень працівника
     * @param dept     відділ працівника
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this(); // викликає конструктор за замовчуванням для генерації ID
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Конструктор за замовчуванням. Генерує випадковий ID.
     */
    public Employee() {
        ID = (int) (Math.random() * 1000);
        // ID обмежується значенням до 1000
    }

    /**
     * Встановлює посаду працівника.
     *
     * @param job посада
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає посаду працівника.
     *
     * @return посада
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я працівника.
     *
     * @return ім'я
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень працівника. Допустимі значення: 1, 2, 3. Недопустимі значення замінюються на 1.
     *
     * @param level рівень працівника
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівень працівника.
     *
     * @return рівень
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає відділ працівника.
     *
     * @return назва відділу
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює відділ працівника.
     *
     * @param dept назва відділу
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім'я працівника. Якщо ім’я не відповідає шаблону, буде встановлено "John Doe".
     *
     * @param name ім’я працівника
     */
    public void setName(String name) {
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
