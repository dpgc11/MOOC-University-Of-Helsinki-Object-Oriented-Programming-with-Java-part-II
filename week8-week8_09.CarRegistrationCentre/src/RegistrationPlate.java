
public class RegistrationPlate {

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!

    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
        this.regCode = regCode;
        this.country = country;
    }

    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (this.regCode != null ? this.regCode.hashCode() : 0);
        hash = 41 * hash + (this.country != null ? this.country.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RegistrationPlate other = (RegistrationPlate) obj;
        if ((this.regCode == null) ? (other.regCode != null) : !this.regCode.equals(other.regCode)) {
            return false;
        }
        if ((this.country == null) ? (other.country != null) : !this.country.equals(other.country)) {
            return false;
        }
        return true;
    }
    
    
}
