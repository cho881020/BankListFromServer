package com.tj.banklistfromserver.datas;

import org.json.JSONException;
import org.json.JSONObject;

public class Bank {

    public int id;
    public String code;
    public String name;
    public String logo;

//    JSON -> Bank 클래스로 전환해주는 메쏘드.

    public static Bank getBankFromJson(JSONObject bankJson) {

//        리턴해주기 위한 bank 객체를 생성
//        내부 데이터는 모두 비어있는 상태
        Bank bankObject = new Bank();

//        비어있는 데이터를 bankJson으로부터 추출해서 채우자.
        try {
            bankObject.id = bankJson.getInt("id");
            bankObject.code = bankJson.getString("code");
            bankObject.name = bankJson.getString("name");
            bankObject.logo = bankJson.getString("logo");
        } catch (JSONException e) {
            e.printStackTrace();
        }


        return bankObject;

    }

}









