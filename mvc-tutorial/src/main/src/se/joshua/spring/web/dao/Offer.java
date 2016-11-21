package se.joshua.spring.web.dao;

import se.joshua.spring.web.util.ValidEmail;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author Ali Yusha {@literal <mailto:Ali.yusha@so4it.com/>}
 */
public class Offer {

    private int id;

    @NotNull
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 character")
    private String name;

    @NotNull
    //@Pattern(regexp = ".*\\@.*\\..*", message = "this is not appear to be valid email address ")
    @ValidEmail(min = 6,message = "this email address is not valid address")
    private String email;

    @NotNull
    @Size(min = 10, max = 100 , message = "must be 10 to 100 ")
    private String text;


    public Offer() {
    }

    public Offer(int id, String name, String email, String text) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.text = text;
    }

    public Offer(String name, String email, String text) {
        this.name = name;
        this.email = email;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
