package com.pacha.onlinevotingsystem.service.utils;

import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class FileUtills {

    public static byte[] compressFile(byte[] data) throws Exception{
        Deflater deflater = new Deflater();
        deflater.setInput(data);
        deflater.finish();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
        byte[] tmp = new byte[4*1024];
        while(!deflater.finished()) {
            int size = deflater.deflate(tmp);
            outputStream.write(tmp,0,size);
        }
        try{
            outputStream.close();
        }
        catch (Exception e) {
            throw new Exception("Problem encountered while decompressing!!");
        }

        return outputStream.toByteArray();
    }

    public static byte[] deCompressFile(byte[] data) throws Exception {
        Inflater inflater = new Inflater();
        inflater.setInput(data);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
        byte[] tmp = new byte[4*1024];
        while(!inflater.finished()) {
            int size = inflater.inflate(tmp);
            outputStream.write(tmp,0,size);
        }
        try{
            outputStream.close();
        }
        catch (Exception e) {
            throw new Exception("Problem encountered while decompressing!!");
        }

        return outputStream.toByteArray();
    }
}
