package ru.lesson.lessons;

/**
 * TODO: comment
 * @author Ticau Vasile
 * @since 03.01.2018
 */

public class User {

    private String id;
    private String name;

    /**
     * Constructor
     * @param id User id
     * @param name User name
     */
    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Get user id
     * @return user id
     */
    public String getId() {
        return id;
    }

    /**
     * Set user id
     * @param id User id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get user name
     * @return user name
     */
    public String getName() {
        return name;
    }

    /**
     * Set user name
     * @param name User name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getId() != null ? !getId().equals(user.getId()) : user.getId() != null) return false;
        return getName() != null ? getName().equals(user.getName()) : user.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }
}
