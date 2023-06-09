public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        //subaru.setColor(Automovil.COLOR_BLANCO);
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        //Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DISEL));
        mazda.setTanque(new Tanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());
        //Automovil nissan = new Automovil("Nissan", "Navara", Automovil.COLOR_GRIS, 3.5, 50);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DISEL), new Tanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Tanque(50));
        //nissan2.setColor("Amarillo");
        nissan2.setTipo(TipoAutomovil.PICKUP);
        nissan2.setColor(Color.AMARILLO);
        // nissan2.colorPatente = "azul";
        //Automovil.colorPatente = "verde";atributo siendo default y no private
        //Automovil.setColorPatente(Automovil.COLOR_AZUL);
        Automovil.setColorPatente(Color.AZUL);
        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente().getColor());
        System.out.println("Kilometros por litos = " + Automovil.calcularConsumoEstatico(300, 60));
        System.out.println("Velocidad maxima en carretera " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima en ciudad " + Automovil.VELOCIDAD_MAX_CIUDAD);

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("tipo subaru: " + tipoSubaru.getNombre());
        System.out.println("tipo desc.subaru: " + tipoSubaru.getDescripcion());

        System.out.println(mazda.calcularConsumo(300, 70));
    }
}