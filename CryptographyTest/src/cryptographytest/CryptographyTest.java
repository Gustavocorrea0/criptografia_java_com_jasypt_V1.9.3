package cryptographytest;

import org.jasypt.util.password.BasicPasswordEncryptor;
import org.jasypt.util.text.BasicTextEncryptor;


/**
 * @author Gustavo
 */
public class CryptographyTest {

    public static void main(String[] args) {
            BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();
            BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
            
            String password = "123456";
            String password2 = "123456";
            
            String senhaCriptografada = passwordEncryptor.encryptPassword(password);
            String senhaCriptografada2 = passwordEncryptor.encryptPassword(password2);
            
            System.out.println(senhaCriptografada);
            System.out.println(senhaCriptografada2);
            
            boolean validaSenha = passwordEncryptor.checkPassword("123456", senhaCriptografada2);
            
            if (validaSenha == false) {
                System.out.println("Erro");
            } else {
                System.out.println("ok");
            }
    }

}
