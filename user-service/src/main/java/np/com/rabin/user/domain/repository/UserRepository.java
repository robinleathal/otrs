package np.com.rabin.user.domain.repository;

import java.util.Collection;

public interface UserRepository<Booking, String> extends Repository<Booking, String> {

    /**
     * @param name
     */
    boolean containsName(String name);

    /**
     * @param name
     */
    public Collection<Booking> findByName(String name) throws Exception;
}
