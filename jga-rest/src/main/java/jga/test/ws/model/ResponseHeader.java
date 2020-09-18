package jga.test.ws.model;

public class ResponseHeader {
	String origen;
	String localizacion;
	String unicidad;
	String filler;
	String idioma;
	String sesion;
	String ip;
	String idCliente;
	String tipoIdCliente;
	Documento documento ;
	
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	public String getUnicidad() {
		return unicidad;
	}
	public void setUnicidad(String unicidad) {
		this.unicidad = unicidad;
	}
	public String getFiller() {
		return filler;
	}
	public void setFiller(String filler) {
		this.filler = filler;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getSesion() {
		return sesion;
	}
	public void setSesion(String sesion) {
		this.sesion = sesion;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getTipoIdCliente() {
		return tipoIdCliente;
	}
	public void setTipoIdCliente(String tipoIdCliente) {
		this.tipoIdCliente = tipoIdCliente;
	}
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
}
