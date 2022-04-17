package np.com.rabin.restaurant.domain.service;

import np.com.rabin.restaurant.domain.repository.ReadOnlyRepository;

public abstract class ReadOnlyBaseService<TE, T> {
    private ReadOnlyRepository<TE, T> repository;

    ReadOnlyBaseService(ReadOnlyRepository<TE, T> repository) {
        this.repository = repository;
    }
}
