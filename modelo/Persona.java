package modelo;

public class Persona {
    // Atributos privados
    private Long id;
    private String name;
    private String firstName;
    private String lastName;
    private String phone;

    // Constructor para inicializar los atributos
    public Persona(Long id, String name, String firstName, String lastName, String phone) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    // Getters y setters para acceder y modificar los atributos
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Método para mostrar información de la persona
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + name);
        System.out.println("Primer Nombre: " + firstName);
        System.out.println("Apellido: " + lastName);
        System.out.println("Teléfono: " + phone);

    }
}
