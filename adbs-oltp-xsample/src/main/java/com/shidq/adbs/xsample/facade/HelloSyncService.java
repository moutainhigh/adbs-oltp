package com.shidq.adbs.xsample.facade;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("hello")
public interface HelloSyncService {
    @Path("say")
    @POST
    String saySync(String string);

    @Path("say0")
    @POST
    String saySync0(String string);
}
