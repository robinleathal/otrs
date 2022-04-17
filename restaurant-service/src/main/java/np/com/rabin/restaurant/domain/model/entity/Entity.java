package np.com.rabin.restaurant.domain.model.entity;

public abstract class Entity<T> {
    T id;
    String name;

    public  T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
