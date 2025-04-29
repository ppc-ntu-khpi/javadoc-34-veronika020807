package domain;

/**
 * Клас {@code Manager} є підкласом {@code Employee}, який представляє керівника
 * з підлеглими працівниками.
 */
public class Manager extends Employee {

    /**
     * Масив працівників, якими керує менеджер.
     */
    private Employee[] employees;

    /**
     * Повний конструктор. Ініціалізує всі поля, включаючи підлеглих працівників.
     *
     * @param employees масив підлеглих працівників
     * @param name      ім’я менеджера
     * @param jobTitle  посада
     * @param level     рівень
     * @param dept      відділ
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Конструктор, який приймає лише підлеглих.
     *
     * @param employees масив підлеглих працівників
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Конструктор за замовчуванням. Створює масив з 10 працівників.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Повертає рядкове представлення менеджера разом зі списком підлеглих.
     *
     * @return інформація про менеджера
     */
    @Override
    public String toString() {
        return super.toString() + "\nEmployees: " + getEmployees();
    }

    /**
     * Повертає імена підлеглих у вигляді рядка, розділеного комами.
     *
     * @return імена працівників
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює масив працівників, якими керує менеджер.
     *
     * @param employees масив працівників
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Повертає масив підлеглих працівників.
     *
     * @return масив {@code Employee}
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
