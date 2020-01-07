package com.example.josimargonzalez.Dafiti_pickup;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

/**
 * Created by paul.sepulveda on 08/06/2016.
 */
public class pickup implements Serializable{

    public String codigo;

    public void asignaJson (JSONObject obj) throws JSONException {
        this.codigo = obj.getString("codigo");

    }

    public JSONObject getJsonObj()  throws JSONException{
        JSONObject json_data = new JSONObject();

        json_data.put("codigo",this.codigo);

        return json_data;
    }

    public void pedido(){
        this.codigo = "0";
    }


}
