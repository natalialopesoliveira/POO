package Matemática;
import java.math.*;

public interface ConstantesMatematicas {
	BigDecimal RAIZDE2 = new BigDecimal("1.4142135623730950488");
	BigDecimal RAIZDE3 = new BigDecimal("1.7320508075688772935");
	BigDecimal RAIZDE5 = new BigDecimal("2.2360679774997896964");
	BigDecimal RAIZDE6 = RAIZDE2.multiply(RAIZDE3).setScale(19, RoundingMode.HALF_UP);
}
