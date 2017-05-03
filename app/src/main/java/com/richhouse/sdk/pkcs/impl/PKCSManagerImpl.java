package com.richhouse.sdk.pkcs.impl;

import com.richhouse.sdk.pkcs.PKCSManager;

import java.security.PublicKey;
import java.security.cert.Certificate;
import java.util.List;

/**
 * Created by William Li on 2016/6/6.
 */
public class PKCSManagerImpl implements PKCSManager {


    @Override
    public byte[] sign(byte priKeyNum, byte[] inputData) throws Exception {
        return new byte[0];
    }

    @Override
    public boolean verifySign(byte pubKeyNum, byte[] data, byte[] signData) throws Exception {
        return false;
    }

    @Override
    public PublicKey exportPubKey(byte pubKeyNum) throws Exception {
        return null;
    }

    @Override
    public boolean personalizePKI(String pin, byte pinTries, String ublkPin, byte ublkPinTries) throws Exception {
        return false;
    }

    @Override
    public boolean verifyPin(byte pinNum, String pin) throws Exception {
        return false;
    }

    @Override
    public boolean importPubKey(byte pubKeyNum, byte pinNum, PublicKey publicKey) throws Exception {
        return false;
    }

    @Override
    public boolean generateKeyPair(byte pubKeyNum, byte pubPinNum, byte priKeyNum, byte priPinNum, short keySize) throws Exception {
        return false;
    }

    @Override
    public boolean createPin(byte pinNum, byte pinTries, String pin) throws Exception {
        return false;
    }

    @Override
    public boolean changePin(byte pinNum, String oldPin, String newPin) throws Exception {
        return false;
    }

    @Override
    public boolean unblock(byte ublkPinNum, String ublkPin) {
        return false;
    }

    @Override
    public boolean importCer(byte cerNum, byte pinNum, Certificate certificate) throws Exception {
        return false;
    }

    @Override
    public boolean verifySign4Cer(byte cerNum, byte[] data, byte[] signData) throws Exception {
        return false;
    }

    @Override
    public Certificate getCertificate(byte cerNum) throws Exception {
        return null;
    }

    @Override
    public boolean deleteCer(byte cerNum, String pin) throws Exception {
        return false;
    }

    @Override
    public List<Certificate> getCertificateList() throws Exception {
        return null;
    }

    @Override
    public Certificate generateCSR(String countryCode, String organizationName, String localityName, String state, String emailAddress, String commonName, byte pubKeyNum, byte priKeyNum, String priPinNum, String priPin) throws Exception {
        return null;
    }


}
