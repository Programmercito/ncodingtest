package bo.ncoding.test.model.dtos;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 * @version     1.0
 */

public class Register {
    private String mail;
    private String password;

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
