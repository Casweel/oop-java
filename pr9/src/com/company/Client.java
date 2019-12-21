package com.company;

public class Client {
    private int INN;
    private String FIO;

    public Client(String _FIO, int _INN) {
        FIO = _FIO;
        INN = _INN;
    }

    private boolean nameCheck(String _FIO) {
        return FIO.equals(_FIO);
    }

    public boolean innCheck(String _FIO, int _INN) throws Exception {
        if (nameCheck(_FIO)) {
            if (INN == _INN) {
                return true;
            } else throw new Exception("Incorrect INN");
        } else return false;
    }

    @Override
    public String toString() {
        return FIO + ' ' + INN;
    }
}