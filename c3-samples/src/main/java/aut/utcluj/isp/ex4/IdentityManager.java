package aut.utcluj.isp.ex4;

/**
 * @author stefan
 */
public interface IdentityManager {
    /**
     * Return identity details
     * @return identity details (e.g: for employee: firstname_lastname_cnp)
     */
    String getIdentity();
}
