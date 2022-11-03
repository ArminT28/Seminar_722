package chat.repository;

public interface iCrudRepository<ID,E> {

    void add(E enitity);
    void remove(ID id);
    void update(ID id, E newEntity);
    E find(ID id);
}
