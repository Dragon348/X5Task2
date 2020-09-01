package ru.x5;

import java.util.HashMap;
import java.util.Map;

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
    private Map<Integer,Float> callCost = new HashMap<>();
    private Map<Integer,String> cityCode = new HashMap<>();
    public Task7(){
        cityCode.put(905,"Москва");
        cityCode.put(194,"Ростов");
        cityCode.put(491,"Краснодар");
        cityCode.put(800,"Киров");
        callCost.put(905,4.15f);
        callCost.put(194,1.98f);
        callCost.put(491,2.69f);
        callCost.put(800,5.00f);
    }
    public void pritTenCost(int code){
        System.out.println(cityCode.get(code) + ". Стоимость разговора: " + callCost.get(code) * 10);
    }

    public void solveTask(Reader reader){
        while(true) {
            try {
                System.out.println("Введите код города:");
                pritTenCost(reader.readInt());
                break;
            }
            catch (Exception e){
                System.out.println("Неизвестный код города");
            }
        }
    }
}
