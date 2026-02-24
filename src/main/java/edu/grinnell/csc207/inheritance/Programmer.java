package edu.grinnell.csc207.inheritance;

/** A programmer. */
public class Programmer extends EmployeeAbstract {

    public Programmer(String name, String id){
        super("(PROG)", name, id);

    }

    @Override
    /** @return the programmer's salary. */
    public int getSalary() {
        return 80000 * 2;
    }


    @Override
    /** @return the programmer's work noise. */
    public String makeWorkNoise() {
        return "Clack clack clack";
    }
}