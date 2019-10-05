package PowerNumberGenerator;

import java.math.BigDecimal;

class PowerGenerator {

    private Double n = new Double(1);
    private Double current;

    public Double next(){

        if (n == 1){
            current = new Double(2) ;
            n++;
        } else {
            current = Math.pow(current, n);
        }

        return current;
    }
}
