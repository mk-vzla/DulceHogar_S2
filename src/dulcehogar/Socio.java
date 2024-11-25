package dulcehogar;

public class Socio {

    private String rut;
    private String nombre;
    private String appPaterno;
    private String appMaterno;
    private String correo;
    private String domicilio;
    private String region;
    private String ciudad;
    private String comuna;
    private int numTelefono;
    private CuentaSocio cuentaSocio;

    public Socio(String rut, String nombre, String appPaterno, String appMaterno, String correo, String domicilio, String region, String ciudad, String comuna, int numTelefono, int numeroCuenta) {
        this.rut = rut;
        this.nombre = nombre;
        this.appPaterno = appPaterno;
        this.appMaterno = appMaterno;
        this.correo = correo;
        this.domicilio = domicilio;
        this.region = region;
        this.ciudad = ciudad;
        this.comuna = comuna;
        this.numTelefono = numTelefono;
        this.cuentaSocio = new CuentaSocio(numeroCuenta);
    }
    


    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppPaterno() {
        return appPaterno;
    }

    public void setAppPaterno(String appPaterno) {
        this.appPaterno = appPaterno;
    }

    public String getAppMaterno() {
        return appMaterno;
    }

    public void setAppMaterno(String appMaterno) {
        this.appMaterno = appMaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    public CuentaSocio getCuentaSocio() {
        return cuentaSocio;
    }

    public void setCuentaSocio(CuentaSocio cuentaSocio) {
        this.cuentaSocio = cuentaSocio;
    }

    public void verDatos() {
        System.out.println("-----------------------------------------");
        System.out.println("           Datos del Socio               ");
        System.out.println("Numero de Socio:   " + cuentaSocio.getNumeroCuenta());
        System.out.println("RUT:               " + rut);
        System.out.println("Nombre:            " + nombre);
        System.out.println("Apellido Paterno:  " + appPaterno);
        System.out.println("Apellido Materno:  " + appMaterno);
        System.out.println("Email:             " + correo);
        System.out.println("Domicilio:         " + domicilio);
        System.out.println("Region:            " + region);
        System.out.println("Ciudad:            " + ciudad);
        System.out.println("Comuna:            " + comuna);
        System.out.println("Telefono:          " + numTelefono);
        System.out.println("-----------------------------------------");
    }
}
