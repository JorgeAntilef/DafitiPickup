package com.example.josimargonzalez.Dafiti_pickup;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

/**
 * Created by jorge.antilef on 03/04/2018.
 */

public class activa_estado implements Serializable {

    public String id_estado;
    public String carrier;
    public String estado;
  ;

    public void asignaJson (JSONObject obj) throws JSONException {
        this.id_estado = obj.getString("id_estado");
        this.carrier = obj.getString("carrier");
        this.estado = obj.getString("estado");

    }

    public JSONObject getJsonObj()  throws JSONException {
        JSONObject json_data = new JSONObject();

        json_data.put("id_estado",this.id_estado);
        json_data.put("carrier",this.carrier);
        json_data.put("estado",this.estado);

        return json_data;
    }

    public void ruta_optima(){
        this.id_estado = "0";
    }



}
