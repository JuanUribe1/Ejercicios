package org.examples;

import com.mongodb.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is a CRUD test with MongoDB!");
        MongoClient mongo = crearConexion();//conexion con Mongo
        if(mongo != null){
            DB db = mongo.getDB("PruebasFromJava");//conexion a la base de datos sino se crea
            System.out.println("Base de datos conectada");

            /*insertarUsuario(db, "usuarios", "probador", "colombia");//CREATE
            insertarUsuario(db, "usuarios", "visitor", "mexico");
            insertarUsuario(db, "usuarios", "administrador", "chile");*/

            /*mostrarColeccion(db, "usuarios");//READ
            System.out.println();
            buscarNombre(db, "usuarios", JOptionPane.showInputDialog(null,"Ingrese nombre para la busqueda"));*/

            /*mostrarColeccion(db, "usuarios");//UPDATE
            actualizarDocumento(db, "usuarios", JOptionPane.showInputDialog(null,"Ingrese nombre para la actualizacion"), "pais", JOptionPane.showInputDialog(null,"Ingrese pais para la actualizacion"));
            mostrarColeccion(db, "usuarios");*/

            /*mostrarColeccion(db, "usuarios");//DELETE
            borrarDocumento(db, "usuarios", JOptionPane.showInputDialog(null,"Ingrese nombre para la borrar"));
            mostrarColeccion(db, "usuarios");*/

            mostrarColeccion(db, "usuarios");

        }


    }

    private static void borrarDocumento(DB db, String coleccion, String nombre) {
        DBCollection collect = db.getCollection(coleccion);
        //Borra todas coincidencias
        collect.remove(new BasicDBObject().append("nombre", nombre));//una forma
        //borra una
        collect.findOne(new BasicDBObject().append("nombre", nombre)).get("id");//una forma
    }

    private static void actualizarDocumento(DB db, String coleccion, String nombre, String atributo, String value) {
        DBCollection collect = db.getCollection(coleccion);
        //crear la sentencia de actualizacion
        BasicDBObject actualizar = new BasicDBObject();
        actualizar.append("$set", new BasicDBObject().append(atributo,value));
        //buscar
        BasicDBObject consulta = new BasicDBObject().append("nombre", nombre);
        //actualizar
        collect.updateMulti(consulta, actualizar);
    }

    private static void buscarNombre(DB db, String coleccion, String nombre) {
        BasicDBObject consulta = new BasicDBObject();
        consulta.put("nombre", nombre);
        if(db.collectionExists(coleccion)){
            DBCollection collect = db.getCollection(coleccion);
            DBCursor cursor = collect.find(consulta);
            while(cursor.hasNext()){
                System.out.println(""+cursor.next().get("nombre")+" - "+cursor.curr().get("pais"));
            }
        }
    }

    private static void mostrarColeccion(DB db, String coleccion) {
        if(db.collectionExists(coleccion)){
            DBCollection collect = db.getCollection(coleccion);
            DBCursor cursor = collect.find();
            while(cursor.hasNext()){
                System.out.println(""+cursor.next().get("nombre")+" - "+cursor.curr().get("pais"));
            }
        }
    }

    private static void insertarUsuario(DB db, String coleccion, String name, String pais) {
        DBCollection collect = db.getCollection(coleccion);
        BasicDBObject documento = new BasicDBObject();
        documento.put("nombre", name);
        documento.put("pais", pais);
        collect.insert(documento);
    }

    private static MongoClient crearConexion() {
        System.out.println("Conexion creada");
        MongoClient mongo = null;
        mongo = new MongoClient("localhost", 27017);
        return mongo;
    }
}