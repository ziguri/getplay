
package projectogetplay;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validador de email, adaptado de http://examples.javacodegeeks.com/core-java/util/regex/matcher/validate-email-address-with-java-regular-expression-example/
 *
 * @author Nikos Maravitsas
 * 
 * @author Vitor Aires
 */
public class ValidadorEmail {

    private Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public ValidadorEmail() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    /**
     * Verifica se um email se enconta num padr~ão estabelecido
     * @param email email a ser validado
     * @return True, se o email está correctamente inserido, false, caso contrário
     */
    
    public boolean validarEmail(final String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
