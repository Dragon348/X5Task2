package ru.x5;

/*
Написать программу, вычисляющую стоимость 10
минутного междугороднего разговора в зависимости
от кода города. ( Москва(905) - 4.15руб. Ростов(194) -
1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00
руб. ). Пользователь в консоли должен ввести код
города, а в ответ от программы получить, например,
при вводе кода 905, - «Москва. Стоимость разговора:
41.5»
 */
public class Task7 {

    public void printTenCost(int code) {
        //System.out.println(cityCode.get(code) + ". Стоимость разговора: " + callCost.get(code) * 10);
        switch (code) {
            case 905: {
                System.out.println("Москва. Стоимость разговора: " + 4.15f * 10);
                break;
            }
            case 194: {
                System.out.println("Ростов. Стоимость разговора: " + 1.98f * 10);
                break;
            }
            case 491: {
                System.out.println("Краснодар. Стоимость разговора: " + 2.69f * 10);
                break;
            }
            case 800: {
                System.out.println("Киров. Стоимость разговора: " + 5.00f * 10);
                break;
            }
            default: {
                System.out.println("Неизвестный код города");
            }
        }
    }

    public void solveTask(Reader reader) {
        printTenCost(reader.readInt());
    }
}
