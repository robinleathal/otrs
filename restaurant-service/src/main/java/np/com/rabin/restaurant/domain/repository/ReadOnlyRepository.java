package np.com.rabin.restaurant.domain.repository;

import java.util.Collection;

public interface ReadOnlyRepository<TE, T> {
    /**
     * @param id
     */
    boolean contains(T id);

    /**
     * @param id
     */
    TE get(T id);

    /**
     *
     * @return
     */
    Collection<TE> getAll();
}
