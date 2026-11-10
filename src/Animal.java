public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String nombreDueno;

    public Animal(String nombre, int edad, String nombreDueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }

    // B. Cada especie lo resuelve a su manera: sin cuerpo, termina en ;
    public abstract double calcularCostoConsulta();

    // C. Todas lo heredan igual y llama internamente al método abstracto
    public void imprimirFicha() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Dueño: " + nombreDueno);
        System.out.println("Costo de consulta: $" + calcularCostoConsulta());
        System.out.println("-----------------------");
    }
}
