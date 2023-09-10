package CreationalDesignPatterns.PrototypeAndRegistry;

import java.util.HashMap;
import java.util.concurrent.ExecutionException;

public class RegistryStudent {
    private HashMap<String, Student> studentRegistry;

    public RegistryStudent(){
        this.studentRegistry = new HashMap<>();
    }

    public Student addToRegistry(String key, Student student) throws Exception{
        if(studentRegistry.containsKey(key)){
            throw new Exception("Student for the key already registered");
        }
        else{
            studentRegistry.put(key, student);
        }

        return student;
    }

    public Student getFromRegistry(String key) throws Exception{
        if(!studentRegistry.containsKey(key)){
            throw new Exception("Student for the key doesn't exist");
        }
        else{
            return studentRegistry.get(key);
        }
    }
}
