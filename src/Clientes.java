import java.util.List;

public class Clientes {
    private String nombreCliente;
    private String apellidoCliente;
    private List<Cuenta> Cuentas;

    public Clientes(String nombreCliente, String apellidoCliente, List<Cuenta> Cuentas) {
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.Cuentas = Cuentas;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public List<Cuenta> getCuentas() {
        return Cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.Cuentas = cuentas;
    }
}
