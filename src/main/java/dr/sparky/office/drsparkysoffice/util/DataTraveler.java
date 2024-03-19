package dr.sparky.office.drsparkysoffice.util;

@FunctionalInterface
public interface DataTraveler {
    // transfer data between 2 controller
    public void data(Object... o);
}
