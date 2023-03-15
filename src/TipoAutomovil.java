public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano", 4),

    STATION_WAGON("Starion Wagon", "Auto grande", 5),

    HATCHBACK("Hatchback", "Auto Compacto", 5),

    PICKUP("Pickup", "Camioneta", 4),

    COUPE("Coupe", "Auto Pequeño", 2),

    CONVERTIBLE("Convertible", "Auto Deportivo", 2),

    FURGON("Furgon", "Auto Utilitario", 3),

    SUV("SUV", "Todo terreno deportivo", 5);

    private final String nombre;
    private final String descripcion;
    private final int numeroPuertas;

    TipoAutomovil(String nombre, String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}
