package com.company;

public class Main {

    public static void main(String[] args) {
        String numberPhone = "89156078352";
        System.out.println("Введенный номер телефона: " + numberPhone);
        System.out.println("Скорректированный номер телефона: " + correctPhone2(numberPhone)); // сделал 2 метода correctPhone1 чисто на if и correctPhone2 с циклом покороче
    }

    public static String correctPhone1(String phone) {
        if (phone.length() > 11) {
            if (phone.contains("+7")) {
                phone = phone.replace("+7", "8");
                System.out.print("Замена +7 на 8");
                if (phone.length() > 11) {
                    System.out.print("; ");
                } else {
                    System.out.println(".");
                }
            }
            if (phone.contains("(")) {
                phone = phone.replace("(", "");
                System.out.print("Удаление открывающейся скобки '('");
                if (phone.length() > 11) {
                    System.out.print("; ");
                } else {
                    System.out.println(".");
                }
            }
            if (phone.contains(")")) {
                phone = phone.replace(")", "");
                System.out.print("Удаление закрывающейся скобки ')'");
                if (phone.length() > 11) {
                    System.out.print("; ");
                } else {
                    System.out.println(".");
                }
            }
            if (phone.contains("-")) {
                phone = phone.replace("-", "");
                System.out.print("Удаление дефиса '-' ");
                if (phone.length() > 11) {
                    System.out.print("; ");
                } else {
                    System.out.println(".");
                }
            }
            if (phone.contains(" ")) {
                phone = phone.replace(" ", "");
                System.out.print("Удаление пробелов");
                if (phone.length() > 11) {
                    System.out.print("; ");
                } else {
                    System.out.println(".");
                }
            }
            if (phone.length() > 11) {
                System.out.println("Веден некорректный номер телефона");
            }

        }
        return phone;
    }

    public static String correctPhone2(String phone) {
        String[] massSymbol = {"+7", "(", ")", " ", "-"};
        for (int i = 0; i < massSymbol.length; i++) {
            if (phone.length() > 11) {
                if (i == 0) {
                    phone = phone.replace(massSymbol[i], "8");
                    System.out.print("Замена +7 на 8");
                } else {
                    phone = phone.replace(massSymbol[i], "");
                    System.out.print("Удаление " + "'" + massSymbol[i] + "'");
                }
            } else if (phone.length() == 11) {
                System.out.println("Изменений не было.");
                break;
            }
            if (phone.length() > 11) {
                System.out.print("; ");
            } else {
                System.out.println(".");
            }
        }
        if (phone.length() > 11) {
            System.out.println();
            phone = "Веден некорректный номер телефона";
        }
        return phone;
    }
}
