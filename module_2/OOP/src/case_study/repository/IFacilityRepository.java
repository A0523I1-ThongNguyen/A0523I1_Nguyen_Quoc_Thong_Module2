package case_study.repository;

import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;


import java.util.LinkedHashMap;
import java.util.LinkedList;

public interface IFacilityRepository extends IRepository  {
    LinkedHashMap<Villa, Integer> displayVilla();
    LinkedHashMap<House,Integer> displayHouse();
    LinkedHashMap<Room,Integer> displayRoom();

    void writeVilla(LinkedHashMap<Villa,Integer> villa) ;
    void writeHouse(LinkedHashMap<House,Integer> house) ;
    void writeRoom(LinkedHashMap<Room,Integer> room) ;

}
