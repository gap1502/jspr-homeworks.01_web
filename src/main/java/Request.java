import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class Request {

    private String method;
    private String path;
    private Map<String, List<String>> queryParams;
    private List<String> headers;
    private byte[] body;
    private final InputStream in;

    public Request(String method, String path, List<String> headers, Map<String,
            List<String>> queryParams, InputStream in) {
        this.method = method;
        this.path = path;
        this.headers = headers;
        this.queryParams = queryParams;
        this.in = in;
    }

    public List<String> getQueryParam(String name) {

        return queryParams.get(name);
    }

    public String getMethod() {
        return method;
    }

    public String getPath() {
        return path;
    }


    public List<String> getHeaders() {

        return headers;
    }


    public byte[] getBody() {

        return body;
    }

    public void setBody(byte[] body) {

        this.body = body;
    }

    public Map<String, List<String>> getQueryParams() {

        return queryParams;
    }

    @Override
    public String toString() {
        return "Request{" +
                "method='" + method + '\'' +
                ", path='" + path + '\'' +
                ", queryParams=" + queryParams +
                ", headers=" + headers +
                ", body=" + Arrays.toString(body) +
                ", in=" + in +
                '}';
    }
}
