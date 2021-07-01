package com.T_Y.driver;
import com.T_Y.controller.ApiHandler;
import com.T_Y.controller.UrlIhandler;
import com.T_Y.server.TcpServer;

public class Main {
        public static void main(String[] args) {
            try {
                TcpServer sqlServer = new TcpServer(8010);
                sqlServer.supportClients(new UrlIhandler());
                System.out.println("Tcp server is listening on port 8010 for SQL quarries");
                TcpServer apiServer = new TcpServer(8011);
                apiServer.supportClients(new ApiHandler());
                System.out.println("Tcp server is listening on port 8011 for Api requests");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
