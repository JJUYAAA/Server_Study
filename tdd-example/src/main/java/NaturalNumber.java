public class NaturalNumber {

    private int naturalnumber;

    private NaturalNumber(int naturalnumber) throws IllegalAccessException {
        if(naturalnumber<1){
            throw new IllegalAccessException("Invalid deposit amount");
        }
        this.naturalnumber = naturalnumber;
    }

    public static NaturalNumber from(int i) throws IllegalAccessException {
        return new NaturalNumber(i);
    }

    public int getNaturalnumber() {
        return naturalnumber;
    }
}
