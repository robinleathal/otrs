package np.com.rabin.restaurant.domain.model.entity;

import java.util.List;
import java.util.Optional;

public class Restaurant extends BaseEntity<String> {
    private Optional<List<Table>> tables;
    private String address;


    public Restaurant(String id, String name) {
        super(id, name);
        this.tables = Optional.empty();
    }
    public Restaurant(String name, String id, String address, Optional<List<Table>> tables) {
        super(id, name);
        this.address = address;
        this.tables = tables;
    }
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
    public static Restaurant getDummyRestaurant() {
        return new Restaurant(null, null);
    }

    /**
     * @param tables
     */
    public void setTables(Optional<List<Table>> tables) {
        this.tables = tables;
    }

    /**
     *
     * @return
     */
    public Optional<List<Table>> getTables() {
        return tables;
    }

    /**
     * Overridden toString() method that return String presentation of the Object
     */
    @Override
    public String toString() {
        return String.format("{id: %s, name: %s, address: %s, tables: %s}", this.getId(),
                this.getName(), this.getAddress(), this.getTables());
    }
}
