package com.company;

public class Main {

    public static void main(String[] args) {
        String numberPhone = "+7 (915) 607-83-52";//89156078352  +7 915 607 83-52
        System.out.println("Введенный номер телефона: " + numberPhone);
        System.out.println("Скорректированный номер телефона: " + correctPhone1(numberPhone));
    }

    public static String correctPhone1(String phone) {
        String[] massSymbol = {"+7", "(", ")", " ", "-"};
        if (phone.length() > 11) {
            for (int i = 0; i < massSymbol.length; i++) {
                if (i == 0) {
                    if (phone.contains(massSymbol[i]) == false) {
                        continue;
                    } else {
                        phone = phone.replace(massSymbol[i], "8");
                        System.out.print("Замена +7 на 8");
                    }
                } else {
                    if (phone.contains(massSymbol[i]) == false) {
                        continue;
                    } else {
                        phone = phone.replace(massSymbol[i], "");
                        System.out.print("Удаление " + "'" + massSymbol[i] + "'");
                    }
                }
                if (phone.length() > 11) {
                    System.out.print("; ");
                } else {
                    System.out.println(".");
                }
            }
            if (phone.length() > 11) {
                phone = "Веден некорректный номер телефона";
            }
        } else if (phone.length() == 11) {
            phone = "Изменений не было.";
        }

        return phone;
    }
}
