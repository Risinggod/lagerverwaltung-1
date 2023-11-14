package de.sbs.fswi2.dao;


import java.util.List;

public class DataAccesObject implements Speicherbar<DataTransferObject> {

    @Override
    public List<DataTransferObject> getAll() {
        System.out.println(daoservice.DAOHttpService.useService());
        return null;
    }

    @Override
    public boolean create(DataTransferObject data) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean delete(DataTransferObject data) {
        // TODO Auto-generated method stub
         return false;
    }


}