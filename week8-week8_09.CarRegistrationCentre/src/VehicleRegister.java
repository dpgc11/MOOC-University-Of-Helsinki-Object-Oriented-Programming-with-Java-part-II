
import java.util.HashMap;

public class VehicleRegister {
    
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    
    public boolean add(RegistrationPlate plate, String owner) {
        
        if (!this.owners.containsKey(plate)) {
            this.owners.put(plate, owner);
            return true;
        }
        
        return false;
        
    }
    
    public String get(RegistrationPlate plate) {
        if (this.owners.containsKey(plate)) {
            return this.owners.get(plate);
        }
        
        return null;
    }
    
    public boolean delete(RegistrationPlate plate) {
        if (this.owners.containsKey(plate)) {
            this.owners.remove(plate);
            return true;
        }
        
        return false;
        
    }
    
    public void printRegistrationPlates() {
        for (RegistrationPlate plate : this.owners.keySet()) {
            System.out.println(plate.toString());
        }
    }
    
    public void printOwners() {
        for (RegistrationPlate plate : this.owners.keySet()) {
            System.out.println(this.owners.get(plate));
        }
        
    }
    
    
    
    
    
    
}