package com.company;

public class Main {

    public static void main(String[] args) {
        String numberPhone = "+7 (915) 607-83-52";//89156078352  +7 915 607 83-52
        System.out.println("Введенный номер телефона: " + numberPhone);
        System.out.print("Скорректированный номер телефона: ");
        String[] array;
        array = correctPhone1(numberPhone);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static String[] correctPhone1(String phone) {
        String[] massSymbol = {"+7", "(", ")", " ", "-"};
        String correctOperation = "Замена +7 на 8; Удаление '('; Удаление ')'; Удаление ' '; Удаление '-'.";
        String[] massStr={"",""};
        if (phone.length() > 11) {
            for (int i = 0; i < massSymbol.length; i++) {
                if (i == 0) {
                    if (phone.contains(massSymbol[i]) == false) {
                        correctOperation = correctOperation.replace("Замена +7 на 8;", "");
                        continue;
                    } else {
                        phone = phone.replace(massSymbol[i], "8");
                    }
                } else {
                    if (phone.contains(massSymbol[i]) == false && correctOperation.contains(massSymbol[i])) {
                        correctOperation = correctOperation.replace("; Удаление '" + massSymbol[i] + "'", "");
                        continue;
                    } else {
                        phone = phone.replace(massSymbol[i], "");
                    }
                }
            }
            if (phone.length() > 11) {
                phone = "Веден некорректный номер телефона";
                correctOperation = "";
            }
        } else if (phone.length() == 11) {
            phone = "Изменений не было.";
            correctOperation = "";
        }
        for (int i = 0; i < massStr.length; i++) {
            if (i == 0) {
                massStr[i] = phone;
            } else {
                massStr[i] = correctOperation;
            }
        }
        return massStr;
    }
}
