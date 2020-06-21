import observer.Observer;
import observer.ObserverBoy;
import payDesk.CountryPayDesk;
import payDesk.ForeignCountryPayDesk;
import payDesk.RegionalPayDesk;
import state.Employee;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Employee regional = new RegionalPayDesk();
        Employee country = new CountryPayDesk();
        Employee foreignCountry = new ForeignCountryPayDesk();
        Observer boy = new ObserverBoy();

        regional.adding(boy);
        country.adding(boy);
        foreignCountry.adding(boy);

        regional.setSuccessor(country);
        country.setSuccessor(foreignCountry);

        country.sendingAShipment("Foreign Country");

        regional.removing(boy);
        country.removing(boy);
        foreignCountry.removing(boy);
    }
}
