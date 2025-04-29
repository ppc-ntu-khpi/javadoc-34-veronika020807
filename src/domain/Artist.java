package domain;

/**
 * Клас {@code Artist} є підкласом {@code Employee}, який представляє художника або спеціаліста з креативними навичками.
 * Додає список навичок (skills), специфічних для художника.
 */
public class Artist extends Employee {

    /**
     * Масив навичок художника.
     */
    private String[] skiils;

    /**
     * Конструктор, який створює об'єкт Artist з повними даними.
     *
     * @param skiils   масив навичок художника
     * @param name     ім'я працівника
     * @param jobTitle посада працівника
     * @param level    рівень працівника
     * @param dept     відділ працівника
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Конструктор, який створює об'єкт Artist лише з навичками.
     *
     * @param skiils масив навичок художника
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     * Конструктор за замовчуванням. Ініціалізує порожній масив з 10 елементів.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Повертає рядкове представлення об'єкта, включаючи навички.
     *
     * @return рядкове представлення об'єкта
     */
    @Override
    public String toString() {
        return super.toString() + "\nSkills: " + getSkills();
    }

    /**
     * Повертає навички художника у вигляді одного рядка, розділеного комами.
     *
     * @return навички як рядок
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
        s = s.substring(0, s.length() - 2); // Видаляє останню кому та пробіл
        return s;
    }

    /**
     * Встановлює масив навичок для художника.
     *
     * @param skills масив навичок
     */
    public void setSkills(String[] skills) {
        this.skiils = skills;
    }

    /**
     * Повертає масив навичок художника.
     *
     * @return масив навичок
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
