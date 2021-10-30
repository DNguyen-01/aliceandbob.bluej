/**
 * @author git-leon
 * @version 1.0.0
 * @date 5/19/21 5:05 PM
 */
public class AliceAndBobEngine {
    /**
     * return `true` if the input value is "Alice"
     * @param input - this "value" is variable: it has the potential to be many things "
     * @return `true` if `input` is "Alice" - <-- whats the expectation?
     */
    public Boolean isAlice(String input) {//isAlice is the name of the method; "String input"parameters
        //check input is Alice
        String alice = "Alice"; //<- string literally
        Boolean name = alice.equals(input); // <- alice.equals (formula) Boolean name <- covers the formula
        //if Alice return true, if not return false
        return name; //returning what ".equals" did for you "Expection - result of that action
    }

    /**
     * return `true` if the input value is "Bob"
     * @param input - this value is variable: it has the potential to be many things
     * @return `true` if `input` is "Bob"
     */
    public Boolean isBob(String input) {
        //check input is bob, if true return true, if not return false
        String bob = "Bob";
        if(bob.equals(input)){
            return true; 
        }
        else{
        return false;
    }
    }

    /**
     * return `true` if the input value is "Alice" or "Bob"
     * @param input - this value is variable: it has the potential to be many things
     * @return `true` if `input` is "Alice" or "Bob"
     */
    public Boolean isAliceOrBob(String input) {
        // if input is Alice or Bob return true, if not return false
        String alice = "Alice";
        String bob = "Bob";
        if(alice.equals(input) || bob.equals(input)){ //lon
            return true;
        }
        return false;
    }

    /**
     * if the input value is "Alice" or "Bob", then
     *      return "Hello PERSONSNAME!",
     * otherwise
     *      return "Begone, PERSONNAME! You're a stranger!",
     * where `PERSONNAME` is replaced with the person's name respectively.
     *
     * @param input - this value is variable: it has the potential to be many things
     * @return respective String value
     */
    public String getGreeting(String input) {
        // if input is alice or bob - return 'Hello Personsname!' if false return 'Begone, Personname!
        // Your're a stranger!." 
        if(isAlice(input) || isBob(input)){ //clean way of intergrating two established method
            return "Hello, " + input + "!";//string literal number
        }
            return "Begone, " + input + "! You're a stranger!";
    }
}
