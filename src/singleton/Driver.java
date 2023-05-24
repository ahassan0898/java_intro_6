package singleton;

public class Driver {

    private static Driver driver;

    private Driver(){
// private and no one will be able to instantiate this anywhere else
    }

    public static Driver getDriver() {
        if (driver == null) driver = new Driver(); // initalizing the variable
        return driver;
    }


}
