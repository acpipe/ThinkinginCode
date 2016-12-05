package com.hit.learn.http;

import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;

import javax.ws.rs.core.UriBuilder;
import java.net.InetAddress;
import java.net.URI;

/**
 * Created by Acceml on 2016/12/5.
 */
public class Httpserver {
    public static void main(String[] args) throws Exception {
        InetAddress ia = null;
        ia = ia.getLocalHost();
        String localIp = ia.getHostAddress();
        URI baseUri = UriBuilder.fromUri("http://" + localIp + "/").port(10086).build();
        System.out.println(baseUri);
        Server httpServer = JettyHttpContainerFactory.createServer(baseUri, new Application());
        try {
            httpServer.start();
        } catch (Exception e) {
            e.printStackTrace();
            // 10.232.21.9
        }
    }
}
