public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {
        Persona conductorSubaru = new Persona("Luci", "Martinez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSub);
        Rueda[] ruedasSub = new Rueda[5];
        /*ruedasSub[0] = new Rueda("Yokohama", 16, 7.5);
        ruedasSub[1] = new Rueda("Yokohama", 16, 7.5);
        ruedasSub[2] = new Rueda("Yokohama", 16, 7.5);
        ruedasSub[3] = new Rueda("Yokohama", 16, 7.5);
        ruedasSub[4] = new Rueda("Yokohama", 16, 7.5);*/
        /*for (int i = 0; i < ruedasSub.length; i++) {
            ruedasSub[i] = new Rueda("Yokohama", 16, 7.5);
        }*/
        for (int i = 0; i < ruedasSub.length; i++) {
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        Persona pato = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DISEL));
        mazda.setTanque(new Tanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setConductor(pato);
        //mazda.setRuedas(ruedasMaz);
        Rueda[] ruedasMaz = new Rueda[5];
        /*Rueda[] ruedasMaz = {new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),};*/
       /* for (int i = 0; i < ruedasMaz.length; i++) {
            ruedasMaz[i] = new Rueda("Michelin", 18, 10.5);
        }*/
        for (int i = 0; i < ruedasMaz.length; i++) {
            mazda.addRueda(new Rueda("Michelin", 18, 10.5));
        }


        Persona bea = new Persona("Bea", "Gonzales");
        /*Rueda[] ruedasNissan = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),};*/
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DISEL), new Tanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.addRueda(new Rueda("Pirelli", 20, 11.5))
        .addRueda(new Rueda("Pirelli", 20, 11.5))
        .addRueda(new Rueda("Pirelli", 20, 11.5))
        .addRueda(new Rueda("Pirelli", 20, 11.5))
        .addRueda(new Rueda("Pirelli", 20, 11.5));

        Persona lalo = new Persona("Lalo", "Mena");
        Rueda[] ruedasNissan2 = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),};
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Tanque(50), lalo, ruedasNissan2);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        nissan2.setColor(Color.AMARILLO);
        Automovil.setColorPatente(Color.AZUL);

        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());

        /*System.out.println("Conductor subaru: " + subaru.getConductor());
        System.out.println("Ruedas subaru");
        for (Rueda r : subaru.getRuedas()) {
            System.out.println(r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho());
        }*/

    }
}