package de.hsos.swa.mocktail.ECB.entity;

public class User {
    int id;
    String name;
    // String[] role;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /*
     * public User(int id, String name, String[] role) {
     * this.id = id;
     * this.name = name;
     * this.role = role;
     * }
     */

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

    /*
     * public String[] getRole() {
     * return role;
     * }
     * 
     * public void setRole(String role) {
     * this.role[0] = role;
     * }
     */

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + "]";
    }

}