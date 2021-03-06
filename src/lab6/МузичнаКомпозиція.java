package lab6;

import lab8.WrongNameValueException;

public class МузичнаКомпозиція {
    private String назва;
    private int тривалість;

    @Override
    public boolean equals(Object obj) {
        return obj.toString().equals(toString());
    }

    public МузичнаКомпозиція(String назва, int тривалість)
            throws WrongNameValueException {
        if (назва == null) {
            throw new WrongNameValueException();
        }
        this.назва = назва;
        this.тривалість = тривалість;
    }

    public int віддайТривалість() {
        return тривалість;
    }

    @Override
    public String toString() {
        return назва + " " + this.getClass().getSimpleName() + " "+ тривалість + " с.";
    }
}
