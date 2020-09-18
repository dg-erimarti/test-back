package jga.test.ws;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.omg.CORBA.RepositoryIdHelper;

import jga.test.ws.model.Cuenta;
import jga.test.ws.model.Response;
import jga.test.ws.model.ResponseBody;
import jga.test.ws.model.ResponseHeader;

@Path("/service")
public class Service {
	
	@GET
	@Path("/getCuentasActivas")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cuenta> getCuentasActivas() {
		List<Cuenta> cuentas = new ArrayList<Cuenta>();
		try {
			ClientWs cws = new ClientWs();
			Response responseC = cws.getData();
			ResponseBody responseBody = responseC.getResponseBody();
			for (Cuenta cuenta : responseBody.getCuentas()) {
				if(cuenta.getEstado().equals("ACTIVO")) {
					cuentas.add(cuenta);
				}
			}
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		return cuentas;
		
	}

}
