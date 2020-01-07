package com.example.josimargonzalez.Dafiti_pickup;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

public class pickup_pinchazos implements Serializable {


        public String id_tbl_pickup;
        public String codigo;

        public void asignaJson (JSONObject obj) throws JSONException {
            this.id_tbl_pickup = obj.getString("id_tbl_pickup");
            this.codigo = obj.getString("codigo");

        }



}
