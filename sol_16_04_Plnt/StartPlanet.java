package sol_16_04_enum;

public class StartPlanet   {


    private static Planet planet1;
//    Planet planet1;

    private final double mass1;   // in kilograms
    private final double radius1; // in meters
    private final double radiusOrb1; // in meters


    StartPlanet(Planet planet1) {
        this.planet1 = planet1;
        this.mass1 = planet1.mass;
        this.radius1 = planet1.radius;
        this.radiusOrb1 = planet1.radiusOrb;
    }


    public static void main(String[] args) {

//        if (args.length != 1) {
//            System.err.println("Usage: java  <earth_weight>");
//            System.exit(-1);
//        }

//        double earthWeight = Double.parseDouble(args[0]);

        double earthWeight = 83;
        double mass = earthWeight / planet1.EARTH.surfaceGravity();


        for (Planet p : planet1.values())
            System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mass), p.radius, p.mass, p.radiusOrb);
    }
}


