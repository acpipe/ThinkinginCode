package com.hit.learn.http;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by Acceml on 2016/12/5.
 */
public class Application extends ResourceConfig {
    public Application() {
        packages("com.hit.learn.http.resources");
        register(JacksonJsonProvider.class);
        register(JacksonFeature.class);
    }
}
