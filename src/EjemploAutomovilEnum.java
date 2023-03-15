public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO,  new Motor(3.0, TipoMotor.DISEL));
        mazda.setTanque(new Tanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("tipo subaru: " + tipoSubaru.getNombre());
        System.out.println("tipo desc.subaru: " + tipoSubaru.getDescripcion());

        switch (tipoSubaru) {
            case CONVERTIBLE -> System.out.println("El automovil es deportivo y descapotable de dos puertas");
            //break;
            case COUPE -> System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
            // break;
            case FURGON -> System.out.println("Es un automovil utilitario de transporte, de empresas");
            //break;
            case HATCHBACK -> System.out.println("Es un automovil mediano compacto, aspecto deportivo");
            // break;
            case PICKUP -> System.out.println("Es un automovil de doble cabina o camioneta");
            // break;
            case SEDAN -> System.out.println("Es un automovil mediano");
            //break;
            case STATION_WAGON -> System.out.println("Es un automovil mas grande, con maleta grande...");
            //break;
        }
        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta : tipos) {
            System.out.print(ta + " => " + ta.name() + ", " + ta.getNombre() + ", " + ta.getDescripcion() +
                    ", " + ta.getNumeroPuertas());
            System.out.println();
        }
    }
}