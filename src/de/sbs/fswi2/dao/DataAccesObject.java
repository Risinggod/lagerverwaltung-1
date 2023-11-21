package de.sbs.fswi2.dao;

import java.util.List;

import daoservice.DAOHttpService;
import daoservice.DAOJsonService;
import daoservice.LagerFXModel;
import javafx.fxml.FXMLLoader;

public class DataAccesObject implements Speicherbar<LagerFXModel> {

    @Override
    public List<LagerFXModel> getAll() {
        List<LagerFXModel> jsonList = DAOJsonService.deserialize(daoservice.DAOHttpService.getJSONOffline());
        System.out.println(jsonList.size());
        return jsonList;
    }

    @Override
    public boolean create(LagerFXModel data) {
        return false;
    }

    @Override
    public boolean delete(LagerFXModel data) {
        return false;
    }

}
