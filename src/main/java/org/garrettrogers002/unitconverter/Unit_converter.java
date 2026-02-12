/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.garrettrogers002.unitconverter;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;
/**
 *
 * @author Gary
 */
public class Unit_converter {

    public static void main(String[] args) {
        try {
           HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
           // first endpoint or something
           
           server.createContext("/api/convert", (exchange) -> {
            System.out.println("Request came");
            String response = "Hello world";
            exchange.sendResponseHeaders(200, response.getBytes().length);
            OutputStream outputStream = exchange.getResponseBody();
            outputStream.write(response.getBytes());
            outputStream.flush();
            exchange.close();
           });
        } catch (Exception e) {
            System.out.println("Error creating server: " + e.getLocalizedMessage());
        }
        Unit_converter unit_converter = new Unit_converter();
        System.out.println(unit_converter);
        System.out.println("Hello World!");
    }
}
