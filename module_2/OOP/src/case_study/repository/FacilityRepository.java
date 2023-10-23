package case_study.repository;

import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.util.ReadVilla;
import case_study.util.WriteHouse;
import case_study.util.WriteVilla;

import java.util.LinkedHashMap;

public class FacilityRepository implements IFacilityRepository {

    @Override
    public LinkedHashMap<Villa, Integer> displayVilla() {
        return ReadVilla.readFileVilla();
    }

    @Override
    public LinkedHashMap<House, Integer> displayHouse() {
        return null;
    }

    @Override
    public LinkedHashMap<Room, Integer> displayRoom() {
        return null;
    }

    @Override
    public void writeVilla(LinkedHashMap<Villa, Integer> villa) {
        WriteVilla.writeFileVilla(villa);
    }

    @Override
    public void writeHouse(LinkedHashMap<House, Integer> house) {
        WriteHouse.writeFile(house);
    }

    @Override
    public void writeRoom(LinkedHashMap<Room, Integer> room) {

    }
}
