package animal.controller;

import animal.Service.ITigerService;
import animal.Service.TigerService;
import animal.repositori.ITigerRepository;

public class TigerController {
    public static void show(){
        ITigerService iTigerService = new TigerService();
        iTigerService.search();
        iTigerService.edit();
        iTigerService.delete();

        iTigerService.add();
        iTigerService.show();
    }
}
