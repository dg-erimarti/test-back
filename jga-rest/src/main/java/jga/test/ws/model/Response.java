package jga.test.ws.model;

public class Response {
	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}
	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	public ResponseBody getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(ResponseBody responseBody) {
		this.responseBody = responseBody;
	}
	public Error getError() {
		return error;
	}
	public void setError(Error error) {
		this.error = error;
	}
	ResponseHeader responseHeader;
	ResponseBody responseBody;
	Error error;
}
