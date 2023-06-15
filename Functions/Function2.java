package Function2;

public class Function2 {

    public void noArgumentNoReturn() // declaration
    // definition in {}
    {
        System.out.println("in no argument no return function");
    }

    public void withArgumentNoReturn(int firstArgument, int secondArugment) {
        System.out.println("in withArgumentNoReturn "
                + firstArgument + " Second " + secondArugment);
    }

    public int noArgumentWithReturn() {
        System.out.println("in noArgumentWithReturn");
        return 1;
    }

    public int withArgumentWithReturn(int firstArgument) {
        return firstArgument * 10;
    }

    public String switchFunction(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
        }
        return "Invalid day";
    }

    public static void main(String args[]) {
        Function2 functions = new Function2();
        functions.noArgumentNoReturn();
        functions.withArgumentNoReturn(1, 2);
        functions.noArgumentWithReturn();
        // get value from return function
        int returnValue = functions.noArgumentWithReturn();
        System.out.println("return value " + returnValue);
        System.out.println("with return direct value " + functions.noArgumentWithReturn());

        System.out.println("withArgumentWithReturn " + functions.withArgumentWithReturn(10));
        System.out.println("switchFunction " + functions.switchFunction(10));

    }
}