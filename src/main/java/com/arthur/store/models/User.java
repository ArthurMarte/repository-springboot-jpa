package com.arthur.store.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//utilizando o Lombok para gerar os getters, setters e constructors
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table (name = "USER_DATA")
public class User implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    private long id;

    private String name;
    private String email;
    private String phone;
    private String password;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id != other.id)
            return false;
        return true;
    }

}
