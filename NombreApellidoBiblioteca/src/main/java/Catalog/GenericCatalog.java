package Catalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class GenericCatalog<T> {


    private List<T> data;

    public GenericCatalog() {
        data = new ArrayList<>();
    }


        public void add(T object) {
            data.add(object);
        }

        public List<T> findAll() {
            return data;
        }

        public Optional<T> findByPredicate(Predicate<T> predicate) {
            return data.stream()
                    .filter(predicate)
                    .findFirst();
        }


        public List<T> findAllByPredicate(Predicate<T> predicate) {
            return data.stream()
                    .filter(predicate)
                    .toList();
        }

        public void delete(Predicate<T> predicate) {
            data.removeIf(predicate);
        }


        public boolean exists(Predicate<T> predicate) {
            return data.stream()
                    .anyMatch(predicate);
        }


        public long count(Predicate<T> predicate) {
            return data.stream()
                    .filter(predicate)
                    .count();
        }
    }

