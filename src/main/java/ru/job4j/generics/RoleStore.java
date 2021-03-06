package ru.job4j.generics;

public class RoleStore implements Store<Role> {
    private final Store<Role> store = new MemStore<>();

    @Override
    public void add(Role model) {
        store.add(model);
    }

    @Override
    public boolean replace(String id, Role model) {
        return store.replace(id, model);
    }

    @Override
    public boolean delete(String id) {
        return store.delete(id);
    }

    @Override
    public Role findById(String id) {
        return store.findById(id);
    }

    @Override
    public int findIndexById(String id) {
        return store.findIndexById(id);
    }

    @Override
    public String get(int index) {
        return store.get(index);
    }
}
