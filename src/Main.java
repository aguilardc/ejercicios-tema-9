public class Main {
    public static void main(String[] args) {
        Cliente objCliente = new Cliente();
        objCliente.setNombre("Juan");
        System.out.println("Soy el cliente: " + objCliente.getNombre());
        objCliente.setEdad(25);
        System.out.println("Mi edad es: " + objCliente.getEdad() + " años");
        objCliente.setTelefono("983098345");
        System.out.println("Mi teléfono es: " + objCliente.getTelefono());
        objCliente.setCredito(5000);
        System.out.println("Tengo un credito de: " + objCliente.getCredito() + " €");

        Trabajador objTrabajador = new Trabajador();
        objTrabajador.setNombre("Luis");
        System.out.println("Soy el trabajador: " + objTrabajador.getNombre());
        objTrabajador.setEdad(34);
        System.out.println("Mi edad es: " + objTrabajador.getEdad() + " años");
        objTrabajador.setTelefono("+51 570-3412");
        System.out.println("Mi teléfono es: " + objTrabajador.getTelefono());
        objTrabajador.setSalario(1500);
        System.out.println("Recibo un salario de " + objTrabajador.getSalario() + " €");
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}