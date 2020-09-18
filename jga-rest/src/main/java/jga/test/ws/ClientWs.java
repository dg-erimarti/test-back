package jga.test.ws;

import java.util.List;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import jga.test.ws.model.Cuenta;

public class ClientWs {
	private static final String URL_BASE = "https://run.mocky.io/v3/b886346f-4710-49e2-854f-3f8b87022732";
    private static Client cliente;
    private static WebTarget webTarget;
    private static Cuenta cuenta;
    private static List<Cuenta> cuentas;
    jga.test.ws.model.Response responseC;
    private static Invocation.Builder invocationBuilder;
    private static Response response;

    
    public jga.test.ws.model.Response getData() {
    	cliente = ClientBuilder.newClient();
        webTarget = cliente.target(URL_BASE);
        webTarget.request(MediaType.APPLICATION_JSON);
        responseC = webTarget.request(MediaType.APPLICATION_JSON).get(jga.test.ws.model.Response.class);
        return responseC;
    }
    
}
