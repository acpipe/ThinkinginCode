package com.hit.learn.http.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Acceml on 2016/12/5.
 */
@Path("/")
public class CheckService {
    private static int clickNum = 0;
    private static int viewNum = 0;
    private static int testNum = 0;

    @GET
    @Path("click")
    /**
     * http://10.232.21.9:10086/click
     */
    public String click() {
        String ret = "click:" + (++clickNum);
        System.out.println(ret);
        return ret;
    }

    @GET
    @Path("view")
    /**
     * http://10.232.21.9:10086/view
     */
    public String view() {
        String ret = "view:" + (++viewNum);
        System.out.println(ret);
        return ret;
    }

    @GET
    @Path("test")
    /**
     * http://10.232.21.9:10086/test
     */
    public String test() {
        String ret = "test:" + (++testNum);
        System.out.println(ret);
        return ret;
    }
}
