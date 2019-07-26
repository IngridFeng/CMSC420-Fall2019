package projects.phonebook.java.utils;

import projects.phonebook.java.hashes.HashTable;

/**
 * <p>{@link NoMorePrimesException} is a simple {@link RuntimeException} which is thrown
 * when{@link PrimeGenerator} has run out of primes to generate.</p>
 *
 * <p><b>**** DO NOT EDIT THIS CLASS! ****** </b></p>
 *
 * @see PrimeGenerator
 * @see HashTable
 *
 * @author <a href="mailto:jason.filippou@gmail.com">Jason Filippou</a>
 */
public class NoMorePrimesException extends RuntimeException {

    /**
     *  Standard constructor.
     * @param msg The {@link String} that we want {@link RuntimeException#getMessage()}
     *            to return to the caller.
     * @see RuntimeException#getMessage()
     */
    public NoMorePrimesException(String msg){
        super(msg);
    }
}