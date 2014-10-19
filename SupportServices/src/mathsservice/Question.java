package mathsservice;

import java.io.Serializable;

/**
 *
 * @author Jamie
 */
public class Question implements Serializable {
    //ArrayList Values for AskQuestions
    private String name;
    private String email;
    private String service;
    private String des;
    
    
    public Question(){
        name = new String();
        email = new String();
        service = new String();
        des = new String();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    
}

