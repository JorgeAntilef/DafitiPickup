package com.example.josimargonzalez.Dafiti_pickup;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

/**
 * Created by paul.sepulveda on 08/06/2016.
 */
public class pedido implements Serializable{

    public String pedido;
    public int manifiesto;
    public String fecha;
    public String nombre_manifiesto;
    public String hora_llegada;
    public String cod_ruta;
    public String estado_entrega;
    public String carrier;
    public String encargado;
    public String latitud;
    public String longitud;
    public String comuna;
    public String direccion;
    public String referencia;
    public String nombre_cliente;
    public String descripcion_estado;
    public String direccion_mapa;
    public String fecha_gestion;
    public String in_map;
    public int solicitud;
    public String tipo_solicitud;


    public void asignaJson (JSONObject obj) throws JSONException {
        this.pedido = obj.getString("pedido");
        this.manifiesto = obj.getInt("manifiesto");
        this.fecha = obj.getString("fecha");
        this.nombre_manifiesto = obj.getString("nombre_manifiesto");
        this.hora_llegada = obj.getString("hora_llegada");
        this.cod_ruta = obj.getString("cod_ruta");
        this.estado_entrega = obj.getString("estado_entrega");
        this.carrier = obj.getString("carrier");
        this.encargado = obj.getString("encargado");
        this.latitud = obj.getString("latitud");
        this.longitud = obj.getString("longitud");
        this.comuna = obj.getString("comuna");
        this.direccion = obj.getString("direccion");
        this.referencia = obj.getString("referencia");
        this.nombre_cliente = obj.getString("nombre_cliente");
        this.descripcion_estado = obj.getString("descripcion_estado");
        this.direccion_mapa = obj.getString("direccion_mapa");
        this.in_map = obj.getString("in_map");
        this.solicitud = obj.getInt("solicitud");
        this.tipo_solicitud = obj.getString("tipo_solicitud");
    }

    public JSONObject getJsonObj()  throws JSONException{
        JSONObject json_data = new JSONObject();

        json_data.put("pedido",this.pedido);
        json_data.put("manifiesto",this.manifiesto);
        json_data.put("fecha",this.fecha);
        json_data.put("nombre_manifiesto",this.nombre_manifiesto);
        json_data.put("hora_llegada",this.hora_llegada);
        json_data.put("cod_ruta",this.cod_ruta);
        json_data.put("estado_entrega",this.estado_entrega);
        json_data.put("carrier",this.carrier);
        json_data.put("encargado",this.encargado);
        json_data.put("latitud",this.latitud);
        json_data.put("longitud",this.longitud);
        json_data.put("comuna",this.comuna);
        json_data.put("direccion",this.direccion);
        json_data.put("referencia",this.referencia);
        json_data.put("nombre_cliente",this.nombre_cliente);
        json_data.put("descripcion_estado",this.descripcion_estado);
        json_data.put("direccion_mapa",this.direccion_mapa);
        json_data.put("fecha_gestion",this.fecha_gestion);
        json_data.put("solicitud",this.solicitud);
        json_data.put("tipo_solicitud",this.tipo_solicitud);

        return json_data;
    }

    public void pedido(){
        this.pedido = "0";
    }


}
