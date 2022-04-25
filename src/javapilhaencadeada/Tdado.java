
package javapilhaencadeada;

public class Tdado {
    private String url;
    private String data_hora;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }
    
     @Override
    public String toString() {
        return "Site{" +
                "url=" + getUrl() +
                " Data=" + getData_hora()+
                '}';
    }
    
}
