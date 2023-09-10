package animal.repositori;

import animal.model.Tiger;

public interface ITigerRepository {
    Tiger[] getListTiger();
    void add(Tiger tiger);
    void deleteTigerByName(String name);
    void editTiger(String name);

    void searchTiger(String name);

}
