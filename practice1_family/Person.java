package org.example.practice1_family;

public class Person {
    private String fullName;
    private boolean gender;

    private static int defaultIndex;

    public Person(String fullName, boolean gender) {
        if (fullName.isEmpty()) {
            this.fullName = String.format("Defaultname_%d", defaultIndex++);
        } else {
            this.fullName = fullName;
        }
        this.gender = gender;
    }

    /**
     * Вариант, когда не знаем, как зовут прабабушку, а знаем прапрабабушку. Ее все равно надо назвать. А пол ее известен
     * @param gender - пол задать надо
     */
    public Person(boolean gender) {
        this("", gender);
    }

    public String getFullName() {
        return fullName;
    }

    public boolean getGender() {
        return gender;
    }
}
