public class EarthVolume {
    public static void main(String[] args) {

        double radiusKm = 6378;         
        double pi = Math.PI;

     
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        
        double kmToMiles = 0.621371;
        double volumeMiles = volumeKm * Math.pow(kmToMiles, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm);
        System.out.println("The volume of Earth in cubic miles is " + volumeMiles);
    }
}